package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class pz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ d93 f21766a;

    /* renamed from: b */
    public final /* synthetic */ d93 f21767b;

    public /* synthetic */ pz1(d93 d93, d93 d932) {
        this.f21766a = d93;
        this.f21767b = d932;
    }

    public final Object call() {
        d93 d93 = this.f21766a;
        d93 d932 = this.f21767b;
        return new vz1((zz1) d93.get(), ((tz1) d932.get()).f24069b, ((tz1) d932.get()).f24068a);
    }
}
