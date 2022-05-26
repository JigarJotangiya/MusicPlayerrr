package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import p402l.p406b.p407a.p409f.p410c.C8970d;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p410c.C8985r;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.u */
/* compiled from: StreamBitratePropertiesReader */
public class C9008u implements C8995h {

    /* renamed from: a */
    private static final C8978l[] f35467a = {C8978l.f35407s};

    protected C9008u() {
    }

    /* renamed from: a */
    public C8970d mo31459a(C8978l lVar, InputStream inputStream, long j) throws IOException {
        C8985r rVar = new C8985r(C9014c.m48174h(inputStream));
        long m = (long) C9014c.m48179m(inputStream);
        for (int i = 0; ((long) i) < m; i++) {
            rVar.mo31432g(C9014c.m48179m(inputStream) & 255, C9014c.m48180n(inputStream));
        }
        rVar.mo31329f(j);
        return rVar;
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35467a.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }
}
