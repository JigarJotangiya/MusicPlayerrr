package com.google.android.gms.ads.p068a0.p069a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2890b;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.p070b0.C2892b;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5737xa;
import com.google.android.gms.internal.ads.ul0;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.a0.a.a */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2852a {

    /* renamed from: a */
    private final Context f9674a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WebView f9675b;

    /* renamed from: c */
    private final C5737xa f9676c;

    C2852a(WebView webView, C5737xa xaVar) {
        this.f9675b = webView;
        this.f9674a = webView.getContext();
        this.f9676c = xaVar;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        C5503qz.m29790c(this.f9674a);
        try {
            return this.f9676c.mo21999c().mo10845g(this.f9674a, str, this.f9675b);
        } catch (RuntimeException e) {
            ul0.m31860e("Exception getting click signals. ", e);
            C2971s.m13213p().mo17571s(e, "TaggingLibraryJsInterface.getClickSignals");
            return BuildConfig.FLAVOR;
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        C2971s.m13214q();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f9674a;
        C2890b bVar = C2890b.BANNER;
        C2903f.C2904a aVar = new C2903f.C2904a();
        aVar.mo10735b(AdMobAdapter.class, bundle);
        C2892b.m12925a(context, bVar, aVar.mo10736c(), new C2872k(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        C5503qz.m29790c(this.f9674a);
        try {
            return this.f9676c.mo21999c().mo10844f(this.f9674a, this.f9675b, (Activity) null);
        } catch (RuntimeException e) {
            ul0.m31860e("Exception getting view signals. ", e);
            C2971s.m13213p().mo17571s(e, "TaggingLibraryJsInterface.getViewSignals");
            return BuildConfig.FLAVOR;
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        C5503qz.m29790c(this.f9674a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            this.f9676c.mo22000d(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            ul0.m31860e("Failed to parse the touch string. ", e);
            C2971s.m13213p().mo17571s(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
