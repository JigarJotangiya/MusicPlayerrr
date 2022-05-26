package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class au3 implements q24, jz3 {

    /* renamed from: g */
    private final cu3 f14082g;

    /* renamed from: h */
    private p24 f14083h;

    /* renamed from: i */
    private iz3 f14084i;

    /* renamed from: j */
    final /* synthetic */ eu3 f14085j;

    public au3(eu3 eu3, cu3 cu3) {
        this.f14085j = eu3;
        this.f14083h = eu3.f16124e;
        this.f14084i = eu3.f16125f;
        this.f14082g = cu3;
    }

    /* renamed from: a */
    private final boolean m20963a(int i, f24 f24) {
        f24 f242 = null;
        if (f24 != null) {
            cu3 cu3 = this.f14082g;
            int i2 = 0;
            while (true) {
                if (i2 >= cu3.f15157c.size()) {
                    break;
                } else if (cu3.f15157c.get(i2).f25534d == f24.f25534d) {
                    f242 = f24.mo17463c(Pair.create(cu3.f15156b, f24.f25531a));
                    break;
                } else {
                    i2++;
                }
            }
            if (f242 == null) {
                return false;
            }
        }
        int i3 = i + this.f14082g.f15158d;
        p24 p24 = this.f14083h;
        if (p24.f21303a != i3 || !wy2.m33453p(p24.f21304b, f242)) {
            this.f14083h = this.f14085j.f16124e.mo20190a(i3, f242, 0);
        }
        iz3 iz3 = this.f14084i;
        if (iz3.f18288a == i3 && wy2.m33453p(iz3.f18289b, f242)) {
            return true;
        }
        this.f14084i = this.f14085j.f16125f.mo18525a(i3, f242);
        return true;
    }

    /* renamed from: A */
    public final void mo15960A(int i, f24 f24, x14 x14, c24 c24, IOException iOException, boolean z) {
        if (m20963a(i, f24)) {
            this.f14083h.mo20198i(x14, c24, iOException, z);
        }
    }

    /* renamed from: D */
    public final void mo15961D(int i, f24 f24, c24 c24) {
        if (m20963a(i, f24)) {
            this.f14083h.mo20192c(c24);
        }
    }

    /* renamed from: p */
    public final void mo15962p(int i, f24 f24, x14 x14, c24 c24) {
        if (m20963a(i, f24)) {
            this.f14083h.mo20194e(x14, c24);
        }
    }

    /* renamed from: t */
    public final void mo15963t(int i, f24 f24, x14 x14, c24 c24) {
        if (m20963a(i, f24)) {
            this.f14083h.mo20196g(x14, c24);
        }
    }

    /* renamed from: x */
    public final void mo15964x(int i, f24 f24, x14 x14, c24 c24) {
        if (m20963a(i, f24)) {
            this.f14083h.mo20200k(x14, c24);
        }
    }
}
