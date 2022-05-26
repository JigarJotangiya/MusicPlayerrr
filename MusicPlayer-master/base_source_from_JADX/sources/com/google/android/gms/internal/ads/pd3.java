package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pd3 extends ka3<ee3, be3> {
    pd3(qd3 qd3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return ee3.m22975G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        ee3 ee3 = (ee3) zn3;
        ae3 E = be3.m21279E();
        E.mo15765t(0);
        E.mo15763r(kl3.zzv(ok3.m28546a(ee3.mo17181D())));
        E.mo15764s(ee3.mo17182H());
        return (be3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<ee3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        de3 E = ee3.m22973E();
        E.mo16912r(32);
        ge3 E2 = he3.m24786E();
        E2.mo17902r(16);
        E.mo16913s((he3) E2.mo19761n());
        hashMap.put("AES_CMAC", new ja3((ee3) E.mo19761n(), 1));
        de3 E3 = ee3.m22973E();
        E3.mo16912r(32);
        ge3 E4 = he3.m24786E();
        E4.mo17902r(16);
        E3.mo16913s((he3) E4.mo19761n());
        hashMap.put("AES256_CMAC", new ja3((ee3) E3.mo19761n(), 1));
        de3 E5 = ee3.m22973E();
        E5.mo16912r(32);
        ge3 E6 = he3.m24786E();
        E6.mo17902r(16);
        E5.mo16913s((he3) E6.mo19761n());
        hashMap.put("AES256_CMAC_RAW", new ja3((ee3) E5.mo19761n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        ee3 ee3 = (ee3) zn3;
        qd3.m29483m(ee3.mo17182H());
        qd3.m29484n(ee3.mo17181D());
    }
}
