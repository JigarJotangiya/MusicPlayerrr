package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hi3 extends qm3<hi3, gi3> implements ao3 {
    /* access modifiers changed from: private */
    public static final hi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private li3 zzf;

    static {
        hi3 hi3 = new hi3();
        zzb = hi3;
        qm3.m29616t(hi3.class, hi3);
    }

    private hi3() {
    }

    /* renamed from: E */
    public static gi3 m24816E() {
        return (gi3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static hi3 m24818G(kl3 kl3, cm3 cm3) throws bn3 {
        return (hi3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: J */
    static /* synthetic */ void m24820J(hi3 hi3, li3 li3) {
        li3.getClass();
        hi3.zzf = li3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new hi3();
        } else {
            if (i2 == 4) {
                return new gi3((fi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo18147D() {
        return this.zze;
    }

    /* renamed from: H */
    public final li3 mo18148H() {
        li3 li3 = this.zzf;
        return li3 == null ? li3.m26756E() : li3;
    }
}
