package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bs1 implements cb1, u91, h81, z81, C5497qt, qd1 {

    /* renamed from: g */
    private final C5790yp f14686g;

    /* renamed from: h */
    private boolean f14687h = false;

    public bs1(C5790yp ypVar, um2 um2) {
        this.f14686g = ypVar;
        ypVar.mo22273c(2);
        if (um2 != null) {
            ypVar.mo22273c(1101);
        }
    }

    /* renamed from: B0 */
    public final void mo16367B0(C5531rq rqVar) {
        this.f14686g.mo22272b(new xr1(rqVar));
        this.f14686g.mo22273c(1103);
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
        this.f14686g.mo22272b(new as1(np2));
    }

    /* renamed from: R */
    public final void mo16368R(C5531rq rqVar) {
        this.f14686g.mo22272b(new yr1(rqVar));
        this.f14686g.mo22273c(1102);
    }

    /* renamed from: a */
    public final void mo16369a() {
        this.f14686g.mo22273c(1109);
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        switch (zzbew.f27186g) {
            case 1:
                this.f14686g.mo22273c(101);
                return;
            case 2:
                this.f14686g.mo22273c(102);
                return;
            case 3:
                this.f14686g.mo22273c(5);
                return;
            case 4:
                this.f14686g.mo22273c(103);
                return;
            case 5:
                this.f14686g.mo22273c(104);
                return;
            case 6:
                this.f14686g.mo22273c(105);
                return;
            case 7:
                this.f14686g.mo22273c(106);
                return;
            default:
                this.f14686g.mo22273c(4);
                return;
        }
    }

    /* renamed from: j */
    public final synchronized void mo15614j() {
        this.f14686g.mo22273c(6);
    }

    /* renamed from: k */
    public final void mo15615k() {
        this.f14686g.mo22273c(3);
    }

    /* renamed from: r */
    public final void mo16371r(C5531rq rqVar) {
        this.f14686g.mo22272b(new zr1(rqVar));
        this.f14686g.mo22273c(1104);
    }

    /* renamed from: t0 */
    public final void mo16372t0(boolean z) {
        this.f14686g.mo22273c(true != z ? 1108 : 1107);
    }

    /* renamed from: u0 */
    public final synchronized void mo10632u0() {
        if (!this.f14687h) {
            this.f14686g.mo22273c(7);
            this.f14687h = true;
            return;
        }
        this.f14686g.mo22273c(8);
    }

    /* renamed from: v */
    public final void mo16373v(boolean z) {
        this.f14686g.mo22273c(true != z ? 1106 : 1105);
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
    }
}
