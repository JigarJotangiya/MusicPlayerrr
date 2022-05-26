package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qb3 extends ma3<re3> {
    qb3() {
        super(re3.class, new ob3(gk3.class));
    }

    /* renamed from: l */
    public static final void m29452l(re3 re3) throws GeneralSecurityException {
        qk3.m29555b(re3.mo20643D(), 0);
        qk3.m29554a(re3.mo20645J().zzd());
        m29453m(re3.mo20644I());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m29453m(xe3 xe3) throws GeneralSecurityException {
        if (xe3.mo22028D() < 12 || xe3.mo22028D() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final ka3<ue3, re3> mo16216a() {
        return new pb3(this, ue3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return re3.m30098H(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        m29452l((re3) zn3);
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
