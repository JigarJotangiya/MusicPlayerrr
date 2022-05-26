package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qa1 extends ud1<sa1> implements z81, fa1 {

    /* renamed from: h */
    private final bp2 f21887h;

    /* renamed from: i */
    private final AtomicBoolean f21888i = new AtomicBoolean();

    public qa1(Set<qf1<sa1>> set, bp2 bp2) {
        super(set);
        this.f21887h = bp2;
    }

    /* renamed from: a */
    private final void m29434a() {
        zzbfk zzbfk;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22486b5)).booleanValue() && this.f21888i.compareAndSet(false, true) && (zzbfk = this.f21887h.f14640c0) != null && zzbfk.f27230g == 3) {
            mo21253K0(new oa1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final /* synthetic */ void mo20415N0(sa1 sa1) throws Exception {
        sa1.mo16977g(this.f21887h.f14640c0);
    }

    /* renamed from: e */
    public final void mo17514e() {
        if (this.f21887h.f14637b == 1) {
            m29434a();
        }
    }

    /* renamed from: j */
    public final void mo15614j() {
        int i = this.f21887h.f14637b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            m29434a();
        }
    }
}
