package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zf3 extends qm3<zf3, yf3> implements ao3 {
    /* access modifiers changed from: private */
    public static final zf3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zf3 zf3 = new zf3();
        zzb = zf3;
        qm3.m29616t(zf3.class, zf3);
    }

    private zf3() {
    }

    /* renamed from: E */
    public static yf3 m34576E() {
        return (yf3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static zf3 m34578G(kl3 kl3, cm3 cm3) throws bn3 {
        return (zf3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zf3();
        } else {
            if (i2 == 4) {
                return new yf3((xf3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo22361D() {
        return this.zze;
    }
}
