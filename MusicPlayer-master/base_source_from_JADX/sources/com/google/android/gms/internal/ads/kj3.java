package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kj3 implements aa3 {

    /* renamed from: c */
    private static final Collection<Integer> f18894c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    private static final byte[] f18895d = new byte[16];

    /* renamed from: a */
    private final jk3 f18896a;

    /* renamed from: b */
    private final byte[] f18897b;

    public kj3(byte[] bArr) throws GeneralSecurityException {
        if (rc3.m30058a(1)) {
            Collection<Integer> collection = f18894c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f18897b = Arrays.copyOfRange(bArr, i, length);
                this.f18896a = new jk3(copyOfRange);
                return;
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("invalid key size: ");
            sb.append(length);
            sb.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(sb.toString());
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo15730a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher a = yj3.f26378e.mo22204a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a2 = this.f18896a.mo18646a(f18895d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr5 = bArr4[i];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a2 = mj3.m27286c(lj3.m26765b(a2), this.f18896a.mo18646a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a2.length;
                if (length >= length2) {
                    int i2 = length - length2;
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i3 = 0; i3 < a2.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a2[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = mj3.m27286c(lj3.m26764a(bArr6), lj3.m26765b(a2));
            }
            byte[] a3 = this.f18896a.mo18646a(bArr3, 16);
            byte[] bArr7 = (byte[]) a3.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.f18897b, "AES"), new IvParameterSpec(bArr7));
            return mj3.m27285b(a3, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
