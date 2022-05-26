package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rh3 extends qm3<rh3, qh3> implements ao3 {
    /* access modifiers changed from: private */
    public static final rh3 zzb;
    private String zze = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        rh3 rh3 = new rh3();
        zzb = rh3;
        qm3.m29616t(rh3.class, rh3);
    }

    private rh3() {
    }

    /* renamed from: D */
    public static qh3 m30131D() {
        return (qh3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static rh3 m30133F() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m30134I(rh3 rh3, String str) {
        str.getClass();
        rh3.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new rh3();
        } else {
            if (i2 == 4) {
                return new qh3((ph3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final kl3 mo20661G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String mo20662H() {
        return this.zze;
    }

    /* renamed from: K */
    public final int mo20663K() {
        int b = si3.m30733b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
