package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.g0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5098g0 implements C5060f0 {

    /* renamed from: a */
    private final long[] f16830a;

    /* renamed from: b */
    private final long[] f16831b;

    /* renamed from: c */
    private final long f16832c;

    /* renamed from: d */
    private final long f16833d;

    private C5098g0(long[] jArr, long[] jArr2, long j, long j2) {
        this.f16830a = jArr;
        this.f16831b = jArr2;
        this.f16832c = j;
        this.f16833d = j2;
    }

    /* renamed from: b */
    public static C5098g0 m24038b(long j, long j2, t94 t94, no2 no2) {
        int i;
        long j3 = j;
        t94 t942 = t94;
        no2 no22 = no2;
        no22.mo19780g(10);
        int m = no2.mo19786m();
        if (m <= 0) {
            return null;
        }
        int i2 = t942.f23801d;
        long Z = wy2.m33431Z((long) m, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int w = no2.mo19796w();
        int w2 = no2.mo19796w();
        int w3 = no2.mo19796w();
        no22.mo19780g(2);
        long j4 = j2 + ((long) t942.f23800c);
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i3 = 0;
        long j5 = j2;
        while (i3 < w) {
            int i4 = w2;
            jArr[i3] = (((long) i3) * Z) / ((long) w);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (w3 == 1) {
                i = no2.mo19792s();
            } else if (w3 == 2) {
                i = no2.mo19796w();
            } else if (w3 == 3) {
                i = no2.mo19794u();
            } else if (w3 != 4) {
                return null;
            } else {
                i = no2.mo19795v();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            w2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new C5098g0(jArr, jArr2, Z, j5);
    }

    /* renamed from: a */
    public final long mo15606a() {
        return this.f16833d;
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        int J = wy2.m33415J(this.f16830a, j, true, true);
        long[] jArr = this.f16830a;
        aa4 aa4 = new aa4(jArr[J], this.f16831b[J]);
        if (aa4.f13832a >= j || J == jArr.length - 1) {
            return new x94(aa4, aa4);
        }
        int i = J + 1;
        return new x94(aa4, new aa4(jArr[i], this.f16831b[i]));
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    /* renamed from: g */
    public final long mo15609g(long j) {
        return this.f16830a[wy2.m33415J(this.f16831b, j, true, true)];
    }

    public final long zze() {
        return this.f16832c;
    }
}
