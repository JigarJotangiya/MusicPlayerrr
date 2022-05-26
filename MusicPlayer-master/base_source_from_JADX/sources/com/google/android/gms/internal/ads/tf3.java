package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tf3 extends qm3<tf3, sf3> implements ao3 {
    /* access modifiers changed from: private */
    public static final tf3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        tf3 tf3 = new tf3();
        zzb = tf3;
        qm3.m29616t(tf3.class, tf3);
    }

    private tf3() {
    }

    /* renamed from: E */
    public static sf3 m31239E() {
        return (sf3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static tf3 m31241G(kl3 kl3, cm3 cm3) throws bn3 {
        return (tf3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new tf3();
        } else {
            if (i2 == 4) {
                return new sf3((rf3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo21057D() {
        return this.zze;
    }
}
