package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vc3 extends ma3<wf3> {
    vc3() {
        super(wf3.class, new tc3(aa3.class));
    }

    /* renamed from: a */
    public final ka3<zf3, wf3> mo16216a() {
        return new uc3(this, zf3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return wf3.m33126G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        wf3 wf3 = (wf3) zn3;
        qk3.m29555b(wf3.mo21812D(), 0);
        if (wf3.mo21813H().zzd() != 64) {
            int zzd = wf3.mo21813H().zzd();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(zzd);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
