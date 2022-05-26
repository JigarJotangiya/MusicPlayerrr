package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j42 extends oh0 implements q91 {

    /* renamed from: g */
    private ph0 f18358g;

    /* renamed from: h */
    private p91 f18359h;

    /* renamed from: i */
    private jg1 f18360i;

    /* renamed from: P */
    public final synchronized void mo17496P(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16467i.mo19361a();
        }
    }

    /* renamed from: X */
    public final synchronized void mo17497X(C4863a aVar) throws RemoteException {
        p91 p91 = this.f18359h;
        if (p91 != null) {
            p91.mo19914f();
        }
    }

    /* renamed from: Y */
    public final synchronized void mo17498Y(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16465g.mo10900a();
        }
    }

    /* renamed from: Z1 */
    public final synchronized void mo17499Z1(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16467i.zze();
        }
    }

    /* renamed from: a0 */
    public final synchronized void mo17500a0(C4863a aVar) throws RemoteException {
        jg1 jg1 = this.f18360i;
        if (jg1 != null) {
            ((e72) jg1).f15889d.f16983b.execute(new d72((e72) jg1, ((e72) jg1).f15886a, ((e72) jg1).f15887b, ((e72) jg1).f15888c));
        }
    }

    /* renamed from: c0 */
    public final synchronized void mo17501c0(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ph0.mo17501c0(aVar);
        }
    }

    /* renamed from: e0 */
    public final synchronized void mo17502e0(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16468j.mo18139b();
        }
    }

    /* renamed from: f7 */
    public final synchronized void mo18539f7(ph0 ph0) {
        this.f18358g = ph0;
    }

    /* renamed from: g7 */
    public final synchronized void mo18540g7(jg1 jg1) {
        this.f18360i = jg1;
    }

    /* renamed from: l3 */
    public final synchronized void mo18293l3(p91 p91) {
        this.f18359h = p91;
    }

    /* renamed from: m1 */
    public final synchronized void mo17503m1(C4863a aVar, int i) throws RemoteException {
        jg1 jg1 = this.f18360i;
        if (jg1 != null) {
            String valueOf = String.valueOf(((e72) jg1).f15888c.f20466a);
            ul0.m31862g(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    /* renamed from: p2 */
    public final synchronized void mo17504p2(C4863a aVar, zzces zzces) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16468j.mo18140x(zzces);
        }
    }

    /* renamed from: q0 */
    public final synchronized void mo17505q0(C4863a aVar, int i) throws RemoteException {
        p91 p91 = this.f18359h;
        if (p91 != null) {
            p91.mo19912c(i);
        }
    }

    public final synchronized void zze(C4863a aVar) throws RemoteException {
        ph0 ph0 = this.f18358g;
        if (ph0 != null) {
            ((f72) ph0).f16466h.mo10632u0();
        }
    }
}
