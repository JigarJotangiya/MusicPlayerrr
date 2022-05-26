package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wy3 extends iy3 {

    /* renamed from: i */
    private static final int f25590i = Float.floatToIntBits(Float.NaN);

    wy3() {
    }

    /* renamed from: o */
    private static void m33464o(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f25590i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: h */
    public final void mo15991h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f18277b.f18273c;
        if (i2 == 536870912) {
            byteBuffer2 = mo18520j((i / 3) * 4);
            while (position < limit) {
                m33464o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo18520j(i);
            while (position < limit) {
                m33464o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: i */
    public final ix3 mo15992i(ix3 ix3) throws jx3 {
        int i = ix3.f18273c;
        if (wy2.m33454q(i)) {
            return i != 4 ? new ix3(ix3.f18271a, ix3.f18272b, 4) : ix3.f18270e;
        }
        throw new jx3(ix3);
    }
}
