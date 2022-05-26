package p159f.p243f.p327d.p329b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import p159f.p243f.p327d.p328a.C7656e;
import p159f.p243f.p327d.p329b.C7683h0;
import p159f.p243f.p327d.p329b.C7686i0;

/* renamed from: f.f.d.b.f0 */
/* compiled from: Multimaps */
public final class C7675f0 {

    /* renamed from: f.f.d.b.f0$a */
    /* compiled from: Multimaps */
    static abstract class C7676a<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        C7676a() {
        }

        public void clear() {
            mo28697d().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo28697d().containsEntry(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C7673e0<K, V> mo28697d();

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo28697d().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo28697d().size();
        }
    }

    /* renamed from: f.f.d.b.f0$b */
    /* compiled from: Multimaps */
    static class C7677b<K, V> extends C7727u<K> {

        /* renamed from: h */
        final C7673e0<K, V> f33031h;

        /* renamed from: f.f.d.b.f0$b$a */
        /* compiled from: Multimaps */
        class C7678a extends C7699n0<Map.Entry<K, Collection<V>>, C7683h0.C7684a<K>> {

            /* renamed from: f.f.d.b.f0$b$a$a */
            /* compiled from: Multimaps */
            class C7679a extends C7686i0.C7687a<K> {

                /* renamed from: a */
                final /* synthetic */ Map.Entry f33032a;

                C7679a(C7678a aVar, Map.Entry entry) {
                    this.f33032a = entry;
                }

                /* renamed from: a */
                public K mo28712a() {
                    return this.f33032a.getKey();
                }

                public int getCount() {
                    return ((Collection) this.f33032a.getValue()).size();
                }
            }

            C7678a(C7677b bVar, Iterator it) {
                super(it);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C7683h0.C7684a<K> mo28655a(Map.Entry<K, Collection<V>> entry) {
                return new C7679a(this, entry);
            }
        }

        C7677b(C7673e0<K, V> e0Var) {
            this.f33031h = e0Var;
        }

        public void clear() {
            this.f33031h.clear();
        }

        public boolean contains(Object obj) {
            return this.f33031h.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        public int distinctElements() {
            return this.f33031h.asMap().size();
        }

        /* access modifiers changed from: package-private */
        public Iterator<C7683h0.C7684a<K>> entryIterator() {
            return new C7678a(this, this.f33031h.asMap().entrySet().iterator());
        }

        public void forEach(Consumer<? super K> consumer) {
            C7656e.m42492c(consumer);
            this.f33031h.entries().forEach(new C7695m(consumer));
        }

        /* renamed from: h */
        public Set<K> mo28705h() {
            return this.f33031h.keySet();
        }

        public Iterator<K> iterator() {
            return C7665d0.m42502c(this.f33031h.entries().iterator());
        }

        /* renamed from: m */
        public int mo28707m(Object obj) {
            Collection collection = (Collection) C7665d0.m42505f(this.f33031h.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int remove(Object obj, int i) {
            C7730w.m42604a(i, "occurrences");
            if (i == 0) {
                return mo28707m(obj);
            }
            Collection collection = (Collection) C7665d0.m42505f(this.f33031h.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        public int size() {
            return this.f33031h.size();
        }

        public Spliterator<K> spliterator() {
            return C7731x.m42607b(this.f33031h.entries().spliterator(), C7701p.f33045a);
        }
    }

    /* renamed from: a */
    static boolean m42519a(C7673e0<?, ?> e0Var, Object obj) {
        if (obj == e0Var) {
            return true;
        }
        if (obj instanceof C7673e0) {
            return e0Var.asMap().equals(((C7673e0) obj).asMap());
        }
        return false;
    }
}
