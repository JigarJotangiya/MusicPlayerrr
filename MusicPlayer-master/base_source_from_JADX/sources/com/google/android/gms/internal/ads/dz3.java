package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dz3 implements kx3 {

    /* renamed from: b */
    private int f15789b;

    /* renamed from: c */
    private float f15790c = 1.0f;

    /* renamed from: d */
    private float f15791d = 1.0f;

    /* renamed from: e */
    private ix3 f15792e;

    /* renamed from: f */
    private ix3 f15793f;

    /* renamed from: g */
    private ix3 f15794g;

    /* renamed from: h */
    private ix3 f15795h;

    /* renamed from: i */
    private boolean f15796i;

    /* renamed from: j */
    private cz3 f15797j;

    /* renamed from: k */
    private ByteBuffer f15798k;

    /* renamed from: l */
    private ShortBuffer f15799l;

    /* renamed from: m */
    private ByteBuffer f15800m;

    /* renamed from: n */
    private long f15801n;

    /* renamed from: o */
    private long f15802o;

    /* renamed from: p */
    private boolean f15803p;

    public dz3() {
        ix3 ix3 = ix3.f18270e;
        this.f15792e = ix3;
        this.f15793f = ix3;
        this.f15794g = ix3;
        this.f15795h = ix3;
        ByteBuffer byteBuffer = kx3.f19102a;
        this.f15798k = byteBuffer;
        this.f15799l = byteBuffer.asShortBuffer();
        this.f15800m = byteBuffer;
        this.f15789b = -1;
    }

    /* renamed from: a */
    public final ByteBuffer mo17059a() {
        int a;
        cz3 cz3 = this.f15797j;
        if (cz3 != null && (a = cz3.mo16792a()) > 0) {
            if (this.f15798k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f15798k = order;
                this.f15799l = order.asShortBuffer();
            } else {
                this.f15798k.clear();
                this.f15799l.clear();
            }
            cz3.mo16795d(this.f15799l);
            this.f15802o += (long) a;
            this.f15798k.limit(a);
            this.f15800m = this.f15798k;
        }
        ByteBuffer byteBuffer = this.f15800m;
        this.f15800m = kx3.f19102a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo17060b() {
        if (mo16432d()) {
            ix3 ix3 = this.f15792e;
            this.f15794g = ix3;
            ix3 ix32 = this.f15793f;
            this.f15795h = ix32;
            if (this.f15796i) {
                this.f15797j = new cz3(ix3.f18271a, ix3.f18272b, this.f15790c, this.f15791d, ix32.f18271a);
            } else {
                cz3 cz3 = this.f15797j;
                if (cz3 != null) {
                    cz3.mo16794c();
                }
            }
        }
        this.f15800m = kx3.f19102a;
        this.f15801n = 0;
        this.f15802o = 0;
        this.f15803p = false;
    }

    /* renamed from: c */
    public final void mo17061c() {
        this.f15790c = 1.0f;
        this.f15791d = 1.0f;
        ix3 ix3 = ix3.f18270e;
        this.f15792e = ix3;
        this.f15793f = ix3;
        this.f15794g = ix3;
        this.f15795h = ix3;
        ByteBuffer byteBuffer = kx3.f19102a;
        this.f15798k = byteBuffer;
        this.f15799l = byteBuffer.asShortBuffer();
        this.f15800m = byteBuffer;
        this.f15789b = -1;
        this.f15796i = false;
        this.f15797j = null;
        this.f15801n = 0;
        this.f15802o = 0;
        this.f15803p = false;
    }

    /* renamed from: d */
    public final boolean mo16432d() {
        if (this.f15793f.f18271a != -1) {
            return Math.abs(this.f15790c + -1.0f) >= 1.0E-4f || Math.abs(this.f15791d + -1.0f) >= 1.0E-4f || this.f15793f.f18271a != this.f15792e.f18271a;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f15797j;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17062e() {
        /*
            r3 = this;
            boolean r0 = r3.f15803p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.cz3 r0 = r3.f15797j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo16792a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dz3.mo17062e():boolean");
    }

    /* renamed from: f */
    public final void mo17063f() {
        cz3 cz3 = this.f15797j;
        if (cz3 != null) {
            cz3.mo16796e();
        }
        this.f15803p = true;
    }

    /* renamed from: g */
    public final ix3 mo17064g(ix3 ix3) throws jx3 {
        if (ix3.f18273c == 2) {
            int i = this.f15789b;
            if (i == -1) {
                i = ix3.f18271a;
            }
            this.f15792e = ix3;
            ix3 ix32 = new ix3(i, ix3.f18272b, 2);
            this.f15793f = ix32;
            this.f15796i = true;
            return ix32;
        }
        throw new jx3(ix3);
    }

    /* renamed from: h */
    public final void mo15991h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            cz3 cz3 = this.f15797j;
            Objects.requireNonNull(cz3);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15801n += (long) remaining;
            cz3.mo16797f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: i */
    public final long mo17065i(long j) {
        if (this.f15802o < 1024) {
            return (long) (((double) this.f15790c) * ((double) j));
        }
        long j2 = this.f15801n;
        cz3 cz3 = this.f15797j;
        Objects.requireNonNull(cz3);
        long b = j2 - ((long) cz3.mo16793b());
        int i = this.f15795h.f18271a;
        int i2 = this.f15794g.f18271a;
        if (i == i2) {
            return wy2.m33431Z(j, b, this.f15802o);
        }
        return wy2.m33431Z(j, b * ((long) i), this.f15802o * ((long) i2));
    }

    /* renamed from: j */
    public final void mo17066j(float f) {
        if (this.f15791d != f) {
            this.f15791d = f;
            this.f15796i = true;
        }
    }

    /* renamed from: k */
    public final void mo17067k(float f) {
        if (this.f15790c != f) {
            this.f15790c = f;
            this.f15796i = true;
        }
    }
}
