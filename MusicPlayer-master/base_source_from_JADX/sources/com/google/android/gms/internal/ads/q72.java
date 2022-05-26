package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.q91;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q72<AdT, AdapterT, ListenerT extends q91> implements yr3<p72<AdT, AdapterT, ListenerT>> {

    /* renamed from: a */
    private final ms3<wt2> f21852a;

    /* renamed from: b */
    private final ms3<e93> f21853b;

    /* renamed from: c */
    private final ms3<m22<AdapterT, ListenerT>> f21854c;

    /* renamed from: d */
    private final ms3<t22<AdT, AdapterT, ListenerT>> f21855d;

    public q72(ms3<wt2> ms3, ms3<e93> ms32, ms3<m22<AdapterT, ListenerT>> ms33, ms3<t22<AdT, AdapterT, ListenerT>> ms34) {
        this.f21852a = ms3;
        this.f21853b = ms32;
        this.f21854c = ms33;
        this.f21855d = ms34;
    }

    /* renamed from: b */
    public final p72<AdT, AdapterT, ListenerT> mo10679a() {
        return new p72<>(this.f21852a.mo10679a(), this.f21853b.mo10679a(), this.f21854c.mo10679a(), this.f21855d.mo10679a());
    }
}
