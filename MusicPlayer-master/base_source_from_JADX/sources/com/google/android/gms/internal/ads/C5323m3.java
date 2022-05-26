package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5323m3 {

    /* renamed from: a */
    private final C5470q2 f19738a;

    /* renamed from: b */
    private final tv2 f19739b;

    /* renamed from: c */
    private final mn2 f19740c = new mn2(new byte[64], 64);

    /* renamed from: d */
    private boolean f19741d;

    /* renamed from: e */
    private boolean f19742e;

    /* renamed from: f */
    private boolean f19743f;

    public C5323m3(C5470q2 q2Var, tv2 tv2) {
        this.f19738a = q2Var;
        this.f19739b = tv2;
    }

    /* renamed from: a */
    public final void mo19332a(no2 no2) throws C5464px {
        long j;
        no2.mo19775b(this.f19740c.f20098a, 0, 3);
        this.f19740c.mo19474h(0);
        this.f19740c.mo19476j(8);
        this.f19741d = this.f19740c.mo19478l();
        this.f19742e = this.f19740c.mo19478l();
        this.f19740c.mo19476j(6);
        no2.mo19775b(this.f19740c.f20098a, 0, this.f19740c.mo19469c(8));
        this.f19740c.mo19474h(0);
        if (this.f19741d) {
            this.f19740c.mo19476j(4);
            int c = this.f19740c.mo19469c(3);
            this.f19740c.mo19476j(1);
            int c2 = this.f19740c.mo19469c(15);
            this.f19740c.mo19476j(1);
            long c3 = (((long) c) << 30) | ((long) (c2 << 15)) | ((long) this.f19740c.mo19469c(15));
            this.f19740c.mo19476j(1);
            if (!this.f19743f && this.f19742e) {
                this.f19740c.mo19476j(4);
                int c4 = this.f19740c.mo19469c(3);
                this.f19740c.mo19476j(1);
                int c5 = this.f19740c.mo19469c(15);
                this.f19740c.mo19476j(1);
                int c6 = this.f19740c.mo19469c(15);
                this.f19740c.mo19476j(1);
                this.f19739b.mo21172b(((long) (c5 << 15)) | (((long) c4) << 30) | ((long) c6));
                this.f19743f = true;
            }
            j = this.f19739b.mo21172b(c3);
        } else {
            j = 0;
        }
        this.f19738a.mo15671d(j, 4);
        this.f19738a.mo15668a(no2);
        this.f19738a.mo15669b();
    }

    /* renamed from: b */
    public final void mo19333b() {
        this.f19743f = false;
        this.f19738a.zze();
    }
}
