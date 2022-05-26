package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s24 implements e24, d24 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final e24 f23320g;

    /* renamed from: h */
    private final long f23321h;

    /* renamed from: i */
    private d24 f23322i;

    public s24(e24 e24, long j) {
        this.f23320g = e24;
        this.f23321h = j;
    }

    /* renamed from: a */
    public final long mo17092a() {
        long a = this.f23320g.mo17092a();
        if (a == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a + this.f23321h;
    }

    /* renamed from: b */
    public final long mo17093b() {
        long b = this.f23320g.mo17093b();
        if (b == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b + this.f23321h;
    }

    /* renamed from: c */
    public final uj0 mo17094c() {
        return this.f23320g.mo17094c();
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        return this.f23320g.mo17095d(j - this.f23321h);
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
        this.f23320g.mo17096e(j - this.f23321h);
    }

    /* renamed from: f */
    public final long mo17097f() {
        long f = this.f23320g.mo17097f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.f23321h;
    }

    /* renamed from: g */
    public final long mo17098g(long j) {
        return this.f23320g.mo17098g(j - this.f23321h) + this.f23321h;
    }

    /* renamed from: h */
    public final void mo17099h() throws IOException {
        this.f23320g.mo17099h();
    }

    /* renamed from: i */
    public final void mo16828i(e24 e24) {
        d24 d24 = this.f23322i;
        Objects.requireNonNull(d24);
        d24.mo16828i(this);
    }

    /* renamed from: j */
    public final long mo17100j(h44[] h44Arr, boolean[] zArr, u34[] u34Arr, boolean[] zArr2, long j) {
        u34[] u34Arr2 = u34Arr;
        u34[] u34Arr3 = new u34[u34Arr2.length];
        int i = 0;
        while (true) {
            u34 u34 = null;
            if (i >= u34Arr2.length) {
                break;
            }
            t24 t24 = (t24) u34Arr2[i];
            if (t24 != null) {
                u34 = t24.mo21004c();
            }
            u34Arr3[i] = u34;
            i++;
        }
        long j2 = this.f23320g.mo17100j(h44Arr, zArr, u34Arr3, zArr2, j - this.f23321h);
        for (int i2 = 0; i2 < u34Arr2.length; i2++) {
            u34 u342 = u34Arr3[i2];
            if (u342 == null) {
                u34Arr2[i2] = null;
            } else {
                u34 u343 = u34Arr2[i2];
                if (u343 == null || ((t24) u343).mo21004c() != u342) {
                    u34Arr2[i2] = new t24(u342, this.f23321h);
                }
            }
        }
        return j2 + this.f23321h;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo19323k(w34 w34) {
        e24 e24 = (e24) w34;
        d24 d24 = this.f23322i;
        Objects.requireNonNull(d24);
        d24.mo19323k(this);
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        return this.f23320g.mo17101l();
    }

    /* renamed from: m */
    public final long mo17102m(long j, ou3 ou3) {
        return this.f23320g.mo17102m(j - this.f23321h, ou3) + this.f23321h;
    }

    /* renamed from: o */
    public final void mo17103o(long j, boolean z) {
        this.f23320g.mo17103o(j - this.f23321h, false);
    }

    /* renamed from: q */
    public final void mo17104q(d24 d24, long j) {
        this.f23322i = d24;
        this.f23320g.mo17104q(this, j - this.f23321h);
    }
}
