package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.d9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4995d9 extends qm3<C4995d9, C4921b9> implements ao3 {
    /* access modifiers changed from: private */
    public static final C4995d9 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C4995d9 d9Var = new C4995d9();
        zzb = d9Var;
        qm3.m29616t(C4995d9.class, d9Var);
    }

    private C4995d9() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new C4995d9();
        } else {
            if (i2 == 4) {
                return new C4921b9((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
