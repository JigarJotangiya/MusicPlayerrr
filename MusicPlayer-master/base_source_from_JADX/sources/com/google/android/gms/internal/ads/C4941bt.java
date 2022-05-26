package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4941bt extends qm3<C4941bt, C5830zs> implements ao3 {
    /* access modifiers changed from: private */
    public static final C4941bt zzb;
    private int zze;
    private int zzf;

    static {
        C4941bt btVar = new C4941bt();
        zzb = btVar;
        qm3.m29616t(C4941bt.class, btVar);
    }

    private C4941bt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C4904at.f14061a});
        } else if (i2 == 3) {
            return new C4941bt();
        } else {
            if (i2 == 4) {
                return new C5830zs((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
