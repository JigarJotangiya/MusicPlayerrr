package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class or3 implements Iterator {

    /* renamed from: g */
    int f21132g = 0;

    /* renamed from: h */
    final /* synthetic */ pr3 f21133h;

    or3(pr3 pr3) {
        this.f21133h = pr3;
    }

    public final boolean hasNext() {
        return this.f21132g < this.f21133h.f21495g.size() || this.f21133h.f21496h.hasNext();
    }

    public final Object next() {
        if (this.f21132g < this.f21133h.f21495g.size()) {
            List<E> list = this.f21133h.f21495g;
            int i = this.f21132g;
            this.f21132g = i + 1;
            return list.get(i);
        }
        pr3 pr3 = this.f21133h;
        pr3.f21495g.add(pr3.f21496h.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
