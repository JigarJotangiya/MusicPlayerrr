package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d04 extends k31 {

    /* renamed from: h */
    private long f15417h;

    /* renamed from: i */
    private int f15418i;

    /* renamed from: j */
    private int f15419j = 32;

    public d04() {
        super(2, 0);
    }

    /* renamed from: b */
    public final void mo16814b() {
        super.mo16814b();
        this.f15418i = 0;
    }

    /* renamed from: m */
    public final int mo16815m() {
        return this.f15418i;
    }

    /* renamed from: n */
    public final long mo16816n() {
        return this.f15417h;
    }

    /* renamed from: o */
    public final void mo16817o(int i) {
        this.f15419j = i;
    }

    /* renamed from: p */
    public final boolean mo16818p(k31 k31) {
        ByteBuffer byteBuffer;
        gs1.m24486d(!k31.mo17030d(1073741824));
        gs1.m24486d(!k31.mo17030d(268435456));
        gs1.m24486d(!k31.mo17030d(4));
        if (mo16819q()) {
            if (this.f15418i >= this.f15419j || k31.mo17030d(Integer.MIN_VALUE) != mo17030d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = k31.f18743c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f18743c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f15418i;
        this.f15418i = i + 1;
        if (i == 0) {
            this.f18745e = k31.f18745e;
            if (k31.mo17030d(1)) {
                mo17029c(1);
            }
        }
        if (k31.mo17030d(Integer.MIN_VALUE)) {
            mo17029c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = k31.f18743c;
        if (byteBuffer3 != null) {
            mo18796i(byteBuffer3.remaining());
            this.f18743c.put(byteBuffer3);
        }
        this.f15417h = k31.f18745e;
        return true;
    }

    /* renamed from: q */
    public final boolean mo16819q() {
        return this.f15418i > 0;
    }
}
