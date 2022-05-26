package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class b50 implements y50 {

    /* renamed from: a */
    public final /* synthetic */ yf1 f14326a;

    public /* synthetic */ b50(yf1 yf1) {
        this.f14326a = yf1;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        x50.m33574d(map, this.f14326a);
        String str = (String) map.get("u");
        if (str == null) {
            ul0.m31862g("URL missing from click GMSG.");
        } else {
            s83.m30616r(x50.m33572b(pr0, str), new o50(pr0), hm0.f17708a);
        }
    }
}
