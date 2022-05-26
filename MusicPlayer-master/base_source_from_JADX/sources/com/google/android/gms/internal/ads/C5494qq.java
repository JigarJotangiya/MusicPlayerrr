package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5494qq extends qm3<C5494qq, C5457pq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5494qq zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C5494qq qqVar = new C5494qq();
        zzb = qqVar;
        qm3.m29616t(C5494qq.class, qqVar);
    }

    private C5494qq() {
    }

    /* renamed from: D */
    public static C5457pq m29651D() {
        return (C5457pq) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m29653F(C5494qq qqVar, boolean z) {
        qqVar.zze |= 1;
        qqVar.zzf = z;
    }

    /* renamed from: G */
    static /* synthetic */ void m29654G(C5494qq qqVar, boolean z) {
        qqVar.zze |= 2;
        qqVar.zzg = z;
    }

    /* renamed from: H */
    static /* synthetic */ void m29655H(C5494qq qqVar, int i) {
        qqVar.zze |= 4;
        qqVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5494qq();
        } else {
            if (i2 == 4) {
                return new C5457pq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
