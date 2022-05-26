package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ee3 extends qm3<ee3, de3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ee3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private he3 zzf;

    static {
        ee3 ee3 = new ee3();
        zzb = ee3;
        qm3.m29616t(ee3.class, ee3);
    }

    private ee3() {
    }

    /* renamed from: E */
    public static de3 m22973E() {
        return (de3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static ee3 m22975G(kl3 kl3, cm3 cm3) throws bn3 {
        return (ee3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: J */
    static /* synthetic */ void m22977J(ee3 ee3, he3 he3) {
        he3.getClass();
        ee3.zzf = he3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ee3();
        } else {
            if (i2 == 4) {
                return new de3((ce3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo17181D() {
        return this.zze;
    }

    /* renamed from: H */
    public final he3 mo17182H() {
        he3 he3 = this.zzf;
        return he3 == null ? he3.m24788G() : he3;
    }
}
