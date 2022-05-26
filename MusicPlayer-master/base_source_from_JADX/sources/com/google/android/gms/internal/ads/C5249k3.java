package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.k3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5249k3 {

    /* renamed from: a */
    private final tv2 f18733a = new tv2(0);

    /* renamed from: b */
    private final no2 f18734b = new no2();

    /* renamed from: c */
    private boolean f18735c;

    /* renamed from: d */
    private boolean f18736d;

    /* renamed from: e */
    private boolean f18737e;

    /* renamed from: f */
    private long f18738f = -9223372036854775807L;

    /* renamed from: g */
    private long f18739g = -9223372036854775807L;

    /* renamed from: h */
    private long f18740h = -9223372036854775807L;

    C5249k3() {
    }

    /* renamed from: c */
    public static long m26075c(no2 no2) {
        no2 no22 = no2;
        int k = no2.mo19784k();
        if (no2.mo19782i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        no22.mo19775b(bArr, 0, 9);
        no22.mo19779f(k);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final int m26076f(z84 z84) {
        no2 no2 = this.f18734b;
        byte[] bArr = wy2.f25584f;
        int length = bArr.length;
        no2.mo19777d(bArr, 0);
        this.f18735c = true;
        z84.mo19928h();
        return 0;
    }

    /* renamed from: g */
    private static final int m26077g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int mo18791a(z84 z84, w94 w94) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f18737e) {
            long b = z84.mo16584b();
            int min = (int) Math.min(20000, b);
            long j2 = b - ((long) min);
            if (z84.zze() != j2) {
                w94.f25288a = j2;
                return 1;
            }
            this.f18734b.mo19776c(min);
            z84.mo19928h();
            ((t84) z84).mo19929i(this.f18734b.mo19781h(), 0, min, false);
            no2 no2 = this.f18734b;
            int k = no2.mo19784k();
            int l = no2.mo19785l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (m26077g(no2.mo19781h(), l) == 442) {
                    no2.mo19779f(l + 4);
                    long c = m26075c(no2);
                    if (c != -9223372036854775807L) {
                        j = c;
                        break;
                    }
                }
                l--;
            }
            this.f18739g = j;
            this.f18737e = true;
            return 0;
        } else if (this.f18739g == -9223372036854775807L) {
            m26076f(z84);
            return 0;
        } else if (!this.f18736d) {
            int min2 = (int) Math.min(20000, z84.mo16584b());
            if (z84.zze() != 0) {
                w94.f25288a = 0;
                return 1;
            }
            this.f18734b.mo19776c(min2);
            z84.mo19928h();
            ((t84) z84).mo19929i(this.f18734b.mo19781h(), 0, min2, false);
            no2 no22 = this.f18734b;
            int k2 = no22.mo19784k();
            int l2 = no22.mo19785l();
            while (true) {
                if (k2 >= l2 - 3) {
                    break;
                }
                if (m26077g(no22.mo19781h(), k2) == 442) {
                    no22.mo19779f(k2 + 4);
                    long c2 = m26075c(no22);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
                        break;
                    }
                }
                k2++;
            }
            this.f18738f = j;
            this.f18736d = true;
            return 0;
        } else {
            long j3 = this.f18738f;
            if (j3 == -9223372036854775807L) {
                m26076f(z84);
                return 0;
            }
            long b2 = this.f18733a.mo21172b(this.f18739g) - this.f18733a.mo21172b(j3);
            this.f18740h = b2;
            if (b2 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b2);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.f18740h = -9223372036854775807L;
            }
            m26076f(z84);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo18792b() {
        return this.f18740h;
    }

    /* renamed from: d */
    public final tv2 mo18793d() {
        return this.f18733a;
    }

    /* renamed from: e */
    public final boolean mo18794e() {
        return this.f18735c;
    }
}
