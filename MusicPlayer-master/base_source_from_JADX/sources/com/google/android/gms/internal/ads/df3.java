package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class df3 extends qm3<df3, cf3> implements ao3 {
    /* access modifiers changed from: private */
    public static final df3 zzb;
    private gf3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        df3 df3 = new df3();
        zzb = df3;
        qm3.m29616t(df3.class, df3);
    }

    private df3() {
    }

    /* renamed from: E */
    public static cf3 m22493E() {
        return (cf3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static df3 m22495G(kl3 kl3, cm3 cm3) throws bn3 {
        return (df3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: I */
    static /* synthetic */ void m22496I(df3 df3, gf3 gf3) {
        gf3.getClass();
        df3.zze = gf3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new df3();
        } else {
            if (i2 == 4) {
                return new cf3((bf3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo16916D() {
        return this.zzf;
    }

    /* renamed from: H */
    public final gf3 mo16917H() {
        gf3 gf3 = this.zze;
        return gf3 == null ? gf3.m24315G() : gf3;
    }
}
