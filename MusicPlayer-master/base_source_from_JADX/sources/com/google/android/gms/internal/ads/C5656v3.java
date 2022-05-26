package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5656v3 implements C5397o3 {

    /* renamed from: a */
    private final mn2 f24563a = new mn2(new byte[4], 4);

    /* renamed from: b */
    final /* synthetic */ C5730x3 f24564b;

    public C5656v3(C5730x3 x3Var) {
        this.f24564b = x3Var;
    }

    /* renamed from: a */
    public final void mo17464a(no2 no2) {
        if (no2.mo19792s() == 0 && (no2.mo19792s() & 128) != 0) {
            no2.mo19780g(6);
            int i = no2.mo19782i() / 4;
            for (int i2 = 0; i2 < i; i2++) {
                no2.mo19774a(this.f24563a, 4);
                int c = this.f24563a.mo19469c(16);
                this.f24563a.mo19476j(3);
                if (c == 0) {
                    this.f24563a.mo19476j(13);
                } else {
                    int c2 = this.f24563a.mo19469c(13);
                    if (this.f24564b.f25636e.get(c2) == null) {
                        this.f24564b.f25636e.put(c2, new C5434p3(new C5693w3(this.f24564b, c2)));
                        C5730x3 x3Var = this.f24564b;
                        x3Var.f25642k = x3Var.f25642k + 1;
                    }
                }
            }
            this.f24564b.f25636e.remove(0);
        }
    }

    /* renamed from: c */
    public final void mo17465c(tv2 tv2, b94 b94, C4953c4 c4Var) {
    }
}
