package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.am */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4897am implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f13976a = "Loader:ExtractorMediaPeriod";

    C4897am(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f13976a);
    }
}
