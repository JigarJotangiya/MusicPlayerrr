package p402l.p406b.p426c.p435v;

import p402l.p406b.p426c.p439x.C9294e;

/* renamed from: l.b.c.v.b */
/* compiled from: Mp4NonStandardFieldKey */
public enum C9270b {
    AAPR("AApr", "MM3 Album Art Attributes", r5),
    ALFN("Alfn", "MM3 Album Art Unknown", r5),
    AMIM("AMIM", "MM3 Album Art MimeType", r5),
    ADCP("Adcp", "MM3 Album Art Description", r5),
    APTY("Apty", "MM3 Album Art ID3 Picture Type", r5);
    
    private String description;
    private String fieldName;
    private C9294e tagger;

    private C9270b(String str, String str2, C9294e eVar) {
        this.fieldName = str;
        this.description = str2;
        this.tagger = eVar;
    }

    public C9294e geTagger() {
        return this.tagger;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFieldName() {
        return this.fieldName;
    }
}
