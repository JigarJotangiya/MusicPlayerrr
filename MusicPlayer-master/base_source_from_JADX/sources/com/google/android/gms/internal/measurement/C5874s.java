package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5874s implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f27551a = Executors.defaultThreadFactory();

    C5874s(C5851g0 g0Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f27551a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
