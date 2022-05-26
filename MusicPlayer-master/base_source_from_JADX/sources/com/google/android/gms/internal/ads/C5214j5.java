package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5214j5 {

    /* renamed from: a */
    private final Executor f18364a;

    public C5214j5(Handler handler) {
        this.f18364a = new C5140h5(this, handler);
    }

    /* renamed from: a */
    public final void mo18545a(C5547s5<?> s5Var, C4955c6 c6Var) {
        s5Var.mo20786t("post-error");
        C5769y5 a = C5769y5.m34033a(c6Var);
        Executor executor = this.f18364a;
        ((C5140h5) executor).f17532g.post(new C5177i5(s5Var, a, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo18546b(C5547s5<?> s5Var, C5769y5<?> y5Var, Runnable runnable) {
        s5Var.mo20790x();
        s5Var.mo20786t("post-response");
        Executor executor = this.f18364a;
        ((C5140h5) executor).f17532g.post(new C5177i5(s5Var, y5Var, runnable));
    }
}
