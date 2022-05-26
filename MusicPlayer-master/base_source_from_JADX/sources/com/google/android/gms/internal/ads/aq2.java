package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class aq2 implements y50 {

    /* renamed from: a */
    public final /* synthetic */ yf1 f14051a;

    /* renamed from: b */
    public final /* synthetic */ lv2 f14052b;

    /* renamed from: c */
    public final /* synthetic */ y12 f14053c;

    public /* synthetic */ aq2(yf1 yf1, lv2 lv2, y12 y12) {
        this.f14051a = yf1;
        this.f14052b = lv2;
        this.f14053c = y12;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        yf1 yf1 = this.f14051a;
        lv2 lv2 = this.f14052b;
        y12 y12 = this.f14053c;
        pr0 pr0 = (pr0) obj;
        x50.m33574d(map, yf1);
        String str = (String) map.get("u");
        if (str == null) {
            ul0.m31862g("URL missing from click GMSG.");
        } else {
            s83.m30616r(x50.m33572b(pr0, str), new cq2(pr0, lv2, y12), hm0.f17708a);
        }
    }
}
