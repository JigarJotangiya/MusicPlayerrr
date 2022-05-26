package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5434p3 implements C4990d4 {

    /* renamed from: a */
    private final C5397o3 f21306a;

    /* renamed from: b */
    private final no2 f21307b = new no2(32);

    /* renamed from: c */
    private int f21308c;

    /* renamed from: d */
    private int f21309d;

    /* renamed from: e */
    private boolean f21310e;

    /* renamed from: f */
    private boolean f21311f;

    public C5434p3(C5397o3 o3Var) {
        this.f21306a = o3Var;
    }

    /* renamed from: a */
    public final void mo16851a(no2 no2, int i) {
        int i2 = i & 1;
        int k = i2 != 0 ? no2.mo19784k() + no2.mo19792s() : -1;
        if (this.f21311f) {
            if (i2 != 0) {
                this.f21311f = false;
                no2.mo19779f(k);
                this.f21309d = 0;
            } else {
                return;
            }
        }
        while (no2.mo19782i() > 0) {
            int i3 = this.f21309d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s = no2.mo19792s();
                    no2.mo19779f(no2.mo19784k() - 1);
                    if (s == 255) {
                        this.f21311f = true;
                        return;
                    }
                }
                int min = Math.min(no2.mo19782i(), 3 - this.f21309d);
                no2.mo19775b(this.f21307b.mo19781h(), this.f21309d, min);
                int i4 = this.f21309d + min;
                this.f21309d = i4;
                if (i4 == 3) {
                    this.f21307b.mo19779f(0);
                    this.f21307b.mo19778e(3);
                    this.f21307b.mo19780g(1);
                    int s2 = this.f21307b.mo19792s();
                    int s3 = this.f21307b.mo19792s();
                    this.f21310e = (s2 & 128) != 0;
                    this.f21308c = (((s2 & 15) << 8) | s3) + 3;
                    int j = this.f21307b.mo19783j();
                    int i5 = this.f21308c;
                    if (j < i5) {
                        int j2 = this.f21307b.mo19783j();
                        this.f21307b.mo19773H(Math.min(4098, Math.max(i5, j2 + j2)));
                    }
                }
            } else {
                int min2 = Math.min(no2.mo19782i(), this.f21308c - this.f21309d);
                no2.mo19775b(this.f21307b.mo19781h(), this.f21309d, min2);
                int i6 = this.f21309d + min2;
                this.f21309d = i6;
                int i7 = this.f21308c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f21310e) {
                        this.f21307b.mo19778e(i7);
                    } else if (wy2.m33418M(this.f21307b.mo19781h(), 0, this.f21308c, -1) != 0) {
                        this.f21311f = true;
                        return;
                    } else {
                        this.f21307b.mo19778e(this.f21308c - 4);
                    }
                    this.f21307b.mo19779f(0);
                    this.f21306a.mo17464a(this.f21307b);
                    this.f21309d = 0;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo16852b() {
        this.f21311f = true;
    }

    /* renamed from: c */
    public final void mo16853c(tv2 tv2, b94 b94, C4953c4 c4Var) {
        this.f21306a.mo17465c(tv2, b94, c4Var);
        this.f21311f = true;
    }
}
