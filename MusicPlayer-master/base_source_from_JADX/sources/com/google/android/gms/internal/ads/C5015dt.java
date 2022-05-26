package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5015dt extends qm3<C5015dt, C4978ct> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5015dt zzb;
    private int zze;
    private C5607ts zzf;
    private int zzg = 1000;
    private C4941bt zzh;
    private C5533rs zzi;

    static {
        C5015dt dtVar = new C5015dt();
        zzb = dtVar;
        qm3.m29616t(C5015dt.class, dtVar);
    }

    private C5015dt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C5199ir.f18147a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5015dt();
        } else {
            if (i2 == 4) {
                return new C4978ct((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
