package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2907b;
import com.google.android.gms.ads.mediation.C3093v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class lc0 extends qb0 {

    /* renamed from: g */
    private final C3093v f19296g;

    public lc0(C3093v vVar) {
        this.f19296g = vVar;
    }

    /* renamed from: B */
    public final boolean mo19116B() {
        return this.f19296g.mo11258l();
    }

    /* renamed from: G */
    public final void mo19117G() {
        this.f19296g.mo11265s();
    }

    /* renamed from: I */
    public final boolean mo19118I() {
        return this.f19296g.mo11259m();
    }

    /* renamed from: I2 */
    public final void mo19119I2(C4863a aVar) {
        this.f19296g.mo11241F((View) C4865b.m20502K0(aVar));
    }

    /* renamed from: a1 */
    public final void mo19120a1(C4863a aVar) {
        this.f19296g.mo11263q((View) C4865b.m20502K0(aVar));
    }

    /* renamed from: c */
    public final float mo19121c() {
        return this.f19296g.mo11257k();
    }

    /* renamed from: d */
    public final float mo19122d() {
        return this.f19296g.mo11251e();
    }

    /* renamed from: e */
    public final float mo19123e() {
        return this.f19296g.mo11252f();
    }

    /* renamed from: g */
    public final Bundle mo19124g() {
        return this.f19296g.mo11253g();
    }

    /* renamed from: h */
    public final C5427ox mo19125h() {
        if (this.f19296g.mo11243H() != null) {
            return this.f19296g.mo11243H().mo11361c();
        }
        return null;
    }

    /* renamed from: i */
    public final j20 mo19126i() {
        return null;
    }

    /* renamed from: j */
    public final q20 mo19127j() {
        C2907b i = this.f19296g.mo11255i();
        if (i != null) {
            return new d20(i.mo10752a(), i.mo10754c(), i.mo10753b(), i.mo10756e(), i.mo10755d());
        }
        return null;
    }

    /* renamed from: k */
    public final C4863a mo19128k() {
        View G = this.f19296g.mo11242G();
        if (G == null) {
            return null;
        }
        return C4865b.m20503f2(G);
    }

    /* renamed from: l */
    public final C4863a mo19129l() {
        Object I = this.f19296g.mo11244I();
        if (I == null) {
            return null;
        }
        return C4865b.m20503f2(I);
    }

    /* renamed from: m */
    public final C4863a mo19130m() {
        View a = this.f19296g.mo11247a();
        if (a == null) {
            return null;
        }
        return C4865b.m20503f2(a);
    }

    /* renamed from: n */
    public final String mo19131n() {
        return this.f19296g.mo11260n();
    }

    /* renamed from: o */
    public final String mo19132o() {
        return this.f19296g.mo11249c();
    }

    /* renamed from: p5 */
    public final void mo19133p5(C4863a aVar, C4863a aVar2, C4863a aVar3) {
        this.f19296g.mo10626E((View) C4865b.m20502K0(aVar), (HashMap) C4865b.m20502K0(aVar2), (HashMap) C4865b.m20502K0(aVar3));
    }

    /* renamed from: t */
    public final List mo19134t() {
        List<C2907b> j = this.f19296g.mo11256j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (C2907b next : j) {
                arrayList.add(new d20(next.mo10752a(), next.mo10754c(), next.mo10753b(), next.mo10756e(), next.mo10755d()));
            }
        }
        return arrayList;
    }

    /* renamed from: u */
    public final String mo19135u() {
        return this.f19296g.mo11262p();
    }

    public final double zze() {
        if (this.f19296g.mo11261o() != null) {
            return this.f19296g.mo11261o().doubleValue();
        }
        return -1.0d;
    }

    public final String zzp() {
        return this.f19296g.mo11248b();
    }

    public final String zzr() {
        return this.f19296g.mo11250d();
    }

    public final String zzs() {
        return this.f19296g.mo11254h();
    }
}
