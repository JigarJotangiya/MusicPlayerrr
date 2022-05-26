package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class il1 implements y50 {

    /* renamed from: a */
    public final /* synthetic */ ml1 f18064a;

    public /* synthetic */ il1(ml1 ml1) {
        this.f18064a = ml1;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        pr0.mo17673Q0().mo17300d1(new ll1(this.f18064a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            pr0.loadData(str, "text/html", "UTF-8");
        } else {
            pr0.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
