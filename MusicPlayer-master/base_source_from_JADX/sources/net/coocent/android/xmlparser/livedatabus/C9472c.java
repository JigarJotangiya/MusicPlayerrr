package net.coocent.android.xmlparser.livedatabus;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: net.coocent.android.xmlparser.livedatabus.c */
/* compiled from: SafeIterableMap */
class C9472c<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9475c<K, V> f36440g;

    /* renamed from: h */
    private C9475c<K, V> f36441h;

    /* renamed from: i */
    private WeakHashMap<C9478f<K, V>, Boolean> f36442i = new WeakHashMap<>();

    /* renamed from: j */
    private int f36443j = 0;

    /* renamed from: net.coocent.android.xmlparser.livedatabus.c$b */
    /* compiled from: SafeIterableMap */
    static class C9474b<K, V> extends C9477e<K, V> {
        C9474b(C9475c<K, V> cVar, C9475c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9475c<K, V> mo32615b(C9475c<K, V> cVar) {
            return cVar.f36447j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C9475c<K, V> mo32616d(C9475c<K, V> cVar) {
            return cVar.f36446i;
        }
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.c$c */
    /* compiled from: SafeIterableMap */
    static class C9475c<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        final K f36444g;

        /* renamed from: h */
        final V f36445h;

        /* renamed from: i */
        C9475c<K, V> f36446i;

        /* renamed from: j */
        C9475c<K, V> f36447j;
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.c$d */
    /* compiled from: SafeIterableMap */
    private class C9476d implements Iterator<Map.Entry<K, V>>, C9478f<K, V> {

        /* renamed from: g */
        private C9475c<K, V> f36448g;

        /* renamed from: h */
        private boolean f36449h;

        private C9476d() {
            this.f36449h = true;
        }

        /* renamed from: a */
        public void mo32617a(C9475c<K, V> cVar) {
            C9475c<K, V> cVar2 = this.f36448g;
            if (cVar == cVar2) {
                this.f36449h = cVar2.f36447j == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f36449h) {
                this.f36449h = false;
                C9475c unused = C9472c.this.f36440g;
            } else {
                C9475c<K, V> cVar = this.f36448g;
                if (cVar != null) {
                    C9475c<K, V> cVar2 = cVar.f36446i;
                }
            }
            return this.f36448g;
        }

        public boolean hasNext() {
            if (!this.f36449h) {
                C9475c<K, V> cVar = this.f36448g;
                if (cVar == null || cVar.f36446i == null) {
                    return false;
                }
                return true;
            } else if (C9472c.this.f36440g != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.c$e */
    /* compiled from: SafeIterableMap */
    private static abstract class C9477e<K, V> implements Iterator<Map.Entry<K, V>>, C9478f<K, V> {

        /* renamed from: g */
        C9475c<K, V> f36451g;

        /* renamed from: h */
        C9475c<K, V> f36452h;

        C9477e(C9475c<K, V> cVar, C9475c<K, V> cVar2) {
        }

        /* renamed from: f */
        private C9475c<K, V> m49848f() {
            C9475c<K, V> cVar = this.f36452h;
            C9475c<K, V> cVar2 = this.f36451g;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo32616d(cVar);
        }

        /* renamed from: a */
        public void mo32617a(C9475c<K, V> cVar) {
            if (this.f36451g == cVar) {
                C9475c<K, V> cVar2 = this.f36452h;
            }
            C9475c<K, V> cVar3 = this.f36451g;
            if (cVar3 == cVar) {
                mo32615b(cVar3);
            }
            if (this.f36452h == cVar) {
                m49848f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C9475c<K, V> mo32615b(C9475c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C9475c<K, V> mo32616d(C9475c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C9475c<K, V> cVar = this.f36452h;
            m49848f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f36452h != null;
        }
    }

    /* renamed from: net.coocent.android.xmlparser.livedatabus.c$f */
    /* compiled from: SafeIterableMap */
    interface C9478f<K, V> {
        /* renamed from: a */
        void mo32617a(C9475c<K, V> cVar);
    }

    C9472c() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9472c)) {
            return false;
        }
        C9472c cVar = (C9472c) obj;
        if (size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
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

    public Iterator<Map.Entry<K, V>> iterator() {
        C9474b bVar = new C9474b(this.f36440g, this.f36441h);
        this.f36442i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C9475c<K, V> mo32610p(K k) {
        C9475c<K, V> cVar = this.f36440g;
        while (cVar != null && !cVar.f36444g.equals(k)) {
            cVar = cVar.f36446i;
        }
        return cVar;
    }

    /* renamed from: s */
    public C9472c<K, V>.d mo32611s() {
        C9472c<K, V>.d dVar = new C9476d();
        this.f36442i.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int size() {
        return this.f36443j;
    }

    /* renamed from: t */
    public V mo32613t(K k) {
        C9475c p = mo32610p(k);
        if (p == null) {
            return null;
        }
        this.f36443j--;
        if (!this.f36442i.isEmpty()) {
            for (C9478f<K, V> a : this.f36442i.keySet()) {
                a.mo32617a(p);
            }
        }
        C9475c<K, V> cVar = p.f36447j;
        if (cVar != null) {
            cVar.f36446i = p.f36446i;
        } else {
            C9475c<K, V> cVar2 = p.f36446i;
        }
        C9475c<K, V> cVar3 = p.f36446i;
        if (cVar3 != null) {
            cVar3.f36447j = cVar;
        }
        p.f36446i = null;
        p.f36447j = null;
        return p.f36445h;
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
}
