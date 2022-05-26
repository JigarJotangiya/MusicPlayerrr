package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Arrays;
import java.util.List;
import p082e.p098e.C3465a;
import p082e.p098e.C3478g;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class io1 extends i30 {

    /* renamed from: g */
    private final Context f18131g;

    /* renamed from: h */
    private final bk1 f18132h;

    /* renamed from: i */
    private bl1 f18133i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public vj1 f18134j;

    public io1(Context context, bk1 bk1, bl1 bl1, vj1 vj1) {
        this.f18131g = context;
        this.f18132h = bk1;
        this.f18133i = bl1;
        this.f18134j = vj1;
    }

    /* renamed from: K6 */
    public final String mo18455K6(String str) {
        return this.f18132h.mo16265Q().get(str);
    }

    /* renamed from: d */
    public final C4863a mo18063d() {
        return C4865b.m20503f2(this.f18131g);
    }

    /* renamed from: e */
    public final String mo18064e() {
        return this.f18132h.mo16287g0();
    }

    /* renamed from: e0 */
    public final void mo18456e0(C4863a aVar) {
        vj1 vj1;
        Object K0 = C4865b.m20502K0(aVar);
        if ((K0 instanceof View) && this.f18132h.mo16279c0() != null && (vj1 = this.f18134j) != null) {
            vj1.mo21544j((View) K0);
        }
    }

    /* renamed from: h */
    public final List<String> mo18457h() {
        C3478g<String, d20> P = this.f18132h.mo16264P();
        C3478g<String, String> Q = this.f18132h.mo16265Q();
        String[] strArr = new String[(P.size() + Q.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = P.mo12395i(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = Q.mo12395i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: i */
    public final void mo18458i() {
        vj1 vj1 = this.f18134j;
        if (vj1 != null) {
            vj1.mo17837a();
        }
        this.f18134j = null;
        this.f18133i = null;
    }

    /* renamed from: j */
    public final void mo18459j() {
        String a = this.f18132h.mo16275a();
        if ("Google".equals(a)) {
            ul0.m31862g("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            ul0.m31862g("Not starting OMID session. OM partner name has not been configured.");
        } else {
            vj1 vj1 = this.f18134j;
            if (vj1 != null) {
                vj1.mo21532J(a, false);
            }
        }
    }

    /* renamed from: k */
    public final void mo18460k() {
        vj1 vj1 = this.f18134j;
        if (vj1 != null) {
            vj1.mo21543i();
        }
    }

    /* renamed from: k0 */
    public final boolean mo18065k0(C4863a aVar) {
        bl1 bl1;
        Object K0 = C4865b.m20502K0(aVar);
        if (!(K0 instanceof ViewGroup) || (bl1 = this.f18133i) == null || !bl1.mo16319f((ViewGroup) K0)) {
            return false;
        }
        this.f18132h.mo16274Z().mo17682Z0(new ho1(this));
        return true;
    }

    /* renamed from: o0 */
    public final void mo18461o0(String str) {
        vj1 vj1 = this.f18134j;
        if (vj1 != null) {
            vj1.mo21540R(str);
        }
    }

    /* renamed from: v */
    public final q20 mo18462v(String str) {
        return this.f18132h.mo16264P().get(str);
    }

    public final C5427ox zze() {
        return this.f18132h.mo16266R();
    }

    public final boolean zzp() {
        vj1 vj1 = this.f18134j;
        if ((vj1 == null || vj1.mo21556v()) && this.f18132h.mo16273Y() != null && this.f18132h.mo16274Z() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr() {
        C4863a c0 = this.f18132h.mo16279c0();
        if (c0 != null) {
            C2971s.m13206i().mo18275P(c0);
            if (this.f18132h.mo16273Y() == null) {
                return true;
            }
            this.f18132h.mo16273Y().mo16880n0("onSdkLoaded", new C3465a());
            return true;
        }
        ul0.m31862g("Trying to start OMID session before creation.");
        return false;
    }
}
