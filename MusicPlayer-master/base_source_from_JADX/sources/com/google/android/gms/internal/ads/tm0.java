package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class tm0<T> {

    /* renamed from: a */
    private final mm0<T> f23940a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f23941b = new AtomicInteger(0);

    public tm0() {
        mm0<T> mm0 = new mm0<>();
        this.f23940a = mm0;
        s83.m30616r(mm0, new rm0(this), hm0.f17713f);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo21116a() {
        return this.f23941b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo21117c() {
        this.f23940a.mo19451e(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void mo21118d(T t) {
        this.f23940a.mo19449c(t);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo21119e(qm0<T> qm0, om0 om0) {
        s83.m30616r(this.f23940a, new sm0(this, qm0, om0), hm0.f17713f);
    }
}
