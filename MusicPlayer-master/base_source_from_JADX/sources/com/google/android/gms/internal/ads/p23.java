package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class p23 extends c53 {

    /* renamed from: h */
    final /* synthetic */ z23 f21302h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p23(z23 z23, Map map) {
        super(map);
        this.f21302h = z23;
    }

    public final void clear() {
        v43.m32154b(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f14828g.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f14828g.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f14828g.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new o23(this, this.f14828g.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f14828g.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        z23 z23 = this.f21302h;
        z23.f26648k = z23.f26648k - size;
        return size > 0;
    }
}
