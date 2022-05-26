package p082e.p126k.p129c.p131j;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.c */
/* compiled from: AbstractProtobufList */
abstract class C3910c<E> extends AbstractList<E> implements C3899b0.C3908i<E> {

    /* renamed from: g */
    private boolean f11984g = true;

    C3910c() {
    }

    public boolean add(E e) {
        mo13468d();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo13468d();
        return super.addAll(collection);
    }

    public void clear() {
        mo13468d();
        super.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo13468d() {
        if (!this.f11984g) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo13463g() {
        this.f11984g = false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: r */
    public boolean mo13464r() {
        return this.f11984g;
    }

    public boolean remove(Object obj) {
        mo13468d();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo13468d();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo13468d();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo13468d();
        return super.addAll(i, collection);
    }
}
