package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class za2 {

    /* renamed from: a */
    private int f26717a;

    /* renamed from: b */
    private long[] f26718b = new long[32];

    public za2(int i) {
    }

    /* renamed from: a */
    public final int mo22353a() {
        return this.f26717a;
    }

    /* renamed from: b */
    public final long mo22354b(int i) {
        if (i >= 0 && i < this.f26717a) {
            return this.f26718b[i];
        }
        int i2 = this.f26717a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo22355c(long j) {
        int i = this.f26717a;
        long[] jArr = this.f26718b;
        if (i == jArr.length) {
            this.f26718b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f26718b;
        int i2 = this.f26717a;
        this.f26717a = i2 + 1;
        jArr2[i2] = j;
    }
}
