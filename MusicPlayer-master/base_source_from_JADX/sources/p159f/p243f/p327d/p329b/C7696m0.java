package p159f.p243f.p327d.p329b;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.m0 */
/* compiled from: Sets */
public final class C7696m0 {

    /* renamed from: f.f.d.b.m0$a */
    /* compiled from: Sets */
    static abstract class C7697a<E> extends AbstractSet<E> {
        C7697a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C7696m0.m42551e(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            C7656e.m42492c(collection);
            return super.retainAll(collection);
        }
    }

    /* renamed from: a */
    static boolean m42547a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    static int m42548b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: c */
    public static <E> HashSet<E> m42549c() {
        return new HashSet<>();
    }

    /* renamed from: d */
    public static <E> HashSet<E> m42550d(int i) {
        return new HashSet<>(C7665d0.m42500a(i));
    }

    /* renamed from: e */
    static boolean m42551e(Set<?> set, Collection<?> collection) {
        C7656e.m42492c(collection);
        if (collection instanceof C7683h0) {
            collection = ((C7683h0) collection).mo28705h();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m42552f(set, collection.iterator());
        }
        return C7662c0.m42498e(set.iterator(), collection);
    }

    /* renamed from: f */
    static boolean m42552f(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
