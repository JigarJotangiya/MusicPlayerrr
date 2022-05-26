package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tb3 extends ma3<af3> {
    tb3() {
        super(af3.class, new rb3(x93.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ ja3 m31186k(int i, int i2, int i3) {
        cf3 E = df3.m22493E();
        E.mo16621r(i);
        ff3 E2 = gf3.m24313E();
        E2.mo17529r(16);
        E.mo16622s((gf3) E2.mo19761n());
        return new ja3((df3) E.mo19761n(), i3);
    }

    /* renamed from: a */
    public final ka3<df3, af3> mo16216a() {
        return new sb3(this, df3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return af3.m20701G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        af3 af3 = (af3) zn3;
        qk3.m29555b(af3.mo15768D(), 0);
        qk3.m29554a(af3.mo15770I().zzd());
        if (af3.mo15769H().mo17903D() != 12 && af3.mo15769H().mo17903D() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 3;
    }
}
