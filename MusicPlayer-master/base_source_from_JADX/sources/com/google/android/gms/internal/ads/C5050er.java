package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.er */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5050er extends qm3<C5050er, C5013dr> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5050er zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private C5533rs zzg;
    private int zzh;
    private C5607ts zzi;
    private int zzj;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C5050er erVar = new C5050er();
        zzb = erVar;
        qm3.m29616t(C5050er.class, erVar);
    }

    private C5050er() {
    }

    /* renamed from: E */
    public static C5050er m23103E() {
        return zzb;
    }

    /* renamed from: F */
    static /* synthetic */ void m23104F(C5050er erVar, String str) {
        erVar.zze |= 1;
        erVar.zzf = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m23105G(C5050er erVar, C5607ts tsVar) {
        tsVar.getClass();
        erVar.zzi = tsVar;
        erVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tm3 tm3 = C5199ir.f18147a;
            return qm3.m29615s(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", tm3, "zzl", tm3, "zzm", tm3});
        } else if (i2 == 3) {
            return new C5050er();
        } else {
            if (i2 == 4) {
                return new C5013dr((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
