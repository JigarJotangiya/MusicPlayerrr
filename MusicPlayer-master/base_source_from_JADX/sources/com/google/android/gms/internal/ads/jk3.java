package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jk3 implements yd3 {

    /* renamed from: a */
    private final SecretKey f18506a;

    /* renamed from: b */
    private final byte[] f18507b;

    /* renamed from: c */
    private final byte[] f18508c;

    public jk3(byte[] bArr) throws GeneralSecurityException {
        qk3.m29554a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f18506a = secretKeySpec;
        Cipher b = m25747b();
        b.init(1, secretKeySpec);
        byte[] b2 = lj3.m26765b(b.doFinal(new byte[16]));
        this.f18507b = b2;
        this.f18508c = lj3.m26765b(b2);
    }

    /* renamed from: b */
    private static Cipher m25747b() throws GeneralSecurityException {
        if (rc3.m30058a(1)) {
            return yj3.f26378e.mo22204a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo18646a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m25747b();
            b.init(1, this.f18506a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = mj3.m27287d(bArr, (max - 1) * 16, this.f18507b, 0, 16);
            } else {
                bArr2 = mj3.m27286c(lj3.m26764a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f18508c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(mj3.m27287d(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(mj3.m27286c(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
