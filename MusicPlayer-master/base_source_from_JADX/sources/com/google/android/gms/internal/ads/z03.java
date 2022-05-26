package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
abstract class z03<T> implements Iterator<T> {

    /* renamed from: g */
    private T f26616g;

    /* renamed from: h */
    private int f26617h = 2;

    protected z03() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22314a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo22315b() {
        this.f26617h = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f26617h;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f26617h = 4;
                    this.f26616g = mo22314a();
                    if (this.f26617h != 3) {
                        this.f26617h = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f26617h = 2;
            T t = this.f26616g;
            this.f26616g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
