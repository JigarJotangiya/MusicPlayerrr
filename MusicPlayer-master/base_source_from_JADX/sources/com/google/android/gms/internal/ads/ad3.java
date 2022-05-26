package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ad3 extends ka3<ng3, tg3> {
    ad3(bd3 bd3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return ng3.m27861F(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        ng3 ng3 = (ng3) zn3;
        KeyPair b = wj3.m33188b(wj3.m33191e(ld3.m26662c(ng3.mo19728G().mo20446H().mo22365I())));
        ECPoint w = ((ECPublicKey) b.getPublic()).getW();
        vg3 F = wg3.m33144F();
        F.mo21503s(0);
        F.mo21502r(ng3.mo19728G());
        F.mo21504t(kl3.zzv(w.getAffineX().toByteArray()));
        F.mo21505u(kl3.zzv(w.getAffineY().toByteArray()));
        sg3 E = tg3.m31246E();
        E.mo20847t(0);
        E.mo20846s((wg3) F.mo19761n());
        E.mo20845r(kl3.zzv(((ECPrivateKey) b.getPrivate()).getS().toByteArray()));
        return (tg3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<ng3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", bd3.m21270l(4, 5, 3, ia3.m25124a("AES128_GCM"), bd3.f14408d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", bd3.m21270l(4, 5, 3, ia3.m25124a("AES128_GCM"), bd3.f14408d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", bd3.m21270l(4, 5, 4, ia3.m25124a("AES128_GCM"), bd3.f14408d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", bd3.m21270l(4, 5, 4, ia3.m25124a("AES128_GCM"), bd3.f14408d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", bd3.m21270l(4, 5, 4, ia3.m25124a("AES128_GCM"), bd3.f14408d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", bd3.m21270l(4, 5, 3, ia3.m25124a("AES128_CTR_HMAC_SHA256"), bd3.f14408d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", bd3.m21270l(4, 5, 3, ia3.m25124a("AES128_CTR_HMAC_SHA256"), bd3.f14408d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", bd3.m21270l(4, 5, 4, ia3.m25124a("AES128_CTR_HMAC_SHA256"), bd3.f14408d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", bd3.m21270l(4, 5, 4, ia3.m25124a("AES128_CTR_HMAC_SHA256"), bd3.f14408d, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        ld3.m26660a(((ng3) zn3).mo19728G());
    }
}
