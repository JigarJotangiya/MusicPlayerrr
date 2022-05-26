package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gj3 implements x93 {

    /* renamed from: e */
    private static final ThreadLocal<Cipher> f17151e = new ej3();

    /* renamed from: f */
    private static final ThreadLocal<Cipher> f17152f = new fj3();

    /* renamed from: a */
    private final byte[] f17153a;

    /* renamed from: b */
    private final byte[] f17154b;

    /* renamed from: c */
    private final SecretKeySpec f17155c;

    /* renamed from: d */
    private final int f17156d;

    public gj3(byte[] bArr, int i) throws GeneralSecurityException {
        if (!rc3.m30058a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f17156d = i;
            qk3.m29554a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f17155c = secretKeySpec;
            Cipher cipher = f17151e.get();
            cipher.init(1, secretKeySpec);
            byte[] b = m24401b(cipher.doFinal(new byte[16]));
            this.f17153a = b;
            this.f17154b = m24401b(b);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: b */
    private static byte[] m24401b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: c */
    private final byte[] m24402c(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m24403d(bArr3, this.f17153a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m24403d(copyOfRange, this.f17153a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f17154b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m24403d(doFinal, bArr2));
    }

    /* renamed from: d */
    private static byte[] m24403d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo17953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f17156d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = ok3.m28546a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f17156d);
            Cipher cipher = f17151e.get();
            cipher.init(1, this.f17155c);
            Cipher cipher2 = cipher;
            byte[] c = m24402c(cipher2, 0, a, 0, a.length);
            byte[] c2 = m24402c(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = f17152f.get();
            cipher3.init(1, this.f17155c, new IvParameterSpec(c));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f17156d);
            byte[] c3 = m24402c(cipher, 2, bArr3, this.f17156d, length);
            int i2 = length + this.f17156d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((c2[i3] ^ c[i3]) ^ c3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
