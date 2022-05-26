package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d53<K, V> extends AbstractCollection<V> {

    /* renamed from: g */
    final Map<K, V> f15513g;

    d53(Map<K, V> map) {
        this.f15513g = map;
    }

    public final void clear() {
        this.f15513g.clear();
    }

    public final boolean contains(Object obj) {
        return this.f15513g.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f15513g.isEmpty();
    }

    public final Iterator<V> iterator() {
        return new a53(this.f15513g.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f15513g.entrySet()) {
                if (q13.m29306a(obj, next.getValue())) {
                    this.f15513g.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f15513g.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f15513g.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f15513g.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f15513g.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f15513g.size();
    }
}
