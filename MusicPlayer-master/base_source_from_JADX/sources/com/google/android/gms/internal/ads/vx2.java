package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class vx2 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f25055a = "ExoPlayer:Loader:ProgressiveMediaPeriod";

    public /* synthetic */ vx2(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f25055a);
    }
}
