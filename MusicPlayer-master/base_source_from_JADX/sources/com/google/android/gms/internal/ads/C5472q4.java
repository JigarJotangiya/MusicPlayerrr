package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.q4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5472q4 implements C5509r4 {

    /* renamed from: a */
    private final ByteBuffer f21803a;

    public C5472q4(ByteBuffer byteBuffer) {
        this.f21803a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final void mo20390a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f21803a) {
            int i2 = (int) j;
            this.f21803a.position(i2);
            this.f21803a.limit(i2 + i);
            slice = this.f21803a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long zza() {
        return (long) this.f21803a.capacity();
    }
}
