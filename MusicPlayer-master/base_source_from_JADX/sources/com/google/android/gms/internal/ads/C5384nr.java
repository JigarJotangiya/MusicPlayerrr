package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.nr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5384nr extends qm3<C5384nr, C5347mr> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5384nr zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private um3 zzh = qm3.m29609m();
    private C5533rs zzi;

    static {
        C5384nr nrVar = new C5384nr();
        zzb = nrVar;
        qm3.m29616t(C5384nr.class, nrVar);
    }

    private C5384nr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C5199ir.f18147a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5384nr();
        } else {
            if (i2 == 4) {
                return new C5347mr((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
