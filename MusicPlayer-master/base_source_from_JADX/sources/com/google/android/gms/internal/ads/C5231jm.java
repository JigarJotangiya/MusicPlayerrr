package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.jm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5231jm implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: l */
    private static final C5231jm f18526l = new C5231jm();

    /* renamed from: g */
    public volatile long f18527g;

    /* renamed from: h */
    private final Handler f18528h;

    /* renamed from: i */
    private final HandlerThread f18529i;

    /* renamed from: j */
    private Choreographer f18530j;

    /* renamed from: k */
    private int f18531k;

    private C5231jm() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f18529i = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f18528h = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C5231jm m25773a() {
        return f18526l;
    }

    /* renamed from: b */
    public final void mo18667b() {
        this.f18528h.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo18668c() {
        this.f18528h.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f18527g = j;
        this.f18530j.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f18530j = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f18531k + 1;
            this.f18531k = i2;
            if (i2 == 1) {
                this.f18530j.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f18531k - 1;
            this.f18531k = i3;
            if (i3 == 0) {
                this.f18530j.removeFrameCallback(this);
                this.f18527g = 0;
            }
            return true;
        }
    }
}
