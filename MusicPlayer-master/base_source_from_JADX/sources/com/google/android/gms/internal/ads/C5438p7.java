package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.p7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5438p7 extends qm3<C5438p7, C5401o7> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5438p7 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C5438p7 p7Var = new C5438p7();
        zzb = p7Var;
        qm3.m29616t(C5438p7.class, p7Var);
    }

    private C5438p7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5438p7();
        } else {
            if (i2 == 4) {
                return new C5401o7((C5327m7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
