package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y64 {

    /* renamed from: a */
    private long f26281a;

    /* renamed from: b */
    private long f26282b;

    /* renamed from: c */
    private long f26283c;

    /* renamed from: d */
    private long f26284d;

    /* renamed from: e */
    private long f26285e;

    /* renamed from: f */
    private long f26286f;

    /* renamed from: g */
    private final boolean[] f26287g = new boolean[15];

    /* renamed from: h */
    private int f26288h;

    /* renamed from: a */
    public final long mo22175a() {
        long j = this.f26285e;
        if (j == 0) {
            return 0;
        }
        return this.f26286f / j;
    }

    /* renamed from: b */
    public final long mo22176b() {
        return this.f26286f;
    }

    /* renamed from: c */
    public final void mo22177c(long j) {
        long j2 = this.f26284d;
        if (j2 == 0) {
            this.f26281a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f26281a;
            this.f26282b = j3;
            this.f26286f = j3;
            this.f26285e = 1;
        } else {
            long j4 = j - this.f26283c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f26282b) <= 1000000) {
                this.f26285e++;
                this.f26286f += j4;
                boolean[] zArr = this.f26287g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f26288h--;
                }
            } else {
                boolean[] zArr2 = this.f26287g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f26288h++;
                }
            }
        }
        this.f26284d++;
        this.f26283c = j;
    }

    /* renamed from: d */
    public final void mo22178d() {
        this.f26284d = 0;
        this.f26285e = 0;
        this.f26286f = 0;
        this.f26288h = 0;
        Arrays.fill(this.f26287g, false);
    }

    /* renamed from: e */
    public final boolean mo22179e() {
        long j = this.f26284d;
        if (j == 0) {
            return false;
        }
        return this.f26287g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean mo22180f() {
        return this.f26284d > 15 && this.f26288h == 0;
    }
}
