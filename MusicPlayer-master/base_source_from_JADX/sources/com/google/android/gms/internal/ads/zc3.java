package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zc3 extends la3<ba3, tg3> {
    zc3(Class cls) {
        super(cls);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo15750b(Object obj) throws GeneralSecurityException {
        tg3 tg3 = (tg3) obj;
        qg3 E = tg3.mo21060H().mo21824E();
        zg3 H = E.mo20446H();
        int c = ld3.m26662c(H.mo22365I());
        byte[] zzE = tg3.mo21061I().zzE();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, zzE), wj3.m33191e(c));
        return new sj3((ECPrivateKey) yj3.f26382i.mo22204a("EC").generatePrivate(eCPrivateKeySpec), H.mo22364G().zzE(), ld3.m26661b(H.mo22366J()), ld3.m26663d(E.mo20447K()), new md3(E.mo20445D().mo18888G()));
    }
}
