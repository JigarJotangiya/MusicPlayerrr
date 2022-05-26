package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fk3 {

    /* renamed from: a */
    private final byte[] f16662a;

    private fk3(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f16662a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static fk3 m23702a(byte[] bArr, int i, int i2) {
        return new fk3(bArr, 0, i2);
    }

    /* renamed from: b */
    public final byte[] mo17553b() {
        byte[] bArr = this.f16662a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
