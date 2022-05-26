package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nc3 extends ka3<bj3, yi3> {
    nc3(oc3 oc3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return bj3.m21344F(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        bj3 bj3 = (bj3) zn3;
        xi3 E = yi3.m34130E();
        E.mo22041s(0);
        E.mo22040r(kl3.zzv(ok3.m28546a(32)));
        return (yi3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<bj3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new ja3(bj3.m21343E(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new ja3(bj3.m21343E(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        bj3 bj3 = (bj3) zn3;
    }
}
