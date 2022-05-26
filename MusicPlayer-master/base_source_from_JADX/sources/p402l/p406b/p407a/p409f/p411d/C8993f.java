package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.f */
/* compiled from: ChunkHeaderReader */
final class C8993f implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35451a = {C8978l.f35409u};

    /* renamed from: b */
    private static final C8993f f35452b = new C8993f();

    private C8993f() {
    }

    /* renamed from: d */
    public static C8993f m48118d() {
        return f35452b;
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        inputStream.skip(h.longValue() - 24);
        return new C8970d(lVar, j, h);
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35451a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
