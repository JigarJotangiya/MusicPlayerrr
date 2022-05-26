package p369i.p377u;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p369i.p387z.p389d.C8588f;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.x */
/* compiled from: Sets.kt */
public final class C8494x implements Set, Serializable, C8607a {
    public static final C8494x INSTANCE = new C8494x();
    private static final long serialVersionUID = 3406603774387020532L;

    private C8494x() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return contains((Void) obj);
        }
        return false;
    }

    public boolean contains(Void voidR) {
        C8594l.m46771e(voidR, "element");
        return false;
    }

    public boolean containsAll(Collection collection) {
        C8594l.m46771e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C8491u.f34910g;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C8588f.m46764a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C8588f.m46765b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
