package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5420oq extends qm3<C5420oq, C5383nq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5420oq zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C5420oq oqVar = new C5420oq();
        zzb = oqVar;
        qm3.m29616t(C5420oq.class, oqVar);
    }

    private C5420oq() {
    }

    /* renamed from: D */
    public static C5383nq m28649D() {
        return (C5383nq) zzb.mo20477v();
    }

    /* renamed from: F */
    public static C5420oq m28651F() {
        return zzb;
    }

    /* renamed from: G */
    static /* synthetic */ void m28652G(C5420oq oqVar, boolean z) {
        oqVar.zze |= 1;
        oqVar.zzf = z;
    }

    /* renamed from: H */
    static /* synthetic */ void m28653H(C5420oq oqVar, int i) {
        oqVar.zze |= 2;
        oqVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C5420oq();
        } else {
            if (i2 == 4) {
                return new C5383nq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
