package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8973g;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.i */
/* compiled from: ContentBrandingReader */
public class C8996i implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35453a = {C8978l.f35394f};

    protected C8996i() {
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        BigInteger h = C9014c.m48174h(inputStream);
        long n = C9014c.m48180n(inputStream);
        byte[] i = C9014c.m48175i(inputStream, C9014c.m48180n(inputStream));
        String str = new String(C9014c.m48175i(inputStream, C9014c.m48180n(inputStream)));
        String str2 = new String(C9014c.m48175i(inputStream, C9014c.m48180n(inputStream)));
        C8973g gVar = new C8973g(j, h);
        gVar.mo31346A(n, i);
        gVar.mo31355z(str);
        gVar.mo31354y(str2);
        return gVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35453a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
