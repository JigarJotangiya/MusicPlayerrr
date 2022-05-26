package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nf3 extends qm3<nf3, mf3> implements ao3 {
    /* access modifiers changed from: private */
    public static final nf3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        nf3 nf3 = new nf3();
        zzb = nf3;
        qm3.m29616t(nf3.class, nf3);
    }

    private nf3() {
    }

    /* renamed from: E */
    public static mf3 m27849E() {
        return (mf3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static nf3 m27851G(kl3 kl3, cm3 cm3) throws bn3 {
        return (nf3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new nf3();
        } else {
            if (i2 == 4) {
                return new mf3((lf3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo19723D() {
        return this.zze;
    }
}
