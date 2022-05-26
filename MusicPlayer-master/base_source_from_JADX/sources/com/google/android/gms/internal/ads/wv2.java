package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wv2 {

    /* renamed from: a */
    private final dw2 f25564a;

    /* renamed from: b */
    private final WebView f25565b;

    /* renamed from: c */
    private final List<ew2> f25566c = new ArrayList();

    /* renamed from: d */
    private final Map<String, ew2> f25567d = new HashMap();

    /* renamed from: e */
    private final String f25568e;

    /* renamed from: f */
    private final String f25569f;

    /* renamed from: g */
    private final xv2 f25570g;

    private wv2(dw2 dw2, WebView webView, String str, List<ew2> list, String str2, String str3, xv2 xv2) {
        this.f25564a = dw2;
        this.f25565b = webView;
        this.f25570g = xv2;
        this.f25569f = str2;
        this.f25568e = BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public static wv2 m33373b(dw2 dw2, WebView webView, String str, String str2) {
        return new wv2(dw2, webView, (String) null, (List<ew2>) null, str, BuildConfig.FLAVOR, xv2.HTML);
    }

    /* renamed from: c */
    public static wv2 m33374c(dw2 dw2, WebView webView, String str, String str2) {
        return new wv2(dw2, webView, (String) null, (List<ew2>) null, str, BuildConfig.FLAVOR, xv2.JAVASCRIPT);
    }

    /* renamed from: a */
    public final WebView mo21927a() {
        return this.f25565b;
    }

    /* renamed from: d */
    public final xv2 mo21928d() {
        return this.f25570g;
    }

    /* renamed from: e */
    public final dw2 mo21929e() {
        return this.f25564a;
    }

    /* renamed from: f */
    public final String mo21930f() {
        return this.f25569f;
    }

    /* renamed from: g */
    public final String mo21931g() {
        return this.f25568e;
    }

    /* renamed from: h */
    public final List<ew2> mo21932h() {
        return Collections.unmodifiableList(this.f25566c);
    }

    /* renamed from: i */
    public final Map<String, ew2> mo21933i() {
        return Collections.unmodifiableMap(this.f25567d);
    }
}
