package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3292l;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z50 implements y50<Object> {

    /* renamed from: a */
    private final ew1 f26665a;

    public z50(ew1 ew1) {
        C3292l.m14241i(ew1, "The Inspector Manager must not be null");
        this.f26665a = ew1;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong(map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.f26665a.mo17369h(map.get("extras"), j);
        }
    }
}
