package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class w23 extends AbstractCollection {

    /* renamed from: g */
    final Object f25195g;

    /* renamed from: h */
    Collection f25196h;

    /* renamed from: i */
    final w23 f25197i;

    /* renamed from: j */
    final Collection f25198j;

    /* renamed from: k */
    final /* synthetic */ z23 f25199k;

    w23(z23 z23, Object obj, Collection collection, w23 w23) {
        this.f25199k = z23;
        this.f25195g = obj;
        this.f25196h = collection;
        this.f25197i = w23;
        this.f25198j = w23 == null ? null : w23.f25196h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21684a() {
        Collection collection;
        w23 w23 = this.f25197i;
        if (w23 != null) {
            w23.mo21684a();
            if (this.f25197i.f25196h != this.f25198j) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f25196h.isEmpty() && (collection = (Collection) this.f25199k.f26647j.get(this.f25195g)) != null) {
            this.f25196h = collection;
        }
    }

    public final boolean add(Object obj) {
        mo21684a();
        boolean isEmpty = this.f25196h.isEmpty();
        boolean add = this.f25196h.add(obj);
        if (add) {
            z23 z23 = this.f25199k;
            z23.f26648k = z23.f26648k + 1;
            if (isEmpty) {
                mo21690d();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f25196h.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f25196h.size();
        z23 z23 = this.f25199k;
        z23.f26648k = z23.f26648k + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo21690d();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f25196h.clear();
            z23 z23 = this.f25199k;
            z23.f26648k = z23.f26648k - size;
            mo21694p();
        }
    }

    public final boolean contains(Object obj) {
        mo21684a();
        return this.f25196h.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        mo21684a();
        return this.f25196h.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo21690d() {
        w23 w23 = this.f25197i;
        if (w23 != null) {
            w23.mo21690d();
        } else {
            this.f25199k.f26647j.put(this.f25195g, this.f25196h);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo21684a();
        return this.f25196h.equals(obj);
    }

    public final int hashCode() {
        mo21684a();
        return this.f25196h.hashCode();
    }

    public final Iterator iterator() {
        mo21684a();
        return new v23(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo21694p() {
        w23 w23 = this.f25197i;
        if (w23 != null) {
            w23.mo21694p();
        } else if (this.f25196h.isEmpty()) {
            this.f25199k.f26647j.remove(this.f25195g);
        }
    }

    public final boolean remove(Object obj) {
        mo21684a();
        boolean remove = this.f25196h.remove(obj);
        if (remove) {
            z23 z23 = this.f25199k;
            z23.f26648k = z23.f26648k - 1;
            mo21694p();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f25196h.removeAll(collection);
        if (removeAll) {
            int size2 = this.f25196h.size();
            z23 z23 = this.f25199k;
            z23.f26648k = z23.f26648k + (size2 - size);
            mo21694p();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f25196h.retainAll(collection);
        if (retainAll) {
            int size2 = this.f25196h.size();
            z23 z23 = this.f25199k;
            z23.f26648k = z23.f26648k + (size2 - size);
            mo21694p();
        }
        return retainAll;
    }

    public final int size() {
        mo21684a();
        return this.f25196h.size();
    }

    public final String toString() {
        mo21684a();
        return this.f25196h.toString();
    }
}
