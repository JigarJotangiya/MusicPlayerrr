package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class w12 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ y12 f25173a;

    public /* synthetic */ w12(y12 y12) {
        this.f25173a = y12;
    }

    public final Object call() {
        return this.f25173a.getWritableDatabase();
    }
}
