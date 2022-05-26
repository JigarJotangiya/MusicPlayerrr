package p159f.p243f.p327d.p329b;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import p159f.p243f.p327d.p328a.C7656e;
import p159f.p243f.p327d.p329b.C7665d0;
import p159f.p243f.p327d.p329b.C7675f0;
import p159f.p243f.p327d.p329b.C7723t;
import p394k.C8619a;

/* renamed from: f.f.d.b.r */
/* compiled from: AbstractMapBasedMultimap */
abstract class C7703r<K, V> extends C7723t<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public transient Map<K, Collection<V>> f33047l;

    /* renamed from: m */
    private transient int f33048m;

    /* renamed from: f.f.d.b.r$a */
    /* compiled from: AbstractMapBasedMultimap */
    class C7704a extends C7703r<K, V>.d<V> {
        C7704a(C7703r rVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo28764a(K k, V v) {
            return v;
        }
    }

    /* renamed from: f.f.d.b.r$b */
    /* compiled from: AbstractMapBasedMultimap */
    class C7705b extends C7703r<K, V>.d<Map.Entry<K, V>> {
        C7705b(C7703r rVar) {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry<K, V> mo28764a(K k, V v) {
            return C7665d0.m42501b(k, v);
        }
    }

    /* renamed from: f.f.d.b.r$c */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7706c extends C7665d0.C7671f<K, Collection<V>> {

        /* renamed from: i */
        final transient Map<K, Collection<V>> f33049i;

        /* renamed from: f.f.d.b.r$c$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7707a extends C7665d0.C7668c<K, Collection<V>> {
            C7707a() {
            }

            public boolean contains(Object obj) {
                return C7736y.m42615a(C7706c.this.f33049i.entrySet(), obj);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public Map<K, Collection<V>> mo28660d() {
                return C7706c.this;
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C7708b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C7703r.this.m42561g(((Map.Entry) obj).getKey());
                return true;
            }

            public Spliterator<Map.Entry<K, Collection<V>>> spliterator() {
                return C7731x.m42607b(C7706c.this.f33049i.entrySet().spliterator(), new C7689j(C7706c.this));
            }
        }

        /* renamed from: f.f.d.b.r$c$b */
        /* compiled from: AbstractMapBasedMultimap */
        class C7708b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: g */
            final Iterator<Map.Entry<K, Collection<V>>> f33052g;

            /* renamed from: h */
            Collection<V> f33053h;

            C7708b() {
                this.f33052g = C7706c.this.f33049i.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f33052g.next();
                this.f33053h = (Collection) next.getValue();
                return C7706c.this.mo28770e(next);
            }

            public boolean hasNext() {
                return this.f33052g.hasNext();
            }

            public void remove() {
                C7730w.m42605b(this.f33053h != null);
                this.f33052g.remove();
                C7703r.access$220(C7703r.this, this.f33053h.size());
                this.f33053h.clear();
                this.f33053h = null;
            }
        }

        C7706c(Map<K, Collection<V>> map) {
            this.f33049i = map;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo28680a() {
            return new C7707a();
        }

        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C7665d0.m42505f(this.f33049i, obj);
            if (collection == null) {
                return null;
            }
            return C7703r.this.wrapCollection(obj, collection);
        }

        public void clear() {
            if (this.f33049i == C7703r.this.f33047l) {
                C7703r.this.clear();
            } else {
                C7662c0.m42495b(new C7708b());
            }
        }

        public boolean containsKey(Object obj) {
            return C7665d0.m42504e(this.f33049i, obj);
        }

        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f33049i.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = C7703r.this.createCollection();
            createCollection.addAll(remove);
            C7703r.access$220(C7703r.this, remove.size());
            remove.clear();
            return createCollection;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map.Entry<K, Collection<V>> mo28770e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C7665d0.m42501b(key, C7703r.this.wrapCollection(key, entry.getValue()));
        }

        public boolean equals(Object obj) {
            return this == obj || this.f33049i.equals(obj);
        }

        public int hashCode() {
            return this.f33049i.hashCode();
        }

        public Set<K> keySet() {
            return C7703r.this.keySet();
        }

        public int size() {
            return this.f33049i.size();
        }

        public String toString() {
            return this.f33049i.toString();
        }
    }

    /* renamed from: f.f.d.b.r$d */
    /* compiled from: AbstractMapBasedMultimap */
    private abstract class C7709d<T> implements Iterator<T> {

        /* renamed from: g */
        final Iterator<Map.Entry<K, Collection<V>>> f33055g;

        /* renamed from: h */
        K f33056h = null;

        /* renamed from: i */
        Collection<V> f33057i = null;

        /* renamed from: j */
        Iterator<V> f33058j = C7662c0.m42496c();

        C7709d() {
            this.f33055g = C7703r.this.f33047l.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo28764a(K k, V v);

        public boolean hasNext() {
            return this.f33055g.hasNext() || this.f33058j.hasNext();
        }

        public T next() {
            if (!this.f33058j.hasNext()) {
                Map.Entry next = this.f33055g.next();
                this.f33056h = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f33057i = collection;
                this.f33058j = collection.iterator();
            }
            return mo28764a(this.f33056h, this.f33058j.next());
        }

        public void remove() {
            this.f33058j.remove();
            if (this.f33057i.isEmpty()) {
                this.f33055g.remove();
            }
            C7703r.access$210(C7703r.this);
        }
    }

    /* renamed from: f.f.d.b.r$e */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7710e extends C7665d0.C7669d<K, Collection<V>> {

        /* renamed from: f.f.d.b.r$e$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7711a implements Iterator<K> {

            /* renamed from: g */
            Map.Entry<K, Collection<V>> f33061g;

            /* renamed from: h */
            final /* synthetic */ Iterator f33062h;

            C7711a(Iterator it) {
                this.f33062h = it;
            }

            public boolean hasNext() {
                return this.f33062h.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f33062h.next();
                this.f33061g = entry;
                return entry.getKey();
            }

            public void remove() {
                C7730w.m42605b(this.f33061g != null);
                Collection value = this.f33061g.getValue();
                this.f33062h.remove();
                C7703r.access$220(C7703r.this, value.size());
                value.clear();
                this.f33061g = null;
            }
        }

        C7710e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C7662c0.m42495b(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo28668p().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || mo28668p().keySet().equals(obj);
        }

        public int hashCode() {
            return mo28668p().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C7711a(mo28668p().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo28668p().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C7703r.access$220(C7703r.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        public Spliterator<K> spliterator() {
            return mo28668p().keySet().spliterator();
        }
    }

    /* renamed from: f.f.d.b.r$f */
    /* compiled from: AbstractMapBasedMultimap */
    class C7712f extends C7703r<K, V>.i implements NavigableMap<K, Collection<V>> {
        C7712f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo28807h().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo28770e(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo28807h().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C7712f(mo28807h().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo28807h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo28770e(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo28807h().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo28770e(floorEntry);
        }

        public K floorKey(K k) {
            return mo28807h().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo28807h().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo28770e(higherEntry);
        }

        public K higherKey(K k) {
            return mo28807h().higherKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public NavigableSet<K> mo28802f() {
            return new C7713g(mo28807h());
        }

        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Map.Entry<K, Collection<V>> mo28815l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection createCollection = C7703r.this.createCollection();
            createCollection.addAll((Collection) next.getValue());
            it.remove();
            return C7665d0.m42501b(next.getKey(), C7703r.this.unmodifiableCollectionSubclass(createCollection));
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo28807h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo28770e(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo28807h().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo28770e(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo28807h().lowerKey(k);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> mo28807h() {
            return (NavigableMap) super.mo28807h();
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo28815l(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo28815l(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C7712f(mo28807h().headMap(k, z));
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C7712f(mo28807h().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C7712f(mo28807h().tailMap(k, z));
        }
    }

    /* renamed from: f.f.d.b.r$g */
    /* compiled from: AbstractMapBasedMultimap */
    class C7713g extends C7703r<K, V>.j implements NavigableSet<K> {
        C7713g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo28839s().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C7713g(mo28839s().descendingMap());
        }

        public K floor(K k) {
            return mo28839s().floorKey(k);
        }

        public K higher(K k) {
            return mo28839s().higherKey(k);
        }

        public K lower(K k) {
            return mo28839s().lowerKey(k);
        }

        public K pollFirst() {
            return C7662c0.m42497d(iterator());
        }

        public K pollLast() {
            return C7662c0.m42497d(descendingIterator());
        }

        /* renamed from: t */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public NavigableMap<K, Collection<V>> mo28839s() {
            return (NavigableMap) super.mo28839s();
        }

        /* renamed from: v */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: x */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C7713g(mo28839s().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C7713g(mo28839s().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C7713g(mo28839s().tailMap(k, z));
        }
    }

    /* renamed from: f.f.d.b.r$h */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7714h extends C7703r<K, V>.l implements RandomAccess {
        C7714h(C7703r rVar, K k, List<V> list, C7703r<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: f.f.d.b.r$i */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7715i extends C7703r<K, V>.C1428c implements SortedMap<K, Collection<V>> {

        /* renamed from: k */
        SortedSet<K> f33066k;

        C7715i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo28807h().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public SortedSet<K> mo28802f() {
            return new C7716j(mo28807h());
        }

        public K firstKey() {
            return mo28807h().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f33066k;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f = mo28802f();
            this.f33066k = f;
            return f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public SortedMap<K, Collection<V>> mo28807h() {
            return (SortedMap) this.f33049i;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C7715i(mo28807h().headMap(k));
        }

        public K lastKey() {
            return mo28807h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C7715i(mo28807h().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C7715i(mo28807h().tailMap(k));
        }
    }

    /* renamed from: f.f.d.b.r$j */
    /* compiled from: AbstractMapBasedMultimap */
    private class C7716j extends C7703r<K, V>.e implements SortedSet<K> {
        C7716j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo28839s().comparator();
        }

        public K first() {
            return mo28839s().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C7716j(mo28839s().headMap(k));
        }

        public K last() {
            return mo28839s().lastKey();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public SortedMap<K, Collection<V>> mo28839s() {
            return (SortedMap) super.mo28668p();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C7716j(mo28839s().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C7716j(mo28839s().tailMap(k));
        }
    }

    /* renamed from: f.f.d.b.r$m */
    /* compiled from: AbstractMapBasedMultimap */
    class C7721m extends C7703r<K, V>.k implements Set<V> {
        C7721m(K k, Set<V> set) {
            super(k, set, (C7703r<K, V>.k) null);
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean e = C7696m0.m42551e((Set) this.f33070h, collection);
            if (e) {
                C7703r.access$212(C7703r.this, this.f33070h.size() - size);
                mo28873v();
            }
            return e;
        }
    }

    protected C7703r(Map<K, Collection<V>> map) {
        C7656e.m42490a(map.isEmpty());
        this.f33047l = map;
    }

    /* renamed from: a */
    private Collection<V> m42555a(K k) {
        Collection<V> collection = this.f33047l.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(k);
        this.f33047l.put(k, createCollection);
        return createCollection;
    }

    static /* synthetic */ int access$208(C7703r rVar) {
        int i = rVar.f33048m;
        rVar.f33048m = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(C7703r rVar) {
        int i = rVar.f33048m;
        rVar.f33048m = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(C7703r rVar, int i) {
        int i2 = rVar.f33048m + i;
        rVar.f33048m = i2;
        return i2;
    }

    static /* synthetic */ int access$220(C7703r rVar, int i) {
        int i2 = rVar.f33048m - i;
        rVar.f33048m = i2;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <E> Iterator<E> m42556b(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m42561g(Object obj) {
        Collection collection = (Collection) C7665d0.m42506g(this.f33047l, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f33048m -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> backingMap() {
        return this.f33047l;
    }

    public void clear() {
        for (Collection<V> clear : this.f33047l.values()) {
            clear.clear();
        }
        this.f33047l.clear();
        this.f33048m = 0;
    }

    public boolean containsKey(Object obj) {
        return this.f33047l.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> createAsMap() {
        return new C7706c(this.f33047l);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> createCollection();

    /* access modifiers changed from: package-private */
    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    /* access modifiers changed from: package-private */
    public Collection<Map.Entry<K, V>> createEntries() {
        if (this instanceof C7694l0) {
            return new C7723t.C7725b(this);
        }
        return new C7723t.C7724a();
    }

    /* access modifiers changed from: package-private */
    public Set<K> createKeySet() {
        return new C7710e(this.f33047l);
    }

    /* access modifiers changed from: package-private */
    public C7683h0<K> createKeys() {
        return new C7675f0.C7677b(this);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f33047l;
        if (map instanceof NavigableMap) {
            return new C7712f((NavigableMap) this.f33047l);
        }
        if (map instanceof SortedMap) {
            return new C7715i((SortedMap) this.f33047l);
        }
        return new C7706c(this.f33047l);
    }

    /* access modifiers changed from: package-private */
    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f33047l;
        if (map instanceof NavigableMap) {
            return new C7713g((NavigableMap) this.f33047l);
        }
        if (map instanceof SortedMap) {
            return new C7716j((SortedMap) this.f33047l);
        }
        return new C7710e(this.f33047l);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass(createCollection());
    }

    /* access modifiers changed from: package-private */
    public Collection<V> createValues() {
        return new C7723t.C7726c();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C7705b(this);
    }

    /* access modifiers changed from: package-private */
    public Spliterator<Map.Entry<K, V>> entrySpliterator() {
        return C7731x.m42606a(this.f33047l.entrySet().spliterator(), C7659b.f33019a, 64, (long) size());
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        C7656e.m42492c(biConsumer);
        this.f33047l.forEach(new C7672e(biConsumer));
    }

    public Collection<V> get(K k) {
        Collection collection = this.f33047l.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    public boolean put(K k, V v) {
        Collection collection = this.f33047l.get(k);
        if (collection == null) {
            Collection createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.f33048m++;
                this.f33047l.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f33048m++;
            return true;
        }
    }

    public Collection<V> removeAll(Object obj) {
        Collection remove = this.f33047l.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.f33048m -= remove.size();
        remove.clear();
        return unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection a = m42555a(k);
        Collection createCollection = createCollection();
        createCollection.addAll(a);
        this.f33048m -= a.size();
        a.clear();
        while (it.hasNext()) {
            if (a.add(it.next())) {
                this.f33048m++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    /* access modifiers changed from: package-private */
    public final void setMap(Map<K, Collection<V>> map) {
        this.f33047l = map;
        this.f33048m = 0;
        for (Collection next : map.values()) {
            C7656e.m42490a(!next.isEmpty());
            this.f33048m += next.size();
        }
    }

    public int size() {
        return this.f33048m;
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> valueIterator() {
        return new C7704a(this);
    }

    /* access modifiers changed from: package-private */
    public Spliterator<V> valueSpliterator() {
        return C7731x.m42606a(this.f33047l.values().spliterator(), C7657a.f33018a, 64, (long) size());
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C7717k(k, collection, (C7703r<K, V>.k) null);
    }

    /* access modifiers changed from: package-private */
    public final List<V> wrapList(K k, List<V> list, C7703r<K, V>.k kVar) {
        if (list instanceof RandomAccess) {
            return new C7714h(this, k, list, kVar);
        }
        return new C7719l(k, list, kVar);
    }

    /* renamed from: f.f.d.b.r$k */
    /* compiled from: AbstractMapBasedMultimap */
    class C7717k extends AbstractCollection<V> {

        /* renamed from: g */
        final K f33069g;

        /* renamed from: h */
        Collection<V> f33070h;

        /* renamed from: i */
        final C7703r<K, V>.k f33071i;

        /* renamed from: j */
        final Collection<V> f33072j;

        C7717k(K k, Collection<V> collection, C7703r<K, V>.k kVar) {
            Collection<V> collection2;
            this.f33069g = k;
            this.f33070h = collection;
            this.f33071i = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.mo28867s();
            }
            this.f33072j = collection2;
        }

        public boolean add(V v) {
            mo28872u();
            boolean isEmpty = this.f33070h.isEmpty();
            boolean add = this.f33070h.add(v);
            if (add) {
                C7703r.access$208(C7703r.this);
                if (isEmpty) {
                    mo28859d();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f33070h.addAll(collection);
            if (addAll) {
                C7703r.access$212(C7703r.this, this.f33070h.size() - size);
                if (size == 0) {
                    mo28859d();
                }
            }
            return addAll;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f33070h.clear();
                C7703r.access$220(C7703r.this, size);
                mo28873v();
            }
        }

        public boolean contains(Object obj) {
            mo28872u();
            return this.f33070h.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo28872u();
            return this.f33070h.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo28859d() {
            C7703r<K, V>.k kVar = this.f33071i;
            if (kVar != null) {
                kVar.mo28859d();
            } else {
                C7703r.this.f33047l.put(this.f33069g, this.f33070h);
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo28872u();
            return this.f33070h.equals(obj);
        }

        public int hashCode() {
            mo28872u();
            return this.f33070h.hashCode();
        }

        public Iterator<V> iterator() {
            mo28872u();
            return new C7718a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C7703r<K, V>.k mo28863p() {
            return this.f33071i;
        }

        public boolean remove(Object obj) {
            mo28872u();
            boolean remove = this.f33070h.remove(obj);
            if (remove) {
                C7703r.access$210(C7703r.this);
                mo28873v();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f33070h.removeAll(collection);
            if (removeAll) {
                C7703r.access$212(C7703r.this, this.f33070h.size() - size);
                mo28873v();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C7656e.m42492c(collection);
            int size = size();
            boolean retainAll = this.f33070h.retainAll(collection);
            if (retainAll) {
                C7703r.access$212(C7703r.this, this.f33070h.size() - size);
                mo28873v();
            }
            return retainAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public Collection<V> mo28867s() {
            return this.f33070h;
        }

        public int size() {
            mo28872u();
            return this.f33070h.size();
        }

        public Spliterator<V> spliterator() {
            mo28872u();
            return this.f33070h.spliterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public K mo28870t() {
            return this.f33069g;
        }

        public String toString() {
            mo28872u();
            return this.f33070h.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo28872u() {
            Collection<V> collection;
            C7703r<K, V>.k kVar = this.f33071i;
            if (kVar != null) {
                kVar.mo28872u();
                if (this.f33071i.mo28867s() != this.f33072j) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f33070h.isEmpty() && (collection = (Collection) C7703r.this.f33047l.get(this.f33069g)) != null) {
                this.f33070h = collection;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo28873v() {
            C7703r<K, V>.k kVar = this.f33071i;
            if (kVar != null) {
                kVar.mo28873v();
            } else if (this.f33070h.isEmpty()) {
                C7703r.this.f33047l.remove(this.f33069g);
            }
        }

        /* renamed from: f.f.d.b.r$k$a */
        /* compiled from: AbstractMapBasedMultimap */
        class C7718a implements Iterator<V> {

            /* renamed from: g */
            final Iterator<V> f33074g;

            /* renamed from: h */
            final Collection<V> f33075h;

            C7718a() {
                Collection<V> collection = C7717k.this.f33070h;
                this.f33075h = collection;
                this.f33074g = C7703r.m42556b(collection);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Iterator<V> mo28874a() {
                mo28875b();
                return this.f33074g;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo28875b() {
                C7717k.this.mo28872u();
                if (C7717k.this.f33070h != this.f33075h) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo28875b();
                return this.f33074g.hasNext();
            }

            public V next() {
                mo28875b();
                return this.f33074g.next();
            }

            public void remove() {
                this.f33074g.remove();
                C7703r.access$210(C7703r.this);
                C7717k.this.mo28873v();
            }

            C7718a(Iterator<V> it) {
                this.f33075h = C7717k.this.f33070h;
                this.f33074g = it;
            }
        }
    }

    /* renamed from: f.f.d.b.r$l */
    /* compiled from: AbstractMapBasedMultimap */
    class C7719l extends C7703r<K, V>.k implements List<V> {

        /* renamed from: f.f.d.b.r$l$a */
        /* compiled from: AbstractMapBasedMultimap */
        private class C7720a extends C7703r<K, V>.C8619a implements ListIterator<V> {
            C7720a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [f.f.d.b.r$l$a, f.f.d.b.r$k$a] */
            /* renamed from: d */
            private ListIterator<V> m42600d() {
                return (ListIterator) mo28874a();
            }

            public void add(V v) {
                boolean isEmpty = C7719l.this.isEmpty();
                m42600d().add(v);
                C7703r.access$208(C7703r.this);
                if (isEmpty) {
                    C7719l.this.mo28859d();
                }
            }

            public boolean hasPrevious() {
                return m42600d().hasPrevious();
            }

            public int nextIndex() {
                return m42600d().nextIndex();
            }

            public V previous() {
                return m42600d().previous();
            }

            public int previousIndex() {
                return m42600d().previousIndex();
            }

            public void set(V v) {
                m42600d().set(v);
            }

            public C7720a(int i) {
                super(C7719l.this.mo28889x().listIterator(i));
            }
        }

        C7719l(K k, List<V> list, C7703r<K, V>.k kVar) {
            super(k, list, kVar);
        }

        public void add(int i, V v) {
            mo28872u();
            boolean isEmpty = mo28867s().isEmpty();
            mo28889x().add(i, v);
            C7703r.access$208(C7703r.this);
            if (isEmpty) {
                mo28859d();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo28889x().addAll(i, collection);
            if (addAll) {
                C7703r.access$212(C7703r.this, mo28867s().size() - size);
                if (size == 0) {
                    mo28859d();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo28872u();
            return mo28889x().get(i);
        }

        public int indexOf(Object obj) {
            mo28872u();
            return mo28889x().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo28872u();
            return mo28889x().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo28872u();
            return new C7720a();
        }

        public V remove(int i) {
            mo28872u();
            V remove = mo28889x().remove(i);
            C7703r.access$210(C7703r.this);
            mo28873v();
            return remove;
        }

        public V set(int i, V v) {
            mo28872u();
            return mo28889x().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo28872u();
            return C7703r.this.wrapList(mo28870t(), mo28889x().subList(i, i2), mo28863p() == null ? this : mo28863p());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public List<V> mo28889x() {
            return (List) mo28867s();
        }

        public ListIterator<V> listIterator(int i) {
            mo28872u();
            return new C7720a(i);
        }
    }
}
