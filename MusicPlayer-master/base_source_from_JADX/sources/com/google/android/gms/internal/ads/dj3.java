package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dj3 implements gk3 {

    /* renamed from: d */
    private static final ThreadLocal<Cipher> f15642d = new cj3();

    /* renamed from: a */
    private final SecretKeySpec f15643a;

    /* renamed from: b */
    private final int f15644b;

    /* renamed from: c */
    private final int f15645c;

    public dj3(byte[] bArr, int i) throws GeneralSecurityException {
        if (rc3.m30058a(2)) {
            qk3.m29554a(bArr.length);
            this.f15643a = new SecretKeySpec(bArr, "AES");
            int blockSize = f15642d.get().getBlockSize();
            this.f15645c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f15644b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo16940a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f15644b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = ok3.m28546a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f15644b);
            int i3 = this.f15644b;
            Cipher cipher = f15642d.get();
            byte[] bArr3 = new byte[this.f15645c];
            System.arraycopy(a, 0, bArr3, 0, this.f15644b);
            cipher.init(1, this.f15643a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
