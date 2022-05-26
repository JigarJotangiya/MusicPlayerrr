package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wt3 {

    /* renamed from: a */
    private final od0 f25539a = new od0();

    /* renamed from: b */
    private final ff0 f25540b = new ff0();

    /* renamed from: c */
    private final ex3 f25541c;

    /* renamed from: d */
    private final Handler f25542d;

    /* renamed from: e */
    private long f25543e;

    /* renamed from: f */
    private int f25544f;

    /* renamed from: g */
    private boolean f25545g;

    /* renamed from: h */
    private tt3 f25546h;

    /* renamed from: i */
    private tt3 f25547i;

    /* renamed from: j */
    private tt3 f25548j;

    /* renamed from: k */
    private int f25549k;

    /* renamed from: l */
    private Object f25550l;

    /* renamed from: m */
    private long f25551m;

    public wt3(ex3 ex3, Handler handler) {
        this.f25541c = ex3;
        this.f25542d = handler;
    }

    /* renamed from: A */
    private static f24 m33332A(bg0 bg0, Object obj, long j, long j2, od0 od0) {
        bg0.mo16241n(obj, od0);
        int c = od0.mo19966c(j);
        if (c == -1) {
            return new f24(obj, j2, od0.mo19965b(j));
        }
        return new f24(obj, c, od0.mo19967d(c), j2);
    }

    /* renamed from: B */
    private final void m33333B() {
        f24 f24;
        d43 zzi = g43.zzi();
        for (tt3 tt3 = this.f25546h; tt3 != null; tt3 = tt3.mo21160h()) {
            zzi.mo16855f(tt3.f23991f.f24429a);
        }
        tt3 tt32 = this.f25547i;
        if (tt32 == null) {
            f24 = null;
        } else {
            f24 = tt32.f23991f.f24429a;
        }
        this.f25542d.post(new vt3(this, zzi, f24));
    }

    /* renamed from: C */
    private final boolean m33334C(bg0 bg0, f24 f24, boolean z) {
        int a = bg0.mo15662a(f24.f25531a);
        if (!bg0.mo15666e(bg0.mo15665d(a, this.f25539a, false).f20976c, this.f25540b, 0).f16569g) {
            if (bg0.mo16236i(a, this.f25539a, this.f25540b, this.f25544f, this.f25545g) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m33335a(bg0 bg0, f24 f24) {
        if (!m33337c(f24)) {
            return false;
        }
        int i = bg0.mo16241n(f24.f25531a, this.f25539a).f20976c;
        if (bg0.mo15666e(i, this.f25540b, 0).f16576n == bg0.mo15662a(f24.f25531a)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m33336b(bg0 bg0) {
        tt3 tt3 = this.f25546h;
        if (tt3 == null) {
            return true;
        }
        int a = bg0.mo15662a(tt3.f23987b);
        while (true) {
            a = bg0.mo16236i(a, this.f25539a, this.f25540b, this.f25544f, this.f25545g);
            while (tt3.mo21160h() != null && !tt3.f23991f.f24435g) {
                tt3 = tt3.mo21160h();
            }
            tt3 h = tt3.mo21160h();
            if (a == -1 || h == null || bg0.mo15662a(h.f23987b) != a) {
                boolean p = mo21917p(tt3);
                tt3.f23991f = mo21911j(bg0, tt3.f23991f);
            } else {
                tt3 = h;
            }
        }
        boolean p2 = mo21917p(tt3);
        tt3.f23991f = mo21911j(bg0, tt3.f23991f);
        if (!p2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m33337c(f24 f24) {
        return !f24.mo21902b() && f24.f25535e == -1;
    }

    /* renamed from: v */
    private final long m33338v(bg0 bg0, Object obj, int i) {
        bg0.mo16241n(obj, this.f25539a);
        this.f25539a.mo19971g(i);
        this.f25539a.mo19974i(i);
        return 0;
    }

    /* renamed from: w */
    private final ut3 m33339w(bg0 bg0, tt3 tt3, long j) {
        long j2;
        bg0 bg02 = bg0;
        ut3 ut3 = tt3.f23991f;
        long e = (tt3.mo21157e() + ut3.f24433e) - j;
        if (ut3.f24435g) {
            long j3 = 0;
            int i = bg0.mo16236i(bg02.mo15662a(ut3.f24429a.f25531a), this.f25539a, this.f25540b, this.f25544f, this.f25545g);
            if (i == -1) {
                return null;
            }
            int i2 = bg02.mo15665d(i, this.f25539a, true).f20976c;
            Object obj = this.f25539a.f20975b;
            long j4 = ut3.f24429a.f25534d;
            if (bg02.mo15666e(i2, this.f25540b, 0).f16575m == i) {
                Pair<Object, Long> m = bg0.mo16240m(this.f25540b, this.f25539a, i2, -9223372036854775807L, Math.max(0, e));
                if (m == null) {
                    return null;
                }
                obj = m.first;
                long longValue = ((Long) m.second).longValue();
                tt3 h = tt3.mo21160h();
                if (h == null || !h.f23987b.equals(obj)) {
                    j4 = this.f25543e;
                    this.f25543e = 1 + j4;
                } else {
                    j4 = h.f23991f.f24429a.f25534d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m33340x(bg0, m33332A(bg0, obj, j2, j4, this.f25539a), j3, j2);
        }
        f24 f24 = ut3.f24429a;
        bg02.mo16241n(f24.f25531a, this.f25539a);
        if (f24.mo21902b()) {
            int i3 = f24.f25532b;
            if (this.f25539a.mo19964a(i3) == -1) {
                return null;
            }
            int e2 = this.f25539a.mo19968e(i3, f24.f25533c);
            if (e2 < 0) {
                return m33341y(bg0, f24.f25531a, i3, e2, ut3.f24431c, f24.f25534d);
            }
            long j5 = ut3.f24431c;
            if (j5 == -9223372036854775807L) {
                ff0 ff0 = this.f25540b;
                od0 od0 = this.f25539a;
                Pair<Object, Long> m2 = bg0.mo16240m(ff0, od0, od0.f20976c, -9223372036854775807L, Math.max(0, e));
                if (m2 == null) {
                    return null;
                }
                j5 = ((Long) m2.second).longValue();
            }
            m33338v(bg02, f24.f25531a, f24.f25532b);
            return m33342z(bg0, f24.f25531a, Math.max(0, j5), ut3.f24431c, f24.f25534d);
        }
        int d = this.f25539a.mo19967d(f24.f25535e);
        if (d == this.f25539a.mo19964a(f24.f25535e)) {
            m33338v(bg02, f24.f25531a, f24.f25535e);
            return m33342z(bg0, f24.f25531a, 0, ut3.f24433e, f24.f25534d);
        }
        return m33341y(bg0, f24.f25531a, f24.f25535e, d, ut3.f24433e, f24.f25534d);
    }

    /* renamed from: x */
    private final ut3 m33340x(bg0 bg0, f24 f24, long j, long j2) {
        f24 f242 = f24;
        bg0 bg02 = bg0;
        bg0.mo16241n(f242.f25531a, this.f25539a);
        if (f24.mo21902b()) {
            return m33341y(bg0, f242.f25531a, f242.f25532b, f242.f25533c, j, f242.f25534d);
        }
        return m33342z(bg0, f242.f25531a, j2, j, f242.f25534d);
    }

    /* renamed from: y */
    private final ut3 m33341y(bg0 bg0, Object obj, int i, int i2, long j, long j2) {
        f24 f24 = new f24(obj, i, i2, j2);
        long f = bg0.mo16241n(f24.f25531a, this.f25539a).mo19970f(f24.f25532b, f24.f25533c);
        if (i2 == this.f25539a.mo19967d(i)) {
            this.f25539a.mo19972h();
        }
        this.f25539a.mo19976k(f24.f25532b);
        long j3 = 0;
        if (f != -9223372036854775807L && f <= 0) {
            j3 = Math.max(0, -1 + f);
        }
        return new ut3(f24, j3, j, -9223372036854775807L, f, false, false, false, false);
    }

    /* renamed from: z */
    private final ut3 m33342z(bg0 bg0, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        bg0 bg02 = bg0;
        Object obj2 = obj;
        long j6 = j;
        bg02.mo16241n(obj2, this.f25539a);
        int b = this.f25539a.mo19965b(j6);
        f24 f24 = new f24(obj2, j3, b);
        boolean c = m33337c(f24);
        boolean a = m33335a(bg02, f24);
        boolean C = m33334C(bg02, f24, c);
        if (b != -1) {
            this.f25539a.mo19976k(b);
        }
        if (b != -1) {
            this.f25539a.mo19971g(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = j4;
        } else {
            j5 = this.f25539a.f20977d;
        }
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0, -1 + j5);
        }
        return new ut3(f24, j6, j2, j4, j5, false, c, a, C);
    }

    /* renamed from: d */
    public final tt3 mo21905d() {
        tt3 tt3 = this.f25546h;
        if (tt3 == null) {
            return null;
        }
        if (tt3 == this.f25547i) {
            this.f25547i = tt3.mo21160h();
        }
        this.f25546h.mo21166n();
        int i = this.f25549k - 1;
        this.f25549k = i;
        if (i == 0) {
            this.f25548j = null;
            tt3 tt32 = this.f25546h;
            this.f25550l = tt32.f23987b;
            this.f25551m = tt32.f23991f.f24429a.f25534d;
        }
        this.f25546h = this.f25546h.mo21160h();
        m33333B();
        return this.f25546h;
    }

    /* renamed from: e */
    public final tt3 mo21906e() {
        tt3 tt3 = this.f25547i;
        boolean z = false;
        if (!(tt3 == null || tt3.mo21160h() == null)) {
            z = true;
        }
        gs1.m24488f(z);
        this.f25547i = this.f25547i.mo21160h();
        m33333B();
        return this.f25547i;
    }

    /* renamed from: f */
    public final tt3 mo21907f() {
        return this.f25548j;
    }

    /* renamed from: g */
    public final tt3 mo21908g() {
        return this.f25546h;
    }

    /* renamed from: h */
    public final tt3 mo21909h() {
        return this.f25547i;
    }

    /* renamed from: i */
    public final ut3 mo21910i(long j, fu3 fu3) {
        tt3 tt3 = this.f25548j;
        if (tt3 != null) {
            return m33339w(fu3.f16764a, tt3, j);
        }
        return m33340x(fu3.f16764a, fu3.f16765b, fu3.f16766c, fu3.f16782s);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ut3 mo21911j(com.google.android.gms.internal.ads.bg0 r19, com.google.android.gms.internal.ads.ut3 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.f24 r3 = r2.f24429a
            boolean r12 = m33337c(r3)
            boolean r13 = r0.m33335a(r1, r3)
            boolean r14 = r0.m33334C(r1, r3, r12)
            com.google.android.gms.internal.ads.f24 r4 = r2.f24429a
            java.lang.Object r4 = r4.f25531a
            com.google.android.gms.internal.ads.od0 r5 = r0.f25539a
            r1.mo16241n(r4, r5)
            boolean r1 = r3.mo21902b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0036
            int r1 = r3.f25535e
            if (r1 != r4) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            com.google.android.gms.internal.ads.od0 r7 = r0.f25539a
            r7.mo19971g(r1)
            r7 = 0
            goto L_0x0037
        L_0x0036:
            r7 = r5
        L_0x0037:
            boolean r1 = r3.mo21902b()
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.od0 r1 = r0.f25539a
            int r5 = r3.f25532b
            int r6 = r3.f25533c
            long r5 = r1.mo19970f(r5, r6)
        L_0x0047:
            r9 = r5
            goto L_0x0054
        L_0x0049:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x004f
            r9 = r7
            goto L_0x0054
        L_0x004f:
            com.google.android.gms.internal.ads.od0 r1 = r0.f25539a
            long r5 = r1.f20977d
            goto L_0x0047
        L_0x0054:
            boolean r1 = r3.mo21902b()
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.od0 r1 = r0.f25539a
            int r4 = r3.f25532b
            r1.mo19976k(r4)
            goto L_0x006b
        L_0x0062:
            int r1 = r3.f25535e
            if (r1 == r4) goto L_0x006b
            com.google.android.gms.internal.ads.od0 r4 = r0.f25539a
            r4.mo19976k(r1)
        L_0x006b:
            com.google.android.gms.internal.ads.ut3 r15 = new com.google.android.gms.internal.ads.ut3
            long r4 = r2.f24430b
            long r1 = r2.f24431c
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wt3.mo21911j(com.google.android.gms.internal.ads.bg0, com.google.android.gms.internal.ads.ut3):com.google.android.gms.internal.ads.ut3");
    }

    /* renamed from: k */
    public final f24 mo21912k(bg0 bg0, Object obj, long j) {
        long j2;
        int a;
        int i = bg0.mo16241n(obj, this.f25539a).f20976c;
        Object obj2 = this.f25550l;
        if (obj2 == null || (a = bg0.mo15662a(obj2)) == -1 || bg0.mo15665d(a, this.f25539a, false).f20976c != i) {
            tt3 tt3 = this.f25546h;
            while (true) {
                if (tt3 == null) {
                    tt3 tt32 = this.f25546h;
                    while (true) {
                        if (tt32 != null) {
                            int a2 = bg0.mo15662a(tt32.f23987b);
                            if (a2 != -1 && bg0.mo15665d(a2, this.f25539a, false).f20976c == i) {
                                j2 = tt32.f23991f.f24429a.f25534d;
                                break;
                            }
                            tt32 = tt32.mo21160h();
                        } else {
                            j2 = this.f25543e;
                            this.f25543e = 1 + j2;
                            if (this.f25546h == null) {
                                this.f25550l = obj;
                                this.f25551m = j2;
                            }
                        }
                    }
                } else if (tt3.f23987b.equals(obj)) {
                    j2 = tt3.f23991f.f24429a.f25534d;
                    break;
                } else {
                    tt3 = tt3.mo21160h();
                }
            }
        } else {
            j2 = this.f25551m;
        }
        return m33332A(bg0, obj, j, j2, this.f25539a);
    }

    /* renamed from: l */
    public final void mo21913l() {
        if (this.f25549k != 0) {
            tt3 tt3 = this.f25546h;
            gs1.m24484b(tt3);
            this.f25550l = tt3.f23987b;
            this.f25551m = tt3.f23991f.f24429a.f25534d;
            while (tt3 != null) {
                tt3.mo21166n();
                tt3 = tt3.mo21160h();
            }
            this.f25546h = null;
            this.f25548j = null;
            this.f25547i = null;
            this.f25549k = 0;
            m33333B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo21914m(d43 d43, f24 f24) {
        this.f25541c.mo17394T(d43.mo16856g(), f24);
    }

    /* renamed from: n */
    public final void mo21915n(long j) {
        tt3 tt3 = this.f25548j;
        if (tt3 != null) {
            tt3.mo21165m(j);
        }
    }

    /* renamed from: o */
    public final boolean mo21916o(e24 e24) {
        tt3 tt3 = this.f25548j;
        return tt3 != null && tt3.f23986a == e24;
    }

    /* renamed from: p */
    public final boolean mo21917p(tt3 tt3) {
        boolean z = false;
        gs1.m24488f(tt3 != null);
        if (tt3.equals(this.f25548j)) {
            return false;
        }
        this.f25548j = tt3;
        while (tt3.mo21160h() != null) {
            tt3 = tt3.mo21160h();
            if (tt3 == this.f25547i) {
                this.f25547i = this.f25546h;
                z = true;
            }
            tt3.mo21166n();
            this.f25549k--;
        }
        this.f25548j.mo21167o((tt3) null);
        m33333B();
        return z;
    }

    /* renamed from: q */
    public final boolean mo21918q() {
        tt3 tt3 = this.f25548j;
        if (tt3 != null) {
            return !tt3.f23991f.f24437i && tt3.mo21170r() && this.f25548j.f23991f.f24433e != -9223372036854775807L && this.f25549k < 100;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo21919r(bg0 bg0, long j, long j2) {
        ut3 ut3;
        long j3;
        boolean z;
        bg0 bg02 = bg0;
        tt3 tt3 = this.f25546h;
        tt3 tt32 = null;
        while (tt3 != null) {
            ut3 ut32 = tt3.f23991f;
            if (tt32 == null) {
                ut3 = mo21911j(bg02, ut32);
                long j4 = j;
            } else {
                ut3 w = m33339w(bg02, tt32, j);
                if (w == null) {
                    return !mo21917p(tt32);
                }
                if (ut32.f24430b != w.f24430b || !ut32.f24429a.equals(w.f24429a)) {
                    return !mo21917p(tt32);
                }
                ut3 = w;
            }
            tt3.f23991f = ut3.mo21361a(ut32.f24431c);
            long j5 = ut32.f24433e;
            long j6 = ut3.f24433e;
            if (j5 == -9223372036854775807L || j5 == j6) {
                tt32 = tt3;
                tt3 = tt3.mo21160h();
            } else {
                tt3.mo21169q();
                long j7 = ut3.f24433e;
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + tt3.mo21157e();
                }
                if (tt3 == this.f25547i) {
                    boolean z2 = tt3.f23991f.f24434f;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return mo21917p(tt3) && !z;
                    }
                }
                z = false;
                if (mo21917p(tt3)) {
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo21920s(bg0 bg0, int i) {
        this.f25544f = i;
        return m33336b(bg0);
    }

    /* renamed from: t */
    public final boolean mo21921t(bg0 bg0, boolean z) {
        this.f25545g = z;
        return m33336b(bg0);
    }

    /* renamed from: u */
    public final tt3 mo21922u(mu3[] mu3Arr, b54 b54, r54 r54, eu3 eu3, ut3 ut3, c54 c54) {
        long j;
        ut3 ut32 = ut3;
        tt3 tt3 = this.f25548j;
        if (tt3 == null) {
            if (ut32.f24429a.mo21902b()) {
                long j2 = ut32.f24431c;
                if (j2 != -9223372036854775807L) {
                    j = j2;
                }
            }
            j = 0;
        } else {
            j = (tt3.mo21157e() + this.f25548j.f23991f.f24433e) - ut32.f24430b;
        }
        tt3 tt32 = new tt3(mu3Arr, j, b54, r54, eu3, ut3, c54, (byte[]) null);
        tt3 tt33 = this.f25548j;
        if (tt33 != null) {
            tt33.mo21167o(tt32);
        } else {
            this.f25546h = tt32;
            this.f25547i = tt32;
        }
        this.f25550l = null;
        this.f25548j = tt32;
        this.f25549k++;
        m33333B();
        return tt32;
    }
}
