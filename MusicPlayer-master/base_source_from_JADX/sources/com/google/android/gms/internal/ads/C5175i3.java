package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.i3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5175i3 implements o84 {

    /* renamed from: a */
    private final tv2 f17877a;

    /* renamed from: b */
    private final no2 f17878b = new no2();

    /* synthetic */ C5175i3(tv2 tv2, C5138h3 h3Var) {
        this.f17877a = tv2;
    }

    /* renamed from: a */
    public final void mo18283a() {
        no2 no2 = this.f17878b;
        byte[] bArr = wy2.f25584f;
        int length = bArr.length;
        no2.mo19777d(bArr, 0);
    }

    /* renamed from: b */
    public final n84 mo18284b(z84 z84, long j) throws IOException {
        int h;
        long j2;
        long zze = z84.zze();
        int min = (int) Math.min(20000, z84.mo16584b() - zze);
        this.f17878b.mo19776c(min);
        ((t84) z84).mo19929i(this.f17878b.mo19781h(), 0, min, false);
        no2 no2 = this.f17878b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (no2.mo19782i() >= 4) {
            if (C5212j3.m25497h(no2.mo19781h(), no2.mo19784k()) != 442) {
                no2.mo19780g(1);
            } else {
                no2.mo19780g(4);
                long c = C5249k3.m26075c(no2);
                if (c != -9223372036854775807L) {
                    long b = this.f17877a.mo21172b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return n84.m27763d(b, zze);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b > j) {
                        j2 = (long) no2.mo19784k();
                    } else {
                        i2 = no2.mo19784k();
                        j3 = b;
                    }
                    return n84.m27764e(zze + j2);
                }
                int l = no2.mo19785l();
                if (no2.mo19782i() >= 10) {
                    no2.mo19780g(9);
                    int s = no2.mo19792s() & 7;
                    if (no2.mo19782i() >= s) {
                        no2.mo19780g(s);
                        if (no2.mo19782i() >= 4) {
                            if (C5212j3.m25497h(no2.mo19781h(), no2.mo19784k()) == 443) {
                                no2.mo19780g(4);
                                int w = no2.mo19796w();
                                if (no2.mo19782i() < w) {
                                    no2.mo19779f(l);
                                } else {
                                    no2.mo19780g(w);
                                }
                            }
                            while (true) {
                                if (no2.mo19782i() < 4 || (h = C5212j3.m25497h(no2.mo19781h(), no2.mo19784k())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                no2.mo19780g(4);
                                if (no2.mo19782i() < 2) {
                                    no2.mo19779f(l);
                                    break;
                                }
                                no2.mo19779f(Math.min(no2.mo19785l(), no2.mo19784k() + no2.mo19796w()));
                            }
                        } else {
                            no2.mo19779f(l);
                        }
                    } else {
                        no2.mo19779f(l);
                    }
                } else {
                    no2.mo19779f(l);
                }
                i = no2.mo19784k();
            }
        }
        return j3 != -9223372036854775807L ? n84.m27765f(j3, zze + ((long) i)) : n84.f20549d;
    }
}
