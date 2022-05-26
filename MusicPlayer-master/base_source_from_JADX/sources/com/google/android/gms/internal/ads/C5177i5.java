package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5177i5 implements Runnable {

    /* renamed from: g */
    private final C5547s5 f17886g;

    /* renamed from: h */
    private final C5769y5 f17887h;

    /* renamed from: i */
    private final Runnable f17888i;

    public C5177i5(C5547s5 s5Var, C5769y5 y5Var, Runnable runnable) {
        this.f17886g = s5Var;
        this.f17887h = y5Var;
        this.f17888i = runnable;
    }

    public final void run() {
        this.f17886g.mo20775D();
        if (this.f17887h.mo22170c()) {
            this.f17886g.mo11059v(this.f17887h.f26264a);
        } else {
            this.f17886g.mo20788u(this.f17887h.f26266c);
        }
        if (this.f17887h.f26267d) {
            this.f17886g.mo20786t("intermediate-response");
        } else {
            this.f17886g.mo20789w("done");
        }
        Runnable runnable = this.f17888i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
