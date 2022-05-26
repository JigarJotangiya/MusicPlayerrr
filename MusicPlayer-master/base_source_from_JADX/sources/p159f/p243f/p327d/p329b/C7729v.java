package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p159f.p243f.p327d.p329b.C7703r;

/* renamed from: f.f.d.b.v */
/* compiled from: AbstractSetMultimap */
abstract class C7729v<K, V> extends C7703r<K, V> implements C7694l0<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected C7729v(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: package-private */
    public abstract Set<V> createCollection();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C7703r.C7721m(k, (Set) collection);
    }

    /* access modifiers changed from: package-private */
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }
}
