package p159f.p243f.p327d.p329b;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import p159f.p243f.p327d.p328a.C7655d;
import p159f.p243f.p327d.p328a.C7656e;
import p159f.p243f.p327d.p329b.C7696m0;

/* renamed from: f.f.d.b.d0 */
/* compiled from: Maps */
public final class C7665d0 {

    /* renamed from: f.f.d.b.d0$a */
    /* compiled from: Maps */
    class C7666a extends C7699n0<Map.Entry<K, V>, K> {
        C7666a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public K mo28655a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* renamed from: f.f.d.b.d0$b */
    /* compiled from: Maps */
    class C7667b extends C7699n0<Map.Entry<K, V>, V> {
        C7667b(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V mo28655a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: f.f.d.b.d0$c */
    /* compiled from: Maps */
    static abstract class C7668c<K, V> extends C7696m0.C7697a<Map.Entry<K, V>> {
        C7668c() {
        }

        public void clear() {
            mo28660d().clear();
        }

        public abstract boolean contains(Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Map<K, V> mo28660d();

        public boolean isEmpty() {
            return mo28660d().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                C7656e.m42492c(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                return C7696m0.m42552f(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                C7656e.m42492c(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet d = C7696m0.m42550d(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        d.add(((Map.Entry) next).getKey());
                    }
                }
                return mo28660d().keySet().retainAll(d);
            }
        }

        public int size() {
            return mo28660d().size();
        }
    }

    /* renamed from: f.f.d.b.d0$d */
    /* compiled from: Maps */
    static class C7669d<K, V> extends C7696m0.C7697a<K> {

        /* renamed from: g */
        final Map<K, V> f33024g;

        C7669d(Map<K, V> map) {
            C7656e.m42492c(map);
            this.f33024g = map;
        }

        public boolean contains(Object obj) {
            return mo28668p().containsKey(obj);
        }

        public void forEach(Consumer<? super K> consumer) {
            C7656e.m42492c(consumer);
            this.f33024g.forEach(new C7691k(consumer));
        }

        public boolean isEmpty() {
            return mo28668p().isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public Map<K, V> mo28668p() {
            return this.f33024g;
        }

        public int size() {
            return mo28668p().size();
        }
    }

    /* renamed from: f.f.d.b.d0$e */
    /* compiled from: Maps */
    static class C7670e<K, V> extends AbstractCollection<V> {

        /* renamed from: g */
        final Map<K, V> f33025g;

        C7670e(Map<K, V> map) {
            C7656e.m42492c(map);
            this.f33025g = map;
        }

        public void clear() {
            mo28675p().clear();
        }

        public boolean contains(Object obj) {
            return mo28675p().containsValue(obj);
        }

        public void forEach(Consumer<? super V> consumer) {
            C7656e.m42492c(consumer);
            this.f33025g.forEach(new C7693l(consumer));
        }

        public boolean isEmpty() {
            return mo28675p().isEmpty();
        }

        public Iterator<V> iterator() {
            return C7665d0.m42507h(mo28675p().entrySet().iterator());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public final Map<K, V> mo28675p() {
            return this.f33025g;
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo28675p().entrySet()) {
                    if (C7655d.m42489a(obj, entry.getValue())) {
                        mo28675p().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                C7656e.m42492c(collection);
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet c = C7696m0.m42549c();
                for (Map.Entry entry : mo28675p().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo28675p().keySet().removeAll(c);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                C7656e.m42492c(collection);
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet c = C7696m0.m42549c();
                for (Map.Entry entry : mo28675p().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        c.add(entry.getKey());
                    }
                }
                return mo28675p().keySet().retainAll(c);
            }
        }

        public int size() {
            return mo28675p().size();
        }
    }

    /* renamed from: f.f.d.b.d0$f */
    /* compiled from: Maps */
    static abstract class C7671f<K, V> extends AbstractMap<K, V> {

        /* renamed from: g */
        private transient Set<Map.Entry<K, V>> f33026g;

        /* renamed from: h */
        private transient Collection<V> f33027h;

        C7671f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo28680a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<V> mo28681b() {
            return new C7670e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f33026g;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo28680a();
            this.f33026g = a;
            return a;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f33027h;
            if (collection != null) {
                return collection;
            }
            Collection<V> b = mo28681b();
            this.f33027h = b;
            return b;
        }
    }

    /* renamed from: a */
    static int m42500a(int i) {
        if (i < 3) {
            C7730w.m42604a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public static <K, V> Map.Entry<K, V> m42501b(K k, V v) {
        return new C7660b0(k, v);
    }

    /* renamed from: c */
    static <K, V> Iterator<K> m42502c(Iterator<Map.Entry<K, V>> it) {
        return new C7666a(it);
    }

    /* renamed from: d */
    public static <K, V> HashMap<K, V> m42503d(int i) {
        return new HashMap<>(m42500a(i));
    }

    /* renamed from: e */
    static boolean m42504e(Map<?, ?> map, Object obj) {
        C7656e.m42492c(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: f */
    static <V> V m42505f(Map<?, V> map, Object obj) {
        C7656e.m42492c(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: g */
    static <V> V m42506g(Map<?, V> map, Object obj) {
        C7656e.m42492c(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static <K, V> Iterator<V> m42507h(Iterator<Map.Entry<K, V>> it) {
        return new C7667b(it);
    }
}
