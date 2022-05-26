package p159f.p243f.p327d.p329b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.ObjIntConsumer;
import p159f.p243f.p327d.p329b.C7683h0;
import p159f.p243f.p327d.p329b.C7686i0;

/* renamed from: f.f.d.b.u */
/* compiled from: AbstractMultiset */
abstract class C7727u<E> extends AbstractCollection<E> implements C7683h0<E> {

    /* renamed from: g */
    private transient Set<C7683h0.C7684a<E>> f33087g;

    /* renamed from: f.f.d.b.u$a */
    /* compiled from: AbstractMultiset */
    class C7728a extends C7686i0.C7688b<E> {
        C7728a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C7683h0<E> mo28727d() {
            return C7727u.this;
        }

        public Iterator<C7683h0.C7684a<E>> iterator() {
            return C7727u.this.entryIterator();
        }

        public int size() {
            return C7727u.this.distinctElements();
        }
    }

    C7727u() {
    }

    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return C7686i0.m42534b(this, collection);
    }

    /* access modifiers changed from: package-private */
    public Set<C7683h0.C7684a<E>> createEntrySet() {
        return new C7728a();
    }

    /* access modifiers changed from: package-private */
    public abstract int distinctElements();

    /* access modifiers changed from: package-private */
    public abstract Iterator<C7683h0.C7684a<E>> entryIterator();

    public Set<C7683h0.C7684a<E>> entrySet() {
        Set<C7683h0.C7684a<E>> set = this.f33087g;
        if (set != null) {
            return set;
        }
        Set<C7683h0.C7684a<E>> createEntrySet = createEntrySet();
        this.f33087g = createEntrySet;
        return createEntrySet;
    }

    public final boolean equals(Object obj) {
        return C7686i0.m42536d(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* renamed from: l */
    public /* synthetic */ void mo28718l(ObjIntConsumer objIntConsumer) {
        C7681g0.m42527a(this, objIntConsumer);
    }

    public abstract int remove(Object obj, int i);

    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        return C7686i0.m42537e(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return C7686i0.m42538f(this, collection);
    }

    public int setCount(E e, int i) {
        return C7686i0.m42539g(this, e, i);
    }

    public final String toString() {
        return entrySet().toString();
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        return C7686i0.m42540h(this, e, i, i2);
    }
}
