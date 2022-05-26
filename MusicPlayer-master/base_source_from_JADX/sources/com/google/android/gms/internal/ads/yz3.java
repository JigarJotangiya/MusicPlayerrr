package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yz3 extends Handler {

    /* renamed from: a */
    final /* synthetic */ a04 f26607a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    yz3(a04 a04, Looper looper) {
        super(looper);
        this.f26607a = a04;
    }

    public final void handleMessage(Message message) {
        a04.m20536a(this.f26607a, message);
    }
}
