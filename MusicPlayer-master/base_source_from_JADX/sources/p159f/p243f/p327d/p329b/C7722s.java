package p159f.p243f.p327d.p329b;

import java.util.Map;
import p159f.p243f.p327d.p328a.C7655d;

/* renamed from: f.f.d.b.s */
/* compiled from: AbstractMapEntry */
abstract class C7722s<K, V> implements Map.Entry<K, V> {
    C7722s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C7655d.m42489a(getKey(), entry.getKey()) || !C7655d.m42489a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public abstract V setValue(V v);

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
