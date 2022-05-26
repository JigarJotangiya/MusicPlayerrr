package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class td3 extends ma3<eh3> {
    public td3() {
        super(eh3.class, new rd3(qa3.class));
    }

    /* renamed from: l */
    public static final void m31223l(eh3 eh3) throws GeneralSecurityException {
        qk3.m29555b(eh3.mo17190D(), 0);
        if (eh3.mo17192J().zzd() >= 16) {
            m31225n(eh3.mo17191I());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ ja3 m31224m(int i, int i2, int i3, int i4) {
        gh3 E = hh3.m24804E();
        kh3 E2 = lh3.m26741E();
        E2.mo18891s(i3);
        E2.mo18890r(i2);
        E.mo17923s((lh3) E2.mo19761n());
        E.mo17922r(i);
        return new ja3((hh3) E.mo19761n(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m31225n(lh3 lh3) throws GeneralSecurityException {
        if (lh3.mo19170D() >= 10) {
            int I = lh3.mo19171I() - 2;
            if (I != 1) {
                if (I != 2) {
                    if (I != 3) {
                        if (I != 4) {
                            if (I != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (lh3.mo19170D() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (lh3.mo19170D() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (lh3.mo19170D() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (lh3.mo19170D() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (lh3.mo19170D() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final ka3<hh3, eh3> mo16216a() {
        return new sd3(this, hh3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return eh3.m22993H(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        m31223l((eh3) zn3);
    }

    /* renamed from: i */
    public final int mo19370i() {
        return 2;
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
