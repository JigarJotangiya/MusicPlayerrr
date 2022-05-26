package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ts0 extends wr0 {
    public ts0(pr0 pr0, C5790yp ypVar, boolean z) {
        super(pr0, ypVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final WebResourceResponse mo21149H0(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof pr0)) {
            ul0.m31862g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        pr0 pr0 = (pr0) webView;
        zi0 zi0 = this.f25490A;
        if (zi0 != null) {
            zi0.mo21065a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo21899z(str, map);
        }
        if (pr0.mo17673Q0() != null) {
            pr0.mo17673Q0().mo17294T();
        }
        if (pr0.mo17717y().mo18020i()) {
            str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22330G);
        } else if (pr0.mo17692h0()) {
            str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22322F);
        } else {
            str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22314E);
        }
        C2971s.m13214q();
        return C2979b2.m13247b(pr0.getContext(), pr0.zzp().f27376g, str2);
    }
}
