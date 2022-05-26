package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hh3 extends qm3<hh3, gh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final hh3 zzb;
    private lh3 zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        hh3 hh3 = new hh3();
        zzb = hh3;
        qm3.m29616t(hh3.class, hh3);
    }

    private hh3() {
    }

    /* renamed from: E */
    public static gh3 m24804E() {
        return (gh3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static hh3 m24806G() {
        return zzb;
    }

    /* renamed from: H */
    public static hh3 m24807H(kl3 kl3, cm3 cm3) throws bn3 {
        return (hh3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: J */
    static /* synthetic */ void m24808J(hh3 hh3, lh3 lh3) {
        lh3.getClass();
        hh3.zze = lh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new hh3();
        } else {
            if (i2 == 4) {
                return new gh3((fh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo18143D() {
        return this.zzf;
    }

    /* renamed from: I */
    public final lh3 mo18144I() {
        lh3 lh3 = this.zze;
        return lh3 == null ? lh3.m26743G() : lh3;
    }
}
