package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.le */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5297le implements Handler.Callback, C5228jj, C5451pk, C5302lj {

    /* renamed from: A */
    private int f19301A;

    /* renamed from: B */
    private int f19302B = 0;

    /* renamed from: C */
    private int f19303C;

    /* renamed from: D */
    private int f19304D;

    /* renamed from: E */
    private long f19305E;

    /* renamed from: F */
    private int f19306F;

    /* renamed from: G */
    private C5223je f19307G;

    /* renamed from: H */
    private long f19308H;

    /* renamed from: I */
    private C5149he f19309I;

    /* renamed from: J */
    private C5149he f19310J;

    /* renamed from: K */
    private C5149he f19311K;

    /* renamed from: L */
    private C5741xe f19312L;

    /* renamed from: M */
    private boolean f19313M;

    /* renamed from: N */
    private volatile int f19314N;

    /* renamed from: O */
    private volatile int f19315O;

    /* renamed from: P */
    private final bp0 f19316P;

    /* renamed from: g */
    private final C5519re[] f19317g;

    /* renamed from: h */
    private final C5556se[] f19318h;

    /* renamed from: i */
    private final C5488qk f19319i;

    /* renamed from: j */
    private final C5711wl f19320j;

    /* renamed from: k */
    private final Handler f19321k;

    /* renamed from: l */
    private final HandlerThread f19322l;

    /* renamed from: m */
    private final Handler f19323m;

    /* renamed from: n */
    private final C4963ce f19324n;

    /* renamed from: o */
    private final C5704we f19325o;

    /* renamed from: p */
    private final C5667ve f19326p;

    /* renamed from: q */
    private C5186ie f19327q;

    /* renamed from: r */
    private C5482qe f19328r;

    /* renamed from: s */
    private C5519re f19329s;

    /* renamed from: t */
    private C5452pl f19330t;

    /* renamed from: u */
    private C5339mj f19331u;

    /* renamed from: v */
    private C5519re[] f19332v;

    /* renamed from: w */
    private boolean f19333w;

    /* renamed from: x */
    private boolean f19334x;

    /* renamed from: y */
    private boolean f19335y;

    /* renamed from: z */
    private boolean f19336z;

    public C5297le(C5519re[] reVarArr, C5488qk qkVar, bp0 bp0, boolean z, int i, Handler handler, C5186ie ieVar, C4963ce ceVar, byte[] bArr) {
        this.f19317g = reVarArr;
        this.f19319i = qkVar;
        this.f19316P = bp0;
        this.f19334x = z;
        this.f19323m = handler;
        this.f19301A = 1;
        this.f19327q = ieVar;
        this.f19324n = ceVar;
        this.f19318h = new C5556se[2];
        for (int i2 = 0; i2 < 2; i2++) {
            reVarArr[i2].mo20629P(i2);
            this.f19318h[i2] = reVarArr[i2].mo20635c();
        }
        this.f19320j = new C5711wl();
        this.f19332v = new C5519re[0];
        this.f19325o = new C5704we();
        this.f19326p = new C5667ve();
        qkVar.mo20456c(this);
        this.f19328r = C5482qe.f21905d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f19322l = handlerThread;
        handlerThread.start();
        this.f19321k = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: B */
    private final int m26664B(int i, C5741xe xeVar, C5741xe xeVar2) {
        int b = xeVar.mo15823b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = xeVar.mo22025f(i, this.f19326p, this.f19325o, this.f19302B);
            i2 = xeVar2.mo15822a(xeVar.mo15825d(i, this.f19326p, true).f24697b);
        }
        return i2;
    }

    /* renamed from: C */
    private final long m26665C(int i, long j) throws C5778yd {
        C5149he heVar;
        m26683l();
        this.f19335y = false;
        m26680i(2);
        C5149he heVar2 = this.f19311K;
        if (heVar2 == null) {
            C5149he heVar3 = this.f19309I;
            if (heVar3 != null) {
                heVar3.mo18131c();
            }
            heVar = null;
        } else {
            heVar = null;
            while (heVar2 != null) {
                if (heVar2.f17641g != i || !heVar2.f17644j) {
                    heVar2.mo18131c();
                } else {
                    heVar = heVar2;
                }
                heVar2 = heVar2.f17646l;
            }
        }
        C5149he heVar4 = this.f19311K;
        if (!(heVar4 == heVar && heVar4 == this.f19310J)) {
            for (C5519re h : this.f19332v) {
                h.mo20638h();
            }
            this.f19332v = new C5519re[0];
            this.f19330t = null;
            this.f19329s = null;
            this.f19311K = null;
        }
        if (heVar != null) {
            heVar.f17646l = null;
            this.f19309I = heVar;
            this.f19310J = heVar;
            m26679h(heVar);
            C5149he heVar5 = this.f19311K;
            if (heVar5.f17645k) {
                j = heVar5.f17635a.mo17944m(j);
            }
            m26676d(j);
            m26672J();
        } else {
            this.f19309I = null;
            this.f19310J = null;
            this.f19311K = null;
            m26676d(j);
        }
        this.f19321k.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: D */
    private final Pair<Integer, Long> m26666D(int i, long j) {
        return m26667E(this.f19312L, 0, -9223372036854775807L);
    }

    /* renamed from: E */
    private final Pair<Integer, Long> m26667E(C5741xe xeVar, int i, long j) {
        return m26668F(xeVar, 0, j, 0);
    }

    /* renamed from: F */
    private final Pair<Integer, Long> m26668F(C5741xe xeVar, int i, long j, long j2) {
        C5304ll.m26772a(0, 0, xeVar.mo15824c());
        xeVar.mo15826e(0, this.f19325o, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = xeVar.mo15825d(0, this.f19326p, false).f24698c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: G */
    private final Pair<Integer, Long> m26669G(C5223je jeVar) {
        C5741xe xeVar = jeVar.f18464a;
        if (xeVar.mo22027h()) {
            xeVar = this.f19312L;
        }
        try {
            int i = jeVar.f18465b;
            Pair<Integer, Long> E = m26667E(xeVar, 0, jeVar.f18466c);
            C5741xe xeVar2 = this.f19312L;
            if (xeVar2 == xeVar) {
                return E;
            }
            if (xeVar2.mo15822a(xeVar.mo15825d(((Integer) E.first).intValue(), this.f19326p, true).f24697b) != -1) {
                return Pair.create(0, (Long) E.second);
            }
            if (m26664B(((Integer) E.first).intValue(), xeVar, this.f19312L) == -1) {
                return null;
            }
            this.f19312L.mo15825d(0, this.f19326p, false);
            return m26666D(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            C5741xe xeVar3 = this.f19312L;
            int i2 = jeVar.f18465b;
            throw new C5408oe(xeVar3, 0, jeVar.f18466c);
        }
    }

    /* renamed from: H */
    private final void m26670H(boolean[] zArr, int i) throws C5778yd {
        int i2;
        this.f19332v = new C5519re[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            C5519re reVar = this.f19317g[i3];
            C5118gk a = this.f19311K.f17647m.f22885b.mo20012a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.f19332v[i4] = reVar;
                if (reVar.mo20633a() == 0) {
                    C5593te teVar = this.f19311K.f17647m.f22887d[i3];
                    boolean z = this.f19334x && this.f19301A == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.mo17955b();
                    zzapg[] zzapgArr = new zzapg[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzapgArr[i6] = a.mo17956c(i6);
                    }
                    C5149he heVar = this.f19311K;
                    i2 = i3;
                    reVar.mo20631R(teVar, zzapgArr, heVar.f17638d[i3], this.f19308H, z2, heVar.f17640f - heVar.f17642h);
                    C5452pl g = reVar.mo20637g();
                    if (g != null) {
                        if (this.f19330t == null) {
                            this.f19330t = g;
                            this.f19329s = reVar;
                            g.mo20280d(this.f19328r);
                        } else {
                            throw C5778yd.zzc(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        reVar.mo20641x();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: I */
    private final void m26671I(Object obj, int i) {
        this.f19327q = new C5186ie(0, 0);
        m26674L(obj, i);
        this.f19327q = new C5186ie(0, -9223372036854775807L);
        m26680i(4);
        m26675M(false);
    }

    /* renamed from: J */
    private final void m26672J() {
        long j;
        C5149he heVar = this.f19309I;
        if (!heVar.f17644j) {
            j = 0;
        } else {
            j = heVar.f17635a.zza();
        }
        if (j == Long.MIN_VALUE) {
            m26678f(false);
            return;
        }
        C5149he heVar2 = this.f19309I;
        long j2 = this.f19308H - (heVar2.f17640f - heVar2.f17642h);
        boolean j3 = this.f19316P.mo16345j(j - j2);
        m26678f(j3);
        if (j3) {
            this.f19309I.f17635a.mo17936b(j2);
        }
    }

    /* renamed from: K */
    private final void m26673K() throws IOException {
        C5149he heVar = this.f19309I;
        if (heVar != null && !heVar.f17644j) {
            C5149he heVar2 = this.f19310J;
            if (heVar2 == null || heVar2.f17646l == heVar) {
                C5519re[] reVarArr = this.f19332v;
                int length = reVarArr.length;
                int i = 0;
                while (i < length) {
                    if (reVarArr[i].mo20626B()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f19309I.f17635a.zzs();
            }
        }
    }

    /* renamed from: L */
    private final void m26674L(Object obj, int i) {
        this.f19323m.obtainMessage(6, new C5260ke(this.f19312L, obj, this.f19327q, i)).sendToTarget();
    }

    /* renamed from: M */
    private final void m26675M(boolean z) {
        this.f19321k.removeMessages(2);
        this.f19335y = false;
        this.f19320j.mo21846c();
        this.f19330t = null;
        this.f19329s = null;
        this.f19308H = 60000000;
        for (C5519re reVar : this.f19332v) {
            try {
                m26687p(reVar);
                reVar.mo20638h();
            } catch (C5778yd | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f19332v = new C5519re[0];
        C5149he heVar = this.f19311K;
        if (heVar == null) {
            heVar = this.f19309I;
        }
        m26688q(heVar);
        this.f19309I = null;
        this.f19310J = null;
        this.f19311K = null;
        m26678f(false);
        if (z) {
            C5339mj mjVar = this.f19331u;
            if (mjVar != null) {
                mjVar.mo18385f();
                this.f19331u = null;
            }
            this.f19312L = null;
        }
    }

    /* renamed from: d */
    private final void m26676d(long j) throws C5778yd {
        long j2;
        C5149he heVar = this.f19311K;
        if (heVar == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + (heVar.f17640f - heVar.f17642h);
        }
        this.f19308H = j2;
        this.f19320j.mo21844a(j2);
        for (C5519re Q : this.f19332v) {
            Q.mo20630Q(this.f19308H);
        }
    }

    /* renamed from: e */
    private final void m26677e(long j, long j2) {
        this.f19321k.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f19321k.sendEmptyMessage(2);
        } else {
            this.f19321k.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: f */
    private final void m26678f(boolean z) {
        if (this.f19336z != z) {
            this.f19336z = z;
            this.f19323m.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: h */
    private final void m26679h(C5149he heVar) throws C5778yd {
        if (this.f19311K != heVar) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                C5519re reVar = this.f19317g[i2];
                zArr[i2] = reVar.mo20633a() != 0;
                C5118gk a = heVar.f17647m.f22885b.mo20012a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (reVar.mo20627I() && reVar.mo20636e() == this.f19311K.f17638d[i2]))) {
                    if (reVar == this.f19329s) {
                        this.f19320j.mo21847e(this.f19330t);
                        this.f19330t = null;
                        this.f19329s = null;
                    }
                    m26687p(reVar);
                    reVar.mo20638h();
                }
            }
            this.f19311K = heVar;
            this.f19323m.obtainMessage(3, heVar.f17647m).sendToTarget();
            m26670H(zArr, i);
        }
    }

    /* renamed from: i */
    private final void m26680i(int i) {
        if (this.f19301A != i) {
            this.f19301A = i;
            this.f19323m.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: j */
    private final void m26681j() throws C5778yd {
        this.f19335y = false;
        this.f19320j.mo21845b();
        for (C5519re x : this.f19332v) {
            x.mo20641x();
        }
    }

    /* renamed from: k */
    private final void m26682k() {
        m26675M(true);
        this.f19316P.mo16338c();
        m26680i(1);
    }

    /* renamed from: l */
    private final void m26683l() throws C5778yd {
        this.f19320j.mo21846c();
        for (C5519re p : this.f19332v) {
            m26687p(p);
        }
    }

    /* renamed from: m */
    private final void m26684m() throws C5778yd {
        long j;
        C5149he heVar = this.f19311K;
        if (heVar != null) {
            long e = heVar.f17635a.mo17938e();
            if (e != -9223372036854775807L) {
                m26676d(e);
            } else {
                C5519re reVar = this.f19329s;
                if (reVar == null || reVar.mo18357F()) {
                    this.f19308H = this.f19320j.mo20279K();
                } else {
                    long K = this.f19330t.mo20279K();
                    this.f19308H = K;
                    this.f19320j.mo21844a(K);
                }
                C5149he heVar2 = this.f19311K;
                e = this.f19308H - (heVar2.f17640f - heVar2.f17642h);
            }
            this.f19327q.f17963c = e;
            this.f19305E = SystemClock.elapsedRealtime() * 1000;
            if (this.f19332v.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f19311K.f17635a.mo17937d();
            }
            C5186ie ieVar = this.f19327q;
            if (j == Long.MIN_VALUE) {
                j = this.f19312L.mo15825d(this.f19311K.f17641g, this.f19326p, false).f24698c;
            }
            ieVar.f17964d = j;
        }
    }

    /* renamed from: n */
    private final boolean m26685n(int i) {
        this.f19312L.mo15825d(i, this.f19326p, false);
        this.f19312L.mo22026g(0, this.f19325o, false);
        if (this.f19312L.mo22025f(i, this.f19326p, this.f19325o, this.f19302B) == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.f19311K.f17646l;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m26686o(long r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.ie r2 = r5.f19327q
            long r2 = r2.f17963c
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.he r6 = r5.f19311K
            com.google.android.gms.internal.ads.he r6 = r6.f17646l
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f17644j
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5297le.m26686o(long):boolean");
    }

    /* renamed from: p */
    private static final void m26687p(C5519re reVar) throws C5778yd {
        if (reVar.mo20633a() == 2) {
            reVar.mo20628O();
        }
    }

    /* renamed from: q */
    private static final void m26688q(C5149he heVar) {
        while (heVar != null) {
            heVar.mo18131c();
            heVar = heVar.f17646l;
        }
    }

    /* renamed from: A */
    public final void mo19145A() {
        this.f19321k.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo18641a(C5265kj kjVar) {
        this.f19321k.obtainMessage(8, kjVar).sendToTarget();
    }

    /* renamed from: b */
    public final void mo18382b(C5741xe xeVar, Object obj) {
        this.f19321k.obtainMessage(7, Pair.create(xeVar, (Object) null)).sendToTarget();
    }

    /* renamed from: c */
    public final void mo19146c() {
        this.f19321k.sendEmptyMessage(10);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo19147g(C5821zj zjVar) {
        this.f19321k.obtainMessage(9, (C5265kj) zjVar).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0364, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0416, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0417, code lost:
        r2 = r0;
        r6 = new com.google.android.gms.internal.ads.C5186ie(r3, r4);
        r8.f19327q = r6;
        r8.f19323m.obtainMessage(4, r1, 0, r6).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0428, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0798, code lost:
        if (m26686o(r1) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0872, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0873, code lost:
        r2 = r0;
        r1 = true;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0878, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0879, code lost:
        r2 = r0;
        r1 = true;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x087f, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f19323m.obtainMessage(8, com.google.android.gms.internal.ads.C5778yd.zzc(r1)).sendToTarget();
        m26682k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ca, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cb, code lost:
        monitor-enter(r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.f19304D++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0268 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026c A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0271 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ea A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0508 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050b A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0558 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0572 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }, LOOP:8: B:317:0x0572->B:321:0x0582, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c7 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x087e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ yd -> 0x08b8, IOException -> 0x089b, RuntimeException -> 0x087e }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x083d;
                case 1: goto L_0x080e;
                case 2: goto L_0x0429;
                case 3: goto L_0x038a;
                case 4: goto L_0x036c;
                case 5: goto L_0x0368;
                case 6: goto L_0x0351;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19302B = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.he r3 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.he r4 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.xe r11 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r13 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we r14 = r8.f19325o     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.mo22025f(r12, r13, r14, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0042:
            com.google.android.gms.internal.ads.he r12 = r2.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.he r2 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r11 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we r14 = r8.f19325o     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r2.mo22025f(r13, r11, r14, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            m26688q(r12)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f17646l = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x006f:
            int r5 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r5 = r8.m26685n(r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f17643i = r5     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != 0) goto L_0x007b
            r8.f19309I = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.he r2 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r3 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r8.m26665C(r2, r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r5 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r2, r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r5     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0092:
            int r2 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.m26680i(r7)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.be[] r1 = (com.google.android.gms.internal.ads.C4926be[]) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.ae r4 = r3.f14409a     // Catch:{ all -> 0x00c9 }
            int r5 = r3.f14410b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f14411c     // Catch:{ all -> 0x00c9 }
            r4.mo15757i(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.mj r1 = r8.f19331u     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.f19321k     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r8.f19304D     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.f19304D = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.f19304D     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.f19304D = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00da:
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x01b5
            r2 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x01b5
            boolean r3 = r1.f17644j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b5
        L_0x00e7:
            boolean r3 = r1.mo18133e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.he r2 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            com.google.android.gms.internal.ads.he r3 = r3.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m26688q(r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f17646l = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19309I = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19310J = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean[] r4 = new boolean[r7]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r5 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r3.mo18130b(r11, r2, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r5 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.ie r5 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.f17963c = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26676d(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 0
            r5 = 0
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.re[] r11 = r8.f19317g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r11[r3]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.mo20633a()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r2[r3] = r12     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r13 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wj[] r13 = r13.f17638d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r3]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.wj r12 = r11.mo20636e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.re r12 = r8.f19329s     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.wl r12 = r8.f19320j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.pl r13 = r8.f19330t     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.mo21847e(r13)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0152:
            r8.f19330t = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19329s = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0156:
            m26687p(r11)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo20638h()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo20630Q(r12)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.rk r1 = r1.f17647m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26670H(r2, r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x019d
        L_0x0178:
            r8.f19309I = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            r1.mo18131c()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x017c
        L_0x0184:
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.f17646l = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.f17644j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x019d
            long r2 = r1.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo18129a(r1, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x019d:
            r33.m26672J()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26684m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f19321k     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r7)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x01b5
        L_0x01a9:
            com.google.android.gms.internal.ads.he r3 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != r3) goto L_0x01af
            r3 = 0
            goto L_0x01b0
        L_0x01af:
            r3 = 1
        L_0x01b0:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.he r1 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x00df
        L_0x01b5:
            return r10
        L_0x01b6:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.kj r1 = (com.google.android.gms.internal.ads.C5265kj) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.kj r2 = r2.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r1) goto L_0x01c5
            r33.m26672J()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01c5:
            return r10
        L_0x01c6:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.kj r1 = (com.google.android.gms.internal.ads.C5265kj) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.kj r3 = r2.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == r1) goto L_0x01d3
            goto L_0x01f5
        L_0x01d3:
            r2.f17644j = r10     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo18133e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.mo18129a(r3, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f17642h = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x01f2
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19310J = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26676d(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26679h(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f2:
            r33.m26672J()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f5:
            return r10
        L_0x01f6:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r1.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r3 = (com.google.android.gms.internal.ads.C5741xe) r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19312L = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0263
            int r4 = r8.f19306F     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 <= 0) goto L_0x0235
            com.google.android.gms.internal.ads.je r3 = r8.f19307G     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r3 = r8.m26669G(r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r8.f19306F     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19306F = r9     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19307G = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x021d
            r8.m26671I(r1, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x021d:
            com.google.android.gms.internal.ads.ie r7 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.intValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7.<init>(r11, r14)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r7     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0264
        L_0x0235:
            com.google.android.gms.internal.ads.ie r4 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r4.f17962b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0263
            boolean r3 = r3.mo22027h()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0248
            r8.m26671I(r1, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0248:
            android.util.Pair r3 = r8.m26666D(r9, r12)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r4 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r7 = r3.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.intValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4.<init>(r7, r14)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r4     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0263:
            r4 = 0
        L_0x0264:
            com.google.android.gms.internal.ads.he r3 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x026a
            com.google.android.gms.internal.ads.he r3 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x026a:
            if (r3 != 0) goto L_0x0271
            r8.m26674L(r1, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0271:
            com.google.android.gms.internal.ads.xe r7 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.f17636b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.mo15822a(r11)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != r5) goto L_0x02d4
            int r6 = r3.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r7 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.m26664B(r6, r2, r7)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r5) goto L_0x028a
            r8.m26671I(r1, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x028a:
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r6 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo15825d(r9, r6, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r2 = r8.m26666D(r9, r12)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r6 = r2.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = r6.intValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r2.longValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r7 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo15825d(r6, r7, r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r2 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.f24697b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f17641g = r5     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02b2:
            com.google.android.gms.internal.ads.he r3 = r3.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r7 = r3.f17636b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r7.equals(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r10 == r7) goto L_0x02c0
            r7 = -1
            goto L_0x02c1
        L_0x02c0:
            r7 = r6
        L_0x02c1:
            r3.f17641g = r7     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x02b2
        L_0x02c4:
            long r2 = r8.m26665C(r6, r11)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r5 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r6, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r5     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26674L(r1, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x02d4:
            boolean r2 = r8.m26685n(r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f17641g = r9     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f17643i = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != r2) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            com.google.android.gms.internal.ads.ie r11 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.f17961a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.ie r12 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f17962b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.<init>(r9, r13)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f17963c = r13     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f17964d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f17964d = r13     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r12     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02fa:
            com.google.android.gms.internal.ads.he r11 = r3.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 == 0) goto L_0x034d
            com.google.android.gms.internal.ads.xe r12 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r13 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we r14 = r8.f19325o     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f19302B     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r12.mo22025f(r7, r13, r14, r15)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == r5) goto L_0x0330
            java.lang.Object r12 = r11.f17636b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r13 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r14 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r13 = r13.mo15825d(r7, r14, r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r13 = r13.f24697b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r12 = r12.equals(r13)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0330
            boolean r3 = r8.m26685n(r7)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f17641g = r7     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f17643i = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r3) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02fa
        L_0x0330:
            if (r2 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.he r2 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r3 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r3.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r8.m26665C(r2, r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r3 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.<init>(r2, r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x034d
        L_0x0346:
            r8.f19309I = r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f17646l = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m26688q(r11)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x034d:
            r8.m26674L(r1, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0350:
            return r10
        L_0x0351:
            r8.m26675M(r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bp0 r1 = r8.f19316P     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo16337b()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26680i(r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            monitor-enter(r33)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19333w = r10     // Catch:{ all -> 0x0364 }
            r33.notifyAll()     // Catch:{ all -> 0x0364 }
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            return r10
        L_0x0364:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            throw r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0368:
            r33.m26682k()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.qe r1 = (com.google.android.gms.internal.ads.C5482qe) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.pl r2 = r8.f19330t     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0379
            com.google.android.gms.internal.ads.qe r1 = r2.mo20280d(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x037e
        L_0x0379:
            com.google.android.gms.internal.ads.wl r2 = r8.f19320j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo20280d(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x037e:
            r8.f19328r = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.je r1 = (com.google.android.gms.internal.ads.C5223je) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x039b
            int r2 = r8.f19306F     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r8.f19306F = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19307G = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x039b:
            android.util.Pair r2 = r8.m26669G(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.ie r1 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r1 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r12)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26680i(r15)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26675M(r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03bf:
            long r3 = r1.f18466c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            r1 = 1
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            java.lang.Object r3 = r2.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.intValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.longValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r2 = r8.f19327q     // Catch:{ all -> 0x0416 }
            int r6 = r2.f17961a     // Catch:{ all -> 0x0416 }
            if (r3 != r6) goto L_0x03fb
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.f17963c     // Catch:{ all -> 0x0416 }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03fb
            com.google.android.gms.internal.ads.ie r2 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x03f7:
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03fb:
            long r6 = r8.m26665C(r3, r4)     // Catch:{ all -> 0x0416 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0405
            r2 = 1
            goto L_0x0406
        L_0x0405:
            r2 = 0
        L_0x0406:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.ie r2 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r6)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x03f7
        L_0x0415:
            return r10
        L_0x0416:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.ie r6 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6.<init>(r3, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r6     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            throw r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0429:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r1 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.mj r1 = r8.f19331u     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r5
            goto L_0x0677
        L_0x043b:
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0444
            com.google.android.gms.internal.ads.ie r1 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f17961a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0479
        L_0x0444:
            int r2 = r1.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r1.f17643i     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0553
            boolean r1 = r1.mo18132d()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.xe r1 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r7 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r1 = r1.mo15825d(r2, r7, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f24698c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x046d
            com.google.android.gms.internal.ads.he r7 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.f17637c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f17637c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0553
        L_0x046d:
            com.google.android.gms.internal.ads.xe r1 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r7 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we r14 = r8.f19325o     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f19302B     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.mo22025f(r2, r7, r14, r15)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0479:
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.mo15823b()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 < r2) goto L_0x0488
            com.google.android.gms.internal.ads.mj r1 = r8.f19331u     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0553
        L_0x0488:
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0493
            com.google.android.gms.internal.ads.ie r2 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0490:
            r11 = r5
            r15 = 2
            goto L_0x04e6
        L_0x0493:
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r7 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo15825d(r1, r7, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.we r7 = r8.f19325o     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo22026g(r9, r7, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x04a4
            goto L_0x0490
        L_0x04a4:
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r7 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r1 = r2.mo15825d(r1, r7, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f24698c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 + r1
            long r1 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.m26668F(r2, r3, r4, r6)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0554
            java.lang.Object r2 = r1.first     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.intValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r1.longValue()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r2
        L_0x04e6:
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x04f1
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04ee:
            r21 = r5
            goto L_0x0504
        L_0x04f1:
            long r5 = r2.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.xe r7 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r13 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r2 = r7.mo15825d(r2, r13, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f24698c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 + r13
            goto L_0x04ee
        L_0x0504:
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x050b
            r27 = 0
            goto L_0x0510
        L_0x050b:
            int r2 = r2.f17637c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r27 = r2
        L_0x0510:
            boolean r29 = r8.m26685n(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xe r2 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r5 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo15825d(r1, r5, r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = new com.google.android.gms.internal.ads.he     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.re[] r5 = r8.f19317g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.se[] r6 = r8.f19318h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.qk r7 = r8.f19319i     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bp0 r13 = r8.f19316P     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.mj r14 = r8.f19331u     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r15 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r15 = r15.f24697b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0548
            r1.f17646l = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0548:
            r8.f19309I = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.kj r1 = r2.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo17946o(r8, r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26678f(r10)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0554
        L_0x0553:
            r11 = r5
        L_0x0554:
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056b
            boolean r1 = r1.mo18132d()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x055f
            goto L_0x056b
        L_0x055f:
            com.google.android.gms.internal.ads.he r1 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056e
            boolean r1 = r8.f19336z     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x056e
            r33.m26672J()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x056e
        L_0x056b:
            r8.m26678f(r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x056e:
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0677
        L_0x0572:
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == r2) goto L_0x05a9
            long r3 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r5 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05a9
            r1.mo18131c()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26679h(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r1 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r3, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26684m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 5
            com.google.android.gms.internal.ads.ie r3 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0572
        L_0x05a9:
            boolean r1 = r2.f17643i     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x05cf
            r1 = 0
        L_0x05ae:
            r2 = 2
            if (r1 >= r2) goto L_0x0677
            com.google.android.gms.internal.ads.re[] r2 = r8.f19317g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wj[] r3 = r3.f17638d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            com.google.android.gms.internal.ads.wj r4 = r2.mo20636e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x05cc
            boolean r3 = r2.mo20626B()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            r2.mo20640t()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05ae
        L_0x05cf:
            r1 = 0
        L_0x05d0:
            r2 = 2
            if (r1 >= r2) goto L_0x05ee
            com.google.android.gms.internal.ads.re[] r2 = r8.f19317g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r3 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wj[] r3 = r3.f17638d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wj r4 = r2.mo20636e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x0677
            if (r3 == 0) goto L_0x05eb
            boolean r2 = r2.mo20626B()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
        L_0x05eb:
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05ee:
            com.google.android.gms.internal.ads.he r1 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r1.f17646l     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
            boolean r3 = r2.f17644j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0677
            com.google.android.gms.internal.ads.rk r1 = r1.f17647m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19310J = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.rk r3 = r2.f17647m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.kj r2 = r2.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.mo17938e()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 0
            r6 = 2
        L_0x0606:
            if (r2 >= r6) goto L_0x0677
            com.google.android.gms.internal.ads.re[] r6 = r8.f19317g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6 = r6[r2]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ok r7 = r1.f22885b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.gk r7 = r7.mo20012a(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0619
        L_0x0614:
            r19 = r3
            r20 = r4
            goto L_0x066d
        L_0x0619:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0626
            r6.mo20640t()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0614
        L_0x0626:
            boolean r7 = r6.mo20627I()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0614
            com.google.android.gms.internal.ads.ok r7 = r3.f22885b     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.gk r7 = r7.mo20012a(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.te[] r13 = r1.f22887d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r2]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.te[] r14 = r3.f22887d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == 0) goto L_0x0666
            boolean r13 = r14.equals(r13)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x0666
            r7.mo17955b()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.zzapg[] r13 = new com.google.android.gms.internal.ads.zzapg[r10]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = 0
        L_0x0648:
            if (r14 > 0) goto L_0x0653
            com.google.android.gms.internal.ads.zzapg r15 = r7.mo17956c(r14)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13[r14] = r15     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r14 = r14 + 1
            goto L_0x0648
        L_0x0653:
            com.google.android.gms.internal.ads.he r7 = r8.f19310J     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wj[] r14 = r7.f17638d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r7.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r19 = r3
            r20 = r4
            long r3 = r7.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r3
            r6.mo20632T(r13, r14, r9)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x066d
        L_0x0666:
            r19 = r3
            r20 = r4
            r6.mo20640t()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x066d:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x0606
        L_0x0677:
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 10
            if (r1 != 0) goto L_0x0686
            r33.m26673K()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m26677e(r11, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0683:
            r1 = 1
            goto L_0x080d
        L_0x0686:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.C5786yl.m34154a(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26684m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r1 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.kj r1 = r1.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r4 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r4.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo17940i(r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.re[] r1 = r8.f19332v     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r1.length     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x069f:
            if (r7 >= r4) goto L_0x06d6
            r9 = r1[r7]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r8.f19305E     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9.mo18364S(r13, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x06b4
            boolean r2 = r9.mo18357F()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06b4
            r6 = 1
            goto L_0x06b5
        L_0x06b4:
            r6 = 0
        L_0x06b5:
            boolean r2 = r9.mo18375w()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06c4
            boolean r2 = r9.mo18357F()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06c2
            goto L_0x06c4
        L_0x06c2:
            r2 = 0
            goto L_0x06c5
        L_0x06c4:
            r2 = 1
        L_0x06c5:
            if (r2 != 0) goto L_0x06ca
            r9.mo20639m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06ca:
            if (r5 == 0) goto L_0x06d0
            if (r2 == 0) goto L_0x06d0
            r5 = 1
            goto L_0x06d1
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x069f
        L_0x06d6:
            if (r5 != 0) goto L_0x06db
            r33.m26673K()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06db:
            com.google.android.gms.internal.ads.pl r1 = r8.f19330t     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.qe r1 = r1.mo20281s()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.qe r2 = r8.f19328r     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.equals(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06fe
            r8.f19328r = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wl r2 = r8.f19320j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.pl r3 = r8.f19330t     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo21847e(r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06fe:
            com.google.android.gms.internal.ads.xe r1 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r3 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            com.google.android.gms.internal.ads.ve r1 = r1.mo15825d(r2, r3, r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f24698c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x072f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0720
            com.google.android.gms.internal.ads.ie r3 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f17963c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x072f
        L_0x0720:
            com.google.android.gms.internal.ads.he r3 = r8.f19311K     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r3.f17643i     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x072f
            r3 = 4
            r8.m26680i(r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26683l()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x072f:
            int r3 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 2
            if (r3 != r4) goto L_0x07a6
            com.google.android.gms.internal.ads.re[] r3 = r8.f19332v     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x0794
            if (r5 == 0) goto L_0x07c0
            boolean r1 = r8.f19335y     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f17644j     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x0746
            long r2 = r2.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x074c
        L_0x0746:
            com.google.android.gms.internal.ads.kj r2 = r2.f17635a     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.mo17937d()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x074c:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0766
            com.google.android.gms.internal.ads.he r2 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f17643i     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0759
            goto L_0x079a
        L_0x0759:
            com.google.android.gms.internal.ads.xe r3 = r8.f19312L     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f17641g     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ve r4 = r8.f19326p     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 0
            com.google.android.gms.internal.ads.ve r2 = r3.mo15825d(r2, r4, r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.f24698c     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0766:
            boolean r4 = r8.f19313M     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 == 0) goto L_0x0780
            com.google.android.gms.internal.ads.bp0 r2 = r8.f19316P     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ie r3 = r8.f19327q     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f17964d     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r5 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.mo16346k(r3, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0791
        L_0x0780:
            com.google.android.gms.internal.ads.bp0 r4 = r8.f19316P     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.he r5 = r8.f19309I     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f19308H     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f17640f     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f17642h     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.mo16346k(r2, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0791:
            if (r1 == 0) goto L_0x07c0
            goto L_0x079a
        L_0x0794:
            boolean r1 = r8.m26686o(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
        L_0x079a:
            r1 = 3
            r8.m26680i(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r1 = r8.f19334x     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
            r33.m26681j()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x07a6:
            r4 = 3
            if (r3 != r4) goto L_0x07c0
            com.google.android.gms.internal.ads.re[] r3 = r8.f19332v     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x07af
            goto L_0x07b3
        L_0x07af:
            boolean r5 = r8.m26686o(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07b3:
            if (r5 != 0) goto L_0x07c0
            boolean r1 = r8.f19334x     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19335y = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m26680i(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26683l()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07c0:
            int r1 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07d3
            com.google.android.gms.internal.ads.re[] r1 = r8.f19332v     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9 = 0
        L_0x07c9:
            if (r9 >= r2) goto L_0x07d3
            r3 = r1[r9]     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo20639m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07d3:
            boolean r1 = r8.f19334x     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07dc
            int r1 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 == r2) goto L_0x07e1
        L_0x07dc:
            int r1 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07ef
        L_0x07e1:
            int r1 = r8.f19314N     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07e9
            int r1 = r8.f19314N     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = (long) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07eb
        L_0x07e9:
            r2 = 10
        L_0x07eb:
            r8.m26677e(r11, r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x07ef:
            com.google.android.gms.internal.ads.re[] r1 = r8.f19332v     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.length     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0802
            int r1 = r8.f19315O     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07fc
            int r1 = r8.f19315O     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = (long) r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07fe
        L_0x07fc:
            r1 = r16
        L_0x07fe:
            r8.m26677e(r11, r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x0802:
            android.os.Handler r1 = r8.f19321k     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0808:
            com.google.android.gms.internal.ads.C5786yl.m34155b()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0683
        L_0x080d:
            return r1
        L_0x080e:
            int r1 = r1.arg1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0814
            r1 = 1
            goto L_0x0815
        L_0x0814:
            r1 = 0
        L_0x0815:
            r2 = 0
            r8.f19335y = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19334x = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0824
            r33.m26683l()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m26684m()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0822:
            r1 = 1
            goto L_0x083c
        L_0x0824:
            int r1 = r8.f19301A     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 != r2) goto L_0x0833
            r33.m26681j()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f19321k     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x0833:
            r2 = 2
            if (r1 != r2) goto L_0x0822
            android.os.Handler r1 = r8.f19321k     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r2)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x083c:
            return r1
        L_0x083d:
            java.lang.Object r2 = r1.obj     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.mj r2 = (com.google.android.gms.internal.ads.C5339mj) r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.arg1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f19323m     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r8.m26675M(r3)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bp0 r3 = r8.f19316P     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo16336a()     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0860
            com.google.android.gms.internal.ads.ie r1 = new com.google.android.gms.internal.ads.ie     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f19327q = r1     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0860:
            r8.f19331u = r2     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ce r1 = r8.f19324n     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r2.mo18384d(r1, r3, r8)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m26680i(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f19321k     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.sendEmptyMessage(r1)     // Catch:{ yd -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r3
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08a0
        L_0x0878:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08bd
        L_0x087e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f19323m
            com.google.android.gms.internal.ads.yd r1 = com.google.android.gms.internal.ads.C5778yd.zzc(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.m26682k()
            r1 = 1
            return r1
        L_0x089b:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08a0:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f19323m
            com.google.android.gms.internal.ads.yd r2 = com.google.android.gms.internal.ads.C5778yd.zzb(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m26682k()
            return r1
        L_0x08b8:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08bd:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f19323m
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m26682k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5297le.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19149r(com.google.android.gms.internal.ads.C4926be... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f19333w     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f19303C     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f19303C = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f19321k     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f19304D     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5297le.mo19149r(com.google.android.gms.internal.ads.be[]):void");
    }

    /* renamed from: s */
    public final void mo19150s() {
        this.f19313M = true;
    }

    /* renamed from: t */
    public final void mo19151t(C5339mj mjVar, boolean z) {
        this.f19321k.obtainMessage(0, 1, 0, mjVar).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19152u() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f19333w     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f19321k     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f19333w     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f19322l     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5297le.mo19152u():void");
    }

    /* renamed from: v */
    public final void mo19153v(C5741xe xeVar, int i, long j) {
        this.f19321k.obtainMessage(3, new C5223je(xeVar, 0, j)).sendToTarget();
    }

    /* renamed from: w */
    public final void mo19154w(C4926be... beVarArr) {
        if (this.f19333w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f19303C++;
        this.f19321k.obtainMessage(11, beVarArr).sendToTarget();
    }

    /* renamed from: x */
    public final void mo19155x(int i) {
        this.f19315O = i;
    }

    /* renamed from: y */
    public final void mo19156y(int i) {
        this.f19314N = i;
    }

    /* renamed from: z */
    public final void mo19157z(boolean z) {
        this.f19321k.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }
}
