package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pr3<E> extends AbstractList<E> {

    /* renamed from: i */
    private static final qr3 f21494i = qr3.m29672b(pr3.class);

    /* renamed from: g */
    final List<E> f21495g;

    /* renamed from: h */
    final Iterator<E> f21496h;

    public pr3(List<E> list, Iterator<E> it) {
        this.f21495g = list;
        this.f21496h = it;
    }

    public final E get(int i) {
        if (this.f21495g.size() > i) {
            return this.f21495g.get(i);
        }
        if (this.f21496h.hasNext()) {
            this.f21495g.add(this.f21496h.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator<E> iterator() {
        return new or3(this);
    }

    public final int size() {
        qr3 qr3 = f21494i;
        qr3.mo19279a("potentially expensive size() call");
        qr3.mo19279a("blowup running");
        while (this.f21496h.hasNext()) {
            this.f21495g.add(this.f21496h.next());
        }
        return this.f21495g.size();
    }
}
