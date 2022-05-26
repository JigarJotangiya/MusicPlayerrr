package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class sf0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f23432a;

    /* renamed from: b */
    final /* synthetic */ uf0 f23433b;

    sf0(uf0 uf0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f23433b = uf0;
        this.f23432a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f23433b.mo21261e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23432a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f23432a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
