package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.k */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C2952k implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C2954m f9878g;

    /* renamed from: h */
    public final /* synthetic */ Drawable f9879h;

    public /* synthetic */ C2952k(C2954m mVar, Drawable drawable) {
        this.f9878g = mVar;
        this.f9879h = drawable;
    }

    public final void run() {
        C2954m mVar = this.f9878g;
        mVar.f9880c.f9882g.getWindow().setBackgroundDrawable(this.f9879h);
    }
}
