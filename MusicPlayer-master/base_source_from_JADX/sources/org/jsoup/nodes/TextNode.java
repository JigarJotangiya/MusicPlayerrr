package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class TextNode extends Node {
    private static final String TEXT_KEY = "text";
    String text;

    public TextNode(String str, String str2) {
        this.baseUri = str2;
        this.text = str;
    }

    public static TextNode createFromEncoded(String str, String str2) {
        return new TextNode(Entities.unescape(str), str2);
    }

    private void ensureAttributes() {
        if (this.attributes == null) {
            Attributes attributes = new Attributes();
            this.attributes = attributes;
            attributes.put(TEXT_KEY, this.text);
        }
    }

    static boolean lastCharIsWhitespace(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    static String normaliseWhitespace(String str) {
        return StringUtil.normaliseWhitespace(str);
    }

    static String stripLeadingWhitespace(String str) {
        return str.replaceFirst("^\\s+", BuildConfig.FLAVOR);
    }

    public String absUrl(String str) {
        ensureAttributes();
        return super.absUrl(str);
    }

    public String attr(String str) {
        ensureAttributes();
        return super.attr(str);
    }

    public Attributes attributes() {
        ensureAttributes();
        return super.attributes();
    }

    public String getWholeText() {
        Attributes attributes = this.attributes;
        return attributes == null ? this.text : attributes.get(TEXT_KEY);
    }

    public boolean hasAttr(String str) {
        ensureAttributes();
        return super.hasAttr(str);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(getWholeText());
    }

    public String nodeName() {
        return "#text";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        indent(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void outerHtmlHead(java.lang.Appendable r7, int r8, org.jsoup.nodes.Document.OutputSettings r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9.prettyPrint()
            if (r0 == 0) goto L_0x003d
            int r0 = r6.siblingIndex()
            if (r0 != 0) goto L_0x0024
            org.jsoup.nodes.Node r0 = r6.parentNode
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L_0x0024
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r6.isBlank()
            if (r0 == 0) goto L_0x003a
        L_0x0024:
            boolean r0 = r9.outline()
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r6.siblingNodes()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            boolean r0 = r6.isBlank()
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r6.indent(r7, r8, r9)
        L_0x003d:
            boolean r8 = r9.prettyPrint()
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = r8 instanceof org.jsoup.nodes.Element
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = org.jsoup.nodes.Element.preserveWhitespace(r8)
            if (r8 != 0) goto L_0x0058
            r8 = 1
            r4 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
            r4 = 0
        L_0x005a:
            java.lang.String r1 = r6.getWholeText()
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            org.jsoup.nodes.Entities.escape(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.TextNode.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public Node removeAttr(String str) {
        ensureAttributes();
        return super.removeAttr(str);
    }

    public TextNode splitText(int i) {
        Validate.isTrue(i >= 0, "Split offset must be not be negative");
        Validate.isTrue(i < this.text.length(), "Split offset must not be greater than current text length");
        String substring = getWholeText().substring(0, i);
        String substring2 = getWholeText().substring(i);
        text(substring);
        TextNode textNode = new TextNode(substring2, baseUri());
        if (parent() != null) {
            parent().addChildren(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return normaliseWhitespace(getWholeText());
    }

    public String toString() {
        return outerHtml();
    }

    public TextNode text(String str) {
        this.text = str;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            attributes.put(TEXT_KEY, str);
        }
        return this;
    }

    public Node attr(String str, String str2) {
        ensureAttributes();
        return super.attr(str, str2);
    }
}
