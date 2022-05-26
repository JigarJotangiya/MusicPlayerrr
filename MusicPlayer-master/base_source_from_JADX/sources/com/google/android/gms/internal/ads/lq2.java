package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lq2<T> {

    /* renamed from: a */
    private final Deque<d93<T>> f19503a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable<T> f19504b;

    /* renamed from: c */
    private final e93 f19505c;

    public lq2(Callable<T> callable, e93 e93) {
        this.f19504b = callable;
        this.f19505c = e93;
    }

    /* renamed from: a */
    public final synchronized d93<T> mo19271a() {
        mo19273c(1);
        return this.f19503a.poll();
    }

    /* renamed from: b */
    public final synchronized void mo19272b(d93<T> d93) {
        this.f19503a.addFirst(d93);
    }

    /* renamed from: c */
    public final synchronized void mo19273c(int i) {
        int size = i - this.f19503a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f19503a.add(this.f19505c.mo17138A0(this.f19504b));
        }
    }
}
