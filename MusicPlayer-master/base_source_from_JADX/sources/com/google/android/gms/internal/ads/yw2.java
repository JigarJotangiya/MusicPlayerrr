package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yw2 extends xw2 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public yw2(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo22089i(webView);
    }
}
