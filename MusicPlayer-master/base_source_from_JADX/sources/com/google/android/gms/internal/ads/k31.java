package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class k31 extends dx0 {

    /* renamed from: b */
    public final g01 f18742b = new g01();

    /* renamed from: c */
    public ByteBuffer f18743c;

    /* renamed from: d */
    public boolean f18744d;

    /* renamed from: e */
    public long f18745e;

    /* renamed from: f */
    public ByteBuffer f18746f;

    /* renamed from: g */
    private final int f18747g;

    public k31(int i, int i2) {
        this.f18747g = i;
    }

    /* renamed from: l */
    private final ByteBuffer m26084l(int i) {
        int i2;
        int i3 = this.f18747g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f18743c;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new i21(i2, i);
    }

    /* renamed from: b */
    public void mo16814b() {
        super.mo16814b();
        ByteBuffer byteBuffer = this.f18743c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18746f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18744d = false;
    }

    /* renamed from: i */
    public final void mo18796i(int i) {
        ByteBuffer byteBuffer = this.f18743c;
        if (byteBuffer == null) {
            this.f18743c = m26084l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f18743c = byteBuffer;
            return;
        }
        ByteBuffer l = m26084l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f18743c = l;
    }

    /* renamed from: j */
    public final void mo18797j() {
        ByteBuffer byteBuffer = this.f18743c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18746f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean mo18798k() {
        return mo17030d(1073741824);
    }
}
