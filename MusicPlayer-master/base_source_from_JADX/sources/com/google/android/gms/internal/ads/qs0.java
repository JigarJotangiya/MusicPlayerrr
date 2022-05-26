package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.rs0;
import com.google.android.gms.internal.ads.ys0;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qs0<WebViewT extends rs0 & ys0 & at0> {

    /* renamed from: a */
    private final WebViewT f22013a;

    /* renamed from: b */
    private final os0 f22014b;

    public qs0(rs0 rs0, WebViewT webviewt, os0 os0) {
        this.f22014b = webviewt;
        this.f22013a = rs0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo20499a(String str) {
        os0 os0 = this.f22014b;
        Uri parse = Uri.parse(str);
        wr0 f1 = ((js0) os0.f21134a).mo18713f1();
        if (f1 == null) {
            ul0.m31859d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            f1.mo17292G0(parse);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            C3018m1.m13388k("Click string is empty, not proceeding.");
            return BuildConfig.FLAVOR;
        }
        C5737xa J = this.f22013a.mo17662J();
        if (J == null) {
            C3018m1.m13388k("Signal utils is empty, ignoring.");
            return BuildConfig.FLAVOR;
        }
        C5589ta c = J.mo21999c();
        if (c == null) {
            C3018m1.m13388k("Signals object is empty, ignoring.");
            return BuildConfig.FLAVOR;
        } else if (this.f22013a.getContext() == null) {
            C3018m1.m13388k("Context is null, ignoring.");
            return BuildConfig.FLAVOR;
        } else {
            Context context = this.f22013a.getContext();
            WebViewT webviewt = this.f22013a;
            return c.mo10842d(context, str, (View) webviewt, webviewt.mo17241i());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            ul0.m31862g("URL is empty, ignoring message");
        } else {
            C2979b2.f9980i.post(new ps0(this, str));
        }
    }
}
