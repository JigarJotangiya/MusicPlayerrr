package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ds */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5014ds extends qm3<C5014ds, C4977cs> implements ao3 {
    private static final vm3<Integer, C5605tq> zzb = new C4940bs();
    /* access modifiers changed from: private */
    public static final C5014ds zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private um3 zzk = qm3.m29609m();
    private C5792yr zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        C5014ds dsVar = new C5014ds();
        zze = dsVar;
        qm3.m29616t(C5014ds.class, dsVar);
    }

    private C5014ds() {
    }

    /* renamed from: D */
    static /* synthetic */ void m22662D(C5014ds dsVar, int i) {
        dsVar.zzo = i - 1;
        dsVar.zzf |= 128;
    }

    /* renamed from: E */
    static /* synthetic */ void m22663E(C5014ds dsVar, int i) {
        dsVar.zzq = i - 1;
        dsVar.zzf |= 512;
    }

    /* renamed from: K */
    public static C4977cs m22664K() {
        return (C4977cs) zze.mo20477v();
    }

    /* renamed from: M */
    public static C5014ds m22666M(byte[] bArr) throws bn3 {
        return (C5014ds) qm3.m29619z(zze, bArr);
    }

    /* renamed from: P */
    static /* synthetic */ void m22667P(C5014ds dsVar, long j) {
        dsVar.zzf |= 1;
        dsVar.zzg = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m22668R(C5014ds dsVar, long j) {
        dsVar.zzf |= 4;
        dsVar.zzi = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m22669S(C5014ds dsVar, long j) {
        dsVar.zzf |= 8;
        dsVar.zzj = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m22670T(C5014ds dsVar, Iterable iterable) {
        um3 um3 = dsVar.zzk;
        if (!um3.mo21839b()) {
            dsVar.zzk = qm3.m29610n(um3);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            dsVar.zzk.mo20677L(((C5605tq) it.next()).zza());
        }
    }

    /* renamed from: U */
    static /* synthetic */ void m22671U(C5014ds dsVar, C5792yr yrVar) {
        yrVar.getClass();
        dsVar.zzl = yrVar;
        dsVar.zzf |= 16;
    }

    /* renamed from: V */
    static /* synthetic */ void m22672V(C5014ds dsVar, int i) {
        dsVar.zzf |= 256;
        dsVar.zzp = i;
    }

    /* renamed from: W */
    static /* synthetic */ void m22673W(C5014ds dsVar, C5126gs gsVar) {
        dsVar.zzr = gsVar.zza();
        dsVar.zzf |= 1024;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m22674d0(C5014ds dsVar, int i) {
        dsVar.zzh = i - 1;
        dsVar.zzf |= 2;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m22675e0(C5014ds dsVar, int i) {
        dsVar.zzm = i - 1;
        dsVar.zzf |= 32;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m22676f0(C5014ds dsVar, int i) {
        dsVar.zzn = i - 1;
        dsVar.zzf |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tm3 tm3 = C5199ir.f18147a;
            return qm3.m29615s(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", tm3, "zzi", "zzj", "zzk", C5605tq.zzc(), "zzl", "zzm", tm3, "zzn", tm3, "zzo", tm3, "zzp", "zzq", tm3, "zzr", C5126gs.zzc()});
        } else if (i2 == 3) {
            return new C5014ds();
        } else {
            if (i2 == 4) {
                return new C4977cs((C5049eq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: F */
    public final int mo17001F() {
        return this.zzp;
    }

    /* renamed from: G */
    public final long mo17002G() {
        return this.zzj;
    }

    /* renamed from: H */
    public final long mo17003H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final long mo17004I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final C5792yr mo17005J() {
        C5792yr yrVar = this.zzl;
        return yrVar == null ? C5792yr.m34281F() : yrVar;
    }

    /* renamed from: N */
    public final C5126gs mo17006N() {
        C5126gs zzb2 = C5126gs.zzb(this.zzr);
        return zzb2 == null ? C5126gs.UNSPECIFIED : zzb2;
    }

    /* renamed from: O */
    public final List<C5605tq> mo17007O() {
        return new wm3(this.zzk, zzb);
    }

    /* renamed from: X */
    public final int mo17008X() {
        int a = C5236jr.m25824a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: Z */
    public final int mo17009Z() {
        int a = C5236jr.m25824a(this.zzo);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a0 */
    public final int mo17010a0() {
        int a = C5236jr.m25824a(this.zzq);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b0 */
    public final int mo17011b0() {
        int a = C5236jr.m25824a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c0 */
    public final int mo17012c0() {
        int a = C5236jr.m25824a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
