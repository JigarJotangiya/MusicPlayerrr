package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bz2 extends qm3<bz2, az2> implements ao3 {
    private static final vm3<Integer, Object> zzb = new yy2();
    /* access modifiers changed from: private */
    public static final bz2 zze;
    private int zzf;
    private um3 zzg = qm3.m29609m();
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        bz2 bz2 = new bz2();
        zze = bz2;
        qm3.m29616t(bz2.class, bz2);
    }

    private bz2() {
    }

    /* renamed from: D */
    public static az2 m21600D() {
        return (az2) zze.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m21602F(bz2 bz2, String str) {
        str.getClass();
        bz2.zzf |= 1;
        bz2.zzh = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m21603G(bz2 bz2, int i) {
        um3 um3 = bz2.zzg;
        if (!um3.mo21839b()) {
            bz2.zzg = qm3.m29610n(um3);
        }
        bz2.zzg.mo20677L(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zy2.f27072a, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new bz2();
        } else {
            if (i2 == 4) {
                return new az2((yy2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
