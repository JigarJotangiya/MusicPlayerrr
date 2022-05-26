package p159f.p243f.p327d.p329b;

import java.util.Collection;
import java.util.Objects;
import p159f.p243f.p327d.p328a.C7655d;
import p159f.p243f.p327d.p328a.C7656e;
import p159f.p243f.p327d.p329b.C7683h0;
import p159f.p243f.p327d.p329b.C7696m0;

/* renamed from: f.f.d.b.i0 */
/* compiled from: Multisets */
public final class C7686i0 {

    /* renamed from: f.f.d.b.i0$a */
    /* compiled from: Multisets */
    static abstract class C7687a<E> implements C7683h0.C7684a<E> {
        C7687a() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7683h0.C7684a)) {
                return false;
            }
            C7683h0.C7684a aVar = (C7683h0.C7684a) obj;
            if (getCount() != aVar.getCount() || !C7655d.m42489a(mo28712a(), aVar.mo28712a())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object a = mo28712a();
            if (a == null) {
                i = 0;
            } else {
                i = a.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(mo28712a());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    /* renamed from: f.f.d.b.i0$b */
    /* compiled from: Multisets */
    static abstract class C7688b<E> extends C7696m0.C7697a<C7683h0.C7684a<E>> {
        C7688b() {
        }

        public void clear() {
            mo28727d().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C7683h0.C7684a)) {
                return false;
            }
            C7683h0.C7684a aVar = (C7683h0.C7684a) obj;
            if (aVar.getCount() > 0 && mo28727d().mo28707m(aVar.mo28712a()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C7683h0<E> mo28727d();

        public boolean remove(Object obj) {
            if (obj instanceof C7683h0.C7684a) {
                C7683h0.C7684a aVar = (C7683h0.C7684a) obj;
                Object a = aVar.mo28712a();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo28727d().setCount(a, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static <E> boolean m42533a(C7683h0<E> h0Var, C7683h0<? extends E> h0Var2) {
        if (h0Var2.isEmpty()) {
            return false;
        }
        Objects.requireNonNull(h0Var);
        h0Var2.mo28718l(new C7700o(h0Var));
        return true;
    }

    /* renamed from: b */
    static <E> boolean m42534b(C7683h0<E> h0Var, Collection<? extends E> collection) {
        C7656e.m42492c(h0Var);
        C7656e.m42492c(collection);
        if (collection instanceof C7683h0) {
            return m42533a(h0Var, m42535c(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return C7662c0.m42494a(h0Var, collection.iterator());
    }

    /* renamed from: c */
    static <T> C7683h0<T> m42535c(Iterable<T> iterable) {
        return (C7683h0) iterable;
    }

    /* renamed from: d */
    static boolean m42536d(C7683h0<?> h0Var, Object obj) {
        if (obj == h0Var) {
            return true;
        }
        if (obj instanceof C7683h0) {
            C7683h0 h0Var2 = (C7683h0) obj;
            if (h0Var.size() == h0Var2.size() && h0Var.entrySet().size() == h0Var2.entrySet().size()) {
                for (C7683h0.C7684a aVar : h0Var2.entrySet()) {
                    if (h0Var.mo28707m(aVar.mo28712a()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static boolean m42537e(C7683h0<?> h0Var, Collection<?> collection) {
        if (collection instanceof C7683h0) {
            collection = ((C7683h0) collection).mo28705h();
        }
        return h0Var.mo28705h().removeAll(collection);
    }

    /* renamed from: f */
    static boolean m42538f(C7683h0<?> h0Var, Collection<?> collection) {
        C7656e.m42492c(collection);
        if (collection instanceof C7683h0) {
            collection = ((C7683h0) collection).mo28705h();
        }
        return h0Var.mo28705h().retainAll(collection);
    }

    /* renamed from: g */
    static <E> int m42539g(C7683h0<E> h0Var, E e, int i) {
        C7730w.m42604a(i, "count");
        int m = h0Var.mo28707m(e);
        int i2 = i - m;
        if (i2 > 0) {
            h0Var.add(e, i2);
        } else if (i2 < 0) {
            h0Var.remove(e, -i2);
        }
        return m;
    }

    /* renamed from: h */
    static <E> boolean m42540h(C7683h0<E> h0Var, E e, int i, int i2) {
        C7730w.m42604a(i, "oldCount");
        C7730w.m42604a(i2, "newCount");
        if (h0Var.mo28707m(e) != i) {
            return false;
        }
        h0Var.setCount(e, i2);
        return true;
    }
}
