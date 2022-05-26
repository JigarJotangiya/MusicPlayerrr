package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vq3 extends qm3<vq3, tq3> implements ao3 {
    /* access modifiers changed from: private */
    public static final vq3 zzb;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private kl3 zzh = kl3.zzb;

    static {
        vq3 vq3 = new vq3();
        zzb = vq3;
        qm3.m29616t(vq3.class, vq3);
    }

    private vq3() {
    }

    /* renamed from: D */
    public static tq3 m32661D() {
        return (tq3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m32663F(vq3 vq3, String str) {
        vq3.zze |= 2;
        vq3.zzg = "image/png";
    }

    /* renamed from: G */
    static /* synthetic */ void m32664G(vq3 vq3, kl3 kl3) {
        kl3.getClass();
        vq3.zze |= 4;
        vq3.zzh = kl3;
    }

    /* renamed from: H */
    static /* synthetic */ void m32665H(vq3 vq3, int i) {
        vq3.zzf = 1;
        vq3.zze = 1 | vq3.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", uq3.f24415a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new vq3();
        } else {
            if (i2 == 4) {
                return new tq3((dq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
