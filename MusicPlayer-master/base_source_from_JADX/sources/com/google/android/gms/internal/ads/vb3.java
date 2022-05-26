package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vb3 extends ka3<nf3, kf3> {
    vb3(wb3 wb3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return nf3.m27851G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        if3 E = kf3.m26209E();
        E.mo18327r(kl3.zzv(ok3.m28546a(((nf3) zn3).mo19723D())));
        E.mo18328s(0);
        return (kf3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<nf3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", wb3.m33061k(16, 1));
        hashMap.put("AES128_GCM_RAW", wb3.m33061k(16, 3));
        hashMap.put("AES256_GCM", wb3.m33061k(32, 1));
        hashMap.put("AES256_GCM_RAW", wb3.m33061k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        qk3.m29554a(((nf3) zn3).mo19723D());
    }
}
