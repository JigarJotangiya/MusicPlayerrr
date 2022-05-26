package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kg3 extends qm3<kg3, ig3> implements ao3 {
    /* access modifiers changed from: private */
    public static final kg3 zzb;
    private rh3 zze;

    static {
        kg3 kg3 = new kg3();
        zzb = kg3;
        qm3.m29616t(kg3.class, kg3);
    }

    private kg3() {
    }

    /* renamed from: D */
    public static ig3 m26221D() {
        return (ig3) zzb.mo20477v();
    }

    /* renamed from: F */
    public static kg3 m26223F() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m26224H(kg3 kg3, rh3 rh3) {
        rh3.getClass();
        kg3.zze = rh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new kg3();
        } else {
            if (i2 == 4) {
                return new ig3((hg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final rh3 mo18888G() {
        rh3 rh3 = this.zze;
        return rh3 == null ? rh3.m30133F() : rh3;
    }
}
