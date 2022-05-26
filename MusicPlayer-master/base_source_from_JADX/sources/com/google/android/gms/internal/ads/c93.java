package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class c93 implements lu3, mu3 {

    /* renamed from: g */
    private final int f14913g;

    /* renamed from: h */
    private final qt3 f14914h = new qt3();

    /* renamed from: i */
    private nu3 f14915i;

    /* renamed from: j */
    private int f14916j;

    /* renamed from: k */
    private int f14917k;

    /* renamed from: l */
    private u34 f14918l;

    /* renamed from: m */
    private C5689w[] f14919m;

    /* renamed from: n */
    private long f14920n;

    /* renamed from: o */
    private long f14921o = Long.MIN_VALUE;

    /* renamed from: p */
    private boolean f14922p;

    /* renamed from: q */
    private boolean f14923q;

    public c93(int i) {
        this.f14913g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo16485A();

    /* renamed from: B */
    public final void mo16553B() {
        this.f14922p = true;
    }

    /* renamed from: C */
    public final boolean mo16554C() {
        return this.f14922p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo16513D(boolean z, boolean z2) throws ji3 {
    }

    /* renamed from: F */
    public final void mo16555F() {
        gs1.m24488f(this.f14917k == 2);
        this.f14917k = 1;
        mo16516J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo16487G(long j, boolean z) throws ji3;

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo16514H() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo16515I() throws ji3 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo16516J() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void mo16488K(C5689w[] wVarArr, long j, long j2) throws ji3;

    /* renamed from: T */
    public final void mo16556T() throws ji3 {
        boolean z = true;
        if (this.f14917k != 1) {
            z = false;
        }
        gs1.m24488f(z);
        this.f14917k = 2;
        mo16515I();
    }

    /* renamed from: a */
    public final int mo16557a() {
        return this.f14913g;
    }

    /* renamed from: c */
    public final long mo16558c() {
        return this.f14921o;
    }

    /* renamed from: d */
    public final void mo16559d(int i) {
        this.f14916j = i;
    }

    /* renamed from: e */
    public /* synthetic */ void mo16533e(float f, float f2) {
    }

    /* renamed from: f */
    public final void mo16560f(C5689w[] wVarArr, u34 u34, long j, long j2) throws ji3 {
        gs1.m24488f(!this.f14922p);
        this.f14918l = u34;
        if (this.f14921o == Long.MIN_VALUE) {
            this.f14921o = j;
        }
        this.f14919m = wVarArr;
        this.f14920n = j2;
        mo16488K(wVarArr, j, j2);
    }

    /* renamed from: g */
    public st3 mo16561g() {
        return null;
    }

    /* renamed from: h */
    public final mu3 mo16562h() {
        return this;
    }

    /* renamed from: j */
    public final u34 mo16563j() {
        return this.f14918l;
    }

    /* renamed from: k */
    public final void mo16564k(long j) throws ji3 {
        this.f14922p = false;
        this.f14921o = j;
        mo16487G(j, false);
    }

    /* renamed from: m */
    public final void mo16565m() {
        boolean z = true;
        if (this.f14917k != 1) {
            z = false;
        }
        gs1.m24488f(z);
        qt3 qt3 = this.f14914h;
        qt3.f22028b = null;
        qt3.f22027a = null;
        this.f14917k = 0;
        this.f14918l = null;
        this.f14919m = null;
        this.f14922p = false;
        mo16485A();
    }

    /* renamed from: n */
    public void mo16537n(int i, Object obj) throws ji3 {
    }

    /* renamed from: o */
    public final void mo16566o(nu3 nu3, C5689w[] wVarArr, u34 u34, long j, boolean z, boolean z2, long j2, long j3) throws ji3 {
        boolean z3 = z;
        gs1.m24488f(this.f14917k == 0);
        this.f14915i = nu3;
        this.f14917k = 1;
        mo16513D(z, z2);
        mo16560f(wVarArr, u34, j2, j3);
        long j4 = j;
        mo16487G(j, z);
    }

    /* renamed from: p */
    public final int mo16567p() {
        return this.f14917k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo16568q() {
        if (mo16573w()) {
            return this.f14922p;
        }
        u34 u34 = this.f14918l;
        Objects.requireNonNull(u34);
        return u34.zze();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C5689w[] mo16569r() {
        C5689w[] wVarArr = this.f14919m;
        Objects.requireNonNull(wVarArr);
        return wVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo16570t(qt3 qt3, k31 k31, int i) {
        u34 u34 = this.f14918l;
        Objects.requireNonNull(u34);
        int b = u34.mo16848b(qt3, k31, i);
        if (b == -4) {
            if (k31.mo17033g()) {
                this.f14921o = Long.MIN_VALUE;
                return this.f14922p ? -4 : -3;
            }
            long j = k31.f18745e + this.f14920n;
            k31.f18745e = j;
            this.f14921o = Math.max(this.f14921o, j);
        } else if (b == -5) {
            C5689w wVar = qt3.f22027a;
            Objects.requireNonNull(wVar);
            if (wVar.f25137p != Long.MAX_VALUE) {
                jb4 b2 = wVar.mo21657b();
                b2.mo18603w(wVar.f25137p + this.f14920n);
                qt3.f22027a = b2.mo18605y();
                return -5;
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final ji3 mo16571u(Throwable th, C5689w wVar, boolean z, int i) {
        int i2;
        if (wVar != null && !this.f14923q) {
            this.f14923q = true;
            try {
                int l = mo16492l(wVar) & 7;
                this.f14923q = false;
                i2 = l;
            } catch (ji3 unused) {
                this.f14923q = false;
            } catch (Throwable th2) {
                this.f14923q = false;
                throw th2;
            }
            return ji3.zzb(th, mo16493s(), this.f14916j, wVar, i2, z, i);
        }
        i2 = 4;
        return ji3.zzb(th, mo16493s(), this.f14916j, wVar, i2, z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo16572v(long j) {
        u34 u34 = this.f14918l;
        Objects.requireNonNull(u34);
        return u34.mo16847a(j - this.f14920n);
    }

    /* renamed from: w */
    public final boolean mo16573w() {
        return this.f14921o == Long.MIN_VALUE;
    }

    /* renamed from: x */
    public final void mo16574x() {
        gs1.m24488f(this.f14917k == 0);
        qt3 qt3 = this.f14914h;
        qt3.f22028b = null;
        qt3.f22027a = null;
        mo16514H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final qt3 mo16575y() {
        qt3 qt3 = this.f14914h;
        qt3.f22028b = null;
        qt3.f22027a = null;
        return qt3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final nu3 mo16576z() {
        nu3 nu3 = this.f14915i;
        Objects.requireNonNull(nu3);
        return nu3;
    }

    public int zze() throws ji3 {
        return 0;
    }

    public final void zzp() throws IOException {
        u34 u34 = this.f14918l;
        Objects.requireNonNull(u34);
        u34.mo16849f();
    }
}
