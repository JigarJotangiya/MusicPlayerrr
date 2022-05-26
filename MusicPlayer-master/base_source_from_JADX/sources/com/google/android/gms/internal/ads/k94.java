package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k94 {
    /* renamed from: a */
    public static zzdd m26169a(z84 z84, boolean z) throws IOException {
        zzdd a = new r94().mo20617a(z84, z ? null : vb4.f24676a);
        if (a == null || a.mo22581a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static m94 m26170b(no2 no2) {
        no2.mo19780g(1);
        int u = no2.mo19794u();
        long k = ((long) no2.mo19784k()) + ((long) u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = no2.mo19799z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = no2.mo19799z();
            no2.mo19780g(2);
            i2++;
        }
        no2.mo19780g((int) (k - ((long) no2.mo19784k())));
        return new m94(jArr, jArr2);
    }
}
