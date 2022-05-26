package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class pp3 implements Iterator<String> {

    /* renamed from: g */
    final Iterator<String> f21455g;

    /* renamed from: h */
    final /* synthetic */ qp3 f21456h;

    pp3(qp3 qp3) {
        this.f21456h = qp3;
        this.f21455g = qp3.f21992g.iterator();
    }

    public final boolean hasNext() {
        return this.f21455g.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f21455g.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
