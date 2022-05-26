package p082e.p098e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: e.e.f */
/* compiled from: MapCollections */
abstract class C3472f<K, V> {

    /* renamed from: a */
    C3472f<K, V>.C1427b f11020a;

    /* renamed from: b */
    C3472f<K, V>.C1428c f11021b;

    /* renamed from: c */
    C3472f<K, V>.e f11022c;

    /* renamed from: e.e.f$a */
    /* compiled from: MapCollections */
    final class C3473a<T> implements Iterator<T> {

        /* renamed from: g */
        final int f11023g;

        /* renamed from: h */
        int f11024h;

        /* renamed from: i */
        int f11025i;

        /* renamed from: j */
        boolean f11026j = false;

        C3473a(int i) {
            this.f11023g = i;
            this.f11024h = C3472f.this.mo12272d();
        }

        public boolean hasNext() {
            return this.f11025i < this.f11024h;
        }

        public T next() {
            if (hasNext()) {
                T b = C3472f.this.mo12270b(this.f11025i, this.f11023g);
                this.f11025i++;
                this.f11026j = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f11026j) {
                int i = this.f11025i - 1;
                this.f11025i = i;
                this.f11024h--;
                this.f11026j = false;
                C3472f.this.mo12276h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: e.e.f$b */
    /* compiled from: MapCollections */
    final class C3474b implements Set<Map.Entry<K, V>> {
        C3474b() {
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo12336d((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C3472f.this.mo12272d();
            for (Map.Entry entry : collection) {
                C3472f.this.mo12275g(entry.getKey(), entry.getValue());
            }
            return d != C3472f.this.mo12272d();
        }

        public void clear() {
            C3472f.this.mo12269a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C3472f.this.mo12273e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return C3469c.m14783c(C3472f.this.mo12270b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo12336d(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C3472f.m14812k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = C3472f.this.mo12272d() - 1; d >= 0; d--) {
                Object b = C3472f.this.mo12270b(d, 0);
                Object b2 = C3472f.this.mo12270b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return C3472f.this.mo12272d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3476d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C3472f.this.mo12272d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.e.f$c */
    /* compiled from: MapCollections */
    final class C3475c implements Set<K> {
        C3475c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3472f.this.mo12269a();
        }

        public boolean contains(Object obj) {
            return C3472f.this.mo12273e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C3472f.m14811j(C3472f.this.mo12271c(), collection);
        }

        public boolean equals(Object obj) {
            return C3472f.m14812k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = C3472f.this.mo12272d() - 1; d >= 0; d--) {
                Object b = C3472f.this.mo12270b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return C3472f.this.mo12272d() == 0;
        }

        public Iterator<K> iterator() {
            return new C3473a(0);
        }

        public boolean remove(Object obj) {
            int e = C3472f.this.mo12273e(obj);
            if (e < 0) {
                return false;
            }
            C3472f.this.mo12276h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C3472f.m14813o(C3472f.this.mo12271c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C3472f.m14814p(C3472f.this.mo12271c(), collection);
        }

        public int size() {
            return C3472f.this.mo12272d();
        }

        public Object[] toArray() {
            return C3472f.this.mo12326q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3472f.this.mo12327r(tArr, 0);
        }
    }

    /* renamed from: e.e.f$d */
    /* compiled from: MapCollections */
    final class C3476d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: g */
        int f11030g;

        /* renamed from: h */
        int f11031h;

        /* renamed from: i */
        boolean f11032i = false;

        C3476d() {
            this.f11030g = C3472f.this.mo12272d() - 1;
            this.f11031h = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> mo12362a() {
            if (hasNext()) {
                this.f11031h++;
                this.f11032i = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f11032i) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C3469c.m14783c(entry.getKey(), C3472f.this.mo12270b(this.f11031h, 0)) || !C3469c.m14783c(entry.getValue(), C3472f.this.mo12270b(this.f11031h, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f11032i) {
                return C3472f.this.mo12270b(this.f11031h, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f11032i) {
                return C3472f.this.mo12270b(this.f11031h, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f11031h < this.f11030g;
        }

        public int hashCode() {
            int i;
            if (this.f11032i) {
                int i2 = 0;
                Object b = C3472f.this.mo12270b(this.f11031h, 0);
                Object b2 = C3472f.this.mo12270b(this.f11031h, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            mo12362a();
            return this;
        }

        public void remove() {
            if (this.f11032i) {
                C3472f.this.mo12276h(this.f11031h);
                this.f11031h--;
                this.f11030g--;
                this.f11032i = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f11032i) {
                return C3472f.this.mo12277i(this.f11031h, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: e.e.f$e */
    /* compiled from: MapCollections */
    final class C3477e implements Collection<V> {
        C3477e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3472f.this.mo12269a();
        }

        public boolean contains(Object obj) {
            return C3472f.this.mo12274f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C3472f.this.mo12272d() == 0;
        }

        public Iterator<V> iterator() {
            return new C3473a(1);
        }

        public boolean remove(Object obj) {
            int f = C3472f.this.mo12274f(obj);
            if (f < 0) {
                return false;
            }
            C3472f.this.mo12276h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C3472f.this.mo12272d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C3472f.this.mo12270b(i, 1))) {
                    C3472f.this.mo12276h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C3472f.this.mo12272d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C3472f.this.mo12270b(i, 1))) {
                    C3472f.this.mo12276h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C3472f.this.mo12272d();
        }

        public Object[] toArray() {
            return C3472f.this.mo12326q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3472f.this.mo12327r(tArr, 1);
        }
    }

    C3472f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m14811j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m14812k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m14813o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m14814p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12269a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo12270b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo12271c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo12272d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo12273e(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo12274f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo12275g(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo12276h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract V mo12277i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo12323l() {
        if (this.f11020a == null) {
            this.f11020a = new C3474b();
        }
        return this.f11020a;
    }

    /* renamed from: m */
    public Set<K> mo12324m() {
        if (this.f11021b == null) {
            this.f11021b = new C3475c();
        }
        return this.f11021b;
    }

    /* renamed from: n */
    public Collection<V> mo12325n() {
        if (this.f11022c == null) {
            this.f11022c = new C3477e();
        }
        return this.f11022c;
    }

    /* renamed from: q */
    public Object[] mo12326q(int i) {
        int d = mo12272d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo12270b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo12327r(T[] tArr, int i) {
        int d = mo12272d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo12270b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
