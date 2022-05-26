package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;

/* renamed from: l.b.a.f.c.p */
/* compiled from: MetadataContainerFactory */
public final class C8983p {

    /* renamed from: a */
    private static final C8983p f35421a = new C8983p();

    private C8983p() {
    }

    /* renamed from: d */
    public static C8983p m48043d() {
        return f35421a;
    }

    /* renamed from: a */
    public C8981o mo31399a(C8972f fVar) {
        return mo31400b(fVar, 0, BigInteger.ZERO);
    }

    /* renamed from: b */
    public C8981o mo31400b(C8972f fVar, long j, BigInteger bigInteger) {
        if (fVar == C8972f.CONTENT_DESCRIPTION) {
            return new C8974h(j, bigInteger);
        }
        if (fVar == C8972f.CONTENT_BRANDING) {
            return new C8973g(j, bigInteger);
        }
        return new C8981o(fVar, j, bigInteger);
    }

    /* renamed from: c */
    public C8981o[] mo31401c(C8972f[] fVarArr) {
        int length = fVarArr.length;
        C8981o[] oVarArr = new C8981o[length];
        for (int i = 0; i < length; i++) {
            oVarArr[i] = mo31399a(fVarArr[i]);
        }
        return oVarArr;
    }
}
