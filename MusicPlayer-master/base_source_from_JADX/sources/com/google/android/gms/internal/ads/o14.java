package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o14 implements q24, jz3 {

    /* renamed from: g */
    private final Object f20866g;

    /* renamed from: h */
    private p24 f20867h;

    /* renamed from: i */
    private iz3 f20868i;

    /* renamed from: j */
    final /* synthetic */ q14 f20869j;

    public o14(q14 q14, Object obj) {
        this.f20869j = q14;
        this.f20867h = q14.mo18268o((f24) null);
        this.f20868i = q14.mo18265l((f24) null);
        this.f20866g = obj;
    }

    /* renamed from: a */
    private final boolean m28258a(int i, f24 f24) {
        f24 f242;
        if (f24 != null) {
            f242 = this.f20869j.mo16028z(this.f20866g, f24);
            if (f242 == null) {
                return false;
            }
        } else {
            f242 = null;
        }
        p24 p24 = this.f20867h;
        if (p24.f21303a != i || !wy2.m33453p(p24.f21304b, f242)) {
            this.f20867h = this.f20869j.mo18269p(i, f242, 0);
        }
        iz3 iz3 = this.f20868i;
        if (iz3.f18288a == i && wy2.m33453p(iz3.f18289b, f242)) {
            return true;
        }
        this.f20868i = this.f20869j.mo18266m(i, f242);
        return true;
    }

    /* renamed from: A */
    public final void mo15960A(int i, f24 f24, x14 x14, c24 c24, IOException iOException, boolean z) {
        if (m28258a(i, f24)) {
            this.f20867h.mo20198i(x14, c24, iOException, z);
        }
    }

    /* renamed from: D */
    public final void mo15961D(int i, f24 f24, c24 c24) {
        if (m28258a(i, f24)) {
            this.f20867h.mo20192c(c24);
        }
    }

    /* renamed from: p */
    public final void mo15962p(int i, f24 f24, x14 x14, c24 c24) {
        if (m28258a(i, f24)) {
            this.f20867h.mo20194e(x14, c24);
        }
    }

    /* renamed from: t */
    public final void mo15963t(int i, f24 f24, x14 x14, c24 c24) {
        if (m28258a(i, f24)) {
            this.f20867h.mo20196g(x14, c24);
        }
    }

    /* renamed from: x */
    public final void mo15964x(int i, f24 f24, x14 x14, c24 c24) {
        if (m28258a(i, f24)) {
            this.f20867h.mo20200k(x14, c24);
        }
    }
}
