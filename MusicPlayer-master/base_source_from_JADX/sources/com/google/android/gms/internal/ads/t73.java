package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t73 extends s73 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<w73<?>, Set<Throwable>> f23779a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater<w73<?>> f23780b;

    t73(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((r73) null);
        this.f23779a = atomicReferenceFieldUpdater;
        this.f23780b = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo20802a(w73<?> w73) {
        return this.f23780b.decrementAndGet(w73);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20803b(w73<?> w73, Set<Throwable> set, Set<Throwable> set2) {
        this.f23779a.compareAndSet(w73, (Object) null, set2);
    }
}
