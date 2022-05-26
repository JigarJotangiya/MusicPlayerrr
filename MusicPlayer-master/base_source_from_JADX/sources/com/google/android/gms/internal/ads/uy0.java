package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uy0 {

    /* renamed from: a */
    private final Map<String, xy0> f24514a;

    /* renamed from: b */
    private final Map<String, wy0> f24515b;

    uy0(Map<String, xy0> map, Map<String, wy0> map2) {
        this.f24514a = map;
        this.f24515b = map2;
    }

    /* renamed from: a */
    public final void mo21398a(np2 np2) throws Exception {
        for (lp2 next : np2.f20683b.f20122c) {
            if (this.f24514a.containsKey(next.f19497a)) {
                this.f24514a.get(next.f19497a).mo19302b(next.f19498b);
            } else if (this.f24515b.containsKey(next.f19497a)) {
                wy0 wy0 = this.f24515b.get(next.f19497a);
                JSONObject jSONObject = next.f19498b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    String optString = jSONObject.optString(next2);
                    if (optString != null) {
                        hashMap.put(next2, optString);
                    }
                }
                wy0.mo15988a(hashMap);
            }
        }
    }
}
