package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sd3 extends ka3<hh3, eh3> {
    sd3(td3 td3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return hh3.m24807H(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        hh3 hh3 = (hh3) zn3;
        dh3 E = eh3.m22990E();
        E.mo16934t(0);
        E.mo16933s(hh3.mo18144I());
        E.mo16932r(kl3.zzv(ok3.m28546a(hh3.mo18143D())));
        return (eh3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<hh3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", td3.m31224m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", td3.m31224m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", td3.m31224m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", td3.m31224m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", td3.m31224m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", td3.m31224m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", td3.m31224m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", td3.m31224m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", td3.m31224m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", td3.m31224m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        hh3 hh3 = (hh3) zn3;
        if (hh3.mo18143D() >= 16) {
            td3.m31225n(hh3.mo18144I());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
