package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iq0 extends eq0 {
    public iq0(eo0 eo0) {
        super(eo0);
    }

    /* renamed from: i */
    public final void mo17262i() {
    }

    /* renamed from: u */
    public final boolean mo17272u(String str) {
        String e = nl0.m27916e(str);
        eo0 eo0 = (eo0) this.f16061i.get();
        if (!(eo0 == null || e == null)) {
            eo0.mo17227A(e, this);
        }
        ul0.m31862g("VideoStreamNoopCache is doing nothing.");
        mo17263j(str, e, "noop", "Noop cache is a noop.");
        return false;
    }
}
