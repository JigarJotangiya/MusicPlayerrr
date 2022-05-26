package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.lr */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5310lr extends qm3<C5310lr, C5273kr> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5310lr zzb;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;
    private int zzi = 1000;
    private C5607ts zzj;
    /* access modifiers changed from: private */
    public xm3 zzk = qm3.m29611o();
    private C5050er zzl;
    private C5162hr zzm;
    private C5792yr zzn;
    private C5198iq zzo;
    private C5163hs zzp;
    private C5460pt zzq;
    private C5531rq zzr;

    static {
        C5310lr lrVar = new C5310lr();
        zzb = lrVar;
        qm3.m29616t(C5310lr.class, lrVar);
    }

    private C5310lr() {
    }

    /* renamed from: F */
    public static C5273kr m26909F() {
        return (C5273kr) zzb.mo20477v();
    }

    /* renamed from: I */
    static /* synthetic */ void m26911I(C5310lr lrVar, String str) {
        str.getClass();
        lrVar.zze |= 2;
        lrVar.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m26912J(C5310lr lrVar, Iterable iterable) {
        xm3 xm3 = lrVar.zzk;
        if (!xm3.mo21839b()) {
            int size = xm3.size();
            lrVar.zzk = xm3.mo20052c(size == 0 ? 10 : size + size);
        }
        vk3.m32462i(iterable, lrVar.zzk);
    }

    /* renamed from: L */
    static /* synthetic */ void m26914L(C5310lr lrVar, C5050er erVar) {
        erVar.getClass();
        lrVar.zzl = erVar;
        lrVar.zze |= 32;
    }

    /* renamed from: M */
    static /* synthetic */ void m26915M(C5310lr lrVar, C5198iq iqVar) {
        iqVar.getClass();
        lrVar.zzo = iqVar;
        lrVar.zze |= 256;
    }

    /* renamed from: N */
    static /* synthetic */ void m26916N(C5310lr lrVar, C5163hs hsVar) {
        hsVar.getClass();
        lrVar.zzp = hsVar;
        lrVar.zze |= 512;
    }

    /* renamed from: O */
    static /* synthetic */ void m26917O(C5310lr lrVar, C5460pt ptVar) {
        ptVar.getClass();
        lrVar.zzq = ptVar;
        lrVar.zze |= 1024;
    }

    /* renamed from: P */
    static /* synthetic */ void m26918P(C5310lr lrVar, C5531rq rqVar) {
        rqVar.getClass();
        lrVar.zzr = rqVar;
        lrVar.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C5199ir.f18147a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new C5310lr();
        } else {
            if (i2 == 4) {
                return new C5273kr((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final C5198iq mo19275D() {
        C5198iq iqVar = this.zzo;
        return iqVar == null ? C5198iq.m25364E() : iqVar;
    }

    /* renamed from: E */
    public final C5050er mo19276E() {
        C5050er erVar = this.zzl;
        return erVar == null ? C5050er.m23103E() : erVar;
    }

    /* renamed from: H */
    public final String mo19277H() {
        return this.zzg;
    }
}
