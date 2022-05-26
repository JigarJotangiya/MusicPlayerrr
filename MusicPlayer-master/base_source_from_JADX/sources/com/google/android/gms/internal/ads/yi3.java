package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yi3 extends qm3<yi3, xi3> implements ao3 {
    /* access modifiers changed from: private */
    public static final yi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;

    static {
        yi3 yi3 = new yi3();
        zzb = yi3;
        qm3.m29616t(yi3.class, yi3);
    }

    private yi3() {
    }

    /* renamed from: E */
    public static xi3 m34130E() {
        return (xi3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static yi3 m34132G(kl3 kl3, cm3 cm3) throws bn3 {
        return (yi3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new yi3();
        } else {
            if (i2 == 4) {
                return new xi3((wi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo22202D() {
        return this.zze;
    }

    /* renamed from: H */
    public final kl3 mo22203H() {
        return this.zzf;
    }
}
