package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w14 implements qb1 {

    /* renamed from: a */
    private final qb1 f25174a;

    /* renamed from: b */
    private final int f25175b;

    /* renamed from: c */
    private final v14 f25176c;

    /* renamed from: d */
    private final byte[] f25177d;

    /* renamed from: e */
    private int f25178e;

    public w14(qb1 qb1, int i, v14 v14) {
        gs1.m24486d(i > 0);
        this.f25174a = qb1;
        this.f25175b = i;
        this.f25176c = v14;
        this.f25177d = new byte[1];
        this.f25178e = i;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f25178e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f25174a.mo15695c(this.f25177d, 0, 1) != -1) {
                int i5 = (this.f25177d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int c = this.f25174a.mo15695c(bArr2, i4, i6);
                        if (c != -1) {
                            i4 += c;
                            i6 -= c;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f25176c.mo16040a(new no2(bArr2, i5));
                    }
                }
                i3 = this.f25175b;
                this.f25178e = i3;
            }
            return -1;
        }
        int c2 = this.f25174a.mo15695c(bArr, i, Math.min(i3, i2));
        if (c2 != -1) {
            this.f25178e -= c2;
        }
        return c2;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f25174a.mo15696g();
    }

    /* renamed from: h */
    public final void mo15697h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public final void mo19648l(fr1 fr1) {
        Objects.requireNonNull(fr1);
        this.f25174a.mo19648l(fr1);
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, List<String>> zza() {
        return this.f25174a.zza();
    }
}
