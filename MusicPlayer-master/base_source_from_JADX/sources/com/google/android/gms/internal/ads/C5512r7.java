package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.r7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5512r7 extends qm3<C5512r7, C5364n7> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5512r7 zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private long zzk;
    private long zzl;
    private String zzm = BuildConfig.FLAVOR;
    private long zzn;
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private ym3<C5438p7> zzq = qm3.m29612p();
    private int zzr;

    static {
        C5512r7 r7Var = new C5512r7();
        zzb = r7Var;
        qm3.m29616t(C5512r7.class, r7Var);
    }

    private C5512r7() {
    }

    /* renamed from: D */
    public static C5364n7 m29884D() {
        return (C5364n7) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m29886F(C5512r7 r7Var, long j) {
        r7Var.zze |= 2;
        r7Var.zzg = j;
    }

    /* renamed from: G */
    static /* synthetic */ void m29887G(C5512r7 r7Var, String str) {
        str.getClass();
        r7Var.zze |= 4;
        r7Var.zzh = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m29888H(C5512r7 r7Var, String str) {
        str.getClass();
        r7Var.zze |= 8;
        r7Var.zzi = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m29889I(C5512r7 r7Var, String str) {
        r7Var.zze |= 16;
        r7Var.zzj = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m29890J(C5512r7 r7Var, String str) {
        r7Var.zze |= 1024;
        r7Var.zzp = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m29891K(C5512r7 r7Var, String str) {
        str.getClass();
        r7Var.zze |= 1;
        r7Var.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m29892L(C5512r7 r7Var, int i) {
        r7Var.zzr = i - 1;
        r7Var.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", C5438p7.class, "zzr", C5475q7.f21847a});
        } else if (i2 == 3) {
            return new C5512r7();
        } else {
            if (i2 == 4) {
                return new C5364n7((C5327m7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
