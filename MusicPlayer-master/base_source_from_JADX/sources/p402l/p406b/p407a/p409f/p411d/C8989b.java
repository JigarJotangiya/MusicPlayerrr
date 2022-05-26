package p402l.p406b.p407a.p409f.p411d;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;
import p402l.p406b.p407a.p409f.p410c.C8967a;
import p402l.p406b.p407a.p409f.p410c.C8978l;
import p402l.p406b.p407a.p409f.p412e.C9014c;

/* renamed from: l.b.a.f.d.b */
/* compiled from: AsfExtHeaderReader */
public class C8989b extends C8992e<C8967a> {

    /* renamed from: e */
    private static final C8978l[] f35442e = {C8978l.f35401m};

    public C8989b(List<Class<? extends C8995h>> list, boolean z) {
        super(list, z);
    }

    /* renamed from: b */
    public C8978l[] mo31452b() {
        return (C8978l[]) f35442e.clone();
    }

    /* renamed from: c */
    public boolean mo31453c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8967a mo31454e(long j, BigInteger bigInteger, InputStream inputStream) throws IOException {
        C9014c.m48178l(inputStream);
        C9014c.m48179m(inputStream);
        C9014c.m48180n(inputStream);
        return new C8967a(j, bigInteger);
    }
}
