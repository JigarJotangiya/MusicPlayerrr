package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tg3 extends qm3<tg3, sg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final tg3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private wg3 zzf;
    /* access modifiers changed from: private */
    public kl3 zzg = kl3.zzb;

    static {
        tg3 tg3 = new tg3();
        zzb = tg3;
        qm3.m29616t(tg3.class, tg3);
    }

    private tg3() {
    }

    /* renamed from: E */
    public static sg3 m31246E() {
        return (sg3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static tg3 m31248G(kl3 kl3, cm3 cm3) throws bn3 {
        return (tg3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: K */
    static /* synthetic */ void m31250K(tg3 tg3, wg3 wg3) {
        wg3.getClass();
        tg3.zzf = wg3;
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
            return new tg3();
        } else {
            if (i2 == 4) {
                return new sg3((rg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo21059D() {
        return this.zze;
    }

    /* renamed from: H */
    public final wg3 mo21060H() {
        wg3 wg3 = this.zzf;
        return wg3 == null ? wg3.m33146H() : wg3;
    }

    /* renamed from: I */
    public final kl3 mo21061I() {
        return this.zzg;
    }
}
