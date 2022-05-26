package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tr0 implements View.OnAttachStateChangeListener {

    /* renamed from: g */
    final /* synthetic */ zi0 f23976g;

    /* renamed from: h */
    final /* synthetic */ wr0 f23977h;

    tr0(wr0 wr0, zi0 zi0) {
        this.f23977h = wr0;
        this.f23976g = zi0;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f23977h.m33283r(view, this.f23976g, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
