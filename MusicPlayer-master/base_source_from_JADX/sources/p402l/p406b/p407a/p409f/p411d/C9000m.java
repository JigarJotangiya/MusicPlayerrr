package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8976j;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.m */
/* compiled from: EncryptionChunkReader */
class C9000m implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35458a = {C8978l.f35395g};

    protected C9000m() {
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        C8976j jVar = new C8976j(C9014c.m48174h(inputStream));
        int n = (int) C9014c.m48180n(inputStream);
        byte[] bArr = new byte[(n + 1)];
        inputStream.read(bArr, 0, n);
        bArr[n] = 0;
        int n2 = (int) C9014c.m48180n(inputStream);
        byte[] bArr2 = new byte[(n2 + 1)];
        inputStream.read(bArr2, 0, n2);
        bArr2[n2] = 0;
        int n3 = (int) C9014c.m48180n(inputStream);
        byte[] bArr3 = new byte[(n3 + 1)];
        inputStream.read(bArr3, 0, n3);
        bArr3[n3] = 0;
        int n4 = (int) C9014c.m48180n(inputStream);
        byte[] bArr4 = new byte[(n4 + 1)];
        inputStream.read(bArr4, 0, n4);
        bArr4[n4] = 0;
        jVar.mo31370j(new String(bArr));
        jVar.mo31369i(new String(bArr2));
        jVar.mo31367g(new String(bArr3));
        jVar.mo31368h(new String(bArr4));
        jVar.mo31329f(j);
        return jVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35458a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
