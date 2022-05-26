package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yb3 extends ka3<tf3, qf3> {
    yb3(zb3 zb3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return tf3.m31241G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        pf3 E = qf3.m29505E();
        E.mo20264r(kl3.zzv(ok3.m28546a(((tf3) zn3).mo21057D())));
        E.mo20265s(0);
        return (qf3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<tf3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zb3.m34511l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zb3.m34511l(16, 3));
        hashMap.put("AES256_GCM_SIV", zb3.m34511l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zb3.m34511l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        qk3.m29554a(((tf3) zn3).mo21057D());
    }
}
