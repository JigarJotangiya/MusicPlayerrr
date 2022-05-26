package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oe3 extends qm3<oe3, ne3> implements ao3 {
    /* access modifiers changed from: private */
    public static final oe3 zzb;
    private ue3 zze;
    private hh3 zzf;

    static {
        oe3 oe3 = new oe3();
        zzb = oe3;
        qm3.m29616t(oe3.class, oe3);
    }

    private oe3() {
    }

    /* renamed from: D */
    public static ne3 m28463D() {
        return (ne3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static oe3 m28465F(kl3 kl3, cm3 cm3) throws bn3 {
        return (oe3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: I */
    static /* synthetic */ void m28466I(oe3 oe3, ue3 ue3) {
        ue3.getClass();
        oe3.zze = ue3;
    }

    /* renamed from: J */
    static /* synthetic */ void m28467J(oe3 oe3, hh3 hh3) {
        hh3.getClass();
        oe3.zzf = hh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new oe3();
        } else {
            if (i2 == 4) {
                return new ne3((me3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final ue3 mo19977G() {
        ue3 ue3 = this.zze;
        return ue3 == null ? ue3.m31793G() : ue3;
    }

    /* renamed from: H */
    public final hh3 mo19978H() {
        hh3 hh3 = this.zzf;
        return hh3 == null ? hh3.m24806G() : hh3;
    }
}
