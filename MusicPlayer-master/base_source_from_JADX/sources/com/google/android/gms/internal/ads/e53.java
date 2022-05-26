package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class e53<K, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    private transient Set<Map.Entry<K, V>> f15871g;

    /* renamed from: h */
    private transient Collection<V> f15872h;

    e53() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo17122a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15871g;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo17122a();
        this.f15871g = a;
        return a;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f15872h;
        if (collection != null) {
            return collection;
        }
        d53 d53 = new d53(this);
        this.f15872h = d53;
        return d53;
    }
}
