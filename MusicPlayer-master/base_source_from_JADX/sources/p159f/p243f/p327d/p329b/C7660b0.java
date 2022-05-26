package p159f.p243f.p327d.p329b;

import java.io.Serializable;

/* renamed from: f.f.d.b.b0 */
/* compiled from: ImmutableEntry */
class C7660b0<K, V> extends C7722s<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final K key;
    final V value;

    C7660b0(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public final K getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
