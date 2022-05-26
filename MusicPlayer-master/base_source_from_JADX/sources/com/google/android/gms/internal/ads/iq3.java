package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iq3 extends qm3<iq3, hq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final iq3 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;

    static {
        iq3 iq3 = new iq3();
        zzb = iq3;
        qm3.m29616t(iq3.class, iq3);
    }

    private iq3() {
    }

    /* renamed from: D */
    public static hq3 m25374D() {
        return (hq3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m25376F(iq3 iq3, String str) {
        iq3.zze |= 1;
        iq3.zzf = str;
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
            return new iq3();
        } else {
            if (i2 == 4) {
                return new hq3((dq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
