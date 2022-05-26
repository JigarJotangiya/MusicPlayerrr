package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wg3 extends qm3<wg3, vg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final wg3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private qg3 zzf;
    /* access modifiers changed from: private */
    public kl3 zzg;
    /* access modifiers changed from: private */
    public kl3 zzh;

    static {
        wg3 wg3 = new wg3();
        zzb = wg3;
        qm3.m29616t(wg3.class, wg3);
    }

    private wg3() {
        kl3 kl3 = kl3.zzb;
        this.zzg = kl3;
        this.zzh = kl3;
    }

    /* renamed from: F */
    public static vg3 m33144F() {
        return (vg3) zzb.mo20477v();
    }

    /* renamed from: H */
    public static wg3 m33146H() {
        return zzb;
    }

    /* renamed from: I */
    public static wg3 m33147I(kl3 kl3, cm3 cm3) throws bn3 {
        return (wg3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: M */
    static /* synthetic */ void m33149M(wg3 wg3, qg3 qg3) {
        qg3.getClass();
        wg3.zzf = qg3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new wg3();
        } else {
            if (i2 == 4) {
                return new vg3((ug3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo21823D() {
        return this.zze;
    }

    /* renamed from: E */
    public final qg3 mo21824E() {
        qg3 qg3 = this.zzf;
        return qg3 == null ? qg3.m29519G() : qg3;
    }

    /* renamed from: J */
    public final kl3 mo21825J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final kl3 mo21826K() {
        return this.zzh;
    }
}
