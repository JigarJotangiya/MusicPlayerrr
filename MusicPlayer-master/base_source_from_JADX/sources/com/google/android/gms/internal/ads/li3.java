package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class li3 extends qm3<li3, ki3> implements ao3 {
    /* access modifiers changed from: private */
    public static final li3 zzb;
    private String zze = BuildConfig.FLAVOR;

    static {
        li3 li3 = new li3();
        zzb = li3;
        qm3.m29616t(li3.class, li3);
    }

    private li3() {
    }

    /* renamed from: E */
    public static li3 m26756E() {
        return zzb;
    }

    /* renamed from: F */
    public static li3 m26757F(kl3 kl3, cm3 cm3) throws bn3 {
        return (li3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new li3();
        } else {
            if (i2 == 4) {
                return new ki3((ii3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final String mo19181G() {
        return this.zze;
    }
}
