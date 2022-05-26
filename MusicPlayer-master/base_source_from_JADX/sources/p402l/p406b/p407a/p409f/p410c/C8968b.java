package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.c.b */
/* compiled from: AsfHeader */
public final class C8968b extends C8971e {

    /* renamed from: g */
    public static final Charset f35366g = Charset.forName("UTF-16LE");

    /* renamed from: h */
    public static final byte[] f35367h = {0, 0};

    /* renamed from: f */
    private final long f35368f;

    static {
        new HashSet().add(C8978l.f35406r);
    }

    public C8968b(long j, BigInteger bigInteger, long j2) {
        super(C8978l.f35400l, j, bigInteger);
        this.f35368f = j2;
    }

    /* renamed from: e */
    public String mo31303e(String str) {
        return new StringBuilder(super.mo31336l(str, str + "  | : Contains: \"" + mo31307p() + "\" chunks" + C9014c.f35470a)).toString();
    }

    /* renamed from: m */
    public C8981o mo31304m() {
        C8981o q = mo31308q();
        return (q != null || mo31309r() == null) ? q : mo31309r().mo31302m();
    }

    /* renamed from: n */
    public C8981o mo31305n(C8972f fVar) {
        Class<C8981o> cls = C8981o.class;
        C8981o oVar = (C8981o) mo31334j(fVar.getContainerGUID(), cls);
        return oVar == null ? (C8981o) mo31309r().mo31334j(fVar.getContainerGUID(), cls) : oVar;
    }

    /* renamed from: o */
    public C8969c mo31306o() {
        List<C8970d> h = mo31332h(C8978l.f35406r);
        C8969c cVar = null;
        for (int i = 0; i < h.size() && cVar == null; i++) {
            if (h.get(i) instanceof C8969c) {
                cVar = (C8969c) h.get(i);
            }
        }
        return cVar;
    }

    /* renamed from: p */
    public long mo31307p() {
        return this.f35368f;
    }

    /* renamed from: q */
    public C8981o mo31308q() {
        return (C8981o) mo31334j(C8978l.f35398j, C8981o.class);
    }

    /* renamed from: r */
    public C8967a mo31309r() {
        return (C8967a) mo31334j(C8978l.f35401m, C8967a.class);
    }

    /* renamed from: s */
    public C8977k mo31310s() {
        return (C8977k) mo31334j(C8978l.f35399k, C8977k.class);
    }
}
