package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iq */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5198iq extends qm3<C5198iq, C5161hq> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5198iq zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private C5753xq zzh;
    private C4902ar zzi;
    private ym3<C5679vq> zzj = qm3.m29612p();
    private C4976cr zzk;
    private C5237js zzl;
    private C4903as zzm;
    private C5458pr zzn;
    private C5532rr zzo;
    private ym3<C5681vs> zzp = qm3.m29612p();

    static {
        C5198iq iqVar = new C5198iq();
        zzb = iqVar;
        qm3.m29616t(C5198iq.class, iqVar);
    }

    private C5198iq() {
    }

    /* renamed from: E */
    public static C5198iq m25364E() {
        return zzb;
    }

    /* renamed from: G */
    static /* synthetic */ void m25365G(C5198iq iqVar, C5124gq gqVar) {
        iqVar.zzf = gqVar.zza();
        iqVar.zze |= 1;
    }

    /* renamed from: H */
    static /* synthetic */ void m25366H(C5198iq iqVar, C4902ar arVar) {
        arVar.getClass();
        iqVar.zzi = arVar;
        iqVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", C5124gq.zzc(), "zzg", C5199ir.f18147a, "zzh", "zzi", "zzj", C5679vq.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C5681vs.class});
        } else if (i2 == 3) {
            return new C5198iq();
        } else {
            if (i2 == 4) {
                return new C5161hq((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final C4902ar mo18477F() {
        C4902ar arVar = this.zzi;
        return arVar == null ? C4902ar.m20926E() : arVar;
    }
}
