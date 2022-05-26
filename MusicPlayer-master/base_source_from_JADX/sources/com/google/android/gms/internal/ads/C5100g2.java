package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5100g2 implements C5470q2 {

    /* renamed from: a */
    private final mn2 f16861a;

    /* renamed from: b */
    private final no2 f16862b;

    /* renamed from: c */
    private final String f16863c;

    /* renamed from: d */
    private String f16864d;

    /* renamed from: e */
    private da4 f16865e;

    /* renamed from: f */
    private int f16866f = 0;

    /* renamed from: g */
    private int f16867g;

    /* renamed from: h */
    private boolean f16868h;

    /* renamed from: i */
    private long f16869i;

    /* renamed from: j */
    private C5689w f16870j;

    /* renamed from: k */
    private int f16871k;

    /* renamed from: l */
    private long f16872l = -9223372036854775807L;

    public C5100g2(String str) {
        mn2 mn2 = new mn2(new byte[128], 128);
        this.f16861a = mn2;
        this.f16862b = new no2(mn2.f20098a);
        this.f16863c = str;
    }

    /* renamed from: a */
    public final void mo15668a(no2 no2) {
        gs1.m24484b(this.f16865e);
        while (no2.mo19782i() > 0) {
            int i = this.f16866f;
            if (i == 0) {
                while (true) {
                    if (no2.mo19782i() <= 0) {
                        break;
                    } else if (!this.f16868h) {
                        this.f16868h = no2.mo19792s() == 11;
                    } else {
                        int s = no2.mo19792s();
                        if (s == 119) {
                            this.f16868h = false;
                            this.f16866f = 1;
                            this.f16862b.mo19781h()[0] = 11;
                            this.f16862b.mo19781h()[1] = 119;
                            this.f16867g = 2;
                            break;
                        }
                        this.f16868h = s == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(no2.mo19782i(), this.f16871k - this.f16867g);
                ba4.m21199b(this.f16865e, no2, min);
                int i2 = this.f16867g + min;
                this.f16867g = i2;
                int i3 = this.f16871k;
                if (i2 == i3) {
                    long j = this.f16872l;
                    if (j != -9223372036854775807L) {
                        this.f16865e.mo16889e(j, 1, i3, 0, (ca4) null);
                        this.f16872l += this.f16869i;
                    }
                    this.f16866f = 0;
                }
            } else {
                byte[] h = this.f16862b.mo19781h();
                int min2 = Math.min(no2.mo19782i(), 128 - this.f16867g);
                no2.mo19775b(h, this.f16867g, min2);
                int i4 = this.f16867g + min2;
                this.f16867g = i4;
                if (i4 == 128) {
                    this.f16861a.mo19474h(0);
                    c84 d = d84.m22381d(this.f16861a);
                    C5689w wVar = this.f16870j;
                    if (wVar == null || d.f14900c != wVar.f25146y || d.f14899b != wVar.f25147z || !wy2.m33453p(d.f14898a, wVar.f25133l)) {
                        jb4 jb4 = new jb4();
                        jb4.mo18587h(this.f16864d);
                        jb4.mo18599s(d.f14898a);
                        jb4.mo18582e0(d.f14900c);
                        jb4.mo18600t(d.f14899b);
                        jb4.mo18591k(this.f16863c);
                        C5689w y = jb4.mo18605y();
                        this.f16870j = y;
                        this.f16865e.mo16885a(y);
                    }
                    this.f16871k = d.f14901d;
                    this.f16869i = (((long) d.f14902e) * 1000000) / ((long) this.f16870j.f25147z);
                    this.f16862b.mo19779f(0);
                    ba4.m21199b(this.f16865e, this.f16862b, 128);
                    this.f16866f = 2;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo15669b() {
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        c4Var.mo16483c();
        this.f16864d = c4Var.mo16482b();
        this.f16865e = b94.mo15724s(c4Var.mo16481a(), 1);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16872l = j;
        }
    }

    public final void zze() {
        this.f16866f = 0;
        this.f16867g = 0;
        this.f16868h = false;
        this.f16872l = -9223372036854775807L;
    }
}
