package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rs */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5533rs extends qm3<C5533rs, C5496qs> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5533rs zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5533rs rsVar = new C5533rs();
        zzb = rsVar;
        qm3.m29616t(C5533rs.class, rsVar);
    }

    private C5533rs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5533rs();
        } else {
            if (i2 == 4) {
                return new C5496qs((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
