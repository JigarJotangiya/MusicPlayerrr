package p082e.p098e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: e.e.a */
/* compiled from: ArrayMap */
public class C3465a<K, V> extends C3478g<K, V> implements Map<K, V> {

    /* renamed from: n */
    C3472f<K, V> f10991n;

    /* renamed from: e.e.a$a */
    /* compiled from: ArrayMap */
    class C3466a extends C3472f<K, V> {
        C3466a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12269a() {
            C3465a.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo12270b(int i, int i2) {
            return C3465a.this.f11040h[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<K, V> mo12271c() {
            return C3465a.this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo12272d() {
            return C3465a.this.f11041i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo12273e(Object obj) {
            return C3465a.this.mo12390f(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo12274f(Object obj) {
            return C3465a.this.mo12394h(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo12275g(K k, V v) {
            C3465a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo12276h(int i) {
            C3465a.this.mo8472k(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public V mo12277i(int i, V v) {
            return C3465a.this.mo8473l(i, v);
        }
    }

    public C3465a() {
    }

    /* renamed from: n */
    private C3472f<K, V> m14753n() {
        if (this.f10991n == null) {
            this.f10991n = new C3466a();
        }
        return this.f10991n;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m14753n().mo12323l();
    }

    public Set<K> keySet() {
        return m14753n().mo12324m();
    }

    /* renamed from: o */
    public boolean mo12266o(Collection<?> collection) {
        return C3472f.m14814p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo12385c(this.f11041i + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m14753n().mo12325n();
    }

    public C3465a(int i) {
        super(i);
    }

    public C3465a(C3478g gVar) {
        super(gVar);
    }
}
