package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class su2<V> {

    /* renamed from: a */
    private long[] f23630a = new long[10];

    /* renamed from: b */
    private V[] f23631b = new Object[10];

    /* renamed from: c */
    private int f23632c;

    /* renamed from: d */
    private int f23633d;

    public su2(int i) {
    }

    /* renamed from: f */
    private final V m30945f() {
        gs1.m24488f(this.f23633d > 0);
        V[] vArr = this.f23631b;
        int i = this.f23632c;
        V v = vArr[i];
        vArr[i] = null;
        this.f23632c = (i + 1) % vArr.length;
        this.f23633d--;
        return v;
    }

    /* renamed from: a */
    public final synchronized int mo20963a() {
        return this.f23633d;
    }

    /* renamed from: b */
    public final synchronized V mo20964b() {
        if (this.f23633d == 0) {
            return null;
        }
        return m30945f();
    }

    /* renamed from: c */
    public final synchronized V mo20965c(long j) {
        V v;
        v = null;
        while (true) {
            if (this.f23633d <= 0) {
                break;
            } else if (j - this.f23630a[this.f23632c] < 0) {
                break;
            } else {
                v = m30945f();
            }
        }
        return v;
    }

    /* renamed from: d */
    public final synchronized void mo20966d(long j, V v) {
        int i = this.f23633d;
        if (i > 0) {
            if (j <= this.f23630a[((this.f23632c + i) - 1) % this.f23631b.length]) {
                mo20967e();
            }
        }
        int length = this.f23631b.length;
        if (this.f23633d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = new Object[i2];
            int i3 = this.f23632c;
            int i4 = length - i3;
            System.arraycopy(this.f23630a, i3, jArr, 0, i4);
            System.arraycopy(this.f23631b, this.f23632c, vArr, 0, i4);
            int i5 = this.f23632c;
            if (i5 > 0) {
                System.arraycopy(this.f23630a, 0, jArr, i4, i5);
                System.arraycopy(this.f23631b, 0, vArr, i4, this.f23632c);
            }
            this.f23630a = jArr;
            this.f23631b = vArr;
            this.f23632c = 0;
        }
        int i6 = this.f23632c;
        int i7 = this.f23633d;
        V[] vArr2 = this.f23631b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f23630a[length2] = j;
        vArr2[length2] = v;
        this.f23633d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void mo20967e() {
        this.f23632c = 0;
        this.f23633d = 0;
        Arrays.fill(this.f23631b, (Object) null);
    }
}
