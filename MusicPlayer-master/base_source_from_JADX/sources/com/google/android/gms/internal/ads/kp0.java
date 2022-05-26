package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class kp0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ eo0 f18950g;

    /* renamed from: h */
    public final /* synthetic */ Map f18951h;

    public /* synthetic */ kp0(eo0 eo0, Map map) {
        this.f18950g = eo0;
        this.f18951h = map;
    }

    public final void run() {
        eo0 eo0 = this.f18950g;
        Map map = this.f18951h;
        int i = lp0.f19476C;
        eo0.mo16880n0("onGcacheInfoEvent", map);
    }
}
