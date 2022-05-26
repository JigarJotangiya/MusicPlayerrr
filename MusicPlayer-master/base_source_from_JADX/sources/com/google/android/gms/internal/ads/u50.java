package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u50 implements y50<pr0> {
    u50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            pr0.mo10854b1();
        } else if ("resume".equals(str)) {
            pr0.mo10853A0();
        }
    }
}
