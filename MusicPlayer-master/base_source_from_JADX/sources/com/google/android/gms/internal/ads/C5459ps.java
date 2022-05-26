package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ps */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5459ps extends qm3<C5459ps, C5422os> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5459ps zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private C5533rs zzh;

    static {
        C5459ps psVar = new C5459ps();
        zzb = psVar;
        qm3.m29616t(C5459ps.class, psVar);
    }

    private C5459ps() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C5199ir.f18147a, "zzh"});
        } else if (i2 == 3) {
            return new C5459ps();
        } else {
            if (i2 == 4) {
                return new C5422os((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
