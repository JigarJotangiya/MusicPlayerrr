package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class i63<F, T> extends h63<F, T> implements ListIterator<T> {
    i63(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f17556g).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f17556g).nextIndex();
    }

    public final T previous() {
        return mo15688a(((ListIterator) this.f17556g).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f17556g).previousIndex();
    }

    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
