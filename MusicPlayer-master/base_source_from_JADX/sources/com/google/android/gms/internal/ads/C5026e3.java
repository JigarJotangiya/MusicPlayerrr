package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5026e3 {

    /* renamed from: a */
    private final int f15840a;

    /* renamed from: b */
    private boolean f15841b;

    /* renamed from: c */
    private boolean f15842c;

    /* renamed from: d */
    public byte[] f15843d;

    /* renamed from: e */
    public int f15844e;

    public C5026e3(int i, int i2) {
        this.f15840a = i;
        byte[] bArr = new byte[131];
        this.f15843d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo17105a(byte[] bArr, int i, int i2) {
        if (this.f15841b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f15843d;
            int length = bArr2.length;
            int i4 = this.f15844e + i3;
            if (length < i4) {
                this.f15843d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f15843d, this.f15844e, i3);
            this.f15844e += i3;
        }
    }

    /* renamed from: b */
    public final void mo17106b() {
        this.f15841b = false;
        this.f15842c = false;
    }

    /* renamed from: c */
    public final void mo17107c(int i) {
        boolean z = true;
        gs1.m24488f(!this.f15841b);
        if (i != this.f15840a) {
            z = false;
        }
        this.f15841b = z;
        if (z) {
            this.f15844e = 3;
            this.f15842c = false;
        }
    }

    /* renamed from: d */
    public final boolean mo17108d(int i) {
        if (!this.f15841b) {
            return false;
        }
        this.f15844e -= i;
        this.f15841b = false;
        this.f15842c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo17109e() {
        return this.f15842c;
    }
}
