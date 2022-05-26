package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5230jl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f18509a = C4934bm.m21442l("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5119gl<? extends C5156hl> f18510b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f18511c;

    public C5230jl(String str) {
    }

    /* renamed from: a */
    public final <T extends C5156hl> long mo18647a(T t, C5082fl<T> flVar, int i) {
        Looper myLooper = Looper.myLooper();
        C5304ll.m26776e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C5119gl(this, myLooper, t, flVar, i, elapsedRealtime).mo17963c(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final void mo18648f() {
        this.f18510b.mo17961a(false);
    }

    /* renamed from: g */
    public final void mo18649g(int i) throws IOException {
        IOException iOException = this.f18511c;
        if (iOException == null) {
            C5119gl<? extends C5156hl> glVar = this.f18510b;
            if (glVar != null) {
                glVar.mo17962b(glVar.f17167i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: h */
    public final void mo18650h(Runnable runnable) {
        C5119gl<? extends C5156hl> glVar = this.f18510b;
        if (glVar != null) {
            glVar.mo17961a(true);
        }
        this.f18509a.execute(runnable);
        this.f18509a.shutdown();
    }

    /* renamed from: i */
    public final boolean mo18651i() {
        return this.f18510b != null;
    }
}
