package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class af3 extends qm3<af3, ze3> implements ao3 {
    /* access modifiers changed from: private */
    public static final af3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private gf3 zzf;
    /* access modifiers changed from: private */
    public kl3 zzg = kl3.zzb;

    static {
        af3 af3 = new af3();
        zzb = af3;
        qm3.m29616t(af3.class, af3);
    }

    private af3() {
    }

    /* renamed from: E */
    public static ze3 m20699E() {
        return (ze3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static af3 m20701G(kl3 kl3, cm3 cm3) throws bn3 {
        return (af3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: K */
    static /* synthetic */ void m20703K(af3 af3, gf3 gf3) {
        gf3.getClass();
        af3.zzf = gf3;
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
            return new af3();
        } else {
            if (i2 == 4) {
                return new ze3((ye3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo15768D() {
        return this.zze;
    }

    /* renamed from: H */
    public final gf3 mo15769H() {
        gf3 gf3 = this.zzf;
        return gf3 == null ? gf3.m24315G() : gf3;
    }

    /* renamed from: I */
    public final kl3 mo15770I() {
        return this.zzg;
    }
}
