package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class uc3 extends ka3<zf3, wf3> {
    uc3(vc3 vc3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return zf3.m34578G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        vf3 E = wf3.m33124E();
        E.mo21493r(kl3.zzv(ok3.m28546a(((zf3) zn3).mo22361D())));
        E.mo21494s(0);
        return (wf3) E.mo19761n();
    }

    /* renamed from: d */
    public final Map<String, ja3<zf3>> mo15755d() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        yf3 E = zf3.m34576E();
        E.mo22191r(64);
        hashMap.put("AES256_SIV", new ja3((zf3) E.mo19761n(), 1));
        yf3 E2 = zf3.m34576E();
        E2.mo22191r(64);
        hashMap.put("AES256_SIV_RAW", new ja3((zf3) E2.mo19761n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        zf3 zf3 = (zf3) zn3;
        if (zf3.mo22361D() != 64) {
            int D = zf3.mo22361D();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(D);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }
}
