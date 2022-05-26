package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class np0 implements kr3 {

    /* renamed from: g */
    private final ByteBuffer f20680g;

    np0(ByteBuffer byteBuffer) {
        this.f20680g = byteBuffer.duplicate();
    }

    /* renamed from: B0 */
    public final int mo19003B0(ByteBuffer byteBuffer) throws IOException {
        if (this.f20680g.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f20680g.remaining());
        byte[] bArr = new byte[min];
        this.f20680g.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: G0 */
    public final ByteBuffer mo19004G0(long j, long j2) throws IOException {
        int position = this.f20680g.position();
        this.f20680g.position((int) j);
        ByteBuffer slice = this.f20680g.slice();
        slice.limit((int) j2);
        this.f20680g.position(position);
        return slice;
    }

    /* renamed from: a */
    public final long mo19005a() throws IOException {
        return (long) this.f20680g.position();
    }

    /* renamed from: b */
    public final long mo19006b() throws IOException {
        return (long) this.f20680g.limit();
    }

    public final void close() throws IOException {
    }

    /* renamed from: g */
    public final void mo19007g(long j) throws IOException {
        this.f20680g.position((int) j);
    }
}
