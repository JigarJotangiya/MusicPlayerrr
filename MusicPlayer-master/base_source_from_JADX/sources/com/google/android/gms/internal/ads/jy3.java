package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jy3 extends iy3 {

    /* renamed from: i */
    private int[] f18681i;

    /* renamed from: j */
    private int[] f18682j;

    jy3() {
    }

    /* renamed from: h */
    public final void mo15991h(ByteBuffer byteBuffer) {
        int[] iArr = this.f18682j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = mo18520j(((limit - position) / this.f18277b.f18274d) * this.f18278c.f18274d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f18277b.f18274d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    /* renamed from: i */
    public final ix3 mo15992i(ix3 ix3) throws jx3 {
        int[] iArr = this.f18681i;
        if (iArr == null) {
            return ix3.f18270e;
        }
        if (ix3.f18273c == 2) {
            boolean z = ix3.f18272b != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new ix3(ix3.f18271a, length, 2) : ix3.f18270e;
                }
                int i2 = iArr[i];
                if (i2 < ix3.f18272b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new jx3(ix3);
                }
            }
        } else {
            throw new jx3(ix3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo16433k() {
        this.f18682j = this.f18681i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16435m() {
        this.f18682j = null;
        this.f18681i = null;
    }

    /* renamed from: o */
    public final void mo18768o(int[] iArr) {
        this.f18681i = iArr;
    }
}
