package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5063f3 implements C5397o3 {

    /* renamed from: a */
    private C5689w f16412a;

    /* renamed from: b */
    private tv2 f16413b;

    /* renamed from: c */
    private da4 f16414c;

    public C5063f3(String str) {
        jb4 jb4 = new jb4();
        jb4.mo18599s(str);
        this.f16412a = jb4.mo18605y();
    }

    /* renamed from: a */
    public final void mo17464a(no2 no2) {
        gs1.m24484b(this.f16413b);
        int i = wy2.f25579a;
        long d = this.f16413b.mo21174d();
        long e = this.f16413b.mo21175e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C5689w wVar = this.f16412a;
            if (e != wVar.f25137p) {
                jb4 b = wVar.mo21657b();
                b.mo18603w(e);
                C5689w y = b.mo18605y();
                this.f16412a = y;
                this.f16414c.mo16885a(y);
            }
            int i2 = no2.mo19782i();
            ba4.m21199b(this.f16414c, no2, i2);
            this.f16414c.mo16889e(d, 1, i2, 0, (ca4) null);
        }
    }

    /* renamed from: c */
    public final void mo17465c(tv2 tv2, b94 b94, C4953c4 c4Var) {
        this.f16413b = tv2;
        c4Var.mo16483c();
        da4 s = b94.mo15724s(c4Var.mo16481a(), 5);
        this.f16414c = s;
        s.mo16885a(this.f16412a);
    }
}
