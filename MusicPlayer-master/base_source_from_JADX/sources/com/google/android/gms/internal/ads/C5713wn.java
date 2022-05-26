package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.wn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5713wn implements Runnable {

    /* renamed from: g */
    final ValueCallback<String> f25463g = new C5676vn(this);

    /* renamed from: h */
    final /* synthetic */ C5417on f25464h;

    /* renamed from: i */
    final /* synthetic */ WebView f25465i;

    /* renamed from: j */
    final /* synthetic */ boolean f25466j;

    /* renamed from: k */
    final /* synthetic */ C5788yn f25467k;

    C5713wn(C5788yn ynVar, C5417on onVar, WebView webView, boolean z) {
        this.f25467k = ynVar;
        this.f25464h = onVar;
        this.f25465i = webView;
        this.f25466j = z;
    }

    public final void run() {
        if (this.f25465i.getSettings().getJavaScriptEnabled()) {
            try {
                this.f25465i.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f25463g);
            } catch (Throwable unused) {
                ((C5676vn) this.f25463g).onReceiveValue(BuildConfig.FLAVOR);
            }
        }
    }
}
