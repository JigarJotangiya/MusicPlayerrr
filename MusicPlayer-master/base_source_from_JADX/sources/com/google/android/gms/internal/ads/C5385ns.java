package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ns */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5385ns extends qm3<C5385ns, C5348ms> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5385ns zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5385ns nsVar = new C5385ns();
        zzb = nsVar;
        qm3.m29616t(C5385ns.class, nsVar);
    }

    private C5385ns() {
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
            return new C5385ns();
        } else {
            if (i2 == 4) {
                return new C5348ms((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
