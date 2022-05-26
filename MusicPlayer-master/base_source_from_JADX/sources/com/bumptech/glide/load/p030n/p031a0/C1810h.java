package com.bumptech.glide.load.p030n.p031a0;

import com.bumptech.glide.load.p030n.p031a0.C1820m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.a0.h */
/* compiled from: GroupedLinkedMap */
class C1810h<K extends C1820m, V> {

    /* renamed from: a */
    private final C1811a<K, V> f6597a = new C1811a<>();

    /* renamed from: b */
    private final Map<K, C1811a<K, V>> f6598b = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.h$a */
    /* compiled from: GroupedLinkedMap */
    private static class C1811a<K, V> {

        /* renamed from: a */
        final K f6599a;

        /* renamed from: b */
        private List<V> f6600b;

        /* renamed from: c */
        C1811a<K, V> f6601c;

        /* renamed from: d */
        C1811a<K, V> f6602d;

        C1811a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo7800a(V v) {
            if (this.f6600b == null) {
                this.f6600b = new ArrayList();
            }
            this.f6600b.add(v);
        }

        /* renamed from: b */
        public V mo7801b() {
            int c = mo7802c();
            if (c > 0) {
                return this.f6600b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo7802c() {
            List<V> list = this.f6600b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C1811a(K k) {
            this.f6602d = this;
            this.f6601c = this;
            this.f6599a = k;
        }
    }

    C1810h() {
    }

    /* renamed from: b */
    private void m8882b(C1811a<K, V> aVar) {
        m8884e(aVar);
        C1811a<K, V> aVar2 = this.f6597a;
        aVar.f6602d = aVar2;
        aVar.f6601c = aVar2.f6601c;
        m8885g(aVar);
    }

    /* renamed from: c */
    private void m8883c(C1811a<K, V> aVar) {
        m8884e(aVar);
        C1811a<K, V> aVar2 = this.f6597a;
        aVar.f6602d = aVar2.f6602d;
        aVar.f6601c = aVar2;
        m8885g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m8884e(C1811a<K, V> aVar) {
        C1811a<K, V> aVar2 = aVar.f6602d;
        aVar2.f6601c = aVar.f6601c;
        aVar.f6601c.f6602d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m8885g(C1811a<K, V> aVar) {
        aVar.f6601c.f6602d = aVar;
        aVar.f6602d.f6601c = aVar;
    }

    /* renamed from: a */
    public V mo7796a(K k) {
        C1811a aVar = this.f6598b.get(k);
        if (aVar == null) {
            aVar = new C1811a(k);
            this.f6598b.put(k, aVar);
        } else {
            k.mo7779a();
        }
        m8882b(aVar);
        return aVar.mo7801b();
    }

    /* renamed from: d */
    public void mo7797d(K k, V v) {
        C1811a aVar = this.f6598b.get(k);
        if (aVar == null) {
            aVar = new C1811a(k);
            m8883c(aVar);
            this.f6598b.put(k, aVar);
        } else {
            k.mo7779a();
        }
        aVar.mo7800a(v);
    }

    /* renamed from: f */
    public V mo7798f() {
        for (C1811a<K, V> aVar = this.f6597a.f6602d; !aVar.equals(this.f6597a); aVar = aVar.f6602d) {
            V b = aVar.mo7801b();
            if (b != null) {
                return b;
            }
            m8884e(aVar);
            this.f6598b.remove(aVar.f6599a);
            ((C1820m) aVar.f6599a).mo7779a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1811a<K, V> aVar = this.f6597a.f6601c; !aVar.equals(this.f6597a); aVar = aVar.f6601c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f6599a);
            sb.append(':');
            sb.append(aVar.mo7802c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
