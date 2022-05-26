package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5790yp;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.us0;
import com.google.android.gms.internal.ads.wr0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.ads.internal.util.g2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2999g2 extends C2995f2 {
    /* renamed from: k */
    public final int mo11021k() {
        return 16974374;
    }

    /* renamed from: l */
    public final CookieManager mo11022l(Context context) {
        if (C2992f.m13326s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            ul0.m31860e("Failed to obtain CookieManager.", th);
            C2971s.m13213p().mo17571s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: m */
    public final WebResourceResponse mo11023m(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: n */
    public final wr0 mo11024n(pr0 pr0, C5790yp ypVar, boolean z) {
        return new us0(pr0, ypVar, z);
    }
}
