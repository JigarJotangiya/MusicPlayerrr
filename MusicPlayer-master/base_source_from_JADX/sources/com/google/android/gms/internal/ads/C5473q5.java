package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5473q5 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f21821g;

    /* renamed from: h */
    final /* synthetic */ long f21822h;

    /* renamed from: i */
    final /* synthetic */ C5547s5 f21823i;

    C5473q5(C5547s5 s5Var, String str, long j) {
        this.f21823i = s5Var;
        this.f21821g = str;
        this.f21822h = j;
    }

    public final void run() {
        this.f21823i.f23333g.mo17125a(this.f21821g, this.f21822h);
        this.f21823i.f23333g.mo17126b(this.f21823i.toString());
    }
}
