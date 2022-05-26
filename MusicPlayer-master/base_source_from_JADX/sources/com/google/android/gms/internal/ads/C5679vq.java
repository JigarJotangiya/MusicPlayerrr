package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5679vq extends qm3<C5679vq, C5642uq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5679vq zzb;
    private int zze;
    private int zzf;
    private C5385ns zzg;

    static {
        C5679vq vqVar = new C5679vq();
        zzb = vqVar;
        qm3.m29616t(C5679vq.class, vqVar);
    }

    private C5679vq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C5605tq.zzc(), "zzg"});
        } else if (i2 == 3) {
            return new C5679vq();
        } else {
            if (i2 == 4) {
                return new C5642uq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
