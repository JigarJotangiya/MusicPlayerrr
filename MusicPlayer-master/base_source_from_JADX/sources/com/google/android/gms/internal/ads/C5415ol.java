package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ol */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5415ol {

    /* renamed from: a */
    private int f21026a;

    /* renamed from: b */
    private long[] f21027b = new long[32];

    public C5415ol(int i) {
    }

    /* renamed from: a */
    public final int mo20016a() {
        return this.f21026a;
    }

    /* renamed from: b */
    public final long mo20017b(int i) {
        if (i >= 0 && i < this.f21026a) {
            return this.f21027b[i];
        }
        int i2 = this.f21026a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo20018c(long j) {
        int i = this.f21026a;
        long[] jArr = this.f21027b;
        if (i == jArr.length) {
            this.f21027b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f21027b;
        int i2 = this.f21026a;
        this.f21026a = i2 + 1;
        jArr2[i2] = j;
    }
}
