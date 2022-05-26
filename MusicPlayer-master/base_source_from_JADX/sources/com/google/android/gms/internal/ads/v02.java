package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class v02 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ t02 f24533a;

    public /* synthetic */ v02(t02 t02) {
        this.f24533a = t02;
    }

    public final Object call() {
        return this.f24533a.getWritableDatabase();
    }
}
