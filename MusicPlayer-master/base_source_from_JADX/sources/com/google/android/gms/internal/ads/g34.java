package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class g34 implements e24, b94, c64, i64, s34 {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public static final Map<String, String> f16895Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final C5689w f16896R;

    /* renamed from: A */
    private f34 f16897A;

    /* renamed from: B */
    private z94 f16898B;

    /* renamed from: C */
    private long f16899C;

    /* renamed from: D */
    private boolean f16900D;

    /* renamed from: E */
    private int f16901E;

    /* renamed from: F */
    private boolean f16902F;

    /* renamed from: G */
    private boolean f16903G;

    /* renamed from: H */
    private int f16904H;

    /* renamed from: I */
    private long f16905I;

    /* renamed from: J */
    private long f16906J;

    /* renamed from: K */
    private long f16907K;

    /* renamed from: L */
    private boolean f16908L;

    /* renamed from: M */
    private int f16909M;

    /* renamed from: N */
    private boolean f16910N;

    /* renamed from: O */
    private boolean f16911O;

    /* renamed from: P */
    private final r54 f16912P;

    /* renamed from: g */
    private final Uri f16913g;

    /* renamed from: h */
    private final qb1 f16914h;

    /* renamed from: i */
    private final oz3 f16915i;

    /* renamed from: j */
    private final p24 f16916j;

    /* renamed from: k */
    private final iz3 f16917k;

    /* renamed from: l */
    private final c34 f16918l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f16919m;

    /* renamed from: n */
    private final l64 f16920n = new l64("ProgressiveMediaPeriod");

    /* renamed from: o */
    private final x24 f16921o;

    /* renamed from: p */
    private final kv1 f16922p;

    /* renamed from: q */
    private final Runnable f16923q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f16924r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f16925s;

    /* renamed from: t */
    private d24 f16926t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public zzzd f16927u;

    /* renamed from: v */
    private t34[] f16928v;

    /* renamed from: w */
    private e34[] f16929w;

    /* renamed from: x */
    private boolean f16930x;

    /* renamed from: y */
    private boolean f16931y;

    /* renamed from: z */
    private boolean f16932z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f16895Q = Collections.unmodifiableMap(hashMap);
        jb4 jb4 = new jb4();
        jb4.mo18587h("icy");
        jb4.mo18599s("application/x-icy");
        f16896R = jb4.mo18605y();
    }

    public g34(Uri uri, qb1 qb1, x24 x24, oz3 oz3, iz3 iz3, x54 x54, p24 p24, c34 c34, r54 r54, String str, int i, byte[] bArr) {
        this.f16913g = uri;
        this.f16914h = qb1;
        this.f16915i = oz3;
        this.f16917k = iz3;
        this.f16916j = p24;
        this.f16918l = c34;
        this.f16912P = r54;
        this.f16919m = (long) i;
        this.f16921o = x24;
        this.f16922p = new kv1(ht1.f17758a);
        this.f16923q = new z24(this);
        this.f16924r = new y24(this);
        this.f16925s = wy2.m33443f0((Handler.Callback) null);
        this.f16929w = new e34[0];
        this.f16928v = new t34[0];
        this.f16907K = -9223372036854775807L;
        this.f16905I = -1;
        this.f16899C = -9223372036854775807L;
        this.f16901E = 1;
    }

    /* renamed from: A */
    private final int m24103A() {
        int i = 0;
        for (t34 u : this.f16928v) {
            i += u.mo21022u();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final long m24104B() {
        long j = Long.MIN_VALUE;
        for (t34 w : this.f16928v) {
            j = Math.max(j, w.mo21024w());
        }
        return j;
    }

    /* renamed from: C */
    private final da4 m24105C(e34 e34) {
        int length = this.f16928v.length;
        for (int i = 0; i < length; i++) {
            if (e34.equals(this.f16929w[i])) {
                return this.f16928v[i];
            }
        }
        r54 r54 = this.f16912P;
        Looper looper = this.f16925s.getLooper();
        oz3 oz3 = this.f16915i;
        iz3 iz3 = this.f16917k;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(oz3);
        t34 t34 = new t34(r54, looper, oz3, iz3, (byte[]) null);
        t34.mo21015G(this);
        int i2 = length + 1;
        e34[] e34Arr = (e34[]) Arrays.copyOf(this.f16929w, i2);
        e34Arr[length] = e34;
        wy2.m33462y(e34Arr);
        this.f16929w = e34Arr;
        t34[] t34Arr = (t34[]) Arrays.copyOf(this.f16928v, i2);
        t34Arr[length] = t34;
        wy2.m33462y(t34Arr);
        this.f16928v = t34Arr;
        return t34;
    }

    /* renamed from: D */
    private final void m24106D() {
        gs1.m24488f(this.f16931y);
        Objects.requireNonNull(this.f16897A);
        Objects.requireNonNull(this.f16898B);
    }

    /* renamed from: E */
    private final void m24107E(b34 b34) {
        if (this.f16905I == -1) {
            this.f16905I = b34.f14308l;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m24108F() {
        zzdd zzdd;
        if (!this.f16911O && !this.f16931y && this.f16930x && this.f16898B != null) {
            t34[] t34Arr = this.f16928v;
            int length = t34Arr.length;
            int i = 0;
            while (i < length) {
                if (t34Arr[i].mo21025x() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f16922p.mo19015c();
            int length2 = this.f16928v.length;
            xh0[] xh0Arr = new xh0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C5689w x = this.f16928v[i2].mo21025x();
                Objects.requireNonNull(x);
                String str = x.f25133l;
                boolean g = C5463pw.m29203g(str);
                boolean z = g || C5463pw.m29204h(str);
                zArr[i2] = z;
                this.f16932z = z | this.f16932z;
                zzzd zzzd = this.f16927u;
                if (zzzd != null) {
                    if (g || this.f16929w[i2].f15853b) {
                        zzdd zzdd2 = x.f25131j;
                        if (zzdd2 == null) {
                            zzdd = new zzdd(zzzd);
                        } else {
                            zzdd = zzdd2.mo22583d(zzzd);
                        }
                        jb4 b = x.mo21657b();
                        b.mo18593m(zzdd);
                        x = b.mo18605y();
                    }
                    if (g && x.f25127f == -1 && x.f25128g == -1 && zzzd.f27440g != -1) {
                        jb4 b2 = x.mo21657b();
                        b2.mo18580d0(zzzd.f27440g);
                        x = b2.mo18605y();
                    }
                }
                xh0Arr[i2] = new xh0(x.mo21658c(this.f16915i.mo19043a(x)));
            }
            this.f16897A = new f34(new uj0(xh0Arr), zArr);
            this.f16931y = true;
            d24 d24 = this.f16926t;
            Objects.requireNonNull(d24);
            d24.mo16828i(this);
        }
    }

    /* renamed from: G */
    private final void m24109G(int i) {
        m24106D();
        f34 f34 = this.f16897A;
        boolean[] zArr = f34.f16424d;
        if (!zArr[i]) {
            C5689w b = f34.f16421a.mo21275b(i).mo22031b(0);
            this.f16916j.mo20193d(C5463pw.m29197a(b.f25133l), b, 0, (Object) null, this.f16906J);
            zArr[i] = true;
        }
    }

    /* renamed from: H */
    private final void m24110H(int i) {
        m24106D();
        boolean[] zArr = this.f16897A.f16422b;
        if (this.f16908L && zArr[i] && !this.f16928v[i].mo21018J(false)) {
            this.f16907K = 0;
            this.f16908L = false;
            this.f16903G = true;
            this.f16906J = 0;
            this.f16909M = 0;
            for (t34 E : this.f16928v) {
                E.mo21013E(false);
            }
            d24 d24 = this.f16926t;
            Objects.requireNonNull(d24);
            d24.mo19323k(this);
        }
    }

    /* renamed from: J */
    private final void m24111J() {
        b34 b34 = new b34(this, this.f16913g, this.f16914h, this.f16921o, this, this.f16922p);
        if (this.f16931y) {
            gs1.m24488f(m24112L());
            long j = this.f16899C;
            if (j == -9223372036854775807L || this.f16907K <= j) {
                z94 z94 = this.f16898B;
                Objects.requireNonNull(z94);
                b34.m21076i(b34, z94.mo15607c(this.f16907K).f25724a.f13833b, this.f16907K);
                for (t34 F : this.f16928v) {
                    F.mo21014F(this.f16907K);
                }
                this.f16907K = -9223372036854775807L;
            } else {
                this.f16910N = true;
                this.f16907K = -9223372036854775807L;
                return;
            }
        }
        this.f16909M = m24103A();
        long a = this.f16920n.mo19081a(b34, this, x54.m33577a(this.f16901E));
        uf1 f = b34.f14307k;
        this.f16916j.mo20201l(new x14(b34.f14297a, f, f.f24320a, Collections.emptyMap(), a, 0, 0), 1, -1, (C5689w) null, 0, (Object) null, b34.f14306j, this.f16899C);
    }

    /* renamed from: L */
    private final boolean m24112L() {
        return this.f16907K != -9223372036854775807L;
    }

    /* renamed from: M */
    private final boolean m24113M() {
        return this.f16903G || m24112L();
    }

    /* renamed from: I */
    public final void mo15722I() {
        this.f16930x = true;
        this.f16925s.post(this.f16923q);
    }

    /* renamed from: K */
    public final void mo17826K() {
        for (t34 D : this.f16928v) {
            D.mo21012D();
        }
        this.f16921o.zze();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final int mo17827N(int i, qt3 qt3, k31 k31, int i2) {
        if (m24113M()) {
            return -3;
        }
        m24109G(i);
        int v = this.f16928v[i].mo21023v(qt3, k31, i2, this.f16910N);
        if (v == -3) {
            m24110H(i);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo17828O(int i, long j) {
        if (m24113M()) {
            return 0;
        }
        m24109G(i);
        t34 t34 = this.f16928v[i];
        int t = t34.mo21021t(j, this.f16910N);
        t34.mo21016H(t);
        if (t != 0) {
            return t;
        }
        m24110H(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final da4 mo17829T() {
        return m24105C(new e34(0, true));
    }

    /* renamed from: a */
    public final long mo17092a() {
        long j;
        m24106D();
        boolean[] zArr = this.f16897A.f16422b;
        if (this.f16910N) {
            return Long.MIN_VALUE;
        }
        if (m24112L()) {
            return this.f16907K;
        }
        if (this.f16932z) {
            int length = this.f16928v.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f16928v[i].mo21017I()) {
                    j = Math.min(j, this.f16928v[i].mo21024w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m24104B();
        }
        return j == Long.MIN_VALUE ? this.f16906J : j;
    }

    /* renamed from: b */
    public final long mo17093b() {
        if (this.f16904H == 0) {
            return Long.MIN_VALUE;
        }
        return mo17092a();
    }

    /* renamed from: c */
    public final uj0 mo17094c() {
        m24106D();
        return this.f16897A.f16421a;
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        if (this.f16910N || this.f16920n.mo19086k() || this.f16908L) {
            return false;
        }
        if (this.f16931y && this.f16904H == 0) {
            return false;
        }
        boolean e = this.f16922p.mo19017e();
        if (this.f16920n.mo19087l()) {
            return e;
        }
        m24111J();
        return true;
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
    }

    /* renamed from: f */
    public final long mo17097f() {
        if (!this.f16903G) {
            return -9223372036854775807L;
        }
        if (!this.f16910N && m24103A() <= this.f16909M) {
            return -9223372036854775807L;
        }
        this.f16903G = false;
        return this.f16906J;
    }

    /* renamed from: g */
    public final long mo17098g(long j) {
        m24106D();
        boolean[] zArr = this.f16897A.f16422b;
        if (true != this.f16898B.mo15608e()) {
            j = 0;
        }
        this.f16903G = false;
        this.f16906J = j;
        if (m24112L()) {
            this.f16907K = j;
            return j;
        }
        if (this.f16901E != 7) {
            int length = this.f16928v.length;
            int i = 0;
            while (i < length) {
                if (this.f16928v[i].mo21019K(j, false) || (!zArr[i] && this.f16932z)) {
                    i++;
                }
            }
            return j;
        }
        this.f16908L = false;
        this.f16907K = j;
        this.f16910N = false;
        if (this.f16920n.mo19087l()) {
            for (t34 z : this.f16928v) {
                z.mo21027z();
            }
            this.f16920n.mo19082g();
        } else {
            this.f16920n.mo19083h();
            for (t34 E : this.f16928v) {
                E.mo21013E(false);
            }
        }
        return j;
    }

    /* renamed from: h */
    public final void mo17099h() throws IOException {
        mo17833w();
        if (this.f16910N && !this.f16931y) {
            throw C5464px.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo16509i(g64 g64, long j, long j2) {
        z94 z94;
        if (this.f16899C == -9223372036854775807L && (z94 = this.f16898B) != null) {
            boolean e = z94.mo15608e();
            long B = m24104B();
            long j3 = B == Long.MIN_VALUE ? 0 : B + 10000;
            this.f16899C = j3;
            this.f16918l.mo16480d(j3, e, this.f16900D);
        }
        b34 b34 = (b34) g64;
        t64 h = b34.f14299c;
        x14 x14 = new x14(b34.f14297a, b34.f14307k, h.mo21034n(), h.mo21035o(), j, j2, h.mo21033b());
        long unused = b34.f14297a;
        this.f16916j.mo20197h(x14, 1, -1, (C5689w) null, 0, (Object) null, b34.f14306j, this.f16899C);
        m24107E(b34);
        this.f16910N = true;
        d24 d24 = this.f16926t;
        Objects.requireNonNull(d24);
        d24.mo19323k(this);
    }

    /* renamed from: j */
    public final long mo17100j(h44[] h44Arr, boolean[] zArr, u34[] u34Arr, boolean[] zArr2, long j) {
        h44 h44;
        m24106D();
        f34 f34 = this.f16897A;
        uj0 uj0 = f34.f16421a;
        boolean[] zArr3 = f34.f16423c;
        int i = this.f16904H;
        int i2 = 0;
        for (int i3 = 0; i3 < h44Arr.length; i3++) {
            d34 d34 = u34Arr[i3];
            if (d34 != null && (h44Arr[i3] == null || !zArr[i3])) {
                int c = d34.f15498a;
                gs1.m24488f(zArr3[c]);
                this.f16904H--;
                zArr3[c] = false;
                u34Arr[i3] = null;
            }
        }
        boolean z = !this.f16902F ? j != 0 : i == 0;
        for (int i4 = 0; i4 < h44Arr.length; i4++) {
            if (u34Arr[i4] == null && (h44 = h44Arr[i4]) != null) {
                gs1.m24488f(h44.mo18077b() == 1);
                gs1.m24488f(h44.mo18076a(0) == 0);
                int a = uj0.mo21274a(h44.mo18079d());
                gs1.m24488f(!zArr3[a]);
                this.f16904H++;
                zArr3[a] = true;
                u34Arr[i4] = new d34(this, a);
                zArr2[i4] = true;
                if (!z) {
                    t34 t34 = this.f16928v[a];
                    z = !t34.mo21019K(j, true) && t34.mo21020s() != 0;
                }
            }
        }
        if (this.f16904H == 0) {
            this.f16908L = false;
            this.f16903G = false;
            if (this.f16920n.mo19087l()) {
                t34[] t34Arr = this.f16928v;
                int length = t34Arr.length;
                while (i2 < length) {
                    t34Arr[i2].mo21027z();
                    i2++;
                }
                this.f16920n.mo19082g();
            } else {
                for (t34 E : this.f16928v) {
                    E.mo21013E(false);
                }
            }
        } else if (z) {
            j = mo17098g(j);
            while (i2 < u34Arr.length) {
                if (u34Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f16902F = true;
        return j;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo16510k(g64 g64, long j, long j2, boolean z) {
        b34 b34 = (b34) g64;
        t64 h = b34.f14299c;
        x14 x14 = new x14(b34.f14297a, b34.f14307k, h.mo21034n(), h.mo21035o(), j, j2, h.mo21033b());
        long unused = b34.f14297a;
        this.f16916j.mo20195f(x14, 1, -1, (C5689w) null, 0, (Object) null, b34.f14306j, this.f16899C);
        if (!z) {
            m24107E(b34);
            for (t34 E : this.f16928v) {
                E.mo21013E(false);
            }
            if (this.f16904H > 0) {
                d24 d24 = this.f16926t;
                Objects.requireNonNull(d24);
                d24.mo19323k(this);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        return this.f16920n.mo19087l() && this.f16922p.mo19016d();
    }

    /* renamed from: m */
    public final long mo17102m(long j, ou3 ou3) {
        long j2 = j;
        ou3 ou32 = ou3;
        m24106D();
        if (!this.f16898B.mo15608e()) {
            return 0;
        }
        x94 c = this.f16898B.mo15607c(j2);
        long j3 = c.f25724a.f13832a;
        long j4 = c.f25725b.f13832a;
        long j5 = ou32.f21195a;
        if (j5 == 0 && ou32.f21196b == 0) {
            return j2;
        }
        long j6 = j;
        long a0 = wy2.m33433a0(j6, j5, Long.MIN_VALUE);
        long T = wy2.m33425T(j6, ou32.f21196b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = a0 <= j3 && j3 <= T;
        if (a0 > j4 || j4 > T) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j4 : a0;
            }
        } else if (Math.abs(j3 - j2) > Math.abs(j4 - j2)) {
            return j4;
        }
        return j3;
    }

    /* renamed from: n */
    public final void mo17830n(C5689w wVar) {
        this.f16925s.post(this.f16923q);
    }

    /* renamed from: o */
    public final void mo17103o(long j, boolean z) {
        m24106D();
        if (!m24112L()) {
            boolean[] zArr = this.f16897A.f16423c;
            int length = this.f16928v.length;
            for (int i = 0; i < length; i++) {
                this.f16928v[i].mo21026y(j, false, zArr[i]);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.e64 mo16511p(com.google.android.gms.internal.ads.g64 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.b34 r1 = (com.google.android.gms.internal.ads.b34) r1
            r0.m24107E(r1)
            com.google.android.gms.internal.ads.t64 r2 = r1.f14299c
            com.google.android.gms.internal.ads.x14 r15 = new com.google.android.gms.internal.ads.x14
            long r4 = r1.f14297a
            com.google.android.gms.internal.ads.uf1 r6 = r1.f14307k
            android.net.Uri r7 = r2.mo21034n()
            java.util.Map r8 = r2.mo21035o()
            long r13 = r2.mo21033b()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.c24 r2 = new com.google.android.gms.internal.ads.c24
            long r3 = r1.f14306j
            long r22 = com.google.android.gms.internal.ads.bw3.m21570d(r3)
            long r3 = r0.f16899C
            long r24 = com.google.android.gms.internal.ads.bw3.m21570d(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.b64 r3 = new com.google.android.gms.internal.ads.b64
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.f14348a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C5464px
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zk1
            if (r4 != 0) goto L_0x008d
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.k64
            if (r4 != 0) goto L_0x008d
        L_0x006a:
            if (r2 == 0) goto L_0x007f
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.rc1
            if (r4 == 0) goto L_0x007a
            r4 = r2
            com.google.android.gms.internal.ads.rc1 r4 = (com.google.android.gms.internal.ads.rc1) r4
            int r4 = r4.zza
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x007a
            goto L_0x008d
        L_0x007a:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x006a
        L_0x007f:
            int r2 = r3.f14349b
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008e
        L_0x008d:
            r2 = r5
        L_0x008e:
            r4 = 1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.e64 r2 = com.google.android.gms.internal.ads.l64.f19223e
            goto L_0x00e8
        L_0x0096:
            int r7 = r26.m24103A()
            int r8 = r0.f16909M
            r9 = 0
            if (r7 <= r8) goto L_0x00a1
            r8 = 1
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            long r10 = r0.f16905I
            r12 = -1
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x00e2
            com.google.android.gms.internal.ads.z94 r10 = r0.f16898B
            if (r10 == 0) goto L_0x00b7
            long r10 = r10.zze()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00b7
            goto L_0x00e2
        L_0x00b7:
            boolean r5 = r0.f16931y
            if (r5 == 0) goto L_0x00c6
            boolean r5 = r26.m24113M()
            if (r5 != 0) goto L_0x00c6
            r0.f16908L = r4
            com.google.android.gms.internal.ads.e64 r2 = com.google.android.gms.internal.ads.l64.f19222d
            goto L_0x00e8
        L_0x00c6:
            boolean r5 = r0.f16931y
            r0.f16903G = r5
            r5 = 0
            r0.f16906J = r5
            r0.f16909M = r9
            com.google.android.gms.internal.ads.t34[] r7 = r0.f16928v
            int r10 = r7.length
            r11 = 0
        L_0x00d4:
            if (r11 >= r10) goto L_0x00de
            r12 = r7[r11]
            r12.mo21013E(r9)
            int r11 = r11 + 1
            goto L_0x00d4
        L_0x00de:
            com.google.android.gms.internal.ads.b34.m21076i(r1, r5, r5)
            goto L_0x00e4
        L_0x00e2:
            r0.f16909M = r7
        L_0x00e4:
            com.google.android.gms.internal.ads.e64 r2 = com.google.android.gms.internal.ads.l64.m26539b(r8, r2)
        L_0x00e8:
            boolean r3 = r2.mo17128c()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.p24 r3 = r0.f16916j
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f14306j
            long r12 = r0.f16899C
            r4 = r15
            r14 = r32
            r15 = r16
            r3.mo20199j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x0108
            long unused = r1.f14297a
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g34.mo16511p(com.google.android.gms.internal.ads.g64, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.e64");
    }

    /* renamed from: q */
    public final void mo17104q(d24 d24, long j) {
        this.f16926t = d24;
        this.f16922p.mo19017e();
        m24111J();
    }

    /* renamed from: r */
    public final void mo15723r(z94 z94) {
        this.f16925s.post(new a34(this, z94));
    }

    /* renamed from: s */
    public final da4 mo15724s(int i, int i2) {
        return m24105C(new e34(i, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo17831u() {
        if (!this.f16911O) {
            d24 d24 = this.f16926t;
            Objects.requireNonNull(d24);
            d24.mo19323k(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo17832v(z94 z94) {
        z94 z942;
        if (this.f16927u == null) {
            z942 = z94;
        } else {
            z942 = new y94(-9223372036854775807L, 0);
        }
        this.f16898B = z942;
        this.f16899C = z94.zze();
        boolean z = false;
        int i = 1;
        if (this.f16905I == -1 && z94.zze() == -9223372036854775807L) {
            z = true;
        }
        this.f16900D = z;
        if (true == z) {
            i = 7;
        }
        this.f16901E = i;
        this.f16918l.mo16480d(this.f16899C, z94.mo15608e(), this.f16900D);
        if (!this.f16931y) {
            m24108F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo17833w() throws IOException {
        this.f16920n.mo19084i(x54.m33577a(this.f16901E));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo17834x(int i) throws IOException {
        this.f16928v[i].mo21010B();
        mo17833w();
    }

    /* renamed from: y */
    public final void mo17835y() {
        if (this.f16931y) {
            for (t34 C : this.f16928v) {
                C.mo21011C();
            }
        }
        this.f16920n.mo19085j(this);
        this.f16925s.removeCallbacksAndMessages((Object) null);
        this.f16926t = null;
        this.f16911O = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final boolean mo17836z(int i) {
        return !m24113M() && this.f16928v[i].mo21018J(this.f16910N);
    }
}
