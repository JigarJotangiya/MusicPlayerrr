package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.wd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5703wd implements C5519re, C5556se {

    /* renamed from: a */
    private final int f25340a;

    /* renamed from: b */
    private C5593te f25341b;

    /* renamed from: c */
    private int f25342c;

    /* renamed from: d */
    private int f25343d;

    /* renamed from: e */
    private C5709wj f25344e;

    /* renamed from: f */
    private long f25345f;

    /* renamed from: g */
    private boolean f25346g = true;

    /* renamed from: h */
    private boolean f25347h;

    public C5703wd(int i) {
        this.f25340a = i;
    }

    /* renamed from: B */
    public final boolean mo20626B() {
        return this.f25346g;
    }

    /* renamed from: I */
    public final boolean mo20627I() {
        return this.f25347h;
    }

    /* renamed from: O */
    public final void mo20628O() throws C5778yd {
        C5304ll.m26776e(this.f25343d == 2);
        this.f25343d = 1;
        mo18408u();
    }

    /* renamed from: P */
    public final void mo20629P(int i) {
        this.f25342c = i;
    }

    /* renamed from: Q */
    public final void mo20630Q(long j) throws C5778yd {
        this.f25347h = false;
        this.f25346g = false;
        mo18374q(j, false);
    }

    /* renamed from: R */
    public final void mo20631R(C5593te teVar, zzapg[] zzapgArr, C5709wj wjVar, long j, boolean z, long j2) throws C5778yd {
        C5304ll.m26776e(this.f25343d == 0);
        this.f25341b = teVar;
        this.f25343d = 1;
        mo18373p(z);
        mo20632T(zzapgArr, wjVar, j2);
        mo18374q(j, z);
    }

    /* renamed from: T */
    public final void mo20632T(zzapg[] zzapgArr, C5709wj wjVar, long j) throws C5778yd {
        C5304ll.m26776e(!this.f25347h);
        this.f25344e = wjVar;
        this.f25346g = false;
        this.f25345f = j;
        mo18409v(zzapgArr, j);
    }

    /* renamed from: a */
    public final int mo20633a() {
        return this.f25343d;
    }

    /* renamed from: b */
    public final int mo20634b() {
        return this.f25340a;
    }

    /* renamed from: c */
    public final C5556se mo20635c() {
        return this;
    }

    /* renamed from: e */
    public final C5709wj mo20636e() {
        return this.f25344e;
    }

    /* renamed from: g */
    public C5452pl mo20637g() {
        return null;
    }

    /* renamed from: h */
    public final void mo20638h() {
        boolean z = true;
        if (this.f25343d != 1) {
            z = false;
        }
        C5304ll.m26776e(z);
        this.f25343d = 0;
        this.f25344e = null;
        this.f25347h = false;
        mo18372o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo21799j() {
        return this.f25346g ? this.f25347h : this.f25344e.zze();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo21800k() {
        return this.f25342c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo21801l(C5371ne neVar, C5225jg jgVar, boolean z) {
        C5371ne neVar2 = neVar;
        C5225jg jgVar2 = jgVar;
        int c = this.f25344e.mo17541c(neVar2, jgVar2, z);
        if (c == -4) {
            if (jgVar.mo16923f()) {
                this.f25346g = true;
                return this.f25347h ? -4 : -3;
            }
            jgVar2.f18475d += this.f25345f;
        } else if (c == -5) {
            zzapg zzapg = neVar2.f20601a;
            long j = zzapg.f27116C;
            if (j != Long.MAX_VALUE) {
                neVar2.f20601a = new zzapg(zzapg.f27121g, zzapg.f27125k, zzapg.f27126l, zzapg.f27123i, zzapg.f27122h, zzapg.f27127m, zzapg.f27130p, zzapg.f27131q, zzapg.f27132r, zzapg.f27133s, zzapg.f27134t, zzapg.f27136v, zzapg.f27135u, zzapg.f27137w, zzapg.f27138x, zzapg.f27139y, zzapg.f27140z, zzapg.f27114A, zzapg.f27115B, zzapg.f27117D, zzapg.f27118E, zzapg.f27119F, j + this.f25345f, zzapg.f27128n, zzapg.f27129o, zzapg.f27124j);
                return -5;
            }
        }
        return c;
    }

    /* renamed from: m */
    public final void mo20639m() throws IOException {
        this.f25344e.mo17540b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C5593te mo21802n() {
        return this.f25341b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo18372o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo18373p(boolean z) throws C5778yd;

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo18374q(long j, boolean z) throws C5778yd;

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo18407r() throws C5778yd;

    /* renamed from: t */
    public final void mo20640t() {
        this.f25347h = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo18408u() throws C5778yd;

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18409v(zzapg[] zzapgArr, long j) throws C5778yd {
    }

    /* renamed from: x */
    public final void mo20641x() throws C5778yd {
        boolean z = true;
        if (this.f25343d != 1) {
            z = false;
        }
        C5304ll.m26776e(z);
        this.f25343d = 2;
        mo18407r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo21803y(long j) {
        this.f25344e.mo17539a(j - this.f25345f);
    }
}
