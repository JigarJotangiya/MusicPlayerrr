package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lh3 extends qm3<lh3, kh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final lh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        lh3 lh3 = new lh3();
        zzb = lh3;
        qm3.m29616t(lh3.class, lh3);
    }

    private lh3() {
    }

    /* renamed from: E */
    public static kh3 m26741E() {
        return (kh3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static lh3 m26743G() {
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
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new lh3();
        } else {
            if (i2 == 4) {
                return new kh3((jh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo19170D() {
        return this.zzf;
    }

    /* renamed from: I */
    public final int mo19171I() {
        int b = bh3.m21334b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
