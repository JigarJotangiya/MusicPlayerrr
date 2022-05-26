package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ys */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5793ys extends qm3<C5793ys, C5718ws> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5793ys zzb;
    private int zze;
    private int zzf = 1000;
    private C4941bt zzg;
    private C5533rs zzh;

    static {
        C5793ys ysVar = new C5793ys();
        zzb = ysVar;
        qm3.m29616t(C5793ys.class, ysVar);
    }

    private C5793ys() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C5199ir.f18147a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5793ys();
        } else {
            if (i2 == 4) {
                return new C5718ws((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
