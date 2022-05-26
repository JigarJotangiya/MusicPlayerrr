package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5623u7 extends qm3<C5623u7, C5586t7> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5623u7 zzb;
    private int zze;
    private C5697w7 zzf;
    private C5809z7 zzg;

    static {
        C5623u7 u7Var = new C5623u7();
        zzb = u7Var;
        qm3.m29616t(C5623u7.class, u7Var);
    }

    private C5623u7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5623u7();
        } else {
            if (i2 == 4) {
                return new C5586t7((C5549s7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
