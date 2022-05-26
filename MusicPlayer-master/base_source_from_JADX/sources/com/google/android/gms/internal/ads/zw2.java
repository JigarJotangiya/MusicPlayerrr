package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zw2 implements Runnable {

    /* renamed from: g */
    private final WebView f27044g;

    /* renamed from: h */
    final /* synthetic */ ax2 f27045h;

    zw2(ax2 ax2) {
        this.f27045h = ax2;
        this.f27044g = ax2.f14207d;
    }

    public final void run() {
        this.f27044g.destroy();
    }
}
