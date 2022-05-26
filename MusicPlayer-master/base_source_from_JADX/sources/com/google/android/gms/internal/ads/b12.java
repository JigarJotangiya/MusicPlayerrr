package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b12 {

    /* renamed from: a */
    private int f14251a = 0;

    /* renamed from: b */
    private long f14252b = 0;

    /* renamed from: c */
    private long f14253c = 0;

    /* renamed from: d */
    private long f14254d = 0;

    /* renamed from: e */
    private final Object f14255e = new Object();

    /* renamed from: f */
    private final Object f14256f = new Object();

    /* renamed from: g */
    private final Object f14257g = new Object();

    /* renamed from: h */
    private final Object f14258h = new Object();

    /* renamed from: a */
    public final int mo15997a() {
        int i;
        synchronized (this.f14255e) {
            i = this.f14251a;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo15998b() {
        long j;
        synchronized (this.f14258h) {
            j = this.f14254d;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo15999c() {
        long j;
        synchronized (this.f14257g) {
            j = this.f14253c;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo16000d() {
        long j;
        synchronized (this.f14256f) {
            j = this.f14252b;
        }
        return j;
    }

    /* renamed from: e */
    public final synchronized void mo16001e(long j) {
        synchronized (this.f14258h) {
            this.f14254d = j;
        }
    }

    /* renamed from: f */
    public final synchronized void mo16002f(long j) {
        synchronized (this.f14257g) {
            this.f14253c = j;
        }
    }

    /* renamed from: g */
    public final void mo16003g(int i) {
        synchronized (this.f14255e) {
            this.f14251a = i;
        }
    }

    /* renamed from: h */
    public final void mo16004h(long j) {
        synchronized (this.f14256f) {
            this.f14252b = j;
        }
    }
}
