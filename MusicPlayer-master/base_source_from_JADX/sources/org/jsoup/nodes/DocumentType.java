package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;

public class DocumentType extends Node {
    private static final String NAME = "name";
    private static final String PUBLIC_ID = "publicId";
    public static final String PUBLIC_KEY = "PUBLIC";
    private static final String PUB_SYS_KEY = "pubSysKey";
    private static final String SYSTEM_ID = "systemId";
    public static final String SYSTEM_KEY = "SYSTEM";

    public DocumentType(String str, String str2, String str3, String str4) {
        super(str4);
        attr(NAME, str);
        attr(PUBLIC_ID, str2);
        if (has(PUBLIC_ID)) {
            attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        attr(SYSTEM_ID, str3);
    }

    private boolean has(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    public String nodeName() {
        return "#doctype";
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        if (outputSettings.syntax() != Document.OutputSettings.Syntax.html || has(PUBLIC_ID) || has(SYSTEM_ID)) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (has(NAME)) {
            appendable.append(" ").append(attr(NAME));
        }
        if (has(PUB_SYS_KEY)) {
            appendable.append(" ").append(attr(PUB_SYS_KEY));
        }
        if (has(PUBLIC_ID)) {
            appendable.append(" \"").append(attr(PUBLIC_ID)).append('\"');
        }
        if (has(SYSTEM_ID)) {
            appendable.append(" \"").append(attr(SYSTEM_ID)).append('\"');
        }
        appendable.append('>');
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public DocumentType(String str, String str2, String str3, String str4, String str5) {
        super(str5);
        attr(NAME, str);
        if (str2 != null) {
            attr(PUB_SYS_KEY, str2);
        }
        attr(PUBLIC_ID, str3);
        attr(SYSTEM_ID, str4);
    }
}
