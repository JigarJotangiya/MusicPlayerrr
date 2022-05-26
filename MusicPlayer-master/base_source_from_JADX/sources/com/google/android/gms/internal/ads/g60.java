package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3360e;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g60 implements y50<pr0> {

    /* renamed from: d */
    static final Map<String, Integer> f16965d = C3360e.m14441b(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final C2926b f16966a;

    /* renamed from: b */
    private final wd0 f16967b;

    /* renamed from: c */
    private final de0 f16968c;

    public g60(C2926b bVar, wd0 wd0, de0 de0) {
        this.f16966a = bVar;
        this.f16967b = wd0;
        this.f16968c = de0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        int intValue = f16965d.get((String) map.get("a")).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f16966a.mo10829c()) {
                    this.f16966a.mo10828b((String) null);
                    return;
                } else if (intValue == 1) {
                    this.f16967b.mo21805i(map);
                    return;
                } else if (intValue == 3) {
                    new zd0(pr0, map).mo22357i();
                    return;
                } else if (intValue == 4) {
                    new ud0(pr0, map).mo21249j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f16967b.mo21804h(true);
                        return;
                    } else if (intValue != 7) {
                        ul0.m31861f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f16968c.mo16909b();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (pr0 == null) {
            ul0.m31862g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z) {
                i = -1;
            } else {
                i = C2971s.m13215r().mo11017g();
            }
        }
        pr0.mo17690g0(i);
    }
}
