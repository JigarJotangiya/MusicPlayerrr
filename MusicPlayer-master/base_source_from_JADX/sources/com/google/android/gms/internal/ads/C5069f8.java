package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5069f8 extends qm3<C5069f8, C5031e8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5069f8 zzb;
    private int zze;
    private int zzf;

    static {
        C5069f8 f8Var = new C5069f8();
        zzb = f8Var;
        qm3.m29616t(C5069f8.class, f8Var);
    }

    private C5069f8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C5180i8.f17914a});
        } else if (i2 == 3) {
            return new C5069f8();
        } else {
            if (i2 == 4) {
                return new C5031e8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
