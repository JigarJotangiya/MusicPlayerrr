package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5283l0 {

    /* renamed from: a */
    public final int f19119a;

    /* renamed from: b */
    public int f19120b;

    /* renamed from: c */
    public int f19121c;

    /* renamed from: d */
    public long f19122d;

    /* renamed from: e */
    private final boolean f19123e;

    /* renamed from: f */
    private final no2 f19124f;

    /* renamed from: g */
    private final no2 f19125g;

    /* renamed from: h */
    private int f19126h;

    /* renamed from: i */
    private int f19127i;

    public C5283l0(no2 no2, no2 no22, boolean z) throws C5464px {
        this.f19125g = no2;
        this.f19124f = no22;
        this.f19123e = z;
        no22.mo19779f(12);
        this.f19119a = no22.mo19795v();
        no2.mo19779f(12);
        this.f19127i = no2.mo19795v();
        c94.m21830b(no2.mo19786m() != 1 ? false : true, "first_chunk must be 1");
        this.f19120b = -1;
    }

    /* renamed from: a */
    public final boolean mo19044a() {
        long j;
        int i = this.f19120b + 1;
        this.f19120b = i;
        if (i == this.f19119a) {
            return false;
        }
        if (this.f19123e) {
            j = this.f19124f.mo19767B();
        } else {
            j = this.f19124f.mo19766A();
        }
        this.f19122d = j;
        if (this.f19120b == this.f19126h) {
            this.f19121c = this.f19125g.mo19795v();
            this.f19125g.mo19780g(4);
            int i2 = -1;
            int i3 = this.f19127i - 1;
            this.f19127i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f19125g.mo19795v();
            }
            this.f19126h = i2;
        }
        return true;
    }
}
