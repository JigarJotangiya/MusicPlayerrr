package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class s32 implements Handler.Callback {

    /* renamed from: g */
    public final /* synthetic */ x82 f23324g;

    public /* synthetic */ s32(x82 x82) {
        this.f23324g = x82;
    }

    public final boolean handleMessage(Message message) {
        x82.m33602g(this.f23324g, message);
        return true;
    }
}
