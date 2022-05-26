package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ri3 extends qm3<ri3, qi3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ri3 zzb;
    private String zze = BuildConfig.FLAVOR;
    private rh3 zzf;

    static {
        ri3 ri3 = new ri3();
        zzb = ri3;
        qm3.m29616t(ri3.class, ri3);
    }

    private ri3() {
    }

    /* renamed from: F */
    public static ri3 m30149F() {
        return zzb;
    }

    /* renamed from: G */
    public static ri3 m30150G(kl3 kl3, cm3 cm3) throws bn3 {
        return (ri3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ri3();
        } else {
            if (i2 == 4) {
                return new qi3((pi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final rh3 mo20665D() {
        rh3 rh3 = this.zzf;
        return rh3 == null ? rh3.m30133F() : rh3;
    }

    /* renamed from: H */
    public final String mo20666H() {
        return this.zze;
    }

    /* renamed from: I */
    public final boolean mo20667I() {
        return this.zzf != null;
    }
}
