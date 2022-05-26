package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5792yr extends qm3<C5792yr, C5569sr> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5792yr zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C5792yr yrVar = new C5792yr();
        zzb = yrVar;
        qm3.m29616t(C5792yr.class, yrVar);
    }

    private C5792yr() {
    }

    /* renamed from: D */
    public static C5569sr m34279D() {
        return (C5569sr) zzb.mo20477v();
    }

    /* renamed from: F */
    public static C5792yr m34281F() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m34282K(C5792yr yrVar, int i) {
        yrVar.zzf = i - 1;
        yrVar.zze |= 1;
    }

    /* renamed from: L */
    static /* synthetic */ void m34283L(C5792yr yrVar, int i) {
        yrVar.zzg = i - 1;
        yrVar.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", C5680vr.f24908a, "zzg", C5606tr.f23975a});
        } else if (i2 == 3) {
            return new C5792yr();
        } else {
            if (i2 == 4) {
                return new C5569sr((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final boolean mo22280G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo22281H() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: I */
    public final int mo22282I() {
        int a = C5643ur.m31973a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: J */
    public final int mo22283J() {
        int a = C5717wr.m33276a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
