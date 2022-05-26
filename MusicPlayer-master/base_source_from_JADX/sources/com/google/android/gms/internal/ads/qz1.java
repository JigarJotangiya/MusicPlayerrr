package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class qz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ d93 f22681a;

    /* renamed from: b */
    public final /* synthetic */ d93 f22682b;

    /* renamed from: c */
    public final /* synthetic */ d93 f22683c;

    public /* synthetic */ qz1(d93 d93, d93 d932, d93 d933) {
        this.f22681a = d93;
        this.f22682b = d932;
        this.f22683c = d933;
    }

    public final Object call() {
        return new vz1((zz1) this.f22681a.get(), (JSONObject) this.f22682b.get(), (rg0) this.f22683c.get());
    }
}
