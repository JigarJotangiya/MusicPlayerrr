package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hs0 implements y50<pr0> {

    /* renamed from: a */
    final /* synthetic */ js0 f17755a;

    hs0(js0 js0) {
        this.f17755a = js0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f17755a) {
                        if (this.f17755a.f18589L != parseInt) {
                            this.f17755a.f18589L = parseInt;
                            this.f17755a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    ul0.m31863h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
