package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.v */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5652v {

    /* renamed from: a */
    private final no2 f24523a = new no2(8);

    /* renamed from: b */
    private int f24524b;

    /* renamed from: b */
    private final long m32113b(z84 z84) throws IOException {
        t84 t84 = (t84) z84;
        int i = 0;
        t84.mo19929i(this.f24523a.mo19781h(), 0, 1, false);
        byte b = this.f24523a.mo19781h()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        t84.mo19929i(this.f24523a.mo19781h(), 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f24523a.mo19781h()[i] & 255) + (i4 << 8);
        }
        this.f24524b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo21405a(z84 z84) throws IOException {
        long b;
        int i;
        long b2 = z84.mo16584b();
        long j = 1024;
        int i2 = (b2 > -1 ? 1 : (b2 == -1 ? 0 : -1));
        if (i2 != 0 && b2 <= 1024) {
            j = b2;
        }
        int i3 = (int) j;
        t84 t84 = (t84) z84;
        t84.mo19929i(this.f24523a.mo19781h(), 0, 4, false);
        this.f24524b = 4;
        for (long A = this.f24523a.mo19766A(); A != 440786851; A = ((A << 8) & -256) | ((long) (this.f24523a.mo19781h()[0] & 255))) {
            int i4 = this.f24524b + 1;
            this.f24524b = i4;
            if (i4 == i3) {
                return false;
            }
            t84.mo19929i(this.f24523a.mo19781h(), 0, 1, false);
        }
        long b3 = m32113b(z84);
        long j2 = (long) this.f24524b;
        if (b3 != Long.MIN_VALUE && (i2 == 0 || j2 + b3 < b2)) {
            while (true) {
                int i5 = (((long) this.f24524b) > (j2 + b3) ? 1 : (((long) this.f24524b) == (j2 + b3) ? 0 : -1));
                if (i5 < 0) {
                    if (m32113b(z84) == Long.MIN_VALUE || b < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int b4 = (int) (b = m32113b(z84));
                        t84.mo21041n(b4, false);
                        this.f24524b += b4;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
