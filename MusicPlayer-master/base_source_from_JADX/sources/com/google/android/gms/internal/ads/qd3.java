package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qd3 extends ma3<be3> {
    qd3() {
        super(be3.class, new od3(qa3.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m29483m(he3 he3) throws GeneralSecurityException {
        if (he3.mo18134D() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (he3.mo18134D() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m29484n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final ka3<ee3, be3> mo16216a() {
        return new pd3(this, ee3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return be3.m21281G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        be3 be3 = (be3) zn3;
        qk3.m29555b(be3.mo16223D(), 0);
        m29484n(be3.mo16225I().zzd());
        m29483m(be3.mo16224H());
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
