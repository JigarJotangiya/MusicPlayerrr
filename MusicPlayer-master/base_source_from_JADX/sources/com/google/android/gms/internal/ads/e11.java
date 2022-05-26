package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e11 {

    /* renamed from: a */
    private final gu2 f15828a;

    /* renamed from: b */
    private final gt1 f15829b;

    /* renamed from: c */
    private final np2 f15830c;

    public e11(gt1 gt1, np2 np2, gu2 gu2) {
        this.f15828a = gu2;
        this.f15829b = gt1;
        this.f15830c = np2;
    }

    /* renamed from: b */
    private static String m22793b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    /* renamed from: a */
    public final void mo17078a(long j, int i) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
            gu2 gu2 = this.f15828a;
            fu2 b = fu2.m23966b("ad_closed");
            b.mo17742g(this.f15830c.f20683b.f20121b);
            b.mo17738a("show_time", String.valueOf(j));
            b.mo17738a("ad_format", "app_open_ad");
            b.mo17738a("acr", m22793b(i));
            gu2.mo18029a(b);
            return;
        }
        ft1 a = this.f15829b.mo18022a();
        a.mo17732d(this.f15830c.f20683b.f20121b);
        a.mo17730b("action", "ad_closed");
        a.mo17730b("show_time", String.valueOf(j));
        a.mo17730b("ad_format", "app_open_ad");
        a.mo17730b("acr", m22793b(i));
        a.mo17734f();
    }
}
