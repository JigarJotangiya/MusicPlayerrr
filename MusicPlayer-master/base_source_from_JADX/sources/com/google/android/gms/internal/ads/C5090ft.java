package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ft */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5090ft extends qm3<C5090ft, C5052et> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5090ft zzb;
    private int zze;
    private int zzf = 1000;
    private C4941bt zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C5090ft ftVar = new C5090ft();
        zzb = ftVar;
        qm3.m29616t(C5090ft.class, ftVar);
    }

    private C5090ft() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", C5199ir.f18147a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5090ft();
        } else {
            if (i2 == 4) {
                return new C5052et((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
