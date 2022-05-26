package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bc3 extends ka3<fg3, cg3> {
    bc3(cc3 cc3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return fg3.m23667F(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        fg3 fg3 = (fg3) zn3;
        bg3 E = cg3.m21909E();
        E.mo16245s(0);
        E.mo16244r(kl3.zzv(ok3.m28546a(32)));
        return (cg3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<fg3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new ja3(fg3.m23666E(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new ja3(fg3.m23666E(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        fg3 fg3 = (fg3) zn3;
    }
}
