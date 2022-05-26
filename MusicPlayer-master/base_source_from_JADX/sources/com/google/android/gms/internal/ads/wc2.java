package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.internal.ads.rg2;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wc2<S extends rg2<?>> {

    /* renamed from: a */
    public final d93<S> f25336a;

    /* renamed from: b */
    private final long f25337b;

    /* renamed from: c */
    private final C3359d f25338c;

    public wc2(d93<S> d93, long j, C3359d dVar) {
        this.f25336a = d93;
        this.f25338c = dVar;
        this.f25337b = dVar.mo11989b() + j;
    }

    /* renamed from: a */
    public final boolean mo21798a() {
        return this.f25337b < this.f25338c.mo11989b();
    }
}
