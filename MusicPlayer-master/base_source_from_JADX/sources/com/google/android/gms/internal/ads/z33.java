package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class z33<E> extends a43<E> {

    /* renamed from: a */
    Object[] f26656a;

    /* renamed from: b */
    int f26657b = 0;

    /* renamed from: c */
    boolean f26658c;

    z33(int i) {
        this.f26656a = new Object[i];
    }

    /* renamed from: e */
    private final void m34410e(int i) {
        Object[] objArr = this.f26656a;
        int length = objArr.length;
        if (length < i) {
            this.f26656a = Arrays.copyOf(objArr, a43.m20595b(length, i));
            this.f26658c = false;
        } else if (this.f26658c) {
            this.f26656a = (Object[]) objArr.clone();
            this.f26658c = false;
        }
    }

    /* renamed from: c */
    public final z33<E> mo22329c(E e) {
        Objects.requireNonNull(e);
        m34410e(this.f26657b + 1);
        Object[] objArr = this.f26656a;
        int i = this.f26657b;
        this.f26657b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.a43<E> mo22330d(java.lang.Iterable<? extends E> r3) {
        /*
            r2 = this;
            int r0 = r2.f26657b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m34410e(r0)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.b43
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.next()
            r2.mo15684a(r0)
            goto L_0x0012
        L_0x0020:
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.b43 r3 = (com.google.android.gms.internal.ads.b43) r3
            java.lang.Object[] r0 = r2.f26656a
            int r1 = r2.f26657b
            int r3 = r3.zza(r0, r1)
            r2.f26657b = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z33.mo22330d(java.lang.Iterable):com.google.android.gms.internal.ads.a43");
    }
}
