package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q84 {
    /* renamed from: a */
    public static void m29409a(long j, no2 no2, da4[] da4Arr) {
        int i;
        while (true) {
            boolean z = true;
            if (no2.mo19782i() > 1) {
                int c = m29411c(no2);
                int c2 = m29411c(no2);
                int k = no2.mo19784k() + c2;
                if (c2 == -1 || c2 > no2.mo19782i()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    k = no2.mo19785l();
                } else if (c == 4 && c2 >= 8) {
                    int s = no2.mo19792s();
                    int w = no2.mo19796w();
                    if (w == 49) {
                        i = no2.mo19786m();
                        w = 49;
                    } else {
                        i = 0;
                    }
                    int s2 = no2.mo19792s();
                    if (w == 47) {
                        no2.mo19780g(1);
                        w = 47;
                    }
                    boolean z2 = s == 181 && (w == 49 || w == 47) && s2 == 3;
                    if (w == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m29410b(j, no2, da4Arr);
                    }
                }
                no2.mo19779f(k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m29410b(long j, no2 no2, da4[] da4Arr) {
        int s = no2.mo19792s();
        if ((s & 64) != 0) {
            no2.mo19780g(1);
            int i = (s & 31) * 3;
            int k = no2.mo19784k();
            for (da4 da4 : da4Arr) {
                no2.mo19779f(k);
                da4.mo16888d(no2, i);
                if (j != -9223372036854775807L) {
                    da4.mo16889e(j, 1, i, 0, (ca4) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m29411c(no2 no2) {
        int i = 0;
        while (no2.mo19782i() != 0) {
            int s = no2.mo19792s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
