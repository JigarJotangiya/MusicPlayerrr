package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5103g5 {

    /* renamed from: a */
    private int f16949a = 2500;

    /* renamed from: b */
    private int f16950b;

    /* renamed from: a */
    public final int mo17858a() {
        return this.f16950b;
    }

    /* renamed from: b */
    public final int mo17859b() {
        return this.f16949a;
    }

    /* renamed from: c */
    public final void mo17860c(C4955c6 c6Var) throws C4955c6 {
        int i = this.f16950b + 1;
        this.f16950b = i;
        int i2 = this.f16949a;
        this.f16949a = i2 + ((int) ((float) i2));
        if (i > 1) {
            throw c6Var;
        }
    }
}
