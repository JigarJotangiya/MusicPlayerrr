package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5476q8 extends qm3<C5476q8, C5439p8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5476q8 zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C5476q8 q8Var = new C5476q8();
        zzb = q8Var;
        qm3.m29616t(C5476q8.class, q8Var);
    }

    private C5476q8() {
    }

    /* renamed from: D */
    public static C5439p8 m29401D() {
        return (C5439p8) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m29403F(C5476q8 q8Var, long j) {
        q8Var.zze |= 4;
        q8Var.zzh = j;
    }

    /* renamed from: G */
    static /* synthetic */ void m29404G(C5476q8 q8Var, long j) {
        q8Var.zze |= 8;
        q8Var.zzi = j;
    }

    /* renamed from: H */
    static /* synthetic */ void m29405H(C5476q8 q8Var, long j) {
        q8Var.zze |= 16;
        q8Var.zzj = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m29406I(C5476q8 q8Var, long j) {
        q8Var.zze |= 32;
        q8Var.zzk = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C5476q8();
        } else {
            if (i2 == 4) {
                return new C5439p8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
