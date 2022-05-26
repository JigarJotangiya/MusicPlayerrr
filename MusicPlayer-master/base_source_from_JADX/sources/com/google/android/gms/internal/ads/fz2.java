package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fz2 extends qm3<fz2, dz2> implements ao3 {
    /* access modifiers changed from: private */
    public static final fz2 zzb;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private bz2 zzi;

    static {
        fz2 fz2 = new fz2();
        zzb = fz2;
        qm3.m29616t(fz2.class, fz2);
    }

    private fz2() {
    }

    /* renamed from: D */
    public static dz2 m24022D() {
        return (dz2) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m24024F(fz2 fz2, String str) {
        str.getClass();
        fz2.zze |= 2;
        fz2.zzg = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m24025G(fz2 fz2, bz2 bz2) {
        bz2.getClass();
        fz2.zzi = bz2;
        fz2.zze |= 8;
    }

    /* renamed from: H */
    static /* synthetic */ void m24026H(fz2 fz2, int i) {
        fz2.zzf = 1;
        fz2.zze = 1 | fz2.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", ez2.f16385a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new fz2();
        } else {
            if (i2 == 4) {
                return new dz2((cz2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
