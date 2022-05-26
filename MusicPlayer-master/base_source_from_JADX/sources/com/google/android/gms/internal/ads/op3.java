package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class op3 implements ListIterator<String> {

    /* renamed from: g */
    final ListIterator<String> f21116g;

    /* renamed from: h */
    final /* synthetic */ int f21117h;

    /* renamed from: i */
    final /* synthetic */ qp3 f21118i;

    op3(qp3 qp3, int i) {
        this.f21118i = qp3;
        this.f21117h = i;
        this.f21116g = qp3.f21992g.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f21116g.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f21116g.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f21116g.next();
    }

    public final int nextIndex() {
        return this.f21116g.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f21116g.previous();
    }

    public final int previousIndex() {
        return this.f21116g.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
