package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ss0 extends ts0 {
    public ss0(pr0 pr0, C5790yp ypVar, boolean z) {
        super(pr0, ypVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo21149H0(webView, str, (Map<String, String>) null);
    }
}
