package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iu3 {

    /* renamed from: a */
    private final hu3 f18162a;

    /* renamed from: b */
    private final gu3 f18163b;

    /* renamed from: c */
    private int f18164c;

    /* renamed from: d */
    private Object f18165d;

    /* renamed from: e */
    private final Looper f18166e;

    /* renamed from: f */
    private boolean f18167f;

    /* renamed from: g */
    private boolean f18168g;

    /* renamed from: h */
    private boolean f18169h;

    public iu3(gu3 gu3, hu3 hu3, bg0 bg0, int i, ht1 ht1, Looper looper) {
        this.f18163b = gu3;
        this.f18162a = hu3;
        this.f18166e = looper;
    }

    /* renamed from: a */
    public final int mo18499a() {
        return this.f18164c;
    }

    /* renamed from: b */
    public final Looper mo18500b() {
        return this.f18166e;
    }

    /* renamed from: c */
    public final hu3 mo18501c() {
        return this.f18162a;
    }

    /* renamed from: d */
    public final iu3 mo18502d() {
        gs1.m24488f(!this.f18167f);
        this.f18167f = true;
        this.f18163b.mo18031b(this);
        return this;
    }

    /* renamed from: e */
    public final iu3 mo18503e(Object obj) {
        gs1.m24488f(!this.f18167f);
        this.f18165d = obj;
        return this;
    }

    /* renamed from: f */
    public final iu3 mo18504f(int i) {
        gs1.m24488f(!this.f18167f);
        this.f18164c = i;
        return this;
    }

    /* renamed from: g */
    public final Object mo18505g() {
        return this.f18165d;
    }

    /* renamed from: h */
    public final synchronized void mo18506h(boolean z) {
        this.f18168g = z | this.f18168g;
        this.f18169h = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean mo18507i(long j) throws InterruptedException, TimeoutException {
        gs1.m24488f(this.f18167f);
        gs1.m24488f(this.f18166e.getThread() != Thread.currentThread());
        long j2 = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.f18169h) {
            if (j2 > 0) {
                wait(j2);
                j2 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f18168g;
    }

    /* renamed from: j */
    public final synchronized boolean mo18508j() {
        return false;
    }
}
