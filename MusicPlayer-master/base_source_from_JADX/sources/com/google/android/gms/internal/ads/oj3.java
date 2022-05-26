package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class oj3 implements gk3 {

    /* renamed from: c */
    private static final int[] f21018c = m28530i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f21019a;

    /* renamed from: b */
    private final int f21020b;

    oj3(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f21019a = m28530i(bArr);
            this.f21020b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    static void m28527f(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> -16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> -12) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> -8) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> -7) | (i15 << 7);
    }

    /* renamed from: g */
    static void m28528g(int[] iArr, int[] iArr2) {
        int[] iArr3 = f21018c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: h */
    static void m28529h(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m28527f(iArr2, 0, 4, 8, 12);
            m28527f(iArr2, 1, 5, 9, 13);
            m28527f(iArr2, 2, 6, 10, 14);
            m28527f(iArr2, 3, 7, 11, 15);
            m28527f(iArr2, 0, 5, 10, 15);
            m28527f(iArr2, 1, 6, 11, 12);
            m28527f(iArr2, 2, 7, 8, 13);
            m28527f(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: i */
    static int[] m28530i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public final byte[] mo16940a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - mo19742b()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo19742b() + length);
            mo20011e(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo19742b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int[] mo19743c(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ByteBuffer mo20010d(byte[] bArr, int i) {
        int[] c = mo19743c(m28530i(bArr), i);
        int[] iArr = (int[]) c.clone();
        m28529h(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            c[i2] = c[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo20011e(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo19742b() >= bArr.length) {
            byte[] a = ok3.m28546a(mo19742b());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer d = mo20010d(a, this.f21020b + i2);
                if (i2 == i - 1) {
                    mj3.m27284a(byteBuffer, wrap, d, remaining % 64);
                } else {
                    mj3.m27284a(byteBuffer, wrap, d, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
