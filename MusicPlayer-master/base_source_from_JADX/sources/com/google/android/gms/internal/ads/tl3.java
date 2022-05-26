package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class tl3 implements lo3 {

    /* renamed from: a */
    private final sl3 f23936a;

    /* renamed from: b */
    private int f23937b;

    /* renamed from: c */
    private int f23938c;

    /* renamed from: d */
    private int f23939d = 0;

    private tl3(sl3 sl3) {
        zm3.m34701f(sl3, "input");
        this.f23936a = sl3;
        sl3.f23545c = this;
    }

    /* renamed from: K */
    private final <T> T m31336K(to3<T> to3, cm3 cm3) throws IOException {
        int i = this.f23938c;
        this.f23938c = ((this.f23937b >>> 3) << 3) | 4;
        try {
            T zze = to3.zze();
            to3.mo16705d(zze, this, cm3);
            to3.mo16704c(zze);
            if (this.f23937b == this.f23938c) {
                return zze;
            }
            throw bn3.zzg();
        } finally {
            this.f23938c = i;
        }
    }

    /* renamed from: L */
    private final <T> T m31337L(to3<T> to3, cm3 cm3) throws IOException {
        int r = this.f23936a.mo19439r();
        sl3 sl3 = this.f23936a;
        if (sl3.f23543a < sl3.f23544b) {
            int k = sl3.mo19432k(r);
            T zze = to3.zze();
            this.f23936a.f23543a++;
            to3.mo16705d(zze, this, cm3);
            to3.mo16704c(zze);
            this.f23936a.mo19417A(0);
            sl3 sl32 = this.f23936a;
            sl32.f23543a--;
            sl32.mo19425a(k);
            return zze;
        }
        throw new bn3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: N */
    private final void m31338N(int i) throws IOException {
        if (this.f23936a.mo19431j() != i) {
            throw bn3.zzj();
        }
    }

    /* renamed from: O */
    private final void m31339O(int i) throws IOException {
        if ((this.f23937b & 7) != i) {
            throw bn3.zza();
        }
    }

    /* renamed from: P */
    private static final void m31340P(int i) throws IOException {
        if ((i & 3) != 0) {
            throw bn3.zzg();
        }
    }

    /* renamed from: Q */
    private static final void m31341Q(int i) throws IOException {
        if ((i & 7) != 0) {
            throw bn3.zzg();
        }
    }

    /* renamed from: R */
    public static tl3 m31342R(sl3 sl3) {
        tl3 tl3 = sl3.f23545c;
        return tl3 != null ? tl3 : new tl3(sl3);
    }

    /* renamed from: A */
    public final <T> T mo19191A(to3<T> to3, cm3 cm3) throws IOException {
        m31339O(3);
        return m31336K(to3, cm3);
    }

    /* renamed from: B */
    public final void mo19192B(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31340P(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    rm3.mo20677L(this.f23936a.mo19434m());
                } while (this.f23936a.mo19431j() < j);
            } else if (i == 5) {
                do {
                    rm3.mo20677L(this.f23936a.mo19434m());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31340P(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19434m()));
                } while (this.f23936a.mo19431j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19434m()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: C */
    public final void mo19193C(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    on3.mo20060t(this.f23936a.mo19443v());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    on3.mo20060t(this.f23936a.mo19443v());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f23936a.mo19443v()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Long.valueOf(this.f23936a.mo19443v()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: D */
    public final <T> void mo19194D(List<T> list, to3<T> to3, cm3 cm3) throws IOException {
        int q;
        int i = this.f23937b;
        if ((i & 7) == 2) {
            do {
                list.add(m31337L(to3, cm3));
                if (!this.f23936a.mo19426b() && this.f23939d == 0) {
                    q = this.f23936a.mo19438q();
                } else {
                    return;
                }
            } while (q == i);
            this.f23939d = q;
            return;
        }
        throw bn3.zza();
    }

    /* renamed from: E */
    public final void mo19195E(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            int i = this.f23937b & 7;
            if (i == 1) {
                do {
                    on3.mo20060t(this.f23936a.mo19440s());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31341Q(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    on3.mo20060t(this.f23936a.mo19440s());
                } while (this.f23936a.mo19431j() < j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f23936a.mo19440s()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31341Q(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Long.valueOf(this.f23936a.mo19440s()));
                } while (this.f23936a.mo19431j() < j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: F */
    public final void mo19196F(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    rm3.mo20677L(this.f23936a.mo19437p());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    rm3.mo20677L(this.f23936a.mo19437p());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19437p()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19437p()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: G */
    public final void mo19197G(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    rm3.mo20677L(this.f23936a.mo19439r());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    rm3.mo20677L(this.f23936a.mo19439r());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19439r()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19439r()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: H */
    public final void mo19198H(List<Boolean> list) throws IOException {
        int q;
        int q2;
        if (list instanceof al3) {
            al3 al3 = (al3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    al3.mo15872p(this.f23936a.mo19427c());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    al3.mo15872p(this.f23936a.mo19427c());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f23936a.mo19427c()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Boolean.valueOf(this.f23936a.mo19427c()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: I */
    public final void mo19199I(List<Float> list) throws IOException {
        int q;
        int q2;
        if (list instanceof km3) {
            km3 km3 = (km3) list;
            int i = this.f23937b & 7;
            if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31340P(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    km3.mo18925p(this.f23936a.mo19430i());
                } while (this.f23936a.mo19431j() < j);
            } else if (i == 5) {
                do {
                    km3.mo18925p(this.f23936a.mo19430i());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31340P(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Float.valueOf(this.f23936a.mo19430i()));
                } while (this.f23936a.mo19431j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f23936a.mo19430i()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: J */
    public final void mo21115J(List<String> list, boolean z) throws IOException {
        int q;
        int q2;
        if ((this.f23937b & 7) != 2) {
            throw bn3.zza();
        } else if ((list instanceof hn3) && !z) {
            hn3 hn3 = (hn3) list;
            do {
                hn3.mo17992n(zzp());
                if (!this.f23936a.mo19426b()) {
                    q2 = this.f23936a.mo19438q();
                } else {
                    return;
                }
            } while (q2 == this.f23937b);
            this.f23939d = q2;
        } else {
            do {
                list.add(z ? mo19221u() : mo19214n());
                if (!this.f23936a.mo19426b()) {
                    q = this.f23936a.mo19438q();
                } else {
                    return;
                }
            } while (q == this.f23937b);
            this.f23939d = q;
        }
    }

    /* renamed from: M */
    public final boolean mo19200M() throws IOException {
        m31339O(0);
        return this.f23936a.mo19427c();
    }

    /* renamed from: a */
    public final float mo19201a() throws IOException {
        m31339O(5);
        return this.f23936a.mo19430i();
    }

    /* renamed from: b */
    public final int mo19202b() throws IOException {
        int i = this.f23939d;
        if (i != 0) {
            this.f23937b = i;
            this.f23939d = 0;
        } else {
            i = this.f23936a.mo19438q();
            this.f23937b = i;
        }
        if (i == 0 || i == this.f23938c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: c */
    public final int mo19203c() throws IOException {
        m31339O(5);
        return this.f23936a.mo19434m();
    }

    /* renamed from: d */
    public final int mo19204d() throws IOException {
        m31339O(0);
        return this.f23936a.mo19435n();
    }

    /* renamed from: e */
    public final int mo19205e() throws IOException {
        m31339O(5);
        return this.f23936a.mo19436o();
    }

    /* renamed from: f */
    public final int mo19206f() {
        return this.f23937b;
    }

    /* renamed from: g */
    public final int mo19207g() throws IOException {
        m31339O(0);
        return this.f23936a.mo19437p();
    }

    /* renamed from: h */
    public final int mo19208h() throws IOException {
        m31339O(0);
        return this.f23936a.mo19439r();
    }

    /* renamed from: i */
    public final long mo19209i() throws IOException {
        m31339O(1);
        return this.f23936a.mo19440s();
    }

    /* renamed from: j */
    public final long mo19210j() throws IOException {
        m31339O(0);
        return this.f23936a.mo19441t();
    }

    /* renamed from: k */
    public final long mo19211k() throws IOException {
        m31339O(0);
        return this.f23936a.mo19443v();
    }

    /* renamed from: l */
    public final long mo19212l() throws IOException {
        m31339O(0);
        return this.f23936a.mo19444w();
    }

    /* renamed from: m */
    public final long mo19213m() throws IOException {
        m31339O(1);
        return this.f23936a.mo19442u();
    }

    /* renamed from: n */
    public final String mo19214n() throws IOException {
        m31339O(2);
        return this.f23936a.mo19446y();
    }

    /* renamed from: o */
    public final void mo19215o(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    rm3.mo20677L(this.f23936a.mo19433l());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    rm3.mo20677L(this.f23936a.mo19433l());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19433l()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19433l()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: p */
    public final void mo19216p(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    on3.mo20060t(this.f23936a.mo19441t());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    on3.mo20060t(this.f23936a.mo19441t());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f23936a.mo19441t()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Long.valueOf(this.f23936a.mo19441t()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: q */
    public final boolean mo19217q() throws IOException {
        int i;
        if (this.f23936a.mo19426b() || (i = this.f23937b) == this.f23938c) {
            return false;
        }
        return this.f23936a.mo19428d(i);
    }

    /* renamed from: r */
    public final void mo19218r(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    on3.mo20060t(this.f23936a.mo19444w());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    on3.mo20060t(this.f23936a.mo19444w());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f23936a.mo19444w()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Long.valueOf(this.f23936a.mo19444w()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: s */
    public final void mo19219s(List<Double> list) throws IOException {
        int q;
        int q2;
        if (list instanceof zl3) {
            zl3 zl3 = (zl3) list;
            int i = this.f23937b & 7;
            if (i == 1) {
                do {
                    zl3.mo22390p(this.f23936a.mo19429h());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31341Q(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    zl3.mo22390p(this.f23936a.mo19429h());
                } while (this.f23936a.mo19431j() < j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f23936a.mo19429h()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31341Q(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Double.valueOf(this.f23936a.mo19429h()));
                } while (this.f23936a.mo19431j() < j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: t */
    public final void mo19220t(List<kl3> list) throws IOException {
        int q;
        if ((this.f23937b & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.f23936a.mo19426b()) {
                    q = this.f23936a.mo19438q();
                } else {
                    return;
                }
            } while (q == this.f23937b);
            this.f23939d = q;
            return;
        }
        throw bn3.zza();
    }

    /* renamed from: u */
    public final String mo19221u() throws IOException {
        m31339O(2);
        return this.f23936a.mo19447z();
    }

    /* renamed from: v */
    public final void mo19222v(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 0) {
                do {
                    rm3.mo20677L(this.f23936a.mo19435n());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int j = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    rm3.mo20677L(this.f23936a.mo19435n());
                } while (this.f23936a.mo19431j() < j);
                m31338N(j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19435n()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int j2 = this.f23936a.mo19431j() + this.f23936a.mo19439r();
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19435n()));
                } while (this.f23936a.mo19431j() < j2);
                m31338N(j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: w */
    public final <T> void mo19223w(List<T> list, to3<T> to3, cm3 cm3) throws IOException {
        int q;
        int i = this.f23937b;
        if ((i & 7) == 3) {
            do {
                list.add(m31336K(to3, cm3));
                if (!this.f23936a.mo19426b() && this.f23939d == 0) {
                    q = this.f23936a.mo19438q();
                } else {
                    return;
                }
            } while (q == i);
            this.f23939d = q;
            return;
        }
        throw bn3.zza();
    }

    /* renamed from: x */
    public final <T> T mo19224x(to3<T> to3, cm3 cm3) throws IOException {
        m31339O(2);
        return m31337L(to3, cm3);
    }

    /* renamed from: y */
    public final void mo19225y(List<Long> list) throws IOException {
        int q;
        int q2;
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            int i = this.f23937b & 7;
            if (i == 1) {
                do {
                    on3.mo20060t(this.f23936a.mo19442u());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31341Q(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    on3.mo20060t(this.f23936a.mo19442u());
                } while (this.f23936a.mo19431j() < j);
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f23936a.mo19442u()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31341Q(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Long.valueOf(this.f23936a.mo19442u()));
                } while (this.f23936a.mo19431j() < j2);
            } else {
                throw bn3.zza();
            }
        }
    }

    /* renamed from: z */
    public final void mo19226z(List<Integer> list) throws IOException {
        int q;
        int q2;
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            int i = this.f23937b & 7;
            if (i == 2) {
                int r = this.f23936a.mo19439r();
                m31340P(r);
                int j = this.f23936a.mo19431j() + r;
                do {
                    rm3.mo20677L(this.f23936a.mo19436o());
                } while (this.f23936a.mo19431j() < j);
            } else if (i == 5) {
                do {
                    rm3.mo20677L(this.f23936a.mo19436o());
                    if (!this.f23936a.mo19426b()) {
                        q2 = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q2 == this.f23937b);
                this.f23939d = q2;
            } else {
                throw bn3.zza();
            }
        } else {
            int i2 = this.f23937b & 7;
            if (i2 == 2) {
                int r2 = this.f23936a.mo19439r();
                m31340P(r2);
                int j2 = this.f23936a.mo19431j() + r2;
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19436o()));
                } while (this.f23936a.mo19431j() < j2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f23936a.mo19436o()));
                    if (!this.f23936a.mo19426b()) {
                        q = this.f23936a.mo19438q();
                    } else {
                        return;
                    }
                } while (q == this.f23937b);
                this.f23939d = q;
            } else {
                throw bn3.zza();
            }
        }
    }

    public final double zza() throws IOException {
        m31339O(1);
        return this.f23936a.mo19429h();
    }

    public final int zze() throws IOException {
        m31339O(0);
        return this.f23936a.mo19433l();
    }

    public final kl3 zzp() throws IOException {
        m31339O(2);
        return this.f23936a.mo19445x();
    }
}
