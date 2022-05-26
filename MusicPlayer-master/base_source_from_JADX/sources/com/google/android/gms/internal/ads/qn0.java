package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qn0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ boolean f21974g;

    /* renamed from: h */
    final /* synthetic */ rn0 f21975h;

    qn0(rn0 rn0, boolean z) {
        this.f21975h = rn0;
        this.f21974g = z;
    }

    public final void run() {
        this.f21975h.m30239q("windowVisibilityChanged", "isVisible", String.valueOf(this.f21974g));
    }
}
