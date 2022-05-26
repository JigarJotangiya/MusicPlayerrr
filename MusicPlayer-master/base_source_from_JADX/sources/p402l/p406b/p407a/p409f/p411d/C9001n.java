package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8977k;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.n */
/* compiled from: FileHeaderReader */
public class C9001n implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35459a = {C8978l.f35399k};

    protected C9001n() {
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        inputStream.skip(16);
        C8977k kVar = r0;
        C8977k kVar2 = new C8977k(h, C9014c.m48174h(inputStream), C9014c.m48174h(inputStream), C9014c.m48174h(inputStream), C9014c.m48174h(inputStream), C9014c.m48174h(inputStream), C9014c.m48174h(inputStream), C9014c.m48180n(inputStream), C9014c.m48180n(inputStream), C9014c.m48180n(inputStream), C9014c.m48180n(inputStream));
        C8977k kVar3 = kVar;
        kVar3.mo31329f(j);
        return kVar3;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35459a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
