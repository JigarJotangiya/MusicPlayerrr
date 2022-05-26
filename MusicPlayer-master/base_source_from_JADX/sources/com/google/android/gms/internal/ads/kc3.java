package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kc3 extends ka3<ri3, oi3> {
    kc3(lc3 lc3, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ zn3 mo15753a(kl3 kl3) throws bn3 {
        return ri3.m30150G(kl3, cm3.m21985a());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo15754c(zn3 zn3) throws GeneralSecurityException {
        ni3 E = oi3.m28518E();
        E.mo19737r((ri3) zn3);
        E.mo19738s(0);
        return (oi3) E.mo19761n();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15756e(zn3 zn3) throws GeneralSecurityException {
        ri3 ri3 = (ri3) zn3;
        if (ri3.mo20666H().isEmpty() || !ri3.mo20667I()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
