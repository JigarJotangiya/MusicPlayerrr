package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p410c.C8980n;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.p */
/* compiled from: LanguageListReader */
public class C9003p implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35460a = {C8978l.f35402n};

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        int m = C9014c.m48179m(inputStream);
        C8980n nVar = new C8980n(j, h);
        for (int i = 0; i < m; i++) {
            nVar.mo31381g(C9014c.m48177k(inputStream, inputStream.read() & 255));
        }
        return nVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35460a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
