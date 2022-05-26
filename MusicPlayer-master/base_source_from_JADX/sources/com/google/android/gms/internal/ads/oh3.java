package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oh3 extends qm3<oh3, nh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final oh3 zzb;
    /* access modifiers changed from: private */
    public String zze = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        oh3 oh3 = new oh3();
        zzb = oh3;
        qm3.m29616t(oh3.class, oh3);
    }

    private oh3() {
    }

    /* renamed from: D */
    public static nh3 m28503D() {
        return (nh3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static oh3 m28505F() {
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
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new oh3();
        } else {
            if (i2 == 4) {
                return new nh3((mh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final kl3 mo19998G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String mo19999H() {
        return this.zze;
    }

    /* renamed from: K */
    public final int mo20000K() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
