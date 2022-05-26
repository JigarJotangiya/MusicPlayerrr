package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qf3 extends qm3<qf3, pf3> implements ao3 {
    /* access modifiers changed from: private */
    public static final qf3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;

    static {
        qf3 qf3 = new qf3();
        zzb = qf3;
        qm3.m29616t(qf3.class, qf3);
    }

    private qf3() {
    }

    /* renamed from: E */
    public static pf3 m29505E() {
        return (pf3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static qf3 m29507G(kl3 kl3, cm3 cm3) throws bn3 {
        return (qf3) qm3.m29605A(zzb, kl3, cm3);
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
            return new qf3();
        } else {
            if (i2 == 4) {
                return new pf3((of3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo20442D() {
        return this.zze;
    }

    /* renamed from: H */
    public final kl3 mo20443H() {
        return this.zzf;
    }
}
