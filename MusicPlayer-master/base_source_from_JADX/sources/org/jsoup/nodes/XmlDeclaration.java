package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

public class XmlDeclaration extends Node {
    private final boolean isProcessingInstruction;
    private final String name;

    public XmlDeclaration(String str, String str2, boolean z) {
        super(str2);
        Validate.notNull(str);
        this.name = str;
        this.isProcessingInstruction = z;
    }

    public String getWholeDeclaration() {
        return this.attributes.html().trim();
    }

    public String name() {
        return this.name;
    }

    public String nodeName() {
        return "#declaration";
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        String str = "!";
        appendable.append("<").append(this.isProcessingInstruction ? str : "?").append(this.name);
        this.attributes.html(appendable, outputSettings);
        if (!this.isProcessingInstruction) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String toString() {
        return outerHtml();
    }
}
