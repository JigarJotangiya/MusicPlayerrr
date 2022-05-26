package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yh3 extends qm3<yh3, xh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final yh3 zzb;
    private oh3 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        yh3 yh3 = new yh3();
        zzb = yh3;
        qm3.m29616t(yh3.class, yh3);
    }

    private yh3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new yh3();
        } else {
            if (i2 == 4) {
                return new xh3((vh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo22197D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final oh3 mo22198E() {
        oh3 oh3 = this.zze;
        return oh3 == null ? oh3.m28505F() : oh3;
    }

    /* renamed from: G */
    public final boolean mo22199G() {
        return this.zze != null;
    }

    /* renamed from: H */
    public final int mo22200H() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: I */
    public final int mo22201I() {
        int b = si3.m30733b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
