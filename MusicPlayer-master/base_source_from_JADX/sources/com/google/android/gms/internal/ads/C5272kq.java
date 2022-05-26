package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5272kq extends qm3<C5272kq, C5235jq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5272kq zzb;
    private int zze;
    private int zzf;
    private C5420oq zzg;
    private C5494qq zzh;

    static {
        C5272kq kqVar = new C5272kq();
        zzb = kqVar;
        qm3.m29616t(C5272kq.class, kqVar);
    }

    private C5272kq() {
    }

    /* renamed from: D */
    public static C5235jq m26345D() {
        return (C5235jq) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m26347F(C5272kq kqVar, C5420oq oqVar) {
        oqVar.getClass();
        kqVar.zzg = oqVar;
        kqVar.zze |= 2;
    }

    /* renamed from: G */
    static /* synthetic */ void m26348G(C5272kq kqVar, C5494qq qqVar) {
        qqVar.getClass();
        kqVar.zzh = qqVar;
        kqVar.zze |= 4;
    }

    /* renamed from: H */
    static /* synthetic */ void m26349H(C5272kq kqVar, int i) {
        kqVar.zzf = 1;
        kqVar.zze = 1 | kqVar.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C5346mq.f20129a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C5272kq();
        } else {
            if (i2 == 4) {
                return new C5235jq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
