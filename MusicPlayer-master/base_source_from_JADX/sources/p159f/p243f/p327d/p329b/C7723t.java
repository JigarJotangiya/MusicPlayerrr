package p159f.p243f.p327d.p329b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import p159f.p243f.p327d.p328a.C7656e;
import p159f.p243f.p327d.p329b.C7675f0;

/* renamed from: f.f.d.b.t */
/* compiled from: AbstractMultimap */
abstract class C7723t<K, V> implements C7673e0<K, V> {

    /* renamed from: g */
    private transient Collection<Map.Entry<K, V>> f33080g;

    /* renamed from: h */
    private transient Set<K> f33081h;

    /* renamed from: i */
    private transient C7683h0<K> f33082i;

    /* renamed from: j */
    private transient Collection<V> f33083j;

    /* renamed from: k */
    private transient Map<K, Collection<V>> f33084k;

    /* renamed from: f.f.d.b.t$a */
    /* compiled from: AbstractMultimap */
    class C7724a extends C7675f0.C7676a<K, V> {
        C7724a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C7673e0<K, V> mo28697d() {
            return C7723t.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C7723t.this.entryIterator();
        }

        public Spliterator<Map.Entry<K, V>> spliterator() {
            return C7723t.this.entrySpliterator();
        }
    }

    /* renamed from: f.f.d.b.t$b */
    /* compiled from: AbstractMultimap */
    class C7725b extends C7723t<K, V>.C0000a implements Set<Map.Entry<K, V>> {
        C7725b(C7723t tVar) {
            super();
        }

        public boolean equals(Object obj) {
            return C7696m0.m42547a(this, obj);
        }

        public int hashCode() {
            return C7696m0.m42548b(this);
        }
    }

    /* renamed from: f.f.d.b.t$c */
    /* compiled from: AbstractMultimap */
    class C7726c extends AbstractCollection<V> {
        C7726c() {
        }

        public void clear() {
            C7723t.this.clear();
        }

        public boolean contains(Object obj) {
            return C7723t.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C7723t.this.valueIterator();
        }

        public int size() {
            return C7723t.this.size();
        }

        public Spliterator<V> spliterator() {
            return C7723t.this.valueSpliterator();
        }
    }

    C7723t() {
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f33084k;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.f33084k = createAsMap;
        return createAsMap;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> createAsMap();

    /* access modifiers changed from: package-private */
    public abstract Collection<Map.Entry<K, V>> createEntries();

    /* access modifiers changed from: package-private */
    public abstract Set<K> createKeySet();

    /* access modifiers changed from: package-private */
    public abstract C7683h0<K> createKeys();

    /* access modifiers changed from: package-private */
    public abstract Collection<V> createValues();

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f33080g;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.f33080g = createEntries;
        return createEntries;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    /* access modifiers changed from: package-private */
    public abstract Spliterator<Map.Entry<K, V>> entrySpliterator();

    public boolean equals(Object obj) {
        return C7675f0.m42519a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f33081h;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.f33081h = createKeySet;
        return createKeySet;
    }

    public C7683h0<K> keys() {
        C7683h0<K> h0Var = this.f33082i;
        if (h0Var != null) {
            return h0Var;
        }
        C7683h0<K> createKeys = createKeys();
        this.f33082i = createKeys;
        return createKeys;
    }

    public abstract boolean put(K k, V v);

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        C7656e.m42492c(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !C7662c0.m42494a(get(k), it)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract Collection<V> replaceValues(K k, Iterable<? extends V> iterable);

    public String toString() {
        return asMap().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<V> valueIterator();

    /* access modifiers changed from: package-private */
    public abstract Spliterator<V> valueSpliterator();

    public Collection<V> values() {
        Collection<V> collection = this.f33083j;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f33083j = createValues;
        return createValues;
    }

    public boolean putAll(C7673e0<? extends K, ? extends V> e0Var) {
        boolean z = false;
        for (Map.Entry next : e0Var.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }
}
