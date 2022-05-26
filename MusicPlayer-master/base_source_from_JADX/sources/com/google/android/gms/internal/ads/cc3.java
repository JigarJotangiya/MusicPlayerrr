package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cc3 extends ma3<cg3> {
    cc3() {
        super(cg3.class, new ac3(x93.class));
    }

    /* renamed from: a */
    public final ka3<fg3, cg3> mo16216a() {
        return new bc3(this, fg3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return cg3.m21911G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        cg3 cg3 = (cg3) zn3;
        qk3.m29555b(cg3.mo16630D(), 0);
        if (cg3.mo16631H().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
