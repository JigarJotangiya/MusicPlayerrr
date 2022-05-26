package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k74 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: l */
    private static final k74 f18831l = new k74();

    /* renamed from: g */
    public volatile long f18832g = -9223372036854775807L;

    /* renamed from: h */
    private final Handler f18833h;

    /* renamed from: i */
    private final HandlerThread f18834i;

    /* renamed from: j */
    private Choreographer f18835j;

    /* renamed from: k */
    private int f18836k;

    private k74() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f18834i = handlerThread;
        handlerThread.start();
        Handler e0 = wy2.m33441e0(handlerThread.getLooper(), this);
        this.f18833h = e0;
        e0.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static k74 m26152a() {
        return f18831l;
    }

    /* renamed from: b */
    public final void mo18866b() {
        this.f18833h.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo18867c() {
        this.f18833h.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f18832g = j;
        Choreographer choreographer = this.f18835j;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f18835j = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f18836k + 1;
            this.f18836k = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.f18835j;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f18836k - 1;
            this.f18836k = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.f18835j;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f18832g = -9223372036854775807L;
            }
            return true;
        }
    }
}
