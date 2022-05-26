package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5697w7 extends qm3<C5697w7, C5660v7> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5697w7 zzb;
    private int zze;
    private int zzf = 2;

    static {
        C5697w7 w7Var = new C5697w7();
        zzb = w7Var;
        qm3.m29616t(C5697w7.class, w7Var);
    }

    private C5697w7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C5734x7.f25697a});
        } else if (i2 == 3) {
            return new C5697w7();
        } else {
            if (i2 == 4) {
                return new C5660v7((C5549s7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
