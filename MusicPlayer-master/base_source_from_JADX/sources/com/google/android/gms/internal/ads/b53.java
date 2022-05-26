package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class b53<K, V> extends e63<Map.Entry<K, V>> {
    b53() {
    }

    public final void clear() {
        mo16068d().clear();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map<K, V> mo16068d();

    public final boolean isEmpty() {
        return mo16068d().isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
            return f63.m23503b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return f63.m23504c(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                e33.m22834a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return mo16068d().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo16068d().size();
    }
}
