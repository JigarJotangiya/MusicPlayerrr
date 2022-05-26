package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ow2 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ WebView f21220g;

    /* renamed from: h */
    final /* synthetic */ String f21221h;

    ow2(pw2 pw2, WebView webView, String str) {
        this.f21220g = webView;
        this.f21221h = str;
    }

    public final void run() {
        this.f21220g.loadUrl(this.f21221h);
    }
}
