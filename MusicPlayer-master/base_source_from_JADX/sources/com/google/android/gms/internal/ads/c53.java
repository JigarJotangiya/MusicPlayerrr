package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class c53<K, V> extends e63<K> {

    /* renamed from: g */
    final Map<K, V> f14828g;

    c53(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f14828g = map;
    }

    public final boolean contains(Object obj) {
        return this.f14828g.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f14828g.isEmpty();
    }

    public Iterator<K> iterator() {
        throw null;
    }

    public final int size() {
        return this.f14828g.size();
    }
}
