package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.ee */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5037ee extends Handler {

    /* renamed from: a */
    final /* synthetic */ C5075fe f15933a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5037ee(C5075fe feVar, Looper looper) {
        super(looper);
        this.f15933a = feVar;
    }

    public final void handleMessage(Message message) {
        this.f15933a.mo17522h(message);
    }
}
