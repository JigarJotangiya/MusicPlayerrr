package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y40 implements y50<Object> {

    /* renamed from: a */
    private final z40 f26256a;

    public y40(z40 z40) {
        this.f26256a = z40;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            ul0.m31862g("App event with no name parameter.");
        } else {
            this.f26256a.mo17588W(str, map.get("info"));
        }
    }
}
