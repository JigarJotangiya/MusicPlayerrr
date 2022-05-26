package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.w03;

/* renamed from: com.google.android.gms.ads.internal.util.w0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3047w0 {

    /* renamed from: a */
    private HandlerThread f10114a = null;

    /* renamed from: b */
    private Handler f10115b = null;

    /* renamed from: c */
    private int f10116c = 0;

    /* renamed from: d */
    private final Object f10117d = new Object();

    /* renamed from: a */
    public final Handler mo11122a() {
        return this.f10115b;
    }

    /* renamed from: b */
    public final Looper mo11123b() {
        Looper looper;
        synchronized (this.f10117d) {
            if (this.f10116c != 0) {
                C3292l.m14241i(this.f10114a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f10114a == null) {
                C3018m1.m13388k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f10114a = handlerThread;
                handlerThread.start();
                this.f10115b = new w03(this.f10114a.getLooper());
                C3018m1.m13388k("Looper thread started.");
            } else {
                C3018m1.m13388k("Resuming the looper thread");
                this.f10117d.notifyAll();
            }
            this.f10116c++;
            looper = this.f10114a.getLooper();
        }
        return looper;
    }
}
