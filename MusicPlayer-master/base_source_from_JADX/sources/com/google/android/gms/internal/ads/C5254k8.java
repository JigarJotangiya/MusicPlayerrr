package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5254k8 extends qm3<C5254k8, C5217j8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5254k8 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        C5254k8 k8Var = new C5254k8();
        zzb = k8Var;
        qm3.m29616t(C5254k8.class, k8Var);
    }

    private C5254k8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", C5106g8.f16988a, "zzg"});
        } else if (i2 == 3) {
            return new C5254k8();
        } else {
            if (i2 == 4) {
                return new C5217j8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
