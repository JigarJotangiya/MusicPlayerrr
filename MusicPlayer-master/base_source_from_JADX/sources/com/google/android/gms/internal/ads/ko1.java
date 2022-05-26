package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ko1 extends l40 {

    /* renamed from: g */
    private final String f18939g;

    /* renamed from: h */
    private final vj1 f18940h;

    /* renamed from: i */
    private final bk1 f18941i;

    public ko1(String str, vj1 vj1, bk1 bk1) {
        this.f18939g = str;
        this.f18940h = vj1;
        this.f18941i = bk1;
    }

    /* renamed from: B */
    public final void mo18936B() {
        this.f18940h.mo21542h();
    }

    /* renamed from: C */
    public final boolean mo18937C() {
        return this.f18940h.mo21555u();
    }

    /* renamed from: G */
    public final void mo18938G() throws RemoteException {
        this.f18940h.mo17837a();
    }

    /* renamed from: H6 */
    public final void mo18939H6(Bundle bundle) throws RemoteException {
        this.f18940h.mo21541S(bundle);
    }

    /* renamed from: R */
    public final void mo18940R() throws RemoteException {
        this.f18940h.mo21531I();
    }

    /* renamed from: V2 */
    public final void mo18941V2(Bundle bundle) throws RemoteException {
        this.f18940h.mo21546l(bundle);
    }

    /* renamed from: Y4 */
    public final boolean mo18942Y4(Bundle bundle) throws RemoteException {
        return this.f18940h.mo21557x(bundle);
    }

    /* renamed from: Y5 */
    public final void mo18943Y5(C5797yw ywVar) throws RemoteException {
        this.f18940h.mo21538P(ywVar);
    }

    /* renamed from: Z */
    public final boolean mo18944Z() throws RemoteException {
        return !this.f18941i.mo16284f().isEmpty() && this.f18941i.mo16267S() != null;
    }

    /* renamed from: a3 */
    public final void mo18945a3(C5685vw vwVar) throws RemoteException {
        this.f18940h.mo21549o(vwVar);
    }

    /* renamed from: a4 */
    public final void mo18946a4(j40 j40) throws RemoteException {
        this.f18940h.mo21551q(j40);
    }

    /* renamed from: c */
    public final Bundle mo18947c() throws RemoteException {
        return this.f18941i.mo16260L();
    }

    /* renamed from: d */
    public final C5316lx mo18948d() throws RemoteException {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22311D4)).booleanValue()) {
            return null;
        }
        return this.f18940h.mo17839c();
    }

    /* renamed from: e */
    public final C5427ox mo18803e() throws RemoteException {
        return this.f18941i.mo16266R();
    }

    /* renamed from: g */
    public final j20 mo18804g() throws RemoteException {
        return this.f18941i.mo16268T();
    }

    /* renamed from: h */
    public final n20 mo18805h() throws RemoteException {
        return this.f18940h.mo21526A().mo22042a();
    }

    /* renamed from: i */
    public final q20 mo18806i() throws RemoteException {
        return this.f18941i.mo16270V();
    }

    /* renamed from: j */
    public final C4863a mo18807j() throws RemoteException {
        return this.f18941i.mo16277b0();
    }

    /* renamed from: j5 */
    public final void mo18949j5() {
        this.f18940h.mo21548n();
    }

    /* renamed from: k */
    public final String mo18808k() throws RemoteException {
        return this.f18941i.mo16281d0();
    }

    /* renamed from: l */
    public final String mo18809l() throws RemoteException {
        return this.f18941i.mo16283e0();
    }

    /* renamed from: m */
    public final C4863a mo18810m() throws RemoteException {
        return C4865b.m20503f2(this.f18940h);
    }

    /* renamed from: n */
    public final String mo18811n() throws RemoteException {
        return this.f18941i.mo16278c();
    }

    /* renamed from: o */
    public final String mo18812o() throws RemoteException {
        return this.f18941i.mo16289h0();
    }

    /* renamed from: t */
    public final List<?> mo18813t() throws RemoteException {
        if (mo18944Z()) {
            return this.f18941i.mo16284f();
        }
        return Collections.emptyList();
    }

    /* renamed from: u */
    public final List<?> mo18814u() throws RemoteException {
        return this.f18941i.mo16282e();
    }

    /* renamed from: w4 */
    public final void mo18950w4(C5205ix ixVar) throws RemoteException {
        this.f18940h.mo21550p(ixVar);
    }

    public final double zze() throws RemoteException {
        return this.f18941i.mo16256A();
    }

    public final String zzp() throws RemoteException {
        return this.f18941i.mo16285f0();
    }

    public final String zzr() throws RemoteException {
        return this.f18939g;
    }

    public final String zzs() throws RemoteException {
        return this.f18941i.mo16276b();
    }
}
