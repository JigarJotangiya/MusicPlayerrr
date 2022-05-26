package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class er0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ eo0 f16069g;

    /* renamed from: h */
    public final /* synthetic */ Map f16070h;

    public /* synthetic */ er0(eo0 eo0, Map map) {
        this.f16069g = eo0;
        this.f16070h = map;
    }

    public final void run() {
        eo0 eo0 = this.f16069g;
        Map map = this.f16070h;
        int i = fr0.f16721B;
        eo0.mo16880n0("onGcacheInfoEvent", map);
    }
}
