package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class h63<F, T> implements Iterator<T> {

    /* renamed from: g */
    final Iterator<? extends F> f17556g;

    h63(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f17556g = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo15688a(F f);

    public final boolean hasNext() {
        return this.f17556g.hasNext();
    }

    public final T next() {
        return mo15688a(this.f17556g.next());
    }

    public final void remove() {
        this.f17556g.remove();
    }
}
