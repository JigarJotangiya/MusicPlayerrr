package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class zt3 implements t90 {

    /* renamed from: a */
    protected final ff0 f26906a = new ff0();

    protected zt3() {
    }

    /* renamed from: b */
    public final boolean mo22431b() {
        bg0 m = mo17328m();
        if (!m.mo16242o()) {
            int d = mo17321d();
            mo17323g();
            mo17327l();
            if (m.mo16237j(d, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo22432f() {
        bg0 m = mo17328m();
        if (!m.mo16242o()) {
            int d = mo17321d();
            mo17323g();
            mo17327l();
            if (m.mo16238k(d, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo22433k() {
        bg0 m = mo17328m();
        return !m.mo16242o() && m.mo15666e(mo17321d(), this.f26906a, 0).mo17525b();
    }

    /* renamed from: n */
    public final boolean mo22434n() {
        bg0 m = mo17328m();
        return !m.mo16242o() && m.mo15666e(mo17321d(), this.f26906a, 0).f16568f;
    }
}
