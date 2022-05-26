package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ts */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5607ts extends qm3<C5607ts, C5570ss> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5607ts zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C5607ts tsVar = new C5607ts();
        zzb = tsVar;
        qm3.m29616t(C5607ts.class, tsVar);
    }

    private C5607ts() {
    }

    /* renamed from: D */
    public static C5570ss m31455D() {
        return (C5570ss) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m31457F(C5607ts tsVar, int i) {
        tsVar.zze |= 1;
        tsVar.zzf = i;
    }

    /* renamed from: G */
    static /* synthetic */ void m31458G(C5607ts tsVar, int i) {
        tsVar.zze |= 2;
        tsVar.zzg = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m31459H(C5607ts tsVar, int i) {
        tsVar.zze |= 4;
        tsVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5607ts();
        } else {
            if (i2 == 4) {
                return new C5570ss((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
