package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class xw2 {

    /* renamed from: a */
    private wx2 f26097a = new wx2((WebView) null);

    /* renamed from: b */
    private long f26098b;

    /* renamed from: c */
    private int f26099c;

    public xw2() {
        mo22084b();
    }

    /* renamed from: a */
    public final WebView mo22083a() {
        return (WebView) this.f26097a.get();
    }

    /* renamed from: b */
    public final void mo22084b() {
        this.f26098b = System.nanoTime();
        this.f26099c = 1;
    }

    /* renamed from: c */
    public void mo15983c() {
        this.f26097a.clear();
    }

    /* renamed from: d */
    public final void mo22085d(String str, long j) {
        if (j >= this.f26098b && this.f26099c != 3) {
            this.f26099c = 3;
            pw2.m29249a().mo20329f(mo22083a(), str);
        }
    }

    /* renamed from: e */
    public final void mo22086e(String str, long j) {
        if (j >= this.f26098b) {
            this.f26099c = 2;
            pw2.m29249a().mo20329f(mo22083a(), str);
        }
    }

    /* renamed from: f */
    public void mo15984f(yv2 yv2, wv2 wv2) {
        mo22087g(yv2, wv2, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo22087g(yv2 yv2, wv2 wv2, JSONObject jSONObject) {
        String h = yv2.mo22300h();
        JSONObject jSONObject2 = new JSONObject();
        bx2.m21586g(jSONObject2, "environment", "app");
        bx2.m21586g(jSONObject2, "adSessionType", wv2.mo21928d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        bx2.m21586g(jSONObject3, "deviceType", sb.toString());
        bx2.m21586g(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        bx2.m21586g(jSONObject3, "os", "Android");
        bx2.m21586g(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        bx2.m21586g(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        bx2.m21586g(jSONObject4, "partnerName", wv2.mo21929e().mo17025b());
        bx2.m21586g(jSONObject4, "partnerVersion", wv2.mo21929e().mo17026c());
        bx2.m21586g(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        bx2.m21586g(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        bx2.m21586g(jSONObject5, "appId", nw2.m28123b().mo19858a().getApplicationContext().getPackageName());
        bx2.m21586g(jSONObject2, "app", jSONObject5);
        if (wv2.mo21930f() != null) {
            bx2.m21586g(jSONObject2, "contentUrl", wv2.mo21930f());
        }
        bx2.m21586g(jSONObject2, "customReferenceData", wv2.mo21931g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<ew2> it = wv2.mo21932h().iterator();
        if (!it.hasNext()) {
            pw2.m29249a().mo20330g(mo22083a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            ew2 next = it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo22088h(float f) {
        pw2.m29249a().mo20328e(mo22083a(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo22089i(WebView webView) {
        this.f26097a = new wx2(webView);
    }

    /* renamed from: j */
    public void mo15985j() {
    }

    /* renamed from: k */
    public final boolean mo22090k() {
        return this.f26097a.get() != null;
    }
}
