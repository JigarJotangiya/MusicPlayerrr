package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.jg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5225jg extends C5002dg {

    /* renamed from: b */
    public final C5114gg f18473b = new C5114gg();

    /* renamed from: c */
    public ByteBuffer f18474c;

    /* renamed from: d */
    public long f18475d;

    public C5225jg(int i) {
    }

    /* renamed from: j */
    private final ByteBuffer m25682j(int i) {
        int i2;
        ByteBuffer byteBuffer = this.f18474c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo16919b() {
        super.mo16919b();
        ByteBuffer byteBuffer = this.f18474c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void mo18615h(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f18474c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f18474c.position() + i;
            if (capacity < position) {
                m25682j(position);
                throw null;
            }
            return;
        }
        m25682j(i);
        throw null;
    }

    /* renamed from: i */
    public final boolean mo18616i() {
        return mo16921d(1073741824);
    }
}
