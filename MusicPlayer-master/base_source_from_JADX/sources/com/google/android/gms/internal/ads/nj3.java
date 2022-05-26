package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nj3 extends oj3 {
    nj3(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo19742b() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int[] mo19743c(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            oj3.m28528g(iArr2, this.f21019a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
