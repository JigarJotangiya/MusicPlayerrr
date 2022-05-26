package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.h0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5135h0 implements C5060f0 {

    /* renamed from: a */
    private final long f17464a;

    /* renamed from: b */
    private final int f17465b;

    /* renamed from: c */
    private final long f17466c;

    /* renamed from: d */
    private final long f17467d;

    /* renamed from: e */
    private final long f17468e;

    /* renamed from: f */
    private final long[] f17469f;

    private C5135h0(long j, int i, long j2, long j3, long[] jArr) {
        this.f17464a = j;
        this.f17465b = i;
        this.f17466c = j2;
        this.f17469f = jArr;
        this.f17467d = j3;
        this.f17468e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: b */
    public static C5135h0 m24603b(long j, long j2, t94 t94, no2 no2) {
        int v;
        long j3 = j;
        t94 t942 = t94;
        int i = t942.f23804g;
        int i2 = t942.f23801d;
        int m = no2.mo19786m();
        if ((m & 1) != 1 || (v = no2.mo19795v()) == 0) {
            return null;
        }
        long Z = wy2.m33431Z((long) v, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new C5135h0(j2, t942.f23800c, Z, -1, (long[]) null);
        }
        long A = no2.mo19766A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) no2.mo19792s();
        }
        if (j3 != -1) {
            long j4 = j2 + A;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new C5135h0(j2, t942.f23800c, Z, A, jArr);
    }

    /* renamed from: d */
    private final long m24604d(int i) {
        return (this.f17466c * ((long) i)) / 100;
    }

    /* renamed from: a */
    public final long mo15606a() {
        return this.f17468e;
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        double d;
        if (!mo15608e()) {
            aa4 aa4 = new aa4(0, this.f17464a + ((long) this.f17465b));
            return new x94(aa4, aa4);
        }
        long U = wy2.m33426U(j, 0, this.f17466c);
        double d2 = (((double) U) * 100.0d) / ((double) this.f17466c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f17469f;
                gs1.m24484b(jArr);
                long[] jArr2 = jArr;
                double d4 = (double) jArr2[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr2[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        aa4 aa42 = new aa4(U, this.f17464a + wy2.m33426U(Math.round((d3 / 256.0d) * ((double) this.f17467d)), (long) this.f17465b, this.f17467d - 1));
        return new x94(aa42, aa42);
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return this.f17469f != null;
    }

    /* renamed from: g */
    public final long mo15609g(long j) {
        long j2;
        long j3 = j - this.f17464a;
        if (!mo15608e() || j3 <= ((long) this.f17465b)) {
            return 0;
        }
        long[] jArr = this.f17469f;
        gs1.m24484b(jArr);
        long[] jArr2 = jArr;
        double d = (((double) j3) * 256.0d) / ((double) this.f17467d);
        int J = wy2.m33415J(jArr2, (long) d, true, true);
        long d2 = m24604d(J);
        long j4 = jArr2[J];
        int i = J + 1;
        long d3 = m24604d(i);
        if (J == 99) {
            j2 = 256;
        } else {
            j2 = jArr2[i];
        }
        return d2 + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (d3 - d2)));
    }

    public final long zze() {
        return this.f17466c;
    }
}
