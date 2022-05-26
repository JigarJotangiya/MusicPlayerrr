package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.z7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5809z7 extends qm3<C5809z7, C5772y7> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5809z7 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        C5809z7 z7Var = new C5809z7();
        zzb = z7Var;
        qm3.m29616t(C5809z7.class, z7Var);
    }

    private C5809z7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C5809z7();
        } else {
            if (i2 == 4) {
                return new C5772y7((C5549s7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
