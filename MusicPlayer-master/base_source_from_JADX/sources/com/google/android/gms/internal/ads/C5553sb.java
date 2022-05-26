package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.sb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5553sb implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f23408a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f23409b = new AtomicInteger(1);

    C5553sb() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f23408a.newThread(runnable);
        int andIncrement = this.f23409b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
