package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5402o8 extends qm3<C5402o8, C5365n8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5402o8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C5402o8 o8Var = new C5402o8();
        zzb = o8Var;
        qm3.m29616t(C5402o8.class, o8Var);
    }

    private C5402o8() {
    }

    /* renamed from: D */
    public static C5365n8 m28318D() {
        return (C5365n8) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m28320F(C5402o8 o8Var, long j) {
        o8Var.zze |= 1;
        o8Var.zzf = j;
    }

    /* renamed from: G */
    static /* synthetic */ void m28321G(C5402o8 o8Var, long j) {
        o8Var.zze |= 2;
        o8Var.zzg = j;
    }

    /* renamed from: H */
    static /* synthetic */ void m28322H(C5402o8 o8Var, long j) {
        o8Var.zze |= 4;
        o8Var.zzh = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m28323I(C5402o8 o8Var, long j) {
        o8Var.zze |= 8;
        o8Var.zzi = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m28324J(C5402o8 o8Var) {
        o8Var.zze &= -9;
        o8Var.zzi = -1;
    }

    /* renamed from: K */
    static /* synthetic */ void m28325K(C5402o8 o8Var, long j) {
        o8Var.zze |= 16;
        o8Var.zzj = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m28326L(C5402o8 o8Var, long j) {
        o8Var.zze |= 32;
        o8Var.zzk = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m28327M(C5402o8 o8Var, long j) {
        o8Var.zze |= 128;
        o8Var.zzm = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m28328N(C5402o8 o8Var, long j) {
        o8Var.zze |= 256;
        o8Var.zzn = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m28329O(C5402o8 o8Var, long j) {
        o8Var.zze |= 512;
        o8Var.zzo = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m28330P(C5402o8 o8Var, long j) {
        o8Var.zze |= 2048;
        o8Var.zzq = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m28331R(C5402o8 o8Var, long j) {
        o8Var.zze |= 4096;
        o8Var.zzr = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m28332S(C5402o8 o8Var, long j) {
        o8Var.zze |= 8192;
        o8Var.zzs = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m28333T(C5402o8 o8Var, long j) {
        o8Var.zze |= 16384;
        o8Var.zzt = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m28334U(C5402o8 o8Var, long j) {
        o8Var.zze |= 32768;
        o8Var.zzu = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m28335V(C5402o8 o8Var, long j) {
        o8Var.zze |= 65536;
        o8Var.zzv = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m28336W(C5402o8 o8Var, long j) {
        o8Var.zze |= 131072;
        o8Var.zzw = j;
    }

    /* renamed from: X */
    static /* synthetic */ void m28337X(C5402o8 o8Var, long j) {
        o8Var.zze |= 262144;
        o8Var.zzx = j;
    }

    /* renamed from: Z */
    static /* synthetic */ void m28338Z(C5402o8 o8Var, int i) {
        o8Var.zzl = i - 1;
        o8Var.zze |= 64;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m28339a0(C5402o8 o8Var, int i) {
        o8Var.zzp = i - 1;
        o8Var.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tm3 tm3 = C5735x8.f25709a;
            return qm3.m29615s(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", tm3, "zzm", "zzn", "zzo", "zzp", tm3, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new C5402o8();
        } else {
            if (i2 == 4) {
                return new C5365n8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
