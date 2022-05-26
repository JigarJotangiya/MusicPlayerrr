package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o23 implements Iterator {

    /* renamed from: g */
    Map.Entry f20882g;

    /* renamed from: h */
    final /* synthetic */ Iterator f20883h;

    /* renamed from: i */
    final /* synthetic */ p23 f20884i;

    o23(p23 p23, Iterator it) {
        this.f20884i = p23;
        this.f20883h = it;
    }

    public final boolean hasNext() {
        return this.f20883h.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f20883h.next();
        this.f20882g = entry;
        return entry.getKey();
    }

    public final void remove() {
        s13.m30504g(this.f20882g != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f20882g.getValue();
        this.f20883h.remove();
        z23 z23 = this.f20884i.f21302h;
        z23.f26648k = z23.f26648k - collection.size();
        collection.clear();
        this.f20882g = null;
    }
}
