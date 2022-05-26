package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gf3 extends qm3<gf3, ff3> implements ao3 {
    /* access modifiers changed from: private */
    public static final gf3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        gf3 gf3 = new gf3();
        zzb = gf3;
        qm3.m29616t(gf3.class, gf3);
    }

    private gf3() {
    }

    /* renamed from: E */
    public static ff3 m24313E() {
        return (ff3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static gf3 m24315G() {
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
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new gf3();
        } else {
            if (i2 == 4) {
                return new ff3((ef3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo17903D() {
        return this.zze;
    }
}
