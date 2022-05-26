package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ax2 extends xw2 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f14207d;

    /* renamed from: e */
    private Long f14208e = null;

    /* renamed from: f */
    private final Map<String, ew2> f14209f;

    public ax2(Map<String, ew2> map, String str) {
        this.f14209f = map;
    }

    /* renamed from: c */
    public final void mo15983c() {
        long j;
        super.mo15983c();
        if (this.f14208e == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f14208e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zw2(this), Math.max(4000 - j, 2000));
        this.f14207d = null;
    }

    /* renamed from: f */
    public final void mo15984f(yv2 yv2, wv2 wv2) {
        JSONObject jSONObject = new JSONObject();
        Map<String, ew2> i = wv2.mo21933i();
        for (String next : i.keySet()) {
            bx2.m21586g(jSONObject, next, i.get(next));
        }
        mo22087g(yv2, wv2, jSONObject);
    }

    /* renamed from: j */
    public final void mo15985j() {
        WebView webView = new WebView(nw2.m28123b().mo19858a());
        this.f14207d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo22089i(this.f14207d);
        WebView webView2 = this.f14207d;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator<String> it = this.f14209f.keySet().iterator();
        if (!it.hasNext()) {
            this.f14208e = Long.valueOf(System.nanoTime());
            return;
        }
        ew2 ew2 = this.f14209f.get(it.next());
        throw null;
    }
}
