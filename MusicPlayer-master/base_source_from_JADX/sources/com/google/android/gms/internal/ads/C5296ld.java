package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ld */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5296ld extends qm3<C5296ld, C5259kd> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5296ld zzb;
    private int zze;
    private C5407od zzf;
    private kl3 zzg;
    private kl3 zzh;

    static {
        C5296ld ldVar = new C5296ld();
        zzb = ldVar;
        qm3.m29616t(C5296ld.class, ldVar);
    }

    private C5296ld() {
        kl3 kl3 = kl3.zzb;
        this.zzg = kl3;
        this.zzh = kl3;
    }

    /* renamed from: E */
    public static C5296ld m26653E(kl3 kl3, cm3 cm3) throws bn3 {
        return (C5296ld) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5296ld();
        } else {
            if (i2 == 4) {
                return new C5259kd((C5222jd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final C5407od mo19141F() {
        C5407od odVar = this.zzf;
        return odVar == null ? C5407od.m28427I() : odVar;
    }

    /* renamed from: G */
    public final kl3 mo19142G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final kl3 mo19143H() {
        return this.zzg;
    }
}
