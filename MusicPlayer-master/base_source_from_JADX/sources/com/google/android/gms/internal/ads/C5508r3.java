package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.r3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5508r3 implements o84 {

    /* renamed from: a */
    private final tv2 f22718a;

    /* renamed from: b */
    private final no2 f22719b = new no2();

    /* renamed from: c */
    private final int f22720c;

    public C5508r3(int i, tv2 tv2, int i2) {
        this.f22720c = i;
        this.f22718a = tv2;
    }

    /* renamed from: a */
    public final void mo18283a() {
        no2 no2 = this.f22719b;
        byte[] bArr = wy2.f25584f;
        int length = bArr.length;
        no2.mo19777d(bArr, 0);
    }

    /* renamed from: b */
    public final n84 mo18284b(z84 z84, long j) throws IOException {
        int a;
        int i;
        long j2;
        long zze = z84.zze();
        int min = (int) Math.min(112800, z84.mo16584b() - zze);
        this.f22719b.mo19776c(min);
        ((t84) z84).mo19929i(this.f22719b.mo19781h(), 0, min, false);
        no2 no2 = this.f22719b;
        int l = no2.mo19785l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (no2.mo19782i() >= 188 && (i = a + 188) <= l) {
            long b = C5027e4.m22837b(no2, (a = C5027e4.m22836a(no2.mo19781h(), no2.mo19784k(), l)), this.f22720c);
            if (b != -9223372036854775807L) {
                long b2 = this.f22718a.mo21172b(b);
                if (b2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return n84.m27763d(b2, zze);
                    }
                    j2 = zze + j4;
                } else if (100000 + b2 > j) {
                    j2 = zze + ((long) a);
                } else {
                    j4 = (long) a;
                    j5 = b2;
                }
                return n84.m27764e(j2);
            }
            no2.mo19779f(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? n84.m27765f(j5, zze + j3) : n84.f20549d;
    }
}
