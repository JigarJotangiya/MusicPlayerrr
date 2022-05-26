package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class co1 {

    /* renamed from: a */
    private final Map<String, String> f15087a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f15088b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo16700a() {
        if (this.f15088b == null) {
            this.f15088b = Collections.unmodifiableMap(new HashMap(this.f15087a));
        }
        return this.f15088b;
    }
}
