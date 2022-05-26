package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.hr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5162hr extends qm3<C5162hr, C5088fr> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5162hr zzb;
    private int zze;
    private int zzf;
    private C5607ts zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C5162hr hrVar = new C5162hr();
        zzb = hrVar;
        qm3.m29616t(C5162hr.class, hrVar);
    }

    private C5162hr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C5125gr.f17232a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5162hr();
        } else {
            if (i2 == 4) {
                return new C5088fr((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
