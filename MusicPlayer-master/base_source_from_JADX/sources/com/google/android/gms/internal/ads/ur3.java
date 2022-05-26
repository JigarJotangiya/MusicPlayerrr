package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class ur3<K, V, V2> implements yr3<Map<K, V2>> {

    /* renamed from: a */
    private final Map<K, ms3<V>> f24422a;

    ur3(Map<K, ms3<V>> map) {
        this.f24422a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, ms3<V>> mo21358b() {
        return this.f24422a;
    }
}
