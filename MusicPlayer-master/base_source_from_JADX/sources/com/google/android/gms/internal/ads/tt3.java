package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tt3 {

    /* renamed from: a */
    public final e24 f23986a;

    /* renamed from: b */
    public final Object f23987b;

    /* renamed from: c */
    public final u34[] f23988c;

    /* renamed from: d */
    public boolean f23989d;

    /* renamed from: e */
    public boolean f23990e;

    /* renamed from: f */
    public ut3 f23991f;

    /* renamed from: g */
    public boolean f23992g;

    /* renamed from: h */
    private final boolean[] f23993h;

    /* renamed from: i */
    private final mu3[] f23994i;

    /* renamed from: j */
    private final b54 f23995j;

    /* renamed from: k */
    private final eu3 f23996k;

    /* renamed from: l */
    private tt3 f23997l;

    /* renamed from: m */
    private uj0 f23998m = uj0.f24342d;

    /* renamed from: n */
    private c54 f23999n;

    /* renamed from: o */
    private long f24000o;

    public tt3(mu3[] mu3Arr, long j, b54 b54, r54 r54, eu3 eu3, ut3 ut3, c54 c54, byte[] bArr) {
        ut3 ut32 = ut3;
        this.f23994i = mu3Arr;
        this.f24000o = j;
        this.f23995j = b54;
        this.f23996k = eu3;
        f24 f24 = ut32.f24429a;
        this.f23987b = f24.f25531a;
        this.f23991f = ut32;
        this.f23999n = c54;
        this.f23988c = new u34[2];
        this.f23993h = new boolean[2];
        long j2 = ut32.f24430b;
        long j3 = ut32.f24432d;
        r54 r542 = r54;
        e24 o = eu3.mo17354o(f24, r54, j2);
        this.f23986a = j3 != -9223372036854775807L ? new m14(o, true, 0, j3) : o;
    }

    /* renamed from: s */
    private final void m31473s() {
        if (m31475u()) {
            int i = 0;
            while (true) {
                c54 c54 = this.f23999n;
                if (i < c54.f14829a) {
                    c54.mo16503b(i);
                    h44 h44 = this.f23999n.f14833e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m31474t() {
        if (m31475u()) {
            int i = 0;
            while (true) {
                c54 c54 = this.f23999n;
                if (i < c54.f14829a) {
                    c54.mo16503b(i);
                    h44 h44 = this.f23999n.f14833e[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m31475u() {
        return this.f23997l == null;
    }

    /* renamed from: a */
    public final long mo21153a(c54 c54, long j, boolean z) {
        return mo21154b(c54, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo21154b(c54 c54, long j, boolean z, boolean[] zArr) {
        c54 c542 = c54;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c542.f14829a) {
                break;
            }
            boolean[] zArr2 = this.f23993h;
            if (z || !c54.mo16502a(this.f23999n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            mu3[] mu3Arr = this.f23994i;
            if (i2 >= 2) {
                break;
            }
            mu3Arr[i2].mo16557a();
            i2++;
        }
        m31473s();
        this.f23999n = c542;
        m31474t();
        long j2 = this.f23986a.mo17100j(c542.f14833e, this.f23993h, this.f23988c, zArr, j);
        int i3 = 0;
        while (true) {
            mu3[] mu3Arr2 = this.f23994i;
            if (i3 >= 2) {
                break;
            }
            mu3Arr2[i3].mo16557a();
            i3++;
        }
        this.f23990e = false;
        int i4 = 0;
        while (true) {
            u34[] u34Arr = this.f23988c;
            if (i4 >= 2) {
                return j2;
            }
            if (u34Arr[i4] != null) {
                gs1.m24488f(c54.mo16503b(i4));
                this.f23994i[i4].mo16557a();
                this.f23990e = true;
            } else {
                gs1.m24488f(c542.f14833e[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long mo21155c() {
        if (!this.f23989d) {
            return this.f23991f.f24430b;
        }
        long a = this.f23990e ? this.f23986a.mo17092a() : Long.MIN_VALUE;
        return a == Long.MIN_VALUE ? this.f23991f.f24433e : a;
    }

    /* renamed from: d */
    public final long mo21156d() {
        if (!this.f23989d) {
            return 0;
        }
        return this.f23986a.mo17093b();
    }

    /* renamed from: e */
    public final long mo21157e() {
        return this.f24000o;
    }

    /* renamed from: f */
    public final long mo21158f() {
        return this.f23991f.f24430b + this.f24000o;
    }

    /* renamed from: g */
    public final uj0 mo21159g() {
        return this.f23998m;
    }

    /* renamed from: h */
    public final tt3 mo21160h() {
        return this.f23997l;
    }

    /* renamed from: i */
    public final c54 mo21161i() {
        return this.f23999n;
    }

    /* renamed from: j */
    public final c54 mo21162j(float f, bg0 bg0) throws ji3 {
        c54 a = this.f23995j.mo16073a(this.f23994i, this.f23998m, this.f23991f.f24429a, bg0);
        for (h44 h44 : a.f14833e) {
        }
        return a;
    }

    /* renamed from: k */
    public final void mo21163k(long j) {
        gs1.m24488f(m31475u());
        this.f23986a.mo17095d(j - this.f24000o);
    }

    /* renamed from: l */
    public final void mo21164l(float f, bg0 bg0) throws ji3 {
        this.f23989d = true;
        this.f23998m = this.f23986a.mo17094c();
        c54 j = mo21162j(f, bg0);
        ut3 ut3 = this.f23991f;
        long j2 = ut3.f24430b;
        long j3 = ut3.f24433e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0, j3 - 1);
        }
        long a = mo21153a(j, j2, false);
        long j4 = this.f24000o;
        ut3 ut32 = this.f23991f;
        this.f24000o = j4 + (ut32.f24430b - a);
        this.f23991f = ut32.mo21362b(a);
    }

    /* renamed from: m */
    public final void mo21165m(long j) {
        gs1.m24488f(m31475u());
        if (this.f23989d) {
            this.f23986a.mo17096e(j - this.f24000o);
        }
    }

    /* renamed from: n */
    public final void mo21166n() {
        m31473s();
        eu3 eu3 = this.f23996k;
        e24 e24 = this.f23986a;
        try {
            if (e24 instanceof m14) {
                eu3.mo17347h(((m14) e24).f19701g);
            } else {
                eu3.mo17347h(e24);
            }
        } catch (RuntimeException e) {
            y92.m34067a("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void mo21167o(tt3 tt3) {
        if (tt3 != this.f23997l) {
            m31473s();
            this.f23997l = tt3;
            m31474t();
        }
    }

    /* renamed from: p */
    public final void mo21168p(long j) {
        this.f24000o = 0;
    }

    /* renamed from: q */
    public final void mo21169q() {
        e24 e24 = this.f23986a;
        if (e24 instanceof m14) {
            long j = this.f23991f.f24432d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((m14) e24).mo19324n(0, j);
        }
    }

    /* renamed from: r */
    public final boolean mo21170r() {
        return this.f23989d && (!this.f23990e || this.f23986a.mo17092a() == Long.MIN_VALUE);
    }
}
