package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class be3 extends qm3<be3, ae3> implements ao3 {
    /* access modifiers changed from: private */
    public static final be3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;
    private he3 zzg;

    static {
        be3 be3 = new be3();
        zzb = be3;
        qm3.m29616t(be3.class, be3);
    }

    private be3() {
    }

    /* renamed from: E */
    public static ae3 m21279E() {
        return (ae3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static be3 m21281G(kl3 kl3, cm3 cm3) throws bn3 {
        return (be3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: L */
    static /* synthetic */ void m21284L(be3 be3, he3 he3) {
        he3.getClass();
        be3.zzg = he3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new be3();
        } else {
            if (i2 == 4) {
                return new ae3((zd3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo16223D() {
        return this.zze;
    }

    /* renamed from: H */
    public final he3 mo16224H() {
        he3 he3 = this.zzg;
        return he3 == null ? he3.m24788G() : he3;
    }

    /* renamed from: I */
    public final kl3 mo16225I() {
        return this.zzf;
    }
}
