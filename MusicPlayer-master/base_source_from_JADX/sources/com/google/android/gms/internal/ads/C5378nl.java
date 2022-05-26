package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5378nl {

    /* renamed from: a */
    private boolean f20645a;

    /* renamed from: a */
    public final synchronized void mo19746a() throws InterruptedException {
        while (!this.f20645a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo19747b() {
        boolean z;
        z = this.f20645a;
        this.f20645a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo19748c() {
        if (this.f20645a) {
            return false;
        }
        this.f20645a = true;
        notifyAll();
        return true;
    }
}
