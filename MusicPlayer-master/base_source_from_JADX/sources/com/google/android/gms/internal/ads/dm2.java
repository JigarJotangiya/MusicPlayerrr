package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.n71;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dm2<RequestComponentT extends n71<AdT>, AdT> implements om2<RequestComponentT, AdT> {

    /* renamed from: a */
    private final om2<RequestComponentT, AdT> f15656a;

    /* renamed from: b */
    private RequestComponentT f15657b;

    public dm2(om2<RequestComponentT, AdT> om2) {
        this.f15656a = om2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ d93 mo16681a(pm2 pm2, nm2 nm2, Object obj) {
        return mo16952c(pm2, nm2, (n71) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT mo16684f() {
        return this.f15657b;
    }

    /* renamed from: c */
    public final synchronized d93<AdT> mo16952c(pm2 pm2, nm2<RequestComponentT> nm2, RequestComponentT requestcomponentt) {
        this.f15657b = requestcomponentt;
        if (pm2.f21428a != null) {
            k51 a = requestcomponentt.mo16754a();
            return a.mo18847h(a.mo18849j(s83.m30607i(pm2.f21428a)));
        }
        return ((cm2) this.f15656a).mo16683c(pm2, nm2, requestcomponentt);
    }
}
