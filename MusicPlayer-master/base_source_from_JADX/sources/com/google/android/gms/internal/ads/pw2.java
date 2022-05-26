package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pw2 {

    /* renamed from: a */
    private static final pw2 f21745a = new pw2();

    private pw2() {
    }

    /* renamed from: a */
    public static pw2 m29249a() {
        return f21745a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20325b(WebView webView, String str, Object... objArr) {
        String str2;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new ow2(this, webView, sb2));
            }
        } else {
            if (str.length() != 0) {
                str2 = "The WebView is null for ".concat(str);
            } else {
                str2 = new String("The WebView is null for ");
            }
            if (qv2.f22261a.booleanValue() && !TextUtils.isEmpty(str2)) {
                Log.i("OMIDLIB", str2);
            }
        }
    }

    /* renamed from: c */
    public final void mo20326c(WebView webView) {
        mo20325b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void mo20327d(WebView webView, JSONObject jSONObject) {
        mo20325b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void mo20328e(WebView webView, float f) {
        mo20325b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: f */
    public final void mo20329f(WebView webView, String str) {
        mo20325b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void mo20330g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo20325b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
