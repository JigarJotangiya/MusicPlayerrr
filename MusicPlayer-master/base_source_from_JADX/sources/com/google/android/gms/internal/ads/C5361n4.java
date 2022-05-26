package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.n4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5361n4 {
    /* renamed from: a */
    public static C5287l4 m27684a(z84 z84) throws IOException {
        byte[] bArr;
        no2 no2 = new no2(16);
        if (C5324m4.m27117a(z84, no2).f19759a != 1380533830) {
            return null;
        }
        t84 t84 = (t84) z84;
        t84.mo19929i(no2.mo19781h(), 0, 4, false);
        no2.mo19779f(0);
        int m = no2.mo19786m();
        if (m != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        C5324m4 a = C5324m4.m27117a(z84, no2);
        while (a.f19759a != 1718449184) {
            t84.mo21041n((int) a.f19760b, false);
            a = C5324m4.m27117a(z84, no2);
        }
        gs1.m24488f(a.f19760b >= 16);
        t84.mo19929i(no2.mo19781h(), 0, 16, false);
        no2.mo19779f(0);
        int q = no2.mo19790q();
        int q2 = no2.mo19790q();
        int p = no2.mo19789p();
        int p2 = no2.mo19789p();
        int q3 = no2.mo19790q();
        int q4 = no2.mo19790q();
        int i = ((int) a.f19760b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            t84.mo19929i(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = wy2.f25584f;
        }
        return new C5287l4(q, q2, p, p2, q3, q4, bArr);
    }
}
