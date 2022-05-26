package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5070f9 extends qm3<C5070f9, C5032e9> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5070f9 zzb;
    private int zze;
    private ym3<kl3> zzf = qm3.m29612p();
    private kl3 zzg = kl3.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C5070f9 f9Var = new C5070f9();
        zzb = f9Var;
        qm3.m29616t(C5070f9.class, f9Var);
    }

    private C5070f9() {
    }

    /* renamed from: D */
    public static C5032e9 m23542D() {
        return (C5032e9) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m23544F(C5070f9 f9Var, kl3 kl3) {
        ym3<kl3> ym3 = f9Var.zzf;
        if (!ym3.mo21839b()) {
            f9Var.zzf = qm3.m29613q(ym3);
        }
        f9Var.zzf.add(kl3);
    }

    /* renamed from: G */
    static /* synthetic */ void m23545G(C5070f9 f9Var, kl3 kl3) {
        f9Var.zze |= 1;
        f9Var.zzg = kl3;
    }

    /* renamed from: H */
    static /* synthetic */ void m23546H(C5070f9 f9Var, int i) {
        f9Var.zzi = i - 1;
        f9Var.zze |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C5773y8.f26293a, "zzi", C5698w8.f25268a});
        } else if (i2 == 3) {
            return new C5070f9();
        } else {
            if (i2 == 4) {
                return new C5032e9((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
