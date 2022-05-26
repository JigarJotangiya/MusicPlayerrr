package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8975i;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.l */
/* compiled from: EncodingChunkReader */
class C8999l implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35457a = {C8978l.f35397i};

    protected C8999l() {
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        C8975i iVar = new C8975i(h);
        inputStream.skip(20);
        int m = C9014c.m48179m(inputStream);
        int i = 46;
        for (int i2 = 0; i2 < m; i2++) {
            String j2 = C9014c.m48176j(inputStream);
            iVar.mo31366g(j2);
            i += (j2.length() * 2) + 4;
        }
        inputStream.skip(h.longValue() - ((long) i));
        iVar.mo31329f(j);
        return iVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35457a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
