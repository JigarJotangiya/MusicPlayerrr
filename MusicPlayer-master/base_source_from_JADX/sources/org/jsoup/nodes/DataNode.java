package org.jsoup.nodes;

import java.io.IOException;
import org.jsoup.nodes.Document;

public class DataNode extends Node {
    private static final String DATA_KEY = "data";

    public DataNode(String str, String str2) {
        super(str2);
        this.attributes.put(DATA_KEY, str);
    }

    public static DataNode createFromEncoded(String str, String str2) {
        return new DataNode(Entities.unescape(str), str2);
    }

    public String getWholeData() {
        return this.attributes.get(DATA_KEY);
    }

    public String nodeName() {
        return "#data";
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlHead(Appendable appendable, int i, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(getWholeData());
    }

    /* access modifiers changed from: package-private */
    public void outerHtmlTail(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public DataNode setWholeData(String str) {
        this.attributes.put(DATA_KEY, str);
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
