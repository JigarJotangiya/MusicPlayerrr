package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kv1 {

    /* renamed from: a */
    private boolean f19007a;

    public kv1(ht1 ht1) {
    }

    /* renamed from: a */
    public final synchronized void mo19013a() throws InterruptedException {
        while (!this.f19007a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo19014b() {
        boolean z = false;
        while (!this.f19007a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo19015c() {
        boolean z;
        z = this.f19007a;
        this.f19007a = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo19016d() {
        return this.f19007a;
    }

    /* renamed from: e */
    public final synchronized boolean mo19017e() {
        if (this.f19007a) {
            return false;
        }
        this.f19007a = true;
        notifyAll();
        return true;
    }
}
