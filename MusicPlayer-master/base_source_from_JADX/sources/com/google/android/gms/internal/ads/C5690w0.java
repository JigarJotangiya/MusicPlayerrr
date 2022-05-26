package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5690w0 {

    /* renamed from: a */
    public final da4 f25148a;

    /* renamed from: b */
    public final C5247k1 f25149b = new C5247k1();

    /* renamed from: c */
    public final no2 f25150c = new no2();

    /* renamed from: d */
    public C5284l1 f25151d;

    /* renamed from: e */
    public C5542s0 f25152e;

    /* renamed from: f */
    public int f25153f;

    /* renamed from: g */
    public int f25154g;

    /* renamed from: h */
    public int f25155h;

    /* renamed from: i */
    public int f25156i;

    /* renamed from: j */
    private final no2 f25157j = new no2(1);

    /* renamed from: k */
    private final no2 f25158k = new no2();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f25159l;

    public C5690w0(da4 da4, C5284l1 l1Var, C5542s0 s0Var) {
        this.f25148a = da4;
        this.f25151d = l1Var;
        this.f25152e = s0Var;
        mo21669h(l1Var, s0Var);
    }

    /* renamed from: a */
    public final int mo21663a() {
        int i;
        if (!this.f25159l) {
            i = this.f25151d.f19141g[this.f25153f];
        } else {
            i = this.f25149b.f18703k[this.f25153f] ? 1 : 0;
        }
        return mo21668f() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final int mo21664b() {
        if (!this.f25159l) {
            return this.f25151d.f19138d[this.f25153f];
        }
        return this.f25149b.f18700h[this.f25153f];
    }

    /* renamed from: c */
    public final int mo21665c(int i, int i2) {
        no2 no2;
        C5210j1 f = mo21668f();
        if (f == null) {
            return 0;
        }
        int i3 = f.f18300d;
        if (i3 != 0) {
            no2 = this.f25149b.f18707o;
        } else {
            byte[] bArr = f.f18301e;
            wy2.m33436c(bArr);
            byte[] bArr2 = bArr;
            no2 no22 = this.f25158k;
            int length = bArr2.length;
            no22.mo19777d(bArr2, length);
            no2 = this.f25158k;
            i3 = length;
        }
        boolean c = this.f25149b.mo18780c(this.f25153f);
        boolean z = c || i2 != 0;
        this.f25157j.mo19781h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        this.f25157j.mo19779f(0);
        this.f25148a.mo16890f(this.f25157j, 1, 1);
        this.f25148a.mo16890f(no2, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.f25150c.mo19776c(8);
            byte[] h = this.f25150c.mo19781h();
            h[0] = 0;
            h[1] = 1;
            h[2] = 0;
            h[3] = (byte) i2;
            h[4] = (byte) ((i >> 24) & 255);
            h[5] = (byte) ((i >> 16) & 255);
            h[6] = (byte) ((i >> 8) & 255);
            h[7] = (byte) (i & 255);
            this.f25148a.mo16890f(this.f25150c, 8, 1);
            return i3 + 9;
        }
        no2 no23 = this.f25149b.f18707o;
        int w = no23.mo19796w();
        no23.mo19780g(-2);
        int i4 = (w * 6) + 2;
        if (i2 != 0) {
            this.f25150c.mo19776c(i4);
            byte[] h2 = this.f25150c.mo19781h();
            no23.mo19775b(h2, 0, i4);
            int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
            h2[2] = (byte) ((i5 >> 8) & 255);
            h2[3] = (byte) (i5 & 255);
            no23 = this.f25150c;
        }
        this.f25148a.mo16890f(no23, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: d */
    public final long mo21666d() {
        if (!this.f25159l) {
            return this.f25151d.f19137c[this.f25153f];
        }
        return this.f25149b.f18698f[this.f25155h];
    }

    /* renamed from: e */
    public final long mo21667e() {
        if (!this.f25159l) {
            return this.f25151d.f19140f[this.f25153f];
        }
        return this.f25149b.mo18778a(this.f25153f);
    }

    /* renamed from: f */
    public final C5210j1 mo21668f() {
        if (!this.f25159l) {
            return null;
        }
        C5247k1 k1Var = this.f25149b;
        C5542s0 s0Var = k1Var.f18693a;
        int i = wy2.f25579a;
        int i2 = s0Var.f23280a;
        C5210j1 j1Var = k1Var.f18706n;
        if (j1Var == null) {
            j1Var = this.f25151d.f19135a.mo18251a(i2);
        }
        if (j1Var == null || !j1Var.f18297a) {
            return null;
        }
        return j1Var;
    }

    /* renamed from: h */
    public final void mo21669h(C5284l1 l1Var, C5542s0 s0Var) {
        this.f25151d = l1Var;
        this.f25152e = s0Var;
        this.f25148a.mo16885a(l1Var.f19135a.f17847f);
        mo21670i();
    }

    /* renamed from: i */
    public final void mo21670i() {
        C5247k1 k1Var = this.f25149b;
        k1Var.f18696d = 0;
        k1Var.f18709q = 0;
        k1Var.f18710r = false;
        k1Var.f18704l = false;
        k1Var.f18708p = false;
        k1Var.f18706n = null;
        this.f25153f = 0;
        this.f25155h = 0;
        this.f25154g = 0;
        this.f25156i = 0;
        this.f25159l = false;
    }

    /* renamed from: k */
    public final boolean mo21671k() {
        this.f25153f++;
        if (!this.f25159l) {
            return false;
        }
        int i = this.f25154g + 1;
        this.f25154g = i;
        int[] iArr = this.f25149b.f18699g;
        int i2 = this.f25155h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f25155h = i2 + 1;
        this.f25154g = 0;
        return false;
    }
}
