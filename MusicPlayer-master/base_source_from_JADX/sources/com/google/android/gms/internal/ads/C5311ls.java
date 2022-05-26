package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ls */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5311ls extends qm3<C5311ls, C5274ks> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5311ls zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5311ls lsVar = new C5311ls();
        zzb = lsVar;
        qm3.m29616t(C5311ls.class, lsVar);
    }

    private C5311ls() {
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
            return new C5311ls();
        } else {
            if (i2 == 4) {
                return new C5274ks((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
