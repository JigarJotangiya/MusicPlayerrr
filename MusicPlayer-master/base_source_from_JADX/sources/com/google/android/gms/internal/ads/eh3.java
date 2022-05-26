package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eh3 extends qm3<eh3, dh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final eh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private lh3 zzf;
    /* access modifiers changed from: private */
    public kl3 zzg = kl3.zzb;

    static {
        eh3 eh3 = new eh3();
        zzb = eh3;
        qm3.m29616t(eh3.class, eh3);
    }

    private eh3() {
    }

    /* renamed from: E */
    public static dh3 m22990E() {
        return (dh3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static eh3 m22992G() {
        return zzb;
    }

    /* renamed from: H */
    public static eh3 m22993H(kl3 kl3, cm3 cm3) throws bn3 {
        return (eh3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: L */
    static /* synthetic */ void m22995L(eh3 eh3, lh3 lh3) {
        lh3.getClass();
        eh3.zzf = lh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new eh3();
        } else {
            if (i2 == 4) {
                return new dh3((ch3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo17190D() {
        return this.zze;
    }

    /* renamed from: I */
    public final lh3 mo17191I() {
        lh3 lh3 = this.zzf;
        return lh3 == null ? lh3.m26743G() : lh3;
    }

    /* renamed from: J */
    public final kl3 mo17192J() {
        return this.zzg;
    }
}
