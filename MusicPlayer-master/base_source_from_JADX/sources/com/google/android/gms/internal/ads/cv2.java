package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cv2 extends qm3<cv2, bv2> implements ao3 {
    /* access modifiers changed from: private */
    public static final cv2 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private String zzs = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String zzt = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;

    static {
        cv2 cv2 = new cv2();
        zzb = cv2;
        qm3.m29616t(cv2.class, cv2);
    }

    private cv2() {
    }

    /* renamed from: D */
    public static bv2 m22171D() {
        return (bv2) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m22173F(cv2 cv2, String str) {
        str.getClass();
        cv2.zzi = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m22174G(cv2 cv2, String str) {
        str.getClass();
        cv2.zzj = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m22175H(cv2 cv2, String str) {
        str.getClass();
        cv2.zzk = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m22179L(cv2 cv2, String str) {
        str.getClass();
        cv2.zzq = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m22180M(cv2 cv2, String str) {
        str.getClass();
        cv2.zzr = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m22181N(cv2 cv2, String str) {
        str.getClass();
        cv2.zzs = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m22184R(cv2 cv2, String str) {
        str.getClass();
        cv2.zzu = str;
    }

    /* renamed from: U */
    static /* synthetic */ void m22187U(cv2 cv2, int i) {
        if (i != 1) {
            cv2.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: V */
    static /* synthetic */ void m22188V(cv2 cv2, int i) {
        if (i != 1) {
            cv2.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new cv2();
        } else {
            if (i2 == 4) {
                return new bv2((av2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
