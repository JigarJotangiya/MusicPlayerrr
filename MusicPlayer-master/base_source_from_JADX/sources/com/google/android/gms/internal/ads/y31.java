package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y31 implements u91, C5824zm {

    /* renamed from: g */
    private final bp2 f26243g;

    /* renamed from: h */
    private final x81 f26244h;

    /* renamed from: i */
    private final da1 f26245i;

    /* renamed from: j */
    private final AtomicBoolean f26246j = new AtomicBoolean();

    /* renamed from: k */
    private final AtomicBoolean f26247k = new AtomicBoolean();

    public y31(bp2 bp2, x81 x81, da1 da1) {
        this.f26243g = bp2;
        this.f26244h = x81;
        this.f26245i = da1;
    }

    /* renamed from: a */
    private final void m34004a() {
        if (this.f26246j.compareAndSet(false, true)) {
            this.f26244h.zza();
        }
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        if (this.f26243g.f14645f == 1 && xmVar.f25884j) {
            m34004a();
        }
        if (xmVar.f25884j && this.f26247k.compareAndSet(false, true)) {
            this.f26245i.zza();
        }
    }

    /* renamed from: k */
    public final synchronized void mo15615k() {
        if (this.f26243g.f14645f != 1) {
            m34004a();
        }
    }
}
