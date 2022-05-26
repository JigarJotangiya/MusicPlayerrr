package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g90 extends tm0<n90> {

    /* renamed from: c */
    private final Object f16994c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final l90 f16995d;

    /* renamed from: e */
    private boolean f16996e;

    public g90(l90 l90) {
        this.f16995d = l90;
    }

    /* renamed from: g */
    public final void mo17885g() {
        synchronized (this.f16994c) {
            if (!this.f16996e) {
                this.f16996e = true;
                mo21119e(new d90(this), new pm0());
                mo21119e(new e90(this), new f90(this));
            }
        }
    }
}
