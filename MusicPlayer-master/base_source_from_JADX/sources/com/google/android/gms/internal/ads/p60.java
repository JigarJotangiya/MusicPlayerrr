package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p60 implements y50<Object> {

    /* renamed from: a */
    private final o60 f21350a;

    public p60(o60 o60) {
        this.f21350a = o60;
    }

    /* renamed from: b */
    public static void m28910b(pr0 pr0, o60 o60) {
        pr0.mo17686d0("/reward", new p60(o60));
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzces zzces = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzces = new zzces(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                ul0.m31863h("Unable to parse reward amount.", e);
            }
            this.f21350a.mo18140x(zzces);
        } else if ("video_start".equals(str)) {
            this.f21350a.mo18139b();
        } else if ("video_complete".equals(str)) {
            this.f21350a.mo18138a();
        }
    }
}
