package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8972f;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p410c.C8981o;
import p402l.p406b.p407a.p409f.p410c.C8984q;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.q */
/* compiled from: MetadataReader */
public class C9004q implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35461a = {C8972f.EXTENDED_CONTENT.getContainerGUID(), C8972f.METADATA_OBJECT.getContainerGUID(), C8972f.METADATA_LIBRARY_OBJECT.getContainerGUID()};

    /* renamed from: d */
    private boolean m48148d(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        inputStream.read(bArr);
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == i - 1) {
                z = bArr[i2] == 1;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        int i;
        int i2;
        InputStream inputStream2 = inputStream;
        C8981o oVar = new C8981o(lVar, j, C9014c.m48174h(inputStream));
        boolean z = oVar.mo31388k() == C8972f.EXTENDED_CONTENT;
        int m = C9014c.m48179m(inputStream);
        int i3 = 0;
        while (i3 < m) {
            if (!z) {
                i = C9014c.m48179m(inputStream);
                i2 = C9014c.m48179m(inputStream);
            } else {
                i2 = 0;
                i = 0;
            }
            int m2 = C9014c.m48179m(inputStream);
            String str = null;
            if (z) {
                str = C9014c.m48177k(inputStream2, m2);
            }
            int m3 = C9014c.m48179m(inputStream);
            int i4 = i3;
            long m4 = z ? (long) C9014c.m48179m(inputStream) : C9014c.m48180n(inputStream);
            C8984q qVar = new C8984q(oVar.mo31388k(), !z ? C9014c.m48177k(inputStream2, m2) : str, m3, i2, i);
            switch (m3) {
                case 0:
                    qVar.mo31409H(C9014c.m48177k(inputStream2, (int) m4));
                    continue;
                case 1:
                    qVar.mo31402A(C9014c.m48175i(inputStream2, m4));
                    continue;
                case 2:
                    qVar.mo31403B(m48148d(inputStream2, (int) m4));
                    continue;
                case 3:
                    qVar.mo31404C(C9014c.m48180n(inputStream));
                    break;
                case 4:
                    qVar.mo31406E(C9014c.m48181o(inputStream));
                    break;
                case 5:
                    qVar.mo31410I(C9014c.m48179m(inputStream));
                    break;
                case 6:
                    qVar.mo31405D(C9014c.m48178l(inputStream));
                    break;
                default:
                    qVar.mo31409H("Invalid datatype: " + new String(C9014c.m48175i(inputStream2, m4)));
                    continue;
            }
            oVar.mo31384g(qVar);
            i3 = i4 + 1;
        }
        return oVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35461a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
