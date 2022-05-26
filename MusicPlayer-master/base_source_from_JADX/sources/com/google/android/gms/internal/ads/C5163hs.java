package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.hs */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5163hs extends qm3<C5163hs, C5051es> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5163hs zzb;
    private int zze;
    private ym3<C5014ds> zzf = qm3.m29612p();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    private long zzl;

    static {
        C5163hs hsVar = new C5163hs();
        zzb = hsVar;
        qm3.m29616t(C5163hs.class, hsVar);
    }

    private C5163hs() {
    }

    /* renamed from: D */
    public static C5051es m24899D() {
        return (C5051es) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m24901F(C5163hs hsVar, Iterable iterable) {
        ym3<C5014ds> ym3 = hsVar.zzf;
        if (!ym3.mo21839b()) {
            hsVar.zzf = qm3.m29613q(ym3);
        }
        vk3.m32462i(iterable, hsVar.zzf);
    }

    /* renamed from: G */
    static /* synthetic */ void m24902G(C5163hs hsVar, int i) {
        hsVar.zze |= 1;
        hsVar.zzg = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m24903H(C5163hs hsVar, int i) {
        hsVar.zze |= 2;
        hsVar.zzh = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m24904I(C5163hs hsVar, long j) {
        hsVar.zze |= 4;
        hsVar.zzi = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m24905J(C5163hs hsVar, String str) {
        str.getClass();
        hsVar.zze |= 8;
        hsVar.zzj = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m24906K(C5163hs hsVar, String str) {
        str.getClass();
        hsVar.zze |= 16;
        hsVar.zzk = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m24907L(C5163hs hsVar, long j) {
        hsVar.zze |= 32;
        hsVar.zzl = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", C5014ds.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C5163hs();
        } else {
            if (i2 == 4) {
                return new C5051es((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
