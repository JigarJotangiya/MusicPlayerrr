package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bd3 extends ya3<tg3, wg3> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final byte[] f14408d = new byte[0];

    bd3() {
        super(tg3.class, wg3.class, new zc3(ba3.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ ja3 m21270l(int i, int i2, int i3, ha3 ha3, byte[] bArr, int i4) {
        mg3 D = ng3.m27859D();
        yg3 D2 = zg3.m34591D();
        int i5 = 4;
        D2.mo22195s(4);
        D2.mo22196t(5);
        D2.mo22194r(kl3.zzv(bArr));
        zg3 zg3 = (zg3) D2.mo19761n();
        qh3 D3 = rh3.m30131D();
        D3.mo20451r(ha3.mo18117a());
        D3.mo20452s(kl3.zzv(ha3.mo18118b()));
        int c = ha3.mo18119c() - 1;
        if (c == 0) {
            i5 = 3;
        } else if (c != 1) {
            i5 = c != 2 ? 6 : 5;
        }
        D3.mo20453t(i5);
        ig3 D4 = kg3.m26221D();
        D4.mo18330r((rh3) D3.mo19761n());
        pg3 E = qg3.m29517E();
        E.mo20270s(zg3);
        E.mo20269r((kg3) D4.mo19761n());
        E.mo20271t(i3);
        D.mo19380r((qg3) E.mo19761n());
        return new ja3((ng3) D.mo19761n(), i4);
    }

    /* renamed from: a */
    public final ka3<ng3, tg3> mo16216a() {
        return new ad3(this, ng3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zn3 mo16217b(kl3 kl3) throws bn3 {
        return tg3.m31248G(kl3, cm3.m21985a());
    }

    /* renamed from: f */
    public final String mo16218f() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo16219h(zn3 zn3) throws GeneralSecurityException {
        tg3 tg3 = (tg3) zn3;
        if (!tg3.mo21061I().zzD()) {
            qk3.m29555b(tg3.mo21059D(), 0);
            ld3.m26660a(tg3.mo21060H().mo21824E());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: j */
    public final int mo16220j() {
        return 4;
    }
}
