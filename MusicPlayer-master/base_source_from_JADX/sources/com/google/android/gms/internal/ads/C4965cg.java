package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.cg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4965cg implements C4927bf {

    /* renamed from: b */
    private int f14960b = -1;

    /* renamed from: c */
    private int f14961c = -1;

    /* renamed from: d */
    private C4928bg f14962d;

    /* renamed from: e */
    private float f14963e = 1.0f;

    /* renamed from: f */
    private float f14964f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f14965g;

    /* renamed from: h */
    private ShortBuffer f14966h;

    /* renamed from: i */
    private ByteBuffer f14967i;

    /* renamed from: j */
    private long f14968j;

    /* renamed from: k */
    private long f14969k;

    /* renamed from: l */
    private boolean f14970l;

    public C4965cg() {
        ByteBuffer byteBuffer = C4927bf.f14427a;
        this.f14965g = byteBuffer;
        this.f14966h = byteBuffer.asShortBuffer();
        this.f14967i = byteBuffer;
    }

    /* renamed from: a */
    public final int mo15771a() {
        return 2;
    }

    /* renamed from: b */
    public final ByteBuffer mo15772b() {
        ByteBuffer byteBuffer = this.f14967i;
        this.f14967i = C4927bf.f14427a;
        return byteBuffer;
    }

    /* renamed from: c */
    public final void mo15773c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f14968j += (long) remaining;
            this.f14962d.mo16229d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.f14962d.mo16226a() * this.f14960b;
        int i = a + a;
        if (i > 0) {
            if (this.f14965g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f14965g = order;
                this.f14966h = order.asShortBuffer();
            } else {
                this.f14965g.clear();
                this.f14966h.clear();
            }
            this.f14962d.mo16227b(this.f14966h);
            this.f14969k += (long) i;
            this.f14965g.limit(i);
            this.f14967i = this.f14965g;
        }
    }

    /* renamed from: d */
    public final void mo15774d() {
        this.f14962d = null;
        ByteBuffer byteBuffer = C4927bf.f14427a;
        this.f14965g = byteBuffer;
        this.f14966h = byteBuffer.asShortBuffer();
        this.f14967i = byteBuffer;
        this.f14960b = -1;
        this.f14961c = -1;
        this.f14968j = 0;
        this.f14969k = 0;
        this.f14970l = false;
    }

    /* renamed from: e */
    public final boolean mo15775e(int i, int i2, int i3) throws C4890af {
        if (i3 != 2) {
            throw new C4890af(i, i2, i3);
        } else if (this.f14961c == i && this.f14960b == i2) {
            return false;
        } else {
            this.f14961c = i;
            this.f14960b = i2;
            return true;
        }
    }

    /* renamed from: f */
    public final void mo15776f() {
        C4928bg bgVar = new C4928bg(this.f14961c, this.f14960b);
        this.f14962d = bgVar;
        bgVar.mo16231f(this.f14963e);
        this.f14962d.mo16230e(this.f14964f);
        this.f14967i = C4927bf.f14427a;
        this.f14968j = 0;
        this.f14969k = 0;
        this.f14970l = false;
    }

    /* renamed from: g */
    public final boolean mo15777g() {
        return Math.abs(this.f14963e + -1.0f) >= 0.01f || Math.abs(this.f14964f + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f14962d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15778h() {
        /*
            r3 = this;
            boolean r0 = r3.f14970l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.bg r0 = r3.f14962d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo16226a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4965cg.mo15778h():boolean");
    }

    /* renamed from: i */
    public final float mo16623i(float f) {
        this.f14964f = C4934bm.m21431a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: j */
    public final float mo16624j(float f) {
        float a = C4934bm.m21431a(f, 0.1f, 8.0f);
        this.f14963e = a;
        return a;
    }

    /* renamed from: k */
    public final long mo16625k() {
        return this.f14968j;
    }

    /* renamed from: l */
    public final long mo16626l() {
        return this.f14969k;
    }

    public final int zza() {
        return this.f14960b;
    }

    public final void zze() {
        this.f14962d.mo16228c();
        this.f14970l = true;
    }
}
