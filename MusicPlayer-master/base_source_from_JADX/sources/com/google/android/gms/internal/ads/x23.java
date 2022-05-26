package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class x23 extends v23 implements ListIterator {

    /* renamed from: j */
    final /* synthetic */ y23 f25630j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x23(y23 y23) {
        super(y23);
        this.f25630j = y23;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f25630j.isEmpty();
        mo21413a();
        ((ListIterator) this.f24560g).add(obj);
        z23 z23 = this.f25630j.f26235l;
        z23.f26648k = z23.f26648k + 1;
        if (isEmpty) {
            this.f25630j.mo21690d();
        }
    }

    public final boolean hasPrevious() {
        mo21413a();
        return ((ListIterator) this.f24560g).hasPrevious();
    }

    public final int nextIndex() {
        mo21413a();
        return ((ListIterator) this.f24560g).nextIndex();
    }

    public final Object previous() {
        mo21413a();
        return ((ListIterator) this.f24560g).previous();
    }

    public final int previousIndex() {
        mo21413a();
        return ((ListIterator) this.f24560g).previousIndex();
    }

    public final void set(Object obj) {
        mo21413a();
        ((ListIterator) this.f24560g).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x23(y23 y23, int i) {
        super(y23, ((List) y23.f25196h).listIterator(i));
        this.f25630j = y23;
    }
}
