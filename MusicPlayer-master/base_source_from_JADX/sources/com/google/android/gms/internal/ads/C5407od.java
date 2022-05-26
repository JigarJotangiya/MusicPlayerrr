package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.od */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5407od extends qm3<C5407od, C5370nd> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5407od zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        C5407od odVar = new C5407od();
        zzb = odVar;
        qm3.m29616t(C5407od.class, odVar);
    }

    private C5407od() {
    }

    /* renamed from: G */
    public static C5370nd m28425G() {
        return (C5370nd) zzb.mo20477v();
    }

    /* renamed from: I */
    public static C5407od m28427I() {
        return zzb;
    }

    /* renamed from: J */
    public static C5407od m28428J(kl3 kl3) throws bn3 {
        return (C5407od) qm3.m29618y(zzb, kl3);
    }

    /* renamed from: K */
    public static C5407od m28429K(kl3 kl3, cm3 cm3) throws bn3 {
        return (C5407od) qm3.m29605A(zzb, kl3, cm3);
    }

    /* renamed from: N */
    static /* synthetic */ void m28430N(C5407od odVar, String str) {
        str.getClass();
        odVar.zze |= 1;
        odVar.zzf = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m28431O(C5407od odVar, long j) {
        odVar.zze |= 16;
        odVar.zzj = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m28432P(C5407od odVar, String str) {
        str.getClass();
        odVar.zze |= 2;
        odVar.zzg = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m28433R(C5407od odVar, long j) {
        odVar.zze |= 4;
        odVar.zzh = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m28434S(C5407od odVar, long j) {
        odVar.zze |= 8;
        odVar.zzi = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return qm3.m29615s(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C5407od();
        } else {
            if (i2 == 4) {
                return new C5370nd((C5333md) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: D */
    public final long mo19959D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final long mo19960E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final long mo19961F() {
        return this.zzj;
    }

    /* renamed from: L */
    public final String mo19962L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final String mo19963M() {
        return this.zzf;
    }
}
