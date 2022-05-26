package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4902ar extends qm3<C4902ar, C5791yq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C4902ar zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private ym3<C5679vq> zzg = qm3.m29612p();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        C4902ar arVar = new C4902ar();
        zzb = arVar;
        qm3.m29616t(C4902ar.class, arVar);
    }

    private C4902ar() {
    }

    /* renamed from: E */
    public static C4902ar m20926E() {
        return zzb;
    }

    /* renamed from: F */
    static /* synthetic */ void m20927F(C4902ar arVar, String str) {
        str.getClass();
        arVar.zze |= 1;
        arVar.zzf = str;
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
            return qm3.m29615s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", C5679vq.class, "zzh", tm3, "zzi", tm3, "zzj", tm3});
        } else if (i2 == 3) {
            return new C4902ar();
        } else {
            if (i2 == 4) {
                return new C5791yq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
