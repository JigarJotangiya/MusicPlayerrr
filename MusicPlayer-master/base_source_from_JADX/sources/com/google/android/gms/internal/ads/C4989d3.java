package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4989d3 implements C5470q2 {

    /* renamed from: a */
    private final no2 f15480a;

    /* renamed from: b */
    private final t94 f15481b;

    /* renamed from: c */
    private final String f15482c;

    /* renamed from: d */
    private da4 f15483d;

    /* renamed from: e */
    private String f15484e;

    /* renamed from: f */
    private int f15485f = 0;

    /* renamed from: g */
    private int f15486g;

    /* renamed from: h */
    private boolean f15487h;

    /* renamed from: i */
    private boolean f15488i;

    /* renamed from: j */
    private long f15489j;

    /* renamed from: k */
    private int f15490k;

    /* renamed from: l */
    private long f15491l;

    public C4989d3(String str) {
        no2 no2 = new no2(4);
        this.f15480a = no2;
        no2.mo19781h()[0] = -1;
        this.f15481b = new t94();
        this.f15491l = -9223372036854775807L;
        this.f15482c = str;
    }

    /* renamed from: a */
    public final void mo15668a(no2 no2) {
        gs1.m24484b(this.f15483d);
        while (no2.mo19782i() > 0) {
            int i = this.f15485f;
            if (i == 0) {
                byte[] h = no2.mo19781h();
                int k = no2.mo19784k();
                int l = no2.mo19785l();
                while (true) {
                    if (k >= l) {
                        no2.mo19779f(l);
                        break;
                    }
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f15488i && (b & 224) == 224;
                    this.f15488i = z;
                    if (z2) {
                        no2.mo19779f(k + 1);
                        this.f15488i = false;
                        this.f15480a.mo19781h()[1] = h[k];
                        this.f15486g = 2;
                        this.f15485f = 1;
                        break;
                    }
                    k++;
                }
            } else if (i != 1) {
                int min = Math.min(no2.mo19782i(), this.f15490k - this.f15486g);
                ba4.m21199b(this.f15483d, no2, min);
                int i2 = this.f15486g + min;
                this.f15486g = i2;
                int i3 = this.f15490k;
                if (i2 >= i3) {
                    long j = this.f15491l;
                    if (j != -9223372036854775807L) {
                        this.f15483d.mo16889e(j, 1, i3, 0, (ca4) null);
                        this.f15491l += this.f15489j;
                    }
                    this.f15486g = 0;
                    this.f15485f = 0;
                }
            } else {
                int min2 = Math.min(no2.mo19782i(), 4 - this.f15486g);
                no2.mo19775b(this.f15480a.mo19781h(), this.f15486g, min2);
                int i4 = this.f15486g + min2;
                this.f15486g = i4;
                if (i4 >= 4) {
                    this.f15480a.mo19779f(0);
                    if (!this.f15481b.mo21043a(this.f15480a.mo19786m())) {
                        this.f15486g = 0;
                        this.f15485f = 1;
                    } else {
                        t94 t94 = this.f15481b;
                        this.f15490k = t94.f23800c;
                        if (!this.f15487h) {
                            this.f15489j = (((long) t94.f23804g) * 1000000) / ((long) t94.f23801d);
                            jb4 jb4 = new jb4();
                            jb4.mo18587h(this.f15484e);
                            jb4.mo18599s(this.f15481b.f23799b);
                            jb4.mo18592l(4096);
                            jb4.mo18582e0(this.f15481b.f23802e);
                            jb4.mo18600t(this.f15481b.f23801d);
                            jb4.mo18591k(this.f15482c);
                            this.f15483d.mo16885a(jb4.mo18605y());
                            this.f15487h = true;
                        }
                        this.f15480a.mo19779f(0);
                        ba4.m21199b(this.f15483d, this.f15480a, 4);
                        this.f15485f = 2;
                    }
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
        this.f15484e = c4Var.mo16482b();
        this.f15483d = b94.mo15724s(c4Var.mo16481a(), 1);
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f15491l = j;
        }
    }

    public final void zze() {
        this.f15485f = 0;
        this.f15486g = 0;
        this.f15488i = false;
        this.f15491l = -9223372036854775807L;
    }
}
