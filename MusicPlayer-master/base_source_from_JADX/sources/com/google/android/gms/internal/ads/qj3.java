package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class qj3 implements x93 {

    /* renamed from: a */
    private final oj3 f21942a;

    /* renamed from: b */
    private final oj3 f21943b;

    public qj3(byte[] bArr) throws GeneralSecurityException {
        if (rc3.m30058a(1)) {
            this.f21942a = mo20277b(bArr, 1);
            this.f21943b = mo20277b(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo17953a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.f21942a.mo19742b()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f21942a.mo19742b() + length + 16);
            if (allocate.remaining() >= length + this.f21942a.mo19742b() + 16) {
                int position = allocate.position();
                this.f21942a.mo20011e(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f21942a.mo19742b()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.f21943b.mo20010d(bArr3, 0).get(bArr4);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = i == 0 ? remaining : (remaining + 16) - i;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(allocate);
                order.position(i2);
                order.putLong(0);
                order.putLong((long) remaining);
                byte[] a = ik3.m25250a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract oj3 mo20277b(byte[] bArr, int i) throws InvalidKeyException;
}
