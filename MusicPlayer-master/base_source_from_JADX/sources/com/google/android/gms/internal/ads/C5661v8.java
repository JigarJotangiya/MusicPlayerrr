package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5661v8 extends qm3<C5661v8, C5624u8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5661v8 zzb;
    private int zze;
    private kl3 zzf;
    private kl3 zzg;
    private kl3 zzh;
    private kl3 zzi;

    static {
        C5661v8 v8Var = new C5661v8();
        zzb = v8Var;
        qm3.m29616t(C5661v8.class, v8Var);
    }

    private C5661v8() {
        kl3 kl3 = kl3.zzb;
        this.zzf = kl3;
        this.zzg = kl3;
        this.zzh = kl3;
        this.zzi = kl3;
    }

    /* renamed from: D */
    public static C5624u8 m32194D() {
        return (C5624u8) zzb.mo20477v();
    }

    /* renamed from: F */
    public static C5661v8 m32196F(byte[] bArr, cm3 cm3) throws bn3 {
        return (C5661v8) qm3.m29606B(zzb, bArr, cm3);
    }

    /* renamed from: K */
    static /* synthetic */ void m32197K(C5661v8 v8Var, kl3 kl3) {
        v8Var.zze |= 1;
        v8Var.zzf = kl3;
    }

    /* renamed from: L */
    static /* synthetic */ void m32198L(C5661v8 v8Var, kl3 kl3) {
        v8Var.zze |= 2;
        v8Var.zzg = kl3;
    }

    /* renamed from: M */
    static /* synthetic */ void m32199M(C5661v8 v8Var, kl3 kl3) {
        v8Var.zze |= 4;
        v8Var.zzh = kl3;
    }

    /* renamed from: N */
    static /* synthetic */ void m32200N(C5661v8 v8Var, kl3 kl3) {
        v8Var.zze |= 8;
        v8Var.zzi = kl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C5661v8();
        } else {
            if (i2 == 4) {
                return new C5624u8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final kl3 mo21437G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final kl3 mo21438H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final kl3 mo21439I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final kl3 mo21440J() {
        return this.zzh;
    }
}
