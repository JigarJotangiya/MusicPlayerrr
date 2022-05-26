package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tk3 {

    /* renamed from: a */
    private final byte[] f23915a = new byte[256];

    /* renamed from: b */
    private int f23916b;

    /* renamed from: c */
    private int f23917c;

    public tk3(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f23915a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f23915a;
            byte b2 = bArr2[i2];
            b = (b + b2 + bArr[i2 % bArr.length]) & 255;
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f23916b = 0;
        this.f23917c = 0;
    }

    /* renamed from: a */
    public final void mo21081a(byte[] bArr) {
        int i = this.f23916b;
        int i2 = this.f23917c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f23915a;
            byte b = bArr2[i];
            i2 = (i2 + b) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b) & 255] ^ bArr[i3]);
        }
        this.f23916b = i;
        this.f23917c = i2;
    }
}
