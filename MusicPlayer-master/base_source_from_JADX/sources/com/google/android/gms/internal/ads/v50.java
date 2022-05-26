package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v50 implements y50<pr0> {
    v50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        if (map.keySet().contains("start")) {
            pr0.mo17673Q0().mo17303i();
        } else if (map.keySet().contains("stop")) {
            pr0.mo17673Q0().mo17304j();
        } else if (map.keySet().contains("cancel")) {
            pr0.mo17673Q0().mo17302h();
        }
    }
}
