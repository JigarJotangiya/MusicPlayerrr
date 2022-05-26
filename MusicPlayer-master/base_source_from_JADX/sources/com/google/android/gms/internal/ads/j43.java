package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j43<K, V> {

    /* renamed from: a */
    Object[] f18361a;

    /* renamed from: b */
    int f18362b;

    public j43() {
        this(4);
    }

    /* renamed from: d */
    private final void m25531d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f18361a;
        int length = objArr.length;
        if (i2 > length) {
            this.f18361a = Arrays.copyOf(objArr, a43.m20595b(length, i2));
        }
    }

    /* renamed from: a */
    public final j43<K, V> mo18541a(K k, V v) {
        m25531d(this.f18362b + 1);
        e33.m22835b(k, v);
        Object[] objArr = this.f18361a;
        int i = this.f18362b;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.f18362b = i + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends java.util.Map$Entry<? extends K, ? extends V>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.j43<K, V> mo18542b(java.lang.Iterable<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.f18362b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m25531d(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.mo18541a(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j43.mo18542b(java.lang.Iterable):com.google.android.gms.internal.ads.j43");
    }

    /* renamed from: c */
    public final k43<K, V> mo18543c() {
        return a63.zzh(this.f18362b, this.f18361a);
    }

    j43(int i) {
        this.f18361a = new Object[(i + i)];
        this.f18362b = 0;
    }
}
