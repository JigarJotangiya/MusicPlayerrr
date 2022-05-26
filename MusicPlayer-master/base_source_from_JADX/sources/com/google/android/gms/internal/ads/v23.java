package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class v23 implements Iterator {

    /* renamed from: g */
    final Iterator f24560g;

    /* renamed from: h */
    final Collection f24561h;

    /* renamed from: i */
    final /* synthetic */ w23 f24562i;

    v23(w23 w23) {
        Iterator it;
        this.f24562i = w23;
        Collection collection = w23.f25196h;
        this.f24561h = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f24560g = it;
    }

    v23(w23 w23, Iterator it) {
        this.f24562i = w23;
        this.f24561h = w23.f25196h;
        this.f24560g = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21413a() {
        this.f24562i.mo21684a();
        if (this.f24562i.f25196h != this.f24561h) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo21413a();
        return this.f24560g.hasNext();
    }

    public final Object next() {
        mo21413a();
        return this.f24560g.next();
    }

    public final void remove() {
        this.f24560g.remove();
        z23 z23 = this.f24562i.f25199k;
        z23.f26648k = z23.f26648k - 1;
        this.f24562i.mo21694p();
    }
}
