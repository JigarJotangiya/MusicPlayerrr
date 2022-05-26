package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pt */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5460pt extends qm3<C5460pt, C5423ot> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5460pt zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C5460pt ptVar = new C5460pt();
        zzb = ptVar;
        qm3.m29616t(C5460pt.class, ptVar);
    }

    private C5460pt() {
    }

    /* renamed from: D */
    public static C5423ot m29147D() {
        return (C5423ot) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m29149F(C5460pt ptVar, boolean z) {
        ptVar.zze |= 1;
        ptVar.zzf = z;
    }

    /* renamed from: G */
    static /* synthetic */ void m29150G(C5460pt ptVar, int i) {
        ptVar.zze |= 2;
        ptVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5460pt();
        } else {
            if (i2 == 4) {
                return new C5423ot((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final boolean mo20310H() {
        return this.zzf;
    }
}
