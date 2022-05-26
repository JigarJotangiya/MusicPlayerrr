package com.google.android.gms.internal.ads;

import p082e.p098e.C3465a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xl1 implements z81 {

    /* renamed from: g */
    private final bk1 f25870g;

    /* renamed from: h */
    private final gk1 f25871h;

    public xl1(bk1 bk1, gk1 gk1) {
        this.f25870g = bk1;
        this.f25871h = gk1;
    }

    /* renamed from: j */
    public final void mo15614j() {
        if (this.f25870g.mo16279c0() != null) {
            pr0 Y = this.f25870g.mo16273Y();
            pr0 Z = this.f25870g.mo16274Z();
            if (Y == null) {
                Y = Z != null ? Z : null;
            }
            if (this.f25871h.mo17549c() && Y != null) {
                Y.mo16880n0("onSdkImpression", new C3465a());
            }
        }
    }
}
