package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class y23 extends w23 implements List {

    /* renamed from: l */
    final /* synthetic */ z23 f26235l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y23(z23 z23, Object obj, List list, w23 w23) {
        super(z23, obj, list, w23);
        this.f26235l = z23;
    }

    public final void add(int i, Object obj) {
        mo21684a();
        boolean isEmpty = this.f25196h.isEmpty();
        ((List) this.f25196h).add(i, obj);
        z23 z23 = this.f26235l;
        z23.f26648k = z23.f26648k + 1;
        if (isEmpty) {
            mo21690d();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f25196h).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f25196h.size();
        z23 z23 = this.f26235l;
        z23.f26648k = z23.f26648k + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo21690d();
        return true;
    }

    public final Object get(int i) {
        mo21684a();
        return ((List) this.f25196h).get(i);
    }

    public final int indexOf(Object obj) {
        mo21684a();
        return ((List) this.f25196h).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        mo21684a();
        return ((List) this.f25196h).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo21684a();
        return new x23(this);
    }

    public final Object remove(int i) {
        mo21684a();
        Object remove = ((List) this.f25196h).remove(i);
        z23 z23 = this.f26235l;
        z23.f26648k = z23.f26648k - 1;
        mo21694p();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo21684a();
        return ((List) this.f25196h).set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo21684a();
        z23 z23 = this.f26235l;
        Object obj = this.f25195g;
        List subList = ((List) this.f25196h).subList(i, i2);
        w23 w23 = this.f25197i;
        if (w23 == null) {
            w23 = this;
        }
        return z23.zzh(obj, subList, w23);
    }

    public final ListIterator listIterator(int i) {
        mo21684a();
        return new x23(this, i);
    }
}
