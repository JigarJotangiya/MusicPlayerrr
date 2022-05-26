package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5386nt extends qm3<C5386nt, C5349mt> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5386nt zzb;
    private int zze;
    private int zzf = 1000;
    private C4941bt zzg;

    static {
        C5386nt ntVar = new C5386nt();
        zzb = ntVar;
        qm3.m29616t(C5386nt.class, ntVar);
    }

    private C5386nt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C5199ir.f18147a, "zzg"});
        } else if (i2 == 3) {
            return new C5386nt();
        } else {
            if (i2 == 4) {
                return new C5349mt((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
