package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ng3 extends qm3<ng3, mg3> implements ao3 {
    /* access modifiers changed from: private */
    public static final ng3 zzb;
    private qg3 zze;

    static {
        ng3 ng3 = new ng3();
        zzb = ng3;
        qm3.m29616t(ng3.class, ng3);
    }

    private ng3() {
    }

    /* renamed from: D */
    public static mg3 m27859D() {
        return (mg3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static ng3 m27861F(kl3 kl3, cm3 cm3) throws bn3 {
        return (ng3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: H */
    static /* synthetic */ void m27862H(ng3 ng3, qg3 qg3) {
        qg3.getClass();
        ng3.zze = qg3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ng3();
        } else {
            if (i2 == 4) {
                return new mg3((lg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final qg3 mo19728G() {
        qg3 qg3 = this.zze;
        return qg3 == null ? qg3.m29519G() : qg3;
    }
}
