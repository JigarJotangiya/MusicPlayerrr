package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5582t3 {

    /* renamed from: a */
    private final tv2 f23698a = new tv2(0);

    /* renamed from: b */
    private final no2 f23699b = new no2();

    /* renamed from: c */
    private boolean f23700c;

    /* renamed from: d */
    private boolean f23701d;

    /* renamed from: e */
    private boolean f23702e;

    /* renamed from: f */
    private long f23703f = -9223372036854775807L;

    /* renamed from: g */
    private long f23704g = -9223372036854775807L;

    /* renamed from: h */
    private long f23705h = -9223372036854775807L;

    C5582t3(int i) {
    }

    /* renamed from: e */
    private final int m31040e(z84 z84) {
        no2 no2 = this.f23699b;
        byte[] bArr = wy2.f25584f;
        int length = bArr.length;
        no2.mo19777d(bArr, 0);
        this.f23700c = true;
        z84.mo19928h();
        return 0;
    }

    /* renamed from: a */
    public final int mo21005a(z84 z84, w94 w94, int i) throws IOException {
        if (i <= 0) {
            m31040e(z84);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f23702e) {
            long b = z84.mo16584b();
            int min = (int) Math.min(112800, b);
            long j2 = b - ((long) min);
            if (z84.zze() != j2) {
                w94.f25288a = j2;
                return 1;
            }
            this.f23699b.mo19776c(min);
            z84.mo19928h();
            ((t84) z84).mo19929i(this.f23699b.mo19781h(), 0, min, false);
            no2 no2 = this.f23699b;
            int k = no2.mo19784k();
            int l = no2.mo19785l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = no2.mo19781h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b2 = C5027e4.m22837b(no2, i2, i);
                            if (b2 != -9223372036854775807L) {
                                j = b2;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f23704g = j;
            this.f23702e = true;
            return 0;
        } else if (this.f23704g == -9223372036854775807L) {
            m31040e(z84);
            return 0;
        } else if (!this.f23701d) {
            int min2 = (int) Math.min(112800, z84.mo16584b());
            if (z84.zze() != 0) {
                w94.f25288a = 0;
                return 1;
            }
            this.f23699b.mo19776c(min2);
            z84.mo19928h();
            ((t84) z84).mo19929i(this.f23699b.mo19781h(), 0, min2, false);
            no2 no22 = this.f23699b;
            int k2 = no22.mo19784k();
            int l2 = no22.mo19785l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (no22.mo19781h()[k2] == 71) {
                    long b3 = C5027e4.m22837b(no22, k2, i);
                    if (b3 != -9223372036854775807L) {
                        j = b3;
                        break;
                    }
                }
                k2++;
            }
            this.f23703f = j;
            this.f23701d = true;
            return 0;
        } else {
            long j3 = this.f23703f;
            if (j3 == -9223372036854775807L) {
                m31040e(z84);
                return 0;
            }
            long b4 = this.f23698a.mo21172b(this.f23704g) - this.f23698a.mo21172b(j3);
            this.f23705h = b4;
            if (b4 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b4);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.f23705h = -9223372036854775807L;
            }
            m31040e(z84);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo21006b() {
        return this.f23705h;
    }

    /* renamed from: c */
    public final tv2 mo21007c() {
        return this.f23698a;
    }

    /* renamed from: d */
    public final boolean mo21008d() {
        return this.f23700c;
    }
}
