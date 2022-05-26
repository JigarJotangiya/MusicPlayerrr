package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.c0 */
/* compiled from: Iterators */
public final class C7662c0 {

    /* renamed from: f.f.d.b.c0$a */
    /* compiled from: Iterators */
    private enum C7663a implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C7730w.m42605b(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m42494a(Collection<T> collection, Iterator<? extends T> it) {
        C7656e.m42492c(collection);
        C7656e.m42492c(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    static void m42495b(Iterator<?> it) {
        C7656e.m42492c(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: c */
    static <T> Iterator<T> m42496c() {
        return C7663a.INSTANCE;
    }

    /* renamed from: d */
    static <T> T m42497d(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: e */
    public static boolean m42498e(Iterator<?> it, Collection<?> collection) {
        C7656e.m42492c(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
