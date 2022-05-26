package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.r2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5507r2 {

    /* renamed from: e */
    private static final byte[] f22705e = {0, 0, 1};

    /* renamed from: a */
    private boolean f22706a;

    /* renamed from: b */
    public int f22707b;

    /* renamed from: c */
    public int f22708c;

    /* renamed from: d */
    public byte[] f22709d = new byte[128];

    public C5507r2(int i) {
    }

    /* renamed from: a */
    public final void mo20548a(byte[] bArr, int i, int i2) {
        if (this.f22706a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f22709d;
            int length = bArr2.length;
            int i4 = this.f22707b + i3;
            if (length < i4) {
                this.f22709d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f22709d, this.f22707b, i3);
            this.f22707b += i3;
        }
    }

    /* renamed from: b */
    public final void mo20549b() {
        this.f22706a = false;
        this.f22707b = 0;
        this.f22708c = 0;
    }

    /* renamed from: c */
    public final boolean mo20550c(int i, int i2) {
        if (this.f22706a) {
            int i3 = this.f22707b - i2;
            this.f22707b = i3;
            if (this.f22708c == 0 && i == 181) {
                this.f22708c = i3;
            } else {
                this.f22706a = false;
                return true;
            }
        } else if (i == 179) {
            this.f22706a = true;
        }
        mo20548a(f22705e, 0, 3);
        return false;
    }
}
