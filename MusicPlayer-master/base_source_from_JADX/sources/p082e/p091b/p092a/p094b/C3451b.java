package p082e.p091b.p092a.p094b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: e.b.a.b.b */
/* compiled from: SafeIterableMap */
public class C3451b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: g */
    C3454c<K, V> f10978g;

    /* renamed from: h */
    private C3454c<K, V> f10979h;

    /* renamed from: i */
    private WeakHashMap<C3457f<K, V>, Boolean> f10980i = new WeakHashMap<>();

    /* renamed from: j */
    private int f10981j = 0;

    /* renamed from: e.b.a.b.b$a */
    /* compiled from: SafeIterableMap */
    static class C3452a<K, V> extends C3456e<K, V> {
        C3452a(C3454c<K, V> cVar, C3454c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3454c<K, V> mo12249b(C3454c<K, V> cVar) {
            return cVar.f10985j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3454c<K, V> mo12250d(C3454c<K, V> cVar) {
            return cVar.f10984i;
        }
    }

    /* renamed from: e.b.a.b.b$b */
    /* compiled from: SafeIterableMap */
    private static class C3453b<K, V> extends C3456e<K, V> {
        C3453b(C3454c<K, V> cVar, C3454c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3454c<K, V> mo12249b(C3454c<K, V> cVar) {
            return cVar.f10984i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3454c<K, V> mo12250d(C3454c<K, V> cVar) {
            return cVar.f10985j;
        }
    }

    /* renamed from: e.b.a.b.b$c */
    /* compiled from: SafeIterableMap */
    static class C3454c<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        final K f10982g;

        /* renamed from: h */
        final V f10983h;

        /* renamed from: i */
        C3454c<K, V> f10984i;

        /* renamed from: j */
        C3454c<K, V> f10985j;

        C3454c(K k, V v) {
            this.f10982g = k;
            this.f10983h = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3454c)) {
                return false;
            }
            C3454c cVar = (C3454c) obj;
            if (!this.f10982g.equals(cVar.f10982g) || !this.f10983h.equals(cVar.f10983h)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f10982g;
        }

        public V getValue() {
            return this.f10983h;
        }

        public int hashCode() {
            return this.f10982g.hashCode() ^ this.f10983h.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10982g + "=" + this.f10983h;
        }
    }

    /* renamed from: e.b.a.b.b$d */
    /* compiled from: SafeIterableMap */
    private class C3455d implements Iterator<Map.Entry<K, V>>, C3457f<K, V> {

        /* renamed from: g */
        private C3454c<K, V> f10986g;

        /* renamed from: h */
        private boolean f10987h = true;

        C3455d() {
        }

        /* renamed from: a */
        public void mo12257a(C3454c<K, V> cVar) {
            C3454c<K, V> cVar2 = this.f10986g;
            if (cVar == cVar2) {
                C3454c<K, V> cVar3 = cVar2.f10985j;
                this.f10986g = cVar3;
                this.f10987h = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f10987h) {
                this.f10987h = false;
                this.f10986g = C3451b.this.f10978g;
            } else {
                C3454c<K, V> cVar = this.f10986g;
                this.f10986g = cVar != null ? cVar.f10984i : null;
            }
            return this.f10986g;
        }

        public boolean hasNext() {
            if (!this.f10987h) {
                C3454c<K, V> cVar = this.f10986g;
                if (cVar == null || cVar.f10984i == null) {
                    return false;
                }
                return true;
            } else if (C3451b.this.f10978g != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: e.b.a.b.b$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C3456e<K, V> implements Iterator<Map.Entry<K, V>>, C3457f<K, V> {

        /* renamed from: g */
        C3454c<K, V> f10989g;

        /* renamed from: h */
        C3454c<K, V> f10990h;

        C3456e(C3454c<K, V> cVar, C3454c<K, V> cVar2) {
            this.f10989g = cVar2;
            this.f10990h = cVar;
        }

        /* renamed from: f */
        private C3454c<K, V> m14747f() {
            C3454c<K, V> cVar = this.f10990h;
            C3454c<K, V> cVar2 = this.f10989g;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo12250d(cVar);
        }

        /* renamed from: a */
        public void mo12257a(C3454c<K, V> cVar) {
            if (this.f10989g == cVar && cVar == this.f10990h) {
                this.f10990h = null;
                this.f10989g = null;
            }
            C3454c<K, V> cVar2 = this.f10989g;
            if (cVar2 == cVar) {
                this.f10989g = mo12249b(cVar2);
            }
            if (this.f10990h == cVar) {
                this.f10990h = m14747f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C3454c<K, V> mo12249b(C3454c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C3454c<K, V> mo12250d(C3454c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C3454c<K, V> cVar = this.f10990h;
            this.f10990h = m14747f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f10990h != null;
        }
    }

    /* renamed from: e.b.a.b.b$f */
    /* compiled from: SafeIterableMap */
    interface C3457f<K, V> {
        /* renamed from: a */
        void mo12257a(C3454c<K, V> cVar);
    }

    /* renamed from: d */
    public Map.Entry<K, V> mo12239d() {
        return this.f10978g;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C3453b bVar = new C3453b(this.f10979h, this.f10978g);
        this.f10980i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3451b)) {
            return false;
        }
        C3451b bVar = (C3451b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C3452a aVar = new C3452a(this.f10978g, this.f10979h);
        this.f10980i.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C3454c<K, V> mo12235p(K k) {
        C3454c<K, V> cVar = this.f10978g;
        while (cVar != null && !cVar.f10982g.equals(k)) {
            cVar = cVar.f10984i;
        }
        return cVar;
    }

    /* renamed from: s */
    public C3451b<K, V>.d mo12244s() {
        C3451b<K, V>.d dVar = new C3455d();
        this.f10980i.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int size() {
        return this.f10981j;
    }

    /* renamed from: t */
    public Map.Entry<K, V> mo12246t() {
        return this.f10979h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C3454c<K, V> mo12248u(K k, V v) {
        C3454c<K, V> cVar = new C3454c<>(k, v);
        this.f10981j++;
        C3454c<K, V> cVar2 = this.f10979h;
        if (cVar2 == null) {
            this.f10978g = cVar;
            this.f10979h = cVar;
            return cVar;
        }
        cVar2.f10984i = cVar;
        cVar.f10985j = cVar2;
        this.f10979h = cVar;
        return cVar;
    }

    /* renamed from: v */
    public V mo12236v(K k, V v) {
        C3454c p = mo12235p(k);
        if (p != null) {
            return p.f10983h;
        }
        mo12248u(k, v);
        return null;
    }

    /* renamed from: x */
    public V mo12237x(K k) {
        C3454c p = mo12235p(k);
        if (p == null) {
            return null;
        }
        this.f10981j--;
        if (!this.f10980i.isEmpty()) {
            for (C3457f<K, V> a : this.f10980i.keySet()) {
                a.mo12257a(p);
            }
        }
        C3454c<K, V> cVar = p.f10985j;
        if (cVar != null) {
            cVar.f10984i = p.f10984i;
        } else {
            this.f10978g = p.f10984i;
        }
        C3454c<K, V> cVar2 = p.f10984i;
        if (cVar2 != null) {
            cVar2.f10985j = cVar;
        } else {
            this.f10979h = cVar;
        }
        p.f10984i = null;
        p.f10985j = null;
        return p.f10983h;
    }
}
