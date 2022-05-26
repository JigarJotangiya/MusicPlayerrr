package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class n23<T> implements Iterator<T> {

    /* renamed from: g */
    final Iterator<Map.Entry> f20469g;

    /* renamed from: h */
    Object f20470h;

    /* renamed from: i */
    Collection f20471i = null;

    /* renamed from: j */
    Iterator f20472j = u43.INSTANCE;

    /* renamed from: k */
    final /* synthetic */ z23 f20473k;

    n23(z23 z23) {
        this.f20473k = z23;
        this.f20469g = z23.f26647j.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f20469g.hasNext() || this.f20472j.hasNext();
    }

    public final T next() {
        if (!this.f20472j.hasNext()) {
            Map.Entry next = this.f20469g.next();
            this.f20470h = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f20471i = collection;
            this.f20472j = collection.iterator();
        }
        return this.f20472j.next();
    }

    public final void remove() {
        this.f20472j.remove();
        Collection collection = this.f20471i;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f20469g.remove();
        }
        z23 z23 = this.f20473k;
        z23.f26648k = z23.f26648k - 1;
    }
}
