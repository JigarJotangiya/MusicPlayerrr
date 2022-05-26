package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r94 {

    /* renamed from: a */
    private final no2 f22794a = new no2(10);

    /* renamed from: a */
    public final zzdd mo20617a(z84 z84, tb4 tb4) throws IOException {
        zzdd zzdd = null;
        int i = 0;
        while (true) {
            try {
                ((t84) z84).mo19929i(this.f22794a.mo19781h(), 0, 10, false);
                this.f22794a.mo19779f(0);
                if (this.f22794a.mo19794u() != 4801587) {
                    break;
                }
                this.f22794a.mo19780g(3);
                int r = this.f22794a.mo19791r();
                int i2 = r + 10;
                if (zzdd == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f22794a.mo19781h(), 0, bArr, 0, 10);
                    ((t84) z84).mo19929i(bArr, 10, r, false);
                    zzdd = vb4.m32273a(bArr, i2, tb4, new m71());
                } else {
                    ((t84) z84).mo21041n(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        z84.mo19928h();
        ((t84) z84).mo21041n(i, false);
        return zzdd;
    }
}
