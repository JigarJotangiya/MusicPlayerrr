package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dm0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f15653a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f15654b;

    dm0(String str) {
        this.f15654b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f15654b;
        int andIncrement = this.f15653a.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
