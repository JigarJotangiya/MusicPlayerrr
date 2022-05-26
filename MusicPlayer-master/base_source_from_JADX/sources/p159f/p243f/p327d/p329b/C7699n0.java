package p159f.p243f.p327d.p329b;

import java.util.Iterator;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.n0 */
/* compiled from: TransformedIterator */
abstract class C7699n0<F, T> implements Iterator<T> {

    /* renamed from: g */
    final Iterator<? extends F> f33043g;

    C7699n0(Iterator<? extends F> it) {
        C7656e.m42492c(it);
        this.f33043g = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo28655a(F f);

    public final boolean hasNext() {
        return this.f33043g.hasNext();
    }

    public final T next() {
        return mo28655a(this.f33043g.next());
    }

    public final void remove() {
        this.f33043g.remove();
    }
}
