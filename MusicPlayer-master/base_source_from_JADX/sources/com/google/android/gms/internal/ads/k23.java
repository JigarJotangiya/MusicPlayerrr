package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k23 implements Iterator<Map.Entry> {

    /* renamed from: g */
    final Iterator<Map.Entry> f18726g;

    /* renamed from: h */
    Collection f18727h;

    /* renamed from: i */
    final /* synthetic */ l23 f18728i;

    k23(l23 l23) {
        this.f18728i = l23;
        this.f18726g = l23.f19165i.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f18726g.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f18726g.next();
        this.f18727h = (Collection) next.getValue();
        return this.f18728i.mo19050b(next);
    }

    public final void remove() {
        s13.m30504g(this.f18727h != null, "no calls to next() since the last call to remove()");
        this.f18726g.remove();
        z23 z23 = this.f18728i.f19166j;
        z23.f26648k = z23.f26648k - this.f18727h.size();
        this.f18727h.clear();
        this.f18727h = null;
    }
}
