package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.xq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5753xq extends qm3<C5753xq, C5716wq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5753xq zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private ym3<C5679vq> zzg = qm3.m29612p();
    private int zzh;

    static {
        C5753xq xqVar = new C5753xq();
        zzb = xqVar;
        qm3.m29616t(C5753xq.class, xqVar);
    }

    private C5753xq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C5679vq.class, "zzh", C5199ir.f18147a});
        } else if (i2 == 3) {
            return new C5753xq();
        } else {
            if (i2 == 4) {
                return new C5716wq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
