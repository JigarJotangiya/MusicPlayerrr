package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qg3 extends qm3<qg3, pg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final qg3 zzb;
    private zg3 zze;
    private kg3 zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        qg3 qg3 = new qg3();
        zzb = qg3;
        qm3.m29616t(qg3.class, qg3);
    }

    private qg3() {
    }

    /* renamed from: E */
    public static pg3 m29517E() {
        return (pg3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static qg3 m29519G() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m29520I(qg3 qg3, zg3 zg3) {
        zg3.getClass();
        qg3.zze = zg3;
    }

    /* renamed from: J */
    static /* synthetic */ void m29521J(qg3 qg3, kg3 kg3) {
        kg3.getClass();
        qg3.zzf = kg3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new qg3();
        } else {
            if (i2 == 4) {
                return new pg3((og3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final kg3 mo20445D() {
        kg3 kg3 = this.zzf;
        return kg3 == null ? kg3.m26223F() : kg3;
    }

    /* renamed from: H */
    public final zg3 mo20446H() {
        zg3 zg3 = this.zze;
        return zg3 == null ? zg3.m34593F() : zg3;
    }

    /* renamed from: K */
    public final int mo20447K() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
