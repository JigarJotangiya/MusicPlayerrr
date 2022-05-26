package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.cb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4960cb {

    /* renamed from: a */
    private static Cipher f14934a;

    /* renamed from: b */
    private static final Object f14935b = new Object();

    /* renamed from: c */
    private static final Object f14936c = new Object();

    public C4960cb(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m21840c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f14936c) {
            if (f14934a == null) {
                f14934a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f14934a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo16582a(byte[] bArr, byte[] bArr2) throws C4923bb {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f14935b) {
                m21840c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m21840c().doFinal(bArr2);
                iv = m21840c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return C5144h9.m24731a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new C4923bb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C4923bb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C4923bb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C4923bb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C4923bb(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo16583b(byte[] bArr, String str) throws C4923bb {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b = C5144h9.m24732b(str, false);
            int length2 = b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f14935b) {
                    m21840c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m21840c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new C4923bb(this);
        } catch (NoSuchAlgorithmException e) {
            throw new C4923bb(this, e);
        } catch (InvalidKeyException e2) {
            throw new C4923bb(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C4923bb(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C4923bb(this, e4);
        } catch (BadPaddingException e5) {
            throw new C4923bb(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C4923bb(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new C4923bb(this, e7);
        }
    }
}
