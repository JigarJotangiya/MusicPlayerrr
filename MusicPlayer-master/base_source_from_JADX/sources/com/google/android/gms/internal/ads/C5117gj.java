package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.gj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5117gj implements C5265kj, C5484qg, C5082fl, C5635uj {

    /* renamed from: A */
    private int f17116A;

    /* renamed from: B */
    private C4969ck f17117B;

    /* renamed from: C */
    private long f17118C;

    /* renamed from: D */
    private boolean[] f17119D;

    /* renamed from: E */
    private boolean[] f17120E;

    /* renamed from: F */
    private boolean f17121F;

    /* renamed from: G */
    private long f17122G;

    /* renamed from: H */
    private long f17123H;

    /* renamed from: I */
    private long f17124I;

    /* renamed from: J */
    private int f17125J;

    /* renamed from: K */
    private boolean f17126K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f17127L;

    /* renamed from: M */
    private final C5785yk f17128M;

    /* renamed from: g */
    private final Uri f17129g;

    /* renamed from: h */
    private final C5673vk f17130h;

    /* renamed from: i */
    private final int f17131i;

    /* renamed from: j */
    private final Handler f17132j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5154hj f17133k;

    /* renamed from: l */
    private final C5302lj f17134l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f17135m;

    /* renamed from: n */
    private final C5230jl f17136n = new C5230jl("Loader:ExtractorMediaPeriod");

    /* renamed from: o */
    private final C5042ej f17137o;

    /* renamed from: p */
    private final C5378nl f17138p;

    /* renamed from: q */
    private final Runnable f17139q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f17140r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f17141s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final SparseArray<C5672vj> f17142t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C5228jj f17143u;

    /* renamed from: v */
    private C5669vg f17144v;

    /* renamed from: w */
    private boolean f17145w;

    /* renamed from: x */
    private boolean f17146x;

    /* renamed from: y */
    private boolean f17147y;

    /* renamed from: z */
    private boolean f17148z;

    public C5117gj(Uri uri, C5673vk vkVar, C5447pg[] pgVarArr, int i, Handler handler, C5154hj hjVar, C5302lj ljVar, C5785yk ykVar, String str, int i2, byte[] bArr) {
        this.f17129g = uri;
        this.f17130h = vkVar;
        this.f17131i = i;
        this.f17132j = handler;
        this.f17133k = hjVar;
        this.f17134l = ljVar;
        this.f17128M = ykVar;
        this.f17135m = (long) i2;
        this.f17137o = new C5042ej(pgVarArr, this);
        this.f17138p = new C5378nl();
        this.f17139q = new C5820zi(this);
        this.f17140r = new C4894aj(this);
        this.f17141s = new Handler();
        this.f17124I = -9223372036854775807L;
        this.f17142t = new SparseArray<>();
        this.f17122G = -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: C */
    static /* bridge */ /* synthetic */ void m24368C(com.google.android.gms.internal.ads.C5117gj r8) {
        /*
            boolean r0 = r8.f17127L
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.f17146x
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.vg r0 = r8.f17144v
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.f17145w
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.vj> r0 = r8.f17142t
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray<com.google.android.gms.internal.ads.vj> r3 = r8.f17142t
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.vj r3 = (com.google.android.gms.internal.ads.C5672vj) r3
            com.google.android.gms.internal.ads.zzapg r3 = r3.mo21519h()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.nl r2 = r8.f17138p
            r2.mo19747b()
            com.google.android.gms.internal.ads.bk[] r2 = new com.google.android.gms.internal.ads.C4932bk[r0]
            boolean[] r3 = new boolean[r0]
            r8.f17120E = r3
            boolean[] r3 = new boolean[r0]
            r8.f17119D = r3
            com.google.android.gms.internal.ads.vg r3 = r8.f17144v
            long r3 = r3.zza()
            r8.f17118C = r3
            r3 = 0
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray<com.google.android.gms.internal.ads.vj> r5 = r8.f17142t
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.vj r5 = (com.google.android.gms.internal.ads.C5672vj) r5
            com.google.android.gms.internal.ads.zzapg r5 = r5.mo21519h()
            com.google.android.gms.internal.ads.bk r6 = new com.google.android.gms.internal.ads.bk
            com.google.android.gms.internal.ads.zzapg[] r7 = new com.google.android.gms.internal.ads.zzapg[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f27126l
            boolean r6 = com.google.android.gms.internal.ads.C5489ql.m29557b(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.C5489ql.m29556a(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean[] r5 = r8.f17120E
            r5[r3] = r4
            boolean r5 = r8.f17121F
            r4 = r4 | r5
            r8.f17121F = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.ck r0 = new com.google.android.gms.internal.ads.ck
            r0.<init>(r2)
            r8.f17117B = r0
            r8.f17146x = r4
            com.google.android.gms.internal.ads.lj r0 = r8.f17134l
            com.google.android.gms.internal.ads.ak r1 = new com.google.android.gms.internal.ads.ak
            long r2 = r8.f17118C
            com.google.android.gms.internal.ads.vg r4 = r8.f17144v
            boolean r4 = r4.mo19725b()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo18382b(r1, r2)
            com.google.android.gms.internal.ads.jj r0 = r8.f17143u
            r0.mo18641a(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5117gj.m24368C(com.google.android.gms.internal.ads.gj):void");
    }

    /* renamed from: q */
    private final int m24370q() {
        int size = this.f17142t.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f17142t.valueAt(i2).mo21516e();
        }
        return i;
    }

    /* renamed from: r */
    private final long m24371r() {
        int size = this.f17142t.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f17142t.valueAt(i).mo21518g());
        }
        return j;
    }

    /* renamed from: s */
    private final void m24372s(C5005dj djVar) {
        if (this.f17122G == -1) {
            this.f17122G = djVar.f15632i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = r11.f17144v;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24373t() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.dj r6 = new com.google.android.gms.internal.ads.dj
            android.net.Uri r2 = r11.f17129g
            com.google.android.gms.internal.ads.vk r3 = r11.f17130h
            com.google.android.gms.internal.ads.ej r4 = r11.f17137o
            com.google.android.gms.internal.ads.nl r5 = r11.f17138p
            r0 = r6
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r11.f17146x
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r11.m24374u()
            com.google.android.gms.internal.ads.C5304ll.m26776e(r0)
            long r3 = r11.f17118C
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            long r7 = r11.f17124I
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r0 = 1
            r11.f17126K = r0
            r11.f17124I = r1
            return
        L_0x0032:
            com.google.android.gms.internal.ads.vg r0 = r11.f17144v
            long r3 = r11.f17124I
            long r3 = r0.mo19724a(r3)
            long r7 = r11.f17124I
            r6.mo16937d(r3, r7)
            r11.f17124I = r1
        L_0x0041:
            int r0 = r11.m24370q()
            r11.f17125J = r0
            int r0 = r11.f17131i
            r3 = -1
            r4 = 6
            r5 = 3
            if (r0 != r3) goto L_0x006a
            boolean r0 = r11.f17146x
            if (r0 == 0) goto L_0x0069
            long r7 = r11.f17122G
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.vg r0 = r11.f17144v
            if (r0 == 0) goto L_0x0067
            long r7 = r0.zza()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 6
            goto L_0x006a
        L_0x0069:
            r0 = 3
        L_0x006a:
            com.google.android.gms.internal.ads.jl r1 = r11.f17136n
            r1.mo18647a(r6, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5117gj.m24373t():void");
    }

    /* renamed from: u */
    private final boolean m24374u() {
        return this.f17124I != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo17932D() throws IOException {
        this.f17136n.mo18649g(Integer.MIN_VALUE);
    }

    /* renamed from: E */
    public final void mo17933E() {
        this.f17136n.mo18650h(new C4931bj(this, this.f17137o));
        this.f17141s.removeCallbacksAndMessages((Object) null);
        this.f17127L = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo17934F(int i, long j) {
        C5672vj valueAt = this.f17142t.valueAt(i);
        if (!this.f17126K || j <= valueAt.mo21518g()) {
            valueAt.mo21525n(j, true);
        } else {
            valueAt.mo21523l();
        }
    }

    /* renamed from: a */
    public final void mo17935a() {
        this.f17145w = true;
        this.f17141s.post(this.f17139q);
    }

    /* renamed from: b */
    public final boolean mo17936b(long j) {
        if (this.f17126K) {
            return false;
        }
        if (this.f17146x && this.f17116A == 0) {
            return false;
        }
        boolean c = this.f17138p.mo19748c();
        if (this.f17136n.mo18651i()) {
            return c;
        }
        m24373t();
        return true;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17554c(C5156hl hlVar, long j, long j2) {
        m24372s((C5005dj) hlVar);
        this.f17126K = true;
        if (this.f17118C == -9223372036854775807L) {
            long r = m24371r();
            long j3 = r == Long.MIN_VALUE ? 0 : r + 10000;
            this.f17118C = j3;
            this.f17134l.mo18382b(new C4895ak(j3, this.f17144v.mo19725b()), (Object) null);
        }
        this.f17143u.mo19147g(this);
    }

    /* renamed from: d */
    public final long mo17937d() {
        long j;
        if (this.f17126K) {
            return Long.MIN_VALUE;
        }
        if (m24374u()) {
            return this.f17124I;
        }
        if (this.f17121F) {
            int size = this.f17142t.size();
            j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f17120E[i]) {
                    j = Math.min(j, this.f17142t.valueAt(i).mo21518g());
                }
            }
        } else {
            j = m24371r();
        }
        return j == Long.MIN_VALUE ? this.f17123H : j;
    }

    /* renamed from: e */
    public final long mo17938e() {
        if (!this.f17148z) {
            return -9223372036854775807L;
        }
        this.f17148z = false;
        return this.f17123H;
    }

    /* renamed from: f */
    public final long mo17939f(C5118gk[] gkVarArr, boolean[] zArr, C5709wj[] wjVarArr, boolean[] zArr2, long j) {
        C5118gk gkVar;
        C5304ll.m26776e(this.f17146x);
        for (int i = 0; i < gkVarArr.length; i++) {
            C5080fj fjVar = wjVarArr[i];
            if (fjVar != null && (gkVarArr[i] == null || !zArr[i])) {
                int d = fjVar.f16642a;
                C5304ll.m26776e(this.f17119D[d]);
                this.f17116A--;
                this.f17119D[d] = false;
                this.f17142t.valueAt(d).mo21520i();
                wjVarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < gkVarArr.length; i2++) {
            if (wjVarArr[i2] == null && (gkVar = gkVarArr[i2]) != null) {
                gkVar.mo17955b();
                C5304ll.m26776e(gkVar.mo17954a(0) == 0);
                int a = this.f17117B.mo16649a(gkVar.mo17957d());
                C5304ll.m26776e(!this.f17119D[a]);
                this.f17116A++;
                this.f17119D[a] = true;
                wjVarArr[i2] = new C5080fj(this, a);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f17147y) {
            int size = this.f17142t.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f17119D[i3]) {
                    this.f17142t.valueAt(i3).mo21520i();
                }
            }
        }
        if (this.f17116A == 0) {
            this.f17148z = false;
            if (this.f17136n.mo18651i()) {
                this.f17136n.mo18648f();
            }
        } else if (!this.f17147y ? j != 0 : z) {
            j = mo17944m(j);
            for (int i4 = 0; i4 < wjVarArr.length; i4++) {
                if (wjVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f17147y = true;
        return j;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo17555g(C5156hl hlVar, long j, long j2, boolean z) {
        m24372s((C5005dj) hlVar);
        if (!z && this.f17116A > 0) {
            int size = this.f17142t.size();
            for (int i = 0; i < size; i++) {
                this.f17142t.valueAt(i).mo21521j(this.f17119D[i]);
            }
            this.f17143u.mo19147g(this);
        }
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ int mo17556h(C5156hl hlVar, long j, long j2, IOException iOException) {
        C5669vg vgVar;
        C5005dj djVar = (C5005dj) hlVar;
        m24372s(djVar);
        Handler handler = this.f17132j;
        if (handler != null) {
            handler.post(new C4968cj(this, iOException));
        }
        if (iOException instanceof C5006dk) {
            return 3;
        }
        int q = m24370q();
        int i = this.f17125J;
        if (this.f17122G == -1 && ((vgVar = this.f17144v) == null || vgVar.zza() == -9223372036854775807L)) {
            this.f17123H = 0;
            this.f17148z = this.f17146x;
            int size = this.f17142t.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f17142t.valueAt(i2).mo21521j(!this.f17146x || this.f17119D[i2]);
            }
            djVar.mo16937d(0, 0);
        }
        this.f17125J = m24370q();
        if (q <= i) {
            return 0;
        }
        return 1;
    }

    /* renamed from: i */
    public final void mo17940i(long j) {
    }

    /* renamed from: j */
    public final void mo17941j(C5669vg vgVar) {
        this.f17144v = vgVar;
        this.f17141s.post(this.f17139q);
    }

    /* renamed from: k */
    public final C4969ck mo17942k() {
        return this.f17117B;
    }

    /* renamed from: l */
    public final C5743xg mo17943l(int i, int i2) {
        C5672vj vjVar = this.f17142t.get(i);
        if (vjVar != null) {
            return vjVar;
        }
        C5672vj vjVar2 = new C5672vj(this.f17128M, (byte[]) null);
        vjVar2.mo21522k(this);
        this.f17142t.put(i, vjVar2);
        return vjVar2;
    }

    /* renamed from: m */
    public final long mo17944m(long j) {
        if (true != this.f17144v.mo19725b()) {
            j = 0;
        }
        this.f17123H = j;
        int size = this.f17142t.size();
        boolean u = true ^ m24374u();
        int i = 0;
        while (true) {
            if (u) {
                if (i >= size) {
                    break;
                }
                if (this.f17119D[i]) {
                    u = this.f17142t.valueAt(i).mo21525n(j, false);
                }
                i++;
            } else {
                this.f17124I = j;
                this.f17126K = false;
                if (this.f17136n.mo18651i()) {
                    this.f17136n.mo18648f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f17142t.valueAt(i2).mo21521j(this.f17119D[i2]);
                    }
                }
            }
        }
        this.f17148z = false;
        return j;
    }

    /* renamed from: n */
    public final void mo17945n(zzapg zzapg) {
        this.f17141s.post(this.f17139q);
    }

    /* renamed from: o */
    public final void mo17946o(C5228jj jjVar, long j) {
        this.f17143u = jjVar;
        this.f17138p.mo19748c();
        m24373t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo17947p(int i) {
        return this.f17126K || (!m24374u() && this.f17142t.valueAt(i).mo21524m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final int mo17948v(int i, C5371ne neVar, C5225jg jgVar, boolean z) {
        if (this.f17148z || m24374u()) {
            return -3;
        }
        return this.f17142t.valueAt(i).mo21517f(neVar, jgVar, z, this.f17126K, this.f17123H);
    }

    public final long zza() {
        if (this.f17116A == 0) {
            return Long.MIN_VALUE;
        }
        return mo17937d();
    }

    public final void zzs() throws IOException {
        this.f17136n.mo18649g(Integer.MIN_VALUE);
    }
}
