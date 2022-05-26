package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b60 {

    /* renamed from: a */
    private boolean f14332a = false;

    /* renamed from: b */
    private boolean f14333b = false;

    /* renamed from: c */
    private float f14334c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f14335d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float mo16078a() {
        return this.f14334c;
    }

    /* renamed from: b */
    public final synchronized void mo16079b(boolean z, float f) {
        this.f14333b = z;
        this.f14334c = f;
    }

    /* renamed from: c */
    public final synchronized void mo16080c(boolean z) {
        this.f14332a = z;
        this.f14335d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean mo16081d() {
        return this.f14333b;
    }

    /* renamed from: e */
    public final synchronized boolean mo16082e(boolean z) {
        if (!this.f14335d.get()) {
            return z;
        }
        return this.f14332a;
    }
}
