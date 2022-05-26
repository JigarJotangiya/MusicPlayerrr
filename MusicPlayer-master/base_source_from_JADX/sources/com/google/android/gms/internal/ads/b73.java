package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b73<V> implements Runnable {

    /* renamed from: g */
    final h73<V> f14358g;

    /* renamed from: h */
    final d93<? extends V> f14359h;

    b73(h73<V> h73, d93<? extends V> d93) {
        this.f14358g = h73;
        this.f14359h = d93;
    }

    public final void run() {
        if (this.f14358g.f17571g == this) {
            if (h73.f17569l.mo15706d(this.f14358g, this, h73.m24701f(this.f14359h))) {
                h73.m24697D(this.f14358g);
            }
        }
    }
}
