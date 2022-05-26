package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class us0 extends ts0 {
    public us0(pr0 pr0, C5790yp ypVar, boolean z) {
        super(pr0, ypVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo21149H0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
