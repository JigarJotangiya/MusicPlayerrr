package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cr3 extends qm3<cr3, br3> implements ao3 {
    /* access modifiers changed from: private */
    public static final cr3 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private boolean zzh;

    static {
        cr3 cr3 = new cr3();
        zzb = cr3;
        qm3.m29616t(cr3.class, cr3);
    }

    private cr3() {
    }

    /* renamed from: D */
    public static br3 m22088D() {
        return (br3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m22090F(cr3 cr3, String str) {
        cr3.zze |= 1;
        cr3.zzf = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m22091G(cr3 cr3, long j) {
        cr3.zze |= 2;
        cr3.zzg = j;
    }

    /* renamed from: H */
    static /* synthetic */ void m22092H(cr3 cr3, boolean z) {
        cr3.zze |= 4;
        cr3.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new cr3();
        } else {
            if (i2 == 4) {
                return new br3((dq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
