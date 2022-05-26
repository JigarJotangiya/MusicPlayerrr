package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cg3 extends qm3<cg3, bg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final cg3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public kl3 zzf = kl3.zzb;

    static {
        cg3 cg3 = new cg3();
        zzb = cg3;
        qm3.m29616t(cg3.class, cg3);
    }

    private cg3() {
    }

    /* renamed from: E */
    public static bg3 m21909E() {
        return (bg3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static cg3 m21911G(kl3 kl3, cm3 cm3) throws bn3 {
        return (cg3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new cg3();
        } else {
            if (i2 == 4) {
                return new bg3((ag3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo16630D() {
        return this.zze;
    }

    /* renamed from: H */
    public final kl3 mo16631H() {
        return this.zzf;
    }
}
