package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ue3 extends qm3<ue3, te3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ue3 zzb;
    private xe3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        ue3 ue3 = new ue3();
        zzb = ue3;
        qm3.m29616t(ue3.class, ue3);
    }

    private ue3() {
    }

    /* renamed from: E */
    public static te3 m31791E() {
        return (te3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static ue3 m31793G() {
        return zzb;
    }

    /* renamed from: H */
    public static ue3 m31794H(kl3 kl3, cm3 cm3) throws bn3 {
        return (ue3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: J */
    static /* synthetic */ void m31795J(ue3 ue3, xe3 xe3) {
        xe3.getClass();
        ue3.zze = xe3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ue3();
        } else {
            if (i2 == 4) {
                return new te3((se3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo21257D() {
        return this.zzf;
    }

    /* renamed from: I */
    public final xe3 mo21258I() {
        xe3 xe3 = this.zze;
        return xe3 == null ? xe3.m33686G() : xe3;
    }
}
