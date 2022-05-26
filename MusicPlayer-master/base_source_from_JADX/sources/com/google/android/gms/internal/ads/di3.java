package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class di3 extends qm3<di3, ci3> implements ao3 {
    /* access modifiers changed from: private */
    public static final di3 zzb;
    private String zze = BuildConfig.FLAVOR;
    private int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        di3 di3 = new di3();
        zzb = di3;
        qm3.m29616t(di3.class, di3);
    }

    private di3() {
    }

    /* renamed from: D */
    public static ci3 m22529D() {
        return (ci3) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m22531F(di3 di3, String str) {
        str.getClass();
        di3.zze = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m22534I(di3 di3, int i) {
        if (i != 1) {
            di3.zzf = i - 2;
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
            return qm3.m29615s(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new di3();
        } else {
            if (i2 == 4) {
                return new ci3((ai3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
