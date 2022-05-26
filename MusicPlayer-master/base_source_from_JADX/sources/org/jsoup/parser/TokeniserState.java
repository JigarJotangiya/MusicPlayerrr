package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;

enum TokeniserState {
    Data {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit(characterReader.consume());
            } else if (current == '&') {
                tokeniser.advanceTransition(TokeniserState.CharacterReferenceInData);
            } else if (current == '<') {
                tokeniser.advanceTransition(TokeniserState.TagOpen);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeData());
            } else {
                tokeniser.emit((Token) new Token.EOF());
            }
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                characterReader.advance();
                tokeniser.emit((char) TokeniserState.replacementChar);
            } else if (current == '&') {
                tokeniser.advanceTransition(TokeniserState.CharacterReferenceInRcdata);
            } else if (current == '<') {
                tokeniser.advanceTransition(TokeniserState.RcdataLessthanSign);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeToAny('&', '<', TokeniserState.nullChar));
            } else {
                tokeniser.emit((Token) new Token.EOF());
            }
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readCharRef(tokeniser, TokeniserState.Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readData(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readData(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                characterReader.advance();
                tokeniser.emit((char) TokeniserState.replacementChar);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeTo((char) TokeniserState.nullChar));
            } else {
                tokeniser.emit((Token) new Token.EOF());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == '!') {
                tokeniser.advanceTransition(TokeniserState.MarkupDeclarationOpen);
            } else if (current == '/') {
                tokeniser.advanceTransition(TokeniserState.EndTagOpen);
            } else if (current == '?') {
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            } else if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(true);
                tokeniser.transition(TokeniserState.TagName);
            } else {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.emit("</");
                tokeniser.transition(TokeniserState.Data);
            } else if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.transition(TokeniserState.TagName);
            } else if (characterReader.matches('>')) {
                tokeniser.error((TokeniserState) this);
                tokeniser.advanceTransition(TokeniserState.Data);
            } else {
                tokeniser.error((TokeniserState) this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.tagPending.appendTagName(characterReader.consumeTagName());
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume == '/') {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    } else if (consume == '>') {
                        tokeniser.emitTagPending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (consume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (!(consume == 9 || consume == 10 || consume == 12 || consume == 13)) {
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.tagPending.appendTagName(TokeniserState.replacementStr);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagOpen);
                return;
            }
            if (characterReader.matchesLetter() && tokeniser.appropriateEndTagName() != null) {
                if (!characterReader.containsIgnoreCase("</" + tokeniser.appropriateEndTagName())) {
                    tokeniser.tagPending = tokeniser.createTagPending(false).name(tokeniser.appropriateEndTagName());
                    tokeniser.emitTagPending();
                    characterReader.unconsume();
                    tokeniser.transition(TokeniserState.Data);
                    return;
                }
            }
            tokeniser.emit("<");
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.RCDATAEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName {
        private void anythingElse(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            characterReader.unconsume();
            tokeniser.transition(TokeniserState.Rcdata);
        }

        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                String consumeLetterSequence = characterReader.consumeLetterSequence();
                tokeniser.tagPending.appendTagName(consumeLetterSequence);
                tokeniser.dataBuffer.append(consumeLetterSequence);
                return;
            }
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.transition(TokeniserState.BeforeAttributeName);
                } else {
                    anythingElse(tokeniser, characterReader);
                }
            } else if (consume != '/') {
                if (consume != '>') {
                    anythingElse(tokeniser, characterReader);
                } else if (tokeniser.isAppropriateEndTagToken()) {
                    tokeniser.emitTagPending();
                    tokeniser.transition(TokeniserState.Data);
                } else {
                    anythingElse(tokeniser, characterReader);
                }
            } else if (tokeniser.isAppropriateEndTagToken()) {
                tokeniser.transition(TokeniserState.SelfClosingStartTag);
            } else {
                anythingElse(tokeniser, characterReader);
            }
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.RawtextEndTagOpen);
                return;
            }
            tokeniser.emit('<');
            tokeniser.transition(TokeniserState.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == '!') {
                tokeniser.emit("<!");
                tokeniser.transition(TokeniserState.ScriptDataEscapeStart);
            } else if (consume != '/') {
                tokeniser.emit("<");
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.ScriptData);
            } else {
                tokeniser.createTempBuffer();
                tokeniser.transition(TokeniserState.ScriptDataEndTagOpen);
            }
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.readEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapeStartDash);
                return;
            }
            tokeniser.transition(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('-')) {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            tokeniser.transition(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                characterReader.advance();
                tokeniser.emit((char) TokeniserState.replacementChar);
            } else if (current == '-') {
                tokeniser.emit('-');
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedDash);
            } else if (current != '<') {
                tokeniser.emit(characterReader.consumeToAny('-', '<', TokeniserState.nullChar));
            } else {
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else if (consume == '-') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataEscapedDashDash);
            } else if (consume != '<') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else {
                tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
                return;
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else if (consume == '-') {
                tokeniser.emit(consume);
            } else if (consume == '<') {
                tokeniser.transition(TokeniserState.ScriptDataEscapedLessthanSign);
            } else if (consume != '>') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            } else {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptData);
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTempBuffer();
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.emit("<" + characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeStart);
            } else if (characterReader.matches('/')) {
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                tokeniser.emit('<');
                tokeniser.transition(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createTagPending(false);
                tokeniser.tagPending.appendTagName(characterReader.current());
                tokeniser.dataBuffer.append(characterReader.current());
                tokeniser.advanceTransition(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            tokeniser.emit("</");
            tokeniser.transition(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataEndTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                characterReader.advance();
                tokeniser.emit((char) TokeniserState.replacementChar);
            } else if (current == '-') {
                tokeniser.emit(current);
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedDash);
            } else if (current == '<') {
                tokeniser.emit(current);
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (current != 65535) {
                tokeniser.emit(characterReader.consumeToAny('-', '<', TokeniserState.nullChar));
            } else {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            } else if (consume == '-') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (consume == '<') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (consume != 65535) {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.emit((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            } else if (consume == '-') {
                tokeniser.emit(consume);
            } else if (consume == '<') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (consume == '>') {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptData);
            } else if (consume != 65535) {
                tokeniser.emit(consume);
                tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
            } else {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matches('/')) {
                tokeniser.emit('/');
                tokeniser.createTempBuffer();
                tokeniser.advanceTransition(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            tokeniser.transition(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.handleDataDoubleEscapeTag(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.newAttribute();
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.AttributeName);
            } else if (consume != ' ') {
                if (!(consume == '\"' || consume == '\'')) {
                    if (consume == '/') {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    } else if (consume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (consume != 9 && consume != 10 && consume != 12 && consume != 13) {
                        switch (consume) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                tokeniser.emitTagPending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            default:
                                tokeniser.tagPending.newAttribute();
                                characterReader.unconsume();
                                tokeniser.transition(TokeniserState.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(consume);
                tokeniser.transition(TokeniserState.AttributeName);
            }
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.tagPending.appendAttributeName(characterReader.consumeToAnySorted(TokeniserState.attributeNameCharsSorted));
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (!(consume == '\"' || consume == '\'')) {
                        if (consume == '/') {
                            tokeniser.transition(TokeniserState.SelfClosingStartTag);
                            return;
                        } else if (consume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        } else if (!(consume == 9 || consume == 10 || consume == 12 || consume == 13)) {
                            switch (consume) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniser.transition(TokeniserState.BeforeAttributeValue);
                                    return;
                                case '>':
                                    tokeniser.emitTagPending();
                                    tokeniser.transition(TokeniserState.Data);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                    tokeniser.error((TokeniserState) this);
                    tokeniser.tagPending.appendAttributeName(consume);
                    return;
                }
                tokeniser.transition(TokeniserState.AfterAttributeName);
                return;
            }
            tokeniser.error((TokeniserState) this);
            tokeniser.tagPending.appendAttributeName((char) TokeniserState.replacementChar);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.appendAttributeName((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.AttributeName);
            } else if (consume != ' ') {
                if (!(consume == '\"' || consume == '\'')) {
                    if (consume == '/') {
                        tokeniser.transition(TokeniserState.SelfClosingStartTag);
                        return;
                    } else if (consume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (consume != 9 && consume != 10 && consume != 12 && consume != 13) {
                        switch (consume) {
                            case '<':
                                break;
                            case '=':
                                tokeniser.transition(TokeniserState.BeforeAttributeValue);
                                return;
                            case '>':
                                tokeniser.emitTagPending();
                                tokeniser.transition(TokeniserState.Data);
                                return;
                            default:
                                tokeniser.tagPending.newAttribute();
                                characterReader.unconsume();
                                tokeniser.transition(TokeniserState.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.newAttribute();
                tokeniser.tagPending.appendAttributeName(consume);
                tokeniser.transition(TokeniserState.AttributeName);
            }
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.appendAttributeValue((char) TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.AttributeValue_unquoted);
            } else if (consume == ' ') {
            } else {
                if (consume != '\"') {
                    if (consume != '`') {
                        if (consume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.emitTagPending();
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        } else if (consume != 9 && consume != 10 && consume != 12 && consume != 13) {
                            if (consume == '&') {
                                characterReader.unconsume();
                                tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                                return;
                            } else if (consume != '\'') {
                                switch (consume) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        tokeniser.error((TokeniserState) this);
                                        tokeniser.emitTagPending();
                                        tokeniser.transition(TokeniserState.Data);
                                        return;
                                    default:
                                        characterReader.unconsume();
                                        tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                                        return;
                                }
                            } else {
                                tokeniser.transition(TokeniserState.AttributeValue_singleQuoted);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    tokeniser.error((TokeniserState) this);
                    tokeniser.tagPending.appendAttributeValue(consume);
                    tokeniser.transition(TokeniserState.AttributeValue_unquoted);
                    return;
                }
                tokeniser.transition(TokeniserState.AttributeValue_doubleQuoted);
            }
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String consumeToAny = characterReader.consumeToAny(TokeniserState.attributeDoubleValueCharsSorted);
            if (consumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAny);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.appendAttributeValue((char) TokeniserState.replacementChar);
            } else if (consume == '\"') {
                tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
            } else if (consume == '&') {
                int[] consumeCharacterReference = tokeniser.consumeCharacterReference('\"', true);
                if (consumeCharacterReference != null) {
                    tokeniser.tagPending.appendAttributeValue(consumeCharacterReference);
                } else {
                    tokeniser.tagPending.appendAttributeValue('&');
                }
            } else if (consume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String consumeToAny = characterReader.consumeToAny(TokeniserState.attributeSingleValueCharsSorted);
            if (consumeToAny.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAny);
            } else {
                tokeniser.tagPending.setEmptyAttributeValue();
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.tagPending.appendAttributeValue((char) TokeniserState.replacementChar);
            } else if (consume == 65535) {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            } else if (consume == '&') {
                int[] consumeCharacterReference = tokeniser.consumeCharacterReference('\'', true);
                if (consumeCharacterReference != null) {
                    tokeniser.tagPending.appendAttributeValue(consumeCharacterReference);
                } else {
                    tokeniser.tagPending.appendAttributeValue('&');
                }
            } else if (consume == '\'') {
                tokeniser.transition(TokeniserState.AfterAttributeValue_quoted);
            }
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            String consumeToAnySorted = characterReader.consumeToAnySorted(TokeniserState.attributeValueUnquoted);
            if (consumeToAnySorted.length() > 0) {
                tokeniser.tagPending.appendAttributeValue(consumeToAnySorted);
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (!(consume == '\"' || consume == '`')) {
                        if (consume == 65535) {
                            tokeniser.eofError(this);
                            tokeniser.transition(TokeniserState.Data);
                            return;
                        } else if (!(consume == 9 || consume == 10 || consume == 12 || consume == 13)) {
                            if (consume == '&') {
                                int[] consumeCharacterReference = tokeniser.consumeCharacterReference('>', true);
                                if (consumeCharacterReference != null) {
                                    tokeniser.tagPending.appendAttributeValue(consumeCharacterReference);
                                    return;
                                } else {
                                    tokeniser.tagPending.appendAttributeValue('&');
                                    return;
                                }
                            } else if (consume != '\'') {
                                switch (consume) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        tokeniser.emitTagPending();
                                        tokeniser.transition(TokeniserState.Data);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                    tokeniser.error((TokeniserState) this);
                    tokeniser.tagPending.appendAttributeValue(consume);
                    return;
                }
                tokeniser.transition(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.error((TokeniserState) this);
            tokeniser.tagPending.appendAttributeValue((char) TokeniserState.replacementChar);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            } else if (consume == '/') {
                tokeniser.transition(TokeniserState.SelfClosingStartTag);
            } else if (consume == '>') {
                tokeniser.emitTagPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            } else {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == '>') {
                tokeniser.tagPending.selfClosing = true;
                tokeniser.emitTagPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                characterReader.unconsume();
                tokeniser.transition(TokeniserState.BeforeAttributeName);
            } else {
                tokeniser.eofError(this);
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            characterReader.unconsume();
            Token.Comment comment = new Token.Comment();
            comment.bogus = true;
            comment.data.append(characterReader.consumeTo('>'));
            tokeniser.emit((Token) comment);
            tokeniser.advanceTransition(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchConsume("--")) {
                tokeniser.createCommentPending();
                tokeniser.transition(TokeniserState.CommentStart);
            } else if (characterReader.matchConsumeIgnoreCase("DOCTYPE")) {
                tokeniser.transition(TokeniserState.Doctype);
            } else if (characterReader.matchConsume("[CDATA[")) {
                tokeniser.transition(TokeniserState.CdataSection);
            } else {
                tokeniser.error((TokeniserState) this);
                tokeniser.advanceTransition(TokeniserState.BogusComment);
            }
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.commentPending.data.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.Comment);
            } else if (consume == '-') {
                tokeniser.transition(TokeniserState.CommentStartDash);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.commentPending.data.append(consume);
                tokeniser.transition(TokeniserState.Comment);
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.commentPending.data.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.Comment);
            } else if (consume == '-') {
                tokeniser.transition(TokeniserState.CommentStartDash);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.commentPending.data.append(consume);
                tokeniser.transition(TokeniserState.Comment);
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current == 0) {
                tokeniser.error((TokeniserState) this);
                characterReader.advance();
                tokeniser.commentPending.data.append(TokeniserState.replacementChar);
            } else if (current == '-') {
                tokeniser.advanceTransition(TokeniserState.CommentEndDash);
            } else if (current != 65535) {
                tokeniser.commentPending.data.append(characterReader.consumeToAny('-', TokeniserState.nullChar));
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append('-');
                sb.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.Comment);
            } else if (consume == '-') {
                tokeniser.transition(TokeniserState.CommentEnd);
            } else if (consume != 65535) {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append('-');
                sb2.append(consume);
                tokeniser.transition(TokeniserState.Comment);
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--");
                sb.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.Comment);
            } else if (consume == '!') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.CommentEndBang);
            } else if (consume == '-') {
                tokeniser.error((TokeniserState) this);
                tokeniser.commentPending.data.append('-');
            } else if (consume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--");
                sb2.append(consume);
                tokeniser.transition(TokeniserState.Comment);
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                StringBuilder sb = tokeniser.commentPending.data;
                sb.append("--!");
                sb.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.Comment);
            } else if (consume == '-') {
                tokeniser.commentPending.data.append("--!");
                tokeniser.transition(TokeniserState.CommentEndDash);
            } else if (consume == '>') {
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                StringBuilder sb2 = tokeniser.commentPending.data;
                sb2.append("--!");
                sb2.append(consume);
                tokeniser.transition(TokeniserState.Comment);
            } else {
                tokeniser.eofError(this);
                tokeniser.emitCommentPending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypeName);
                return;
            }
            if (consume != '>') {
                if (consume != 65535) {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.transition(TokeniserState.BeforeDoctypeName);
                    return;
                }
                tokeniser.eofError(this);
            }
            tokeniser.error((TokeniserState) this);
            tokeniser.createDoctypePending();
            tokeniser.doctypePending.forceQuirks = true;
            tokeniser.emitDoctypePending();
            tokeniser.transition(TokeniserState.Data);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.createDoctypePending();
                tokeniser.transition(TokeniserState.DoctypeName);
                return;
            }
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.createDoctypePending();
                tokeniser.doctypePending.name.append(TokeniserState.replacementChar);
                tokeniser.transition(TokeniserState.DoctypeName);
            } else if (consume == ' ') {
            } else {
                if (consume == 65535) {
                    tokeniser.eofError(this);
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                } else if (consume != 9 && consume != 10 && consume != 12 && consume != 13) {
                    tokeniser.createDoctypePending();
                    tokeniser.doctypePending.name.append(consume);
                    tokeniser.transition(TokeniserState.DoctypeName);
                }
            }
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.matchesLetter()) {
                tokeniser.doctypePending.name.append(characterReader.consumeLetterSequence());
                return;
            }
            char consume = characterReader.consume();
            if (consume != 0) {
                if (consume != ' ') {
                    if (consume == '>') {
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (consume == 65535) {
                        tokeniser.eofError(this);
                        tokeniser.doctypePending.forceQuirks = true;
                        tokeniser.emitDoctypePending();
                        tokeniser.transition(TokeniserState.Data);
                        return;
                    } else if (!(consume == 9 || consume == 10 || consume == 12 || consume == 13)) {
                        tokeniser.doctypePending.name.append(consume);
                        return;
                    }
                }
                tokeniser.transition(TokeniserState.AfterDoctypeName);
                return;
            }
            tokeniser.error((TokeniserState) this);
            tokeniser.doctypePending.name.append(TokeniserState.replacementChar);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (characterReader.matchesAny(9, 10, 13, 12, ' ')) {
                characterReader.advance();
            } else if (characterReader.matches('>')) {
                tokeniser.emitDoctypePending();
                tokeniser.advanceTransition(TokeniserState.Data);
            } else if (characterReader.matchConsumeIgnoreCase(DocumentType.PUBLIC_KEY)) {
                tokeniser.doctypePending.pubSysKey = DocumentType.PUBLIC_KEY;
                tokeniser.transition(TokeniserState.AfterDoctypePublicKeyword);
            } else if (characterReader.matchConsumeIgnoreCase(DocumentType.SYSTEM_KEY)) {
                tokeniser.doctypePending.pubSysKey = DocumentType.SYSTEM_KEY;
                tokeniser.transition(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.advanceTransition(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypePublicIdentifier);
            } else if (consume == '\"') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            } else if (consume == '\'') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.transition(TokeniserState.BogusDoctype);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 9 && consume != 10 && consume != 12 && consume != 13 && consume != ' ') {
                if (consume == '\"') {
                    tokeniser.transition(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                } else if (consume == '\'') {
                    tokeniser.transition(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                } else if (consume == '>') {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                } else if (consume != 65535) {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.transition(TokeniserState.BogusDoctype);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                }
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.publicIdentifier.append(TokeniserState.replacementChar);
            } else if (consume == '\"') {
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.doctypePending.publicIdentifier.append(consume);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.publicIdentifier.append(TokeniserState.replacementChar);
            } else if (consume == '\'') {
                tokeniser.transition(TokeniserState.AfterDoctypePublicIdentifier);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.doctypePending.publicIdentifier.append(consume);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
            } else if (consume == '\"') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            } else if (consume == '\'') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
            } else if (consume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.transition(TokeniserState.BogusDoctype);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 9 && consume != 10 && consume != 12 && consume != 13 && consume != ' ') {
                if (consume == '\"') {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                } else if (consume == '\'') {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                } else if (consume == '>') {
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                } else if (consume != 65535) {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.transition(TokeniserState.BogusDoctype);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                }
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(TokeniserState.BeforeDoctypeSystemIdentifier);
            } else if (consume == '\"') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            } else if (consume == '\'') {
                tokeniser.error((TokeniserState) this);
                tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 9 && consume != 10 && consume != 12 && consume != 13 && consume != ' ') {
                if (consume == '\"') {
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                } else if (consume == '\'') {
                    tokeniser.transition(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                } else if (consume == '>') {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                } else if (consume != 65535) {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.transition(TokeniserState.BogusDoctype);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                }
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.systemIdentifier.append(TokeniserState.replacementChar);
            } else if (consume == '\"') {
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.doctypePending.systemIdentifier.append(consume);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == 0) {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.systemIdentifier.append(TokeniserState.replacementChar);
            } else if (consume == '\'') {
                tokeniser.transition(TokeniserState.AfterDoctypeSystemIdentifier);
            } else if (consume == '>') {
                tokeniser.error((TokeniserState) this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume != 65535) {
                tokeniser.doctypePending.systemIdentifier.append(consume);
            } else {
                tokeniser.eofError(this);
                tokeniser.doctypePending.forceQuirks = true;
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume != 9 && consume != 10 && consume != 12 && consume != 13 && consume != ' ') {
                if (consume == '>') {
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                } else if (consume != 65535) {
                    tokeniser.error((TokeniserState) this);
                    tokeniser.transition(TokeniserState.BogusDoctype);
                } else {
                    tokeniser.eofError(this);
                    tokeniser.doctypePending.forceQuirks = true;
                    tokeniser.emitDoctypePending();
                    tokeniser.transition(TokeniserState.Data);
                }
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            char consume = characterReader.consume();
            if (consume == '>') {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            } else if (consume == 65535) {
                tokeniser.emitDoctypePending();
                tokeniser.transition(TokeniserState.Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        public void read(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.emit(characterReader.consumeTo("]]>"));
            characterReader.matchConsume("]]>");
            tokeniser.transition(TokeniserState.Data);
        }
    };
    
    /* access modifiers changed from: private */
    public static final char[] attributeDoubleValueCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeNameCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeSingleValueCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeValueUnquoted = null;
    private static final char eof = '￿';
    static final char nullChar = '\u0000';
    private static final char replacementChar = '�';
    /* access modifiers changed from: private */
    public static final String replacementStr = null;

    static {
        char[] cArr = {'\'', '&', nullChar};
        attributeSingleValueCharsSorted = cArr;
        char[] cArr2 = {'\"', '&', nullChar};
        attributeDoubleValueCharsSorted = cArr2;
        char[] cArr3 = {9, 10, 13, 12, ' ', '/', '=', '>', nullChar, '\"', '\'', '<'};
        attributeNameCharsSorted = cArr3;
        char[] cArr4 = {9, 10, 13, 12, ' ', '&', '>', nullChar, '\"', '\'', '<', '=', '`'};
        attributeValueUnquoted = cArr4;
        replacementStr = String.valueOf(replacementChar);
        Arrays.sort(cArr);
        Arrays.sort(cArr2);
        Arrays.sort(cArr3);
        Arrays.sort(cArr4);
    }

    /* access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.dataBuffer.append(consumeLetterSequence);
            tokeniser.emit(consumeLetterSequence);
            return;
        }
        char consume = characterReader.consume();
        if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ' || consume == '/' || consume == '>') {
            if (tokeniser.dataBuffer.toString().equals("script")) {
                tokeniser.transition(tokeniserState);
            } else {
                tokeniser.transition(tokeniserState2);
            }
            tokeniser.emit(consume);
            return;
        }
        characterReader.unconsume();
        tokeniser.transition(tokeniserState2);
    }

    /* access modifiers changed from: private */
    public static void handleDataEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.matchesLetter()) {
            String consumeLetterSequence = characterReader.consumeLetterSequence();
            tokeniser.tagPending.appendTagName(consumeLetterSequence);
            tokeniser.dataBuffer.append(consumeLetterSequence);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (tokeniser.isAppropriateEndTagToken() && !characterReader.isEmpty()) {
            char consume = characterReader.consume();
            if (consume == 9 || consume == 10 || consume == 12 || consume == 13 || consume == ' ') {
                tokeniser.transition(BeforeAttributeName);
            } else if (consume == '/') {
                tokeniser.transition(SelfClosingStartTag);
            } else if (consume != '>') {
                tokeniser.dataBuffer.append(consume);
                z = true;
            } else {
                tokeniser.emitTagPending();
                tokeniser.transition(Data);
            }
            z2 = z;
        }
        if (z2) {
            tokeniser.emit("</" + tokeniser.dataBuffer.toString());
            tokeniser.transition(tokeniserState);
        }
    }

    /* access modifiers changed from: private */
    public static void readCharRef(Tokeniser tokeniser, TokeniserState tokeniserState) {
        int[] consumeCharacterReference = tokeniser.consumeCharacterReference((Character) null, false);
        if (consumeCharacterReference == null) {
            tokeniser.emit('&');
        } else {
            tokeniser.emit(consumeCharacterReference);
        }
        tokeniser.transition(tokeniserState);
    }

    /* access modifiers changed from: private */
    public static void readData(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char current = characterReader.current();
        if (current == 0) {
            tokeniser.error(tokeniserState);
            characterReader.advance();
            tokeniser.emit((char) replacementChar);
        } else if (current == '<') {
            tokeniser.advanceTransition(tokeniserState2);
        } else if (current != 65535) {
            tokeniser.emit(characterReader.consumeToAny('<', nullChar));
        } else {
            tokeniser.emit((Token) new Token.EOF());
        }
    }

    /* access modifiers changed from: private */
    public static void readEndTag(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.matchesLetter()) {
            tokeniser.createTagPending(false);
            tokeniser.transition(tokeniserState);
            return;
        }
        tokeniser.emit("</");
        tokeniser.transition(tokeniserState2);
    }

    /* access modifiers changed from: package-private */
    public abstract void read(Tokeniser tokeniser, CharacterReader characterReader);
}
