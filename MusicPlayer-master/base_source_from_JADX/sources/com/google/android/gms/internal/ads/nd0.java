package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nd0 {

    /* renamed from: a */
    public final long f20590a;

    /* renamed from: b */
    public final int f20591b;

    /* renamed from: c */
    public final Uri[] f20592c;

    /* renamed from: d */
    public final int[] f20593d;

    /* renamed from: e */
    public final long[] f20594e;

    /* renamed from: f */
    public final long f20595f;

    /* renamed from: g */
    public final boolean f20596g;

    static {
        C4900ap apVar = C4900ap.f14010a;
    }

    public nd0(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    /* renamed from: a */
    public final int mo19707a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f20593d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final nd0 mo19708b(int i) {
        int[] iArr = this.f20593d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f20594e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new nd0(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.f20592c, 0), copyOf2, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nd0.class == obj.getClass()) {
            nd0 nd0 = (nd0) obj;
            return this.f20591b == nd0.f20591b && Arrays.equals(this.f20592c, nd0.f20592c) && Arrays.equals(this.f20593d, nd0.f20593d) && Arrays.equals(this.f20594e, nd0.f20594e);
        }
    }

    public final int hashCode() {
        return ((((((this.f20591b * 961) + Arrays.hashCode(this.f20592c)) * 31) + Arrays.hashCode(this.f20593d)) * 31) + Arrays.hashCode(this.f20594e)) * 961;
    }

    private nd0(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        gs1.m24486d(iArr.length == uriArr.length);
        this.f20590a = 0;
        this.f20591b = i;
        this.f20593d = iArr;
        this.f20592c = uriArr;
        this.f20594e = jArr;
        this.f20595f = 0;
        this.f20596g = false;
    }
}
