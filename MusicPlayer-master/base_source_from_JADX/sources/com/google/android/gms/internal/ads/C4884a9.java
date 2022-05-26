package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.a9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4884a9 extends qm3<C4884a9, C5810z8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C4884a9 zzb;
    private int zze;
    private long zzf;
    private String zzg = BuildConfig.FLAVOR;
    private kl3 zzh = kl3.zzb;

    static {
        C4884a9 a9Var = new C4884a9();
        zzb = a9Var;
        qm3.m29616t(C4884a9.class, a9Var);
    }

    private C4884a9() {
    }

    /* renamed from: F */
    public static C4884a9 m20630F() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4884a9();
        } else {
            if (i2 == 4) {
                return new C5810z8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final long mo15710D() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo15711G() {
        return (this.zze & 1) != 0;
    }
}
