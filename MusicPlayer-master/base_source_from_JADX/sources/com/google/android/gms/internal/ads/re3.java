package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class re3 extends qm3<re3, qe3> implements ao3 {
    /* access modifiers changed from: private */
    public static final re3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private xe3 zzf;
    /* access modifiers changed from: private */
    public kl3 zzg = kl3.zzb;

    static {
        re3 re3 = new re3();
        zzb = re3;
        qm3.m29616t(re3.class, re3);
    }

    private re3() {
    }

    /* renamed from: E */
    public static qe3 m30095E() {
        return (qe3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static re3 m30097G() {
        return zzb;
    }

    /* renamed from: H */
    public static re3 m30098H(kl3 kl3, cm3 cm3) throws bn3 {
        return (re3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: L */
    static /* synthetic */ void m30100L(re3 re3, xe3 xe3) {
        xe3.getClass();
        re3.zzf = xe3;
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
            return new re3();
        } else {
            if (i2 == 4) {
                return new qe3((pe3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo20643D() {
        return this.zze;
    }

    /* renamed from: I */
    public final xe3 mo20644I() {
        xe3 xe3 = this.zzf;
        return xe3 == null ? xe3.m33686G() : xe3;
    }

    /* renamed from: J */
    public final kl3 mo20645J() {
        return this.zzg;
    }
}
