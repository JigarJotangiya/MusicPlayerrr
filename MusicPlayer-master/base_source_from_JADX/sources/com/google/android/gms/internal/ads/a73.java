package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a73 extends w63 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater<g73, Thread> f13809a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater<g73, g73> f13810b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater<h73, g73> f13811c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater<h73, z63> f13812d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater<h73, Object> f13813e;

    a73(AtomicReferenceFieldUpdater<g73, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g73, g73> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<h73, g73> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<h73, z63> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<h73, Object> atomicReferenceFieldUpdater5) {
        super((v63) null);
        this.f13809a = atomicReferenceFieldUpdater;
        this.f13810b = atomicReferenceFieldUpdater2;
        this.f13811c = atomicReferenceFieldUpdater3;
        this.f13812d = atomicReferenceFieldUpdater4;
        this.f13813e = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15703a(g73 g73, g73 g732) {
        this.f13810b.lazySet(g73, g732);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15704b(g73 g73, Thread thread) {
        this.f13809a.lazySet(g73, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo15705c(h73<?> h73, z63 z63, z63 z632) {
        return this.f13812d.compareAndSet(h73, z63, z632);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo15706d(h73<?> h73, Object obj, Object obj2) {
        return this.f13813e.compareAndSet(h73, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo15707e(h73<?> h73, g73 g73, g73 g732) {
        return this.f13811c.compareAndSet(h73, g73, g732);
    }
}
