package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5825zn {

    /* renamed from: a */
    public final String f26838a;

    /* renamed from: b */
    public final C5745xi f26839b;

    /* renamed from: c */
    public final C5040eh f26840c;

    /* renamed from: d */
    public final C5755xs f26841d;

    /* renamed from: e */
    public final C4957c8 f26842e;

    static {
        new C5767y3().mo22160c();
        C5765y1 y1Var = C5765y1.f26195a;
    }

    /* synthetic */ C5825zn(String str, C4996da daVar, C5822zk zkVar, C5040eh ehVar, C5755xs xsVar, C5787ym ymVar) {
        this.f26838a = str;
        this.f26839b = zkVar;
        this.f26840c = ehVar;
        this.f26841d = xsVar;
        this.f26842e = daVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5825zn)) {
            return false;
        }
        C5825zn znVar = (C5825zn) obj;
        return wy2.m33453p(this.f26838a, znVar.f26838a) && this.f26842e.equals(znVar.f26842e) && wy2.m33453p(this.f26839b, znVar.f26839b) && wy2.m33453p(this.f26840c, znVar.f26840c) && wy2.m33453p(this.f26841d, znVar.f26841d);
    }

    public final int hashCode() {
        int hashCode = this.f26838a.hashCode() * 31;
        C5745xi xiVar = this.f26839b;
        return ((((((hashCode + (xiVar != null ? xiVar.hashCode() : 0)) * 31) + this.f26840c.hashCode()) * 31) + this.f26842e.hashCode()) * 31) + this.f26841d.hashCode();
    }
}
