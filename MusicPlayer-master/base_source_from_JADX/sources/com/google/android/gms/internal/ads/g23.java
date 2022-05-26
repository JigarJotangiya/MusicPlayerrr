package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class g23<E> extends k63<E> {

    /* renamed from: g */
    private final int f16879g;

    /* renamed from: h */
    private int f16880h;

    protected g23(int i, int i2) {
        s13.m30499b(i2, i, "index");
        this.f16879g = i;
        this.f16880h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo17116a(int i);

    public final boolean hasNext() {
        return this.f16880h < this.f16879g;
    }

    public final boolean hasPrevious() {
        return this.f16880h > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f16880h;
            this.f16880h = i + 1;
            return mo17116a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f16880h;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f16880h - 1;
            this.f16880h = i;
            return mo17116a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f16880h - 1;
    }
}
