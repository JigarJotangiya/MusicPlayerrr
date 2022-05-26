package p082e.p091b.p092a.p094b;

import java.util.HashMap;
import java.util.Map;
import p082e.p091b.p092a.p094b.C3451b;

/* renamed from: e.b.a.b.a */
/* compiled from: FastSafeIterableMap */
public class C3450a<K, V> extends C3451b<K, V> {

    /* renamed from: k */
    private HashMap<K, C3451b.C3454c<K, V>> f10977k = new HashMap<>();

    public boolean contains(K k) {
        return this.f10977k.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C3451b.C3454c<K, V> mo12235p(K k) {
        return this.f10977k.get(k);
    }

    /* renamed from: v */
    public V mo12236v(K k, V v) {
        C3451b.C3454c p = mo12235p(k);
        if (p != null) {
            return p.f10983h;
        }
        this.f10977k.put(k, mo12248u(k, v));
        return null;
    }

    /* renamed from: x */
    public V mo12237x(K k) {
        V x = super.mo12237x(k);
        this.f10977k.remove(k);
        return x;
    }

    /* renamed from: y */
    public Map.Entry<K, V> mo12238y(K k) {
        if (contains(k)) {
            return this.f10977k.get(k).f10985j;
        }
        return null;
    }
}
