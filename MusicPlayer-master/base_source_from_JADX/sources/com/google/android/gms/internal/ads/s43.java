package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s43 extends j63 {

    /* renamed from: g */
    boolean f23331g;

    /* renamed from: h */
    final /* synthetic */ Object f23332h;

    s43(Object obj) {
        this.f23332h = obj;
    }

    public final boolean hasNext() {
        return !this.f23331g;
    }

    public final Object next() {
        if (!this.f23331g) {
            this.f23331g = true;
            return this.f23332h;
        }
        throw new NoSuchElementException();
    }
}
