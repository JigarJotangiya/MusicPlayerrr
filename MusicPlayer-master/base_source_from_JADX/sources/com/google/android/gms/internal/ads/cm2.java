package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.n71;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cm2<RequestComponentT extends n71<AdT>, AdT> implements om2<RequestComponentT, AdT> {

    /* renamed from: a */
    private RequestComponentT f15031a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ d93 mo16681a(pm2 pm2, nm2 nm2, Object obj) {
        return mo16683c(pm2, nm2, (n71) null);
    }

    /* renamed from: b */
    public final synchronized RequestComponentT mo16684f() {
        return this.f15031a;
    }

    /* renamed from: c */
    public final synchronized d93<AdT> mo16683c(pm2 pm2, nm2<RequestComponentT> nm2, RequestComponentT requestcomponentt) {
        k51 a;
        if (requestcomponentt != null) {
            this.f15031a = requestcomponentt;
        } else {
            this.f15031a = (n71) nm2.mo18001a(pm2.f21429b).mo16419e();
        }
        a = this.f15031a.mo16754a();
        return a.mo18847h(a.mo18848i());
    }
}
