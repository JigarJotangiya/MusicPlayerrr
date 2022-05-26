package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.l9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5292l9 {

    /* renamed from: a */
    static boolean f19257a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f19258b;

    /* renamed from: c */
    private static final Object f19259c = new Object();

    /* renamed from: d */
    private static final Object f19260d = new Object();

    /* renamed from: e */
    static final CountDownLatch f19261e = new CountDownLatch(1);

    /* renamed from: a */
    static String m26588a(C5513r8 r8Var, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] e = r8Var.mo21561e();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22376M1)).booleanValue()) {
            Vector<byte[]> b = m26589b(e, 255);
            if (b == null || b.size() == 0) {
                bArr = m26594g(m26593f(4096).mo21561e(), str, true);
            } else {
                C5032e9 D = C5070f9.m23542D();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    D.mo17132r(kl3.zzv(m26594g(b.get(i), str, false)));
                }
                D.mo17133s(kl3.zzv(m26592e(e)));
                bArr = ((C5070f9) D.mo19761n()).mo21561e();
            }
        } else if (C5738xb.f25741a != null) {
            byte[] a = C5738xb.f25741a.mo16579a(e, str != null ? str.getBytes() : new byte[0]);
            C5032e9 D2 = C5070f9.m23542D();
            D2.mo17132r(kl3.zzv(a));
            D2.mo17134t(3);
            bArr = ((C5070f9) D2.mo19761n()).mo21561e();
        } else {
            throw new GeneralSecurityException();
        }
        return C5144h9.m24731a(bArr, true);
    }

    /* renamed from: b */
    static Vector<byte[]> m26589b(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: d */
    static void m26591d() {
        synchronized (f19260d) {
            if (!f19257a) {
                f19257a = true;
                new Thread(new C5255k9((C5218j9) null)).start();
            }
        }
    }

    /* renamed from: e */
    public static byte[] m26592e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f19259c) {
            m26591d();
            MessageDigest messageDigest = null;
            try {
                if (f19261e.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = f19258b;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = f19258b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: f */
    static C5513r8 m26593f(int i) {
        C4920b8 f0 = C5513r8.m29957f0();
        f0.mo16140u0(4096);
        return (C5513r8) f0.mo19761n();
    }

    /* renamed from: g */
    private static byte[] m26594g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = m26593f(4096).mo21561e();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m26592e(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        C5329m9[] m9VarArr = new C5330ma().f19842G2;
        int length2 = m9VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            m9VarArr[i2].mo15725a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new tk3(str.getBytes("UTF-8")).mo21081a(bArr4);
        }
        return bArr4;
    }
}
