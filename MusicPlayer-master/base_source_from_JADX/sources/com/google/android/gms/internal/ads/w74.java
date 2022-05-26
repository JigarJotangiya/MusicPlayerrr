package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w74 {

    /* renamed from: a */
    private final Handler f25266a;

    /* renamed from: b */
    private final x74 f25267b;

    public w74(Handler handler, x74 x74) {
        this.f25266a = x74 == null ? null : handler;
        this.f25267b = x74;
    }

    /* renamed from: a */
    public final void mo21746a(String str, long j, long j2) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new v74(this, str, j, j2));
        }
    }

    /* renamed from: b */
    public final void mo21747b(String str) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new u74(this, str));
        }
    }

    /* renamed from: c */
    public final void mo21748c(da3 da3) {
        da3.mo16884a();
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new q74(this, da3));
        }
    }

    /* renamed from: d */
    public final void mo21749d(int i, long j) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new m74(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo21750e(da3 da3) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new r74(this, da3));
        }
    }

    /* renamed from: f */
    public final void mo21751f(C5689w wVar, eb3 eb3) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new o74(this, wVar, eb3));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo21752g(String str, long j, long j2) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17428y(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo21753h(String str) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17380E(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo21754i(da3 da3) {
        da3.mo16884a();
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17416j(da3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo21755j(int i, long j) {
        x74 x74 = this.f25267b;
        int i2 = wy2.f25579a;
        x74.mo17425u(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo21756k(da3 da3) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17406d(da3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo21757l(C5689w wVar, eb3 eb3) {
        int i = wy2.f25579a;
        this.f25267b.mo17422q(wVar, eb3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo21758m(Object obj, long j) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17417k(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo21759n(long j, int i) {
        x74 x74 = this.f25267b;
        int i2 = wy2.f25579a;
        x74.mo17423r(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo21760o(Exception exc) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17426v(exc);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo21761p(cw0 cw0) {
        x74 x74 = this.f25267b;
        int i = wy2.f25579a;
        x74.mo17402b(cw0);
    }

    /* renamed from: q */
    public final void mo21762q(Object obj) {
        if (this.f25266a != null) {
            this.f25266a.post(new t74(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: r */
    public final void mo21763r(long j, int i) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new n74(this, j, i));
        }
    }

    /* renamed from: s */
    public final void mo21764s(Exception exc) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new s74(this, exc));
        }
    }

    /* renamed from: t */
    public final void mo21765t(cw0 cw0) {
        Handler handler = this.f25266a;
        if (handler != null) {
            handler.post(new p74(this, cw0));
        }
    }
}
