package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mb3 extends ka3<oe3, le3> {
    mb3(nb3 nb3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return oe3.m28465F(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        oe3 oe3 = (oe3) zn3;
        new qb3();
        re3 g = pb3.m28978g(oe3.mo19977G());
        Object c = new td3().mo16216a().mo15754c(oe3.mo19978H());
        ke3 E = le3.m26709E();
        E.mo18880r(g);
        E.mo18881s((eh3) c);
        E.mo18882t(0);
        return (le3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<oe3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", nb3.m27809k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", nb3.m27809k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", nb3.m27809k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", nb3.m27809k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        oe3 oe3 = (oe3) zn3;
        ((pb3) new qb3().mo16216a()).mo15756e(oe3.mo19977G());
        new td3().mo16216a().mo15756e(oe3.mo19978H());
        qk3.m29554a(oe3.mo19977G().mo21257D());
    }
}
