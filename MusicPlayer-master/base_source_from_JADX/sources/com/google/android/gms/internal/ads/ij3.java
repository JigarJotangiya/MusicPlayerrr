package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ij3 implements x93 {

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f18057b = new hj3();

    /* renamed from: a */
    private final SecretKey f18058a;

    public ij3(byte[] bArr) throws GeneralSecurityException {
        if (rc3.m30058a(2)) {
            qk3.m29554a(bArr.length);
            this.f18058a = new SecretKeySpec(bArr, "AES");
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo17953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = ok3.m28546a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            int length2 = a.length;
            if (!pk3.m29043b() || pk3.m29042a() > 19) {
                algorithmParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } else {
                algorithmParameterSpec = new IvParameterSpec(a, 0, length2);
            }
            ThreadLocal<Cipher> threadLocal = f18057b;
            threadLocal.get().init(1, this.f18058a, algorithmParameterSpec);
            int doFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
