package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p402l.p406b.p407a.p418k.C9067b;

/* renamed from: l.b.a.k.j.h */
/* compiled from: Mp4HdlrBox */
public class C9084h extends C9075a {

    /* renamed from: e */
    private static Map<String, C9085a> f35661e = new HashMap();

    /* renamed from: c */
    private String f35662c;

    /* renamed from: d */
    private C9085a f35663d;

    /* renamed from: l.b.a.k.j.h$a */
    /* compiled from: Mp4HdlrBox */
    public enum C9085a {
        ODSM("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        CRSM("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        SDSM("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        M7SM("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        OCSM("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        IPSM("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        MJSM("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO"),
        MDIR("mdir", "Apple Meta Data iTunes Reader"),
        MP7B("mp7b", "MPEG-7 binary XML"),
        MP7T("mp7t", "MPEG-7 XML"),
        VIDE("vide", "Video Track"),
        SOUN("soun", "Sound Track"),
        HINT("hint", "Hint Track"),
        APPL("appl", "Apple specific"),
        META("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        
        private String description;

        /* renamed from: id */
        private String f35665id;

        private C9085a(String str, String str2) {
            this.f35665id = str;
            this.description = str2;
        }

        public String getDescription() {
            return this.description;
        }

        public String getId() {
            return this.f35665id;
        }
    }

    static {
        for (C9085a aVar : C9085a.values()) {
            f35661e.put(aVar.getId(), aVar);
        }
    }

    public C9084h(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        this.f35629b = byteBuffer;
    }

    /* renamed from: c */
    public static C9084h m48467c() {
        C9077c cVar = new C9077c(C9067b.HDLR.getFieldName());
        cVar.mo31646j(34);
        ByteBuffer allocate = ByteBuffer.allocate(26);
        allocate.put(8, (byte) 109);
        allocate.put(9, (byte) 100);
        allocate.put(10, (byte) 105);
        allocate.put(11, (byte) 114);
        allocate.put(12, (byte) 97);
        allocate.put(13, (byte) 112);
        allocate.put(14, (byte) 112);
        allocate.put(15, (byte) 108);
        allocate.rewind();
        return new C9084h(cVar, allocate);
    }

    public String toString() {
        return "handlerType:" + this.f35662c + ":human readable:" + this.f35663d.getDescription();
    }
}
