package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oc3 extends ma3<yi3> {
    oc3() {
        super(yi3.class, new mc3(x93.class));
    }

    /* renamed from: a */
    public final ka3<bj3, yi3> mo16216a() {
        return new nc3(this, bj3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return yi3.m34132G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        yi3 yi3 = (yi3) zn3;
        qk3.m29555b(yi3.mo22202D(), 0);
        if (yi3.mo22203H().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
