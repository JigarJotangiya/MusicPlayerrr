package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class nz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ d93 f20771a;

    /* renamed from: b */
    public final /* synthetic */ d93 f20772b;

    public /* synthetic */ nz1(d93 d93, d93 d932) {
        this.f20771a = d93;
        this.f20772b = d932;
    }

    public final Object call() {
        return new c02((JSONObject) this.f20771a.get(), (rg0) this.f20772b.get());
    }
}
