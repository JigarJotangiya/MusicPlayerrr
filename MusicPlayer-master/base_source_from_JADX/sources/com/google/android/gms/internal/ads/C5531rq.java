package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5531rq extends qm3<C5531rq, C5309lq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5531rq zzb;
    private ym3<C5272kq> zze = qm3.m29612p();

    static {
        C5531rq rqVar = new C5531rq();
        zzb = rqVar;
        qm3.m29616t(C5531rq.class, rqVar);
    }

    private C5531rq() {
    }

    /* renamed from: D */
    public static C5309lq m30292D() {
        return (C5309lq) zzb.mo20477v();
    }

    /* renamed from: F */
    static /* synthetic */ void m30294F(C5531rq rqVar, C5272kq kqVar) {
        kqVar.getClass();
        ym3<C5272kq> ym3 = rqVar.zze;
        if (!ym3.mo21839b()) {
            rqVar.zze = qm3.m29613q(ym3);
        }
        rqVar.zze.add(kqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C5272kq.class});
        } else if (i2 == 3) {
            return new C5531rq();
        } else {
            if (i2 == 4) {
                return new C5309lq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
