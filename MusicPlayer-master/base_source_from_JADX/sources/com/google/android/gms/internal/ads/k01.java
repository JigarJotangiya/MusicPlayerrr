package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class k01 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ pr0 f18689g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f18690h;

    public /* synthetic */ k01(pr0 pr0, JSONObject jSONObject) {
        this.f18689g = pr0;
        this.f18690h = jSONObject;
    }

    public final void run() {
        this.f18689g.mo17684c1("AFMA_updateActiveView", this.f18690h);
    }
}
