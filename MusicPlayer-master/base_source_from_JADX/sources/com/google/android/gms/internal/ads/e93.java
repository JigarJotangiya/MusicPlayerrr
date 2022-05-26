package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public interface e93 extends ExecutorService {
    /* renamed from: A0 */
    <T> d93<T> mo17138A0(Callable<T> callable);

    /* renamed from: F0 */
    d93<?> mo17139F0(Runnable runnable);
}
