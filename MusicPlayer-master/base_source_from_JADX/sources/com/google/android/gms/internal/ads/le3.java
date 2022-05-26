package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class le3 extends qm3<le3, ke3> implements ao3 {
    /* access modifiers changed from: private */
    public static final le3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private re3 zzf;
    private eh3 zzg;

    static {
        le3 le3 = new le3();
        zzb = le3;
        qm3.m29616t(le3.class, le3);
    }

    private le3() {
    }

    /* renamed from: E */
    public static ke3 m26709E() {
        return (ke3) zzb.mo20477v();
    }

    /* renamed from: G */
    public static le3 m26711G(kl3 kl3, cm3 cm3) throws bn3 {
        return (le3) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: K */
    static /* synthetic */ void m26713K(le3 le3, re3 re3) {
        re3.getClass();
        le3.zzf = re3;
    }

    /* renamed from: L */
    static /* synthetic */ void m26714L(le3 le3, eh3 eh3) {
        eh3.getClass();
        le3.zzg = eh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new le3();
        } else {
            if (i2 == 4) {
                return new ke3((je3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final int mo19159D() {
        return this.zze;
    }

    /* renamed from: H */
    public final re3 mo19160H() {
        re3 re3 = this.zzf;
        return re3 == null ? re3.m30097G() : re3;
    }

    /* renamed from: I */
    public final eh3 mo19161I() {
        eh3 eh3 = this.zzg;
        return eh3 == null ? eh3.m22992G() : eh3;
    }
}
