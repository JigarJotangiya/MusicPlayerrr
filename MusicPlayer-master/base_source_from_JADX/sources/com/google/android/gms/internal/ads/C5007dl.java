package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5007dl {

    /* renamed from: a */
    private final Map<String, String> f15648a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f15649b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo16944a() {
        if (this.f15649b == null) {
            this.f15649b = Collections.unmodifiableMap(new HashMap(this.f15648a));
        }
        return this.f15649b;
    }
}
