package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class wk3<E> extends AbstractList<E> implements ym3<E> {

    /* renamed from: g */
    private boolean f25453g = true;

    wk3() {
    }

    /* renamed from: a */
    public final void mo21838a() {
        this.f25453g = false;
    }

    public boolean add(E e) {
        mo21840d();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo21840d();
        return super.addAll(i, collection);
    }

    /* renamed from: b */
    public final boolean mo21839b() {
        return this.f25453g;
    }

    public void clear() {
        mo21840d();
        super.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo21840d() {
        if (!this.f25453g) {
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

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo21840d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo21840d();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo21840d();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo21840d();
        return super.addAll(collection);
    }
}
