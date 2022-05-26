package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ii2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ d93 f18041a;

    /* renamed from: b */
    public final /* synthetic */ d93 f18042b;

    public /* synthetic */ ii2(d93 d93, d93 d932) {
        this.f18041a = d93;
        this.f18042b = d932;
    }

    public final Object call() {
        return new ki2((String) this.f18041a.get(), (String) this.f18042b.get());
    }
}
