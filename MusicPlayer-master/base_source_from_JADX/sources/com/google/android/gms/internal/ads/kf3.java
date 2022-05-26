package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kf3 extends qm3<kf3, if3> implements ao3 {
    /* access modifiers changed from: private */
    public static final kf3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;

    static {
        kf3 kf3 = new kf3();
        zzb = kf3;
        qm3.m29616t(kf3.class, kf3);
    }

    private kf3() {
    }

    /* renamed from: E */
    public static if3 m26209E() {
        return (if3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static kf3 m26211G(kl3 kl3, cm3 cm3) throws bn3 {
        return (kf3) qm3.m29605A(zzb, kl3, cm3);
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
            return new kf3();
        } else {
            if (i2 == 4) {
                return new if3((hf3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo18884D() {
        return this.zze;
    }

    /* renamed from: H */
    public final kl3 mo18885H() {
        return this.zzf;
    }
}
