package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lr1 implements yr3<C5790yp> {

    /* renamed from: a */
    private final ms3<Context> f19507a;

    /* renamed from: b */
    private final ms3<String> f19508b;

    /* renamed from: c */
    private final ms3<zzcjf> f19509c;

    /* renamed from: d */
    private final ms3<C5124gq> f19510d;

    /* renamed from: e */
    private final ms3<String> f19511e;

    public lr1(ms3<Context> ms3, ms3<String> ms32, ms3<zzcjf> ms33, ms3<C5124gq> ms34, ms3<String> ms35) {
        this.f19507a = ms3;
        this.f19508b = ms32;
        this.f19509c = ms33;
        this.f19510d = ms34;
        this.f19511e = ms35;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Context b = ((rt0) this.f19507a).mo20741b();
        String b2 = ((hx1) this.f19508b).mo10679a();
        zzcjf b3 = ((cu0) this.f19509c).mo16749b();
        C5124gq a = this.f19510d.mo10679a();
        String a2 = this.f19511e.mo10679a();
        C5790yp ypVar = new C5790yp(new C5012dq(b));
        C5570ss D = C5607ts.m31455D();
        D.mo20955r(b3.f27377h);
        D.mo20957t(b3.f27378i);
        D.mo20956s(true != b3.f27379j ? 2 : 0);
        ypVar.mo22272b(new kr1(a, b2, (C5607ts) D.mo19761n(), a2));
        return ypVar;
    }
}
