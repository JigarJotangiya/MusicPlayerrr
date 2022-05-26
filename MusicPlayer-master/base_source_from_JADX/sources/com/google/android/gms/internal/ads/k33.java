package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class k33<T> implements Iterator<T> {

    /* renamed from: g */
    int f18749g;

    /* renamed from: h */
    int f18750h;

    /* renamed from: i */
    int f18751i = -1;

    /* renamed from: j */
    final /* synthetic */ p33 f18752j;

    /* synthetic */ k33(p33 p33, j33 j33) {
        this.f18752j = p33;
        this.f18749g = p33.f21320h;
        this.f18750h = p33.zze();
    }

    /* renamed from: b */
    private final void m26089b() {
        if (this.f18752j.f21320h != this.f18749g) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo17482a(int i);

    public final boolean hasNext() {
        return this.f18750h >= 0;
    }

    public final T next() {
        m26089b();
        if (hasNext()) {
            int i = this.f18750h;
            this.f18751i = i;
            T a = mo17482a(i);
            this.f18750h = this.f18752j.zzf(this.f18750h);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m26089b();
        s13.m30504g(this.f18751i >= 0, "no calls to next() since the last call to remove()");
        this.f18749g += 32;
        p33 p33 = this.f18752j;
        p33.remove(p33.zzg(p33, this.f18751i));
        this.f18750h--;
        this.f18751i = -1;
    }
}
