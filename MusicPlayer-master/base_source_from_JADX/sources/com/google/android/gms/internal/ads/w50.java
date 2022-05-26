package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w50 implements y50<pr0> {
    w50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        if (map.keySet().contains("start")) {
            pr0.mo17654D(true);
        }
        if (map.keySet().contains("stop")) {
            pr0.mo17654D(false);
        }
    }
}
