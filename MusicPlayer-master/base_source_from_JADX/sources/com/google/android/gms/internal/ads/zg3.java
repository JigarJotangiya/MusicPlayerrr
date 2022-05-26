package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zg3 extends qm3<zg3, yg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final zg3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public kl3 zzg = kl3.zzb;

    static {
        zg3 zg3 = new zg3();
        zzb = zg3;
        qm3.m29616t(zg3.class, zg3);
    }

    private zg3() {
    }

    /* renamed from: D */
    public static yg3 m34591D() {
        return (yg3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static zg3 m34593F() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zg3();
        } else {
            if (i2 == 4) {
                return new yg3((xg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final kl3 mo22364G() {
        return this.zzg;
    }

    /* renamed from: I */
    public final int mo22365I() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: J */
    public final int mo22366J() {
        int b = bh3.m21334b(this.zzf);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
