package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sb3 extends ka3<df3, af3> {
    sb3(tb3 tb3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return df3.m22495G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        df3 df3 = (df3) zn3;
        ze3 E = af3.m20699E();
        E.mo22358r(kl3.zzv(ok3.m28546a(df3.mo16916D())));
        E.mo22359s(df3.mo16917H());
        E.mo22360t(0);
        return (af3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<df3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", tb3.m31186k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", tb3.m31186k(16, 16, 3));
        hashMap.put("AES256_EAX", tb3.m31186k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", tb3.m31186k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        df3 df3 = (df3) zn3;
        qk3.m29554a(df3.mo16916D());
        if (df3.mo16917H().mo17903D() != 12 && df3.mo16917H().mo17903D() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
