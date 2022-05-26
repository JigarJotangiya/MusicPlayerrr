package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vx3 {

    /* renamed from: a */
    private final Handler f25056a;

    /* renamed from: b */
    private final wx3 f25057b;

    public vx3(Handler handler, wx3 wx3) {
        this.f25056a = wx3 == null ? null : handler;
        this.f25057b = wx3;
    }

    /* renamed from: a */
    public final void mo21626a(Exception exc) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new qx3(this, exc));
        }
    }

    /* renamed from: b */
    public final void mo21627b(Exception exc) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new rx3(this, exc));
        }
    }

    /* renamed from: c */
    public final void mo21628c(String str, long j, long j2) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new tx3(this, str, j, j2));
        }
    }

    /* renamed from: d */
    public final void mo21629d(String str) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new sx3(this, str));
        }
    }

    /* renamed from: e */
    public final void mo21630e(da3 da3) {
        da3.mo16884a();
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new ox3(this, da3));
        }
    }

    /* renamed from: f */
    public final void mo21631f(da3 da3) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new px3(this, da3));
        }
    }

    /* renamed from: g */
    public final void mo21632g(C5689w wVar, eb3 eb3) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new nx3(this, wVar, eb3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo21633h(Exception exc) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17420n(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo21634i(Exception exc) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17410f(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo21635j(String str, long j, long j2) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17412g(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo21636k(String str) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17387M(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo21637l(da3 da3) {
        da3.mo16884a();
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17427w(da3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo21638m(da3 da3) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17424s(da3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo21639n(C5689w wVar, eb3 eb3) {
        int i = wy2.f25579a;
        this.f25057b.mo17379C(wVar, eb3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo21640o(long j) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17421o(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo21641p(boolean z) {
        wx3 wx3 = this.f25057b;
        int i = wy2.f25579a;
        wx3.mo17400a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo21642q(int i, long j, long j2) {
        wx3 wx3 = this.f25057b;
        int i2 = wy2.f25579a;
        wx3.mo17415i(i, j, j2);
    }

    /* renamed from: r */
    public final void mo21643r(long j) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new mx3(this, j));
        }
    }

    /* renamed from: s */
    public final void mo21644s(boolean z) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new ux3(this, z));
        }
    }

    /* renamed from: t */
    public final void mo21645t(int i, long j, long j2) {
        Handler handler = this.f25056a;
        if (handler != null) {
            handler.post(new lx3(this, i, j, j2));
        }
    }
}
