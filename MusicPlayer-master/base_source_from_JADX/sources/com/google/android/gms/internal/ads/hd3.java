package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hd3 {

    /* renamed from: a */
    private final long f17621a;

    /* renamed from: b */
    private final long f17622b;

    /* renamed from: c */
    private long f17623c = -9223372036854775807L;

    /* renamed from: d */
    private long f17624d = -9223372036854775807L;

    /* renamed from: e */
    private long f17625e = -9223372036854775807L;

    /* renamed from: f */
    private long f17626f = -9223372036854775807L;

    /* renamed from: g */
    private long f17627g = -9223372036854775807L;

    /* renamed from: h */
    private long f17628h = -9223372036854775807L;

    /* renamed from: i */
    private float f17629i = 1.03f;

    /* renamed from: j */
    private float f17630j = 0.97f;

    /* renamed from: k */
    private float f17631k = 1.0f;

    /* renamed from: l */
    private long f17632l = -9223372036854775807L;

    /* renamed from: m */
    private long f17633m = -9223372036854775807L;

    /* renamed from: n */
    private long f17634n = -9223372036854775807L;

    /* synthetic */ hd3(float f, float f2, long j, float f3, long j2, long j3, float f4, gc3 gc3) {
        this.f17621a = j2;
        this.f17622b = j3;
    }

    /* renamed from: f */
    private static long m24772f(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: g */
    private final void m24773g() {
        long j = this.f17623c;
        if (j != -9223372036854775807L) {
            long j2 = this.f17624d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f17626f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f17627g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f17625e != j) {
            this.f17625e = j;
            this.f17628h = j;
            this.f17633m = -9223372036854775807L;
            this.f17634n = -9223372036854775807L;
            this.f17632l = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public final float mo18124a(long j, long j2) {
        long j3;
        if (this.f17623c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f17633m;
        if (j5 == -9223372036854775807L) {
            this.f17633m = j4;
            this.f17634n = 0;
        } else {
            long max = Math.max(j4, m24772f(j5, j4, 0.999f));
            this.f17633m = max;
            this.f17634n = m24772f(this.f17634n, Math.abs(j4 - max), 0.999f);
        }
        if (this.f17632l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f17632l < 1000) {
            return this.f17631k;
        }
        this.f17632l = SystemClock.elapsedRealtime();
        long j6 = this.f17633m + (this.f17634n * 3);
        if (this.f17628h > j6) {
            long c = bw3.m21569c(1000);
            float f = (float) c;
            long[] jArr = {j6, this.f17625e, this.f17628h - (((long) ((this.f17631k - 4.0f) * f)) + ((long) ((this.f17629i - 4.0f) * f)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f17628h = j3;
        } else {
            j3 = wy2.m33426U(j - ((long) (Math.max(0.0f, this.f17631k - 4.0f) / 1.0E-7f)), this.f17628h, j6);
            this.f17628h = j3;
            long j8 = this.f17627g;
            if (j8 != -9223372036854775807L && j3 > j8) {
                this.f17628h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f17621a) {
            this.f17631k = 1.0f;
            return 1.0f;
        }
        float A = wy2.m33406A((((float) j9) * 1.0E-7f) + 1.0f, this.f17630j, this.f17629i);
        this.f17631k = A;
        return A;
    }

    /* renamed from: b */
    public final long mo18125b() {
        return this.f17628h;
    }

    /* renamed from: c */
    public final void mo18126c() {
        long j = this.f17628h;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f17622b;
            this.f17628h = j2;
            long j3 = this.f17627g;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f17628h = j3;
            }
            this.f17632l = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void mo18127d(C5040eh ehVar) {
        long j = ehVar.f15945a;
        this.f17623c = bw3.m21569c(-9223372036854775807L);
        long j2 = ehVar.f15946b;
        this.f17626f = bw3.m21569c(-9223372036854775807L);
        long j3 = ehVar.f15947c;
        this.f17627g = bw3.m21569c(-9223372036854775807L);
        float f = ehVar.f15948d;
        this.f17630j = 0.97f;
        float f2 = ehVar.f15949e;
        this.f17629i = 1.03f;
        m24773g();
    }

    /* renamed from: e */
    public final void mo18128e(long j) {
        this.f17624d = j;
        m24773g();
    }
}
