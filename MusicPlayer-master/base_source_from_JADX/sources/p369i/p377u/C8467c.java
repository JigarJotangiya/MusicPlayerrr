package p369i.p377u;

import java.util.Collection;
import java.util.Iterator;
import p369i.p387z.p389d.C8583b;
import p369i.p387z.p389d.C8588f;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.u.c */
/* compiled from: Collections.kt */
final class C8467c<T> implements Collection<T>, C8607a {

    /* renamed from: g */
    private final T[] f34908g;

    /* renamed from: h */
    private final boolean f34909h;

    public C8467c(T[] tArr, boolean z) {
        C8594l.m46771e(tArr, "values");
        this.f34908g = tArr;
        this.f34909h = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C8477h.m46628m(this.f34908g, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C8594l.m46771e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public int mo30481d() {
        return this.f34908g.length;
    }

    public boolean isEmpty() {
        return this.f34908g.length == 0;
    }

    public Iterator<T> iterator() {
        return C8583b.m46761a(this.f34908g);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo30481d();
    }

    public final Object[] toArray() {
        return C8481k.m46660a(this.f34908g, this.f34909h);
    }

    public <T> T[] toArray(T[] tArr) {
        return C8588f.m46765b(this, tArr);
    }
}
