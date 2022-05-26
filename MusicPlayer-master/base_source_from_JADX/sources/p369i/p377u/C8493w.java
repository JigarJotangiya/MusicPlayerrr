package p369i.p377u;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.w */
/* compiled from: Maps.kt */
final class C8493w implements Map, Serializable, C8607a {
    public static final C8493w INSTANCE = new C8493w();
    private static final long serialVersionUID = 8246714829545688274L;

    private C8493w() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return containsValue((Void) obj);
        }
        return false;
    }

    public boolean containsValue(Void voidR) {
        C8594l.m46771e(voidR, "value");
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> getEntries() {
        return C8494x.INSTANCE;
    }

    public Set<Object> getKeys() {
        return C8494x.INSTANCE;
    }

    public int getSize() {
        return 0;
    }

    public Collection getValues() {
        return C8492v.INSTANCE;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void put(Object obj, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return getValues();
    }
}
