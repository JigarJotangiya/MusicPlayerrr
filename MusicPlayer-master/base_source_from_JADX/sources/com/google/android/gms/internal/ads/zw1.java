package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zw1 implements yr3<d93<String>> {

    /* renamed from: a */
    private final ms3<wt2> f27042a;

    /* renamed from: b */
    private final ms3<Context> f27043b;

    public zw1(ms3<wt2> ms3, ms3<Context> ms32) {
        this.f27042a = ms3;
        this.f27043b = ms32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        CookieManager l = C2971s.m13215r().mo11022l(this.f27043b.mo10679a());
        pt2 pt2 = pt2.WEBVIEW_COOKIE;
        return ft2.m23960a(new ww1(l), pt2, this.f27042a.mo10679a()).mo19542i(1, TimeUnit.SECONDS).mo19536c(Exception.class, new ht2(vw1.f25032a)).mo19534a();
    }
}
