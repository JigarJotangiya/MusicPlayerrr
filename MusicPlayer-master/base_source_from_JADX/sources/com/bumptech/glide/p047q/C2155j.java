package com.bumptech.glide.p047q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1721c;
import com.bumptech.glide.C1726d;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.p030n.C1877k;
import com.bumptech.glide.load.p030n.C1895q;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p036p.p039f.C2059a;
import com.bumptech.glide.p047q.p048l.C2165h;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p047q.p049m.C2174c;
import com.bumptech.glide.p051s.C2188f;
import com.bumptech.glide.p051s.C2194k;
import com.bumptech.glide.p051s.p052l.C2205c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.q.j */
/* compiled from: SingleRequest */
public final class C2155j<R> implements C2147d, C2165h, C2154i {

    /* renamed from: D */
    private static final boolean f7351D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f7352A;

    /* renamed from: B */
    private boolean f7353B;

    /* renamed from: C */
    private RuntimeException f7354C;

    /* renamed from: a */
    private final String f7355a;

    /* renamed from: b */
    private final C2205c f7356b;

    /* renamed from: c */
    private final Object f7357c;

    /* renamed from: d */
    private final C2152g<R> f7358d;

    /* renamed from: e */
    private final C2148e f7359e;

    /* renamed from: f */
    private final Context f7360f;

    /* renamed from: g */
    private final C1726d f7361g;

    /* renamed from: h */
    private final Object f7362h;

    /* renamed from: i */
    private final Class<R> f7363i;

    /* renamed from: j */
    private final C2144a<?> f7364j;

    /* renamed from: k */
    private final int f7365k;

    /* renamed from: l */
    private final int f7366l;

    /* renamed from: m */
    private final C1730g f7367m;

    /* renamed from: n */
    private final C2166i<R> f7368n;

    /* renamed from: o */
    private final List<C2152g<R>> f7369o;

    /* renamed from: p */
    private final C2174c<? super R> f7370p;

    /* renamed from: q */
    private final Executor f7371q;

    /* renamed from: r */
    private C1902v<R> f7372r;

    /* renamed from: s */
    private C1877k.C1883d f7373s;

    /* renamed from: t */
    private long f7374t;

    /* renamed from: u */
    private volatile C1877k f7375u;

    /* renamed from: v */
    private C2156a f7376v;

    /* renamed from: w */
    private Drawable f7377w;

    /* renamed from: x */
    private Drawable f7378x;

    /* renamed from: y */
    private Drawable f7379y;

    /* renamed from: z */
    private int f7380z;

    /* renamed from: com.bumptech.glide.q.j$a */
    /* compiled from: SingleRequest */
    private enum C2156a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C2155j(Context context, C1726d dVar, Object obj, Object obj2, Class<R> cls, C2144a<?> aVar, int i, int i2, C1730g gVar, C2166i<R> iVar, C2152g<R> gVar2, List<C2152g<R>> list, C2148e eVar, C1877k kVar, C2174c<? super R> cVar, Executor executor) {
        this.f7355a = f7351D ? String.valueOf(super.hashCode()) : null;
        this.f7356b = C2205c.m10314a();
        this.f7357c = obj;
        this.f7360f = context;
        this.f7361g = dVar;
        this.f7362h = obj2;
        this.f7363i = cls;
        this.f7364j = aVar;
        this.f7365k = i;
        this.f7366l = i2;
        this.f7367m = gVar;
        this.f7368n = iVar;
        this.f7358d = gVar2;
        this.f7369o = list;
        this.f7359e = eVar;
        this.f7375u = kVar;
        this.f7370p = cVar;
        this.f7371q = executor;
        this.f7376v = C2156a.PENDING;
        if (this.f7354C == null && dVar.mo7606g().mo7609a(C1721c.C1724c.class)) {
            this.f7354C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m10115A() {
        if (m10118l()) {
            Drawable drawable = null;
            if (this.f7362h == null) {
                drawable = m10122p();
            }
            if (drawable == null) {
                drawable = m10121o();
            }
            if (drawable == null) {
                drawable = m10123q();
            }
            this.f7368n.mo8430f(drawable);
        }
    }

    /* renamed from: i */
    private void m10116i() {
        if (this.f7353B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m10117k() {
        C2148e eVar = this.f7359e;
        return eVar == null || eVar.mo8424k(this);
    }

    /* renamed from: l */
    private boolean m10118l() {
        C2148e eVar = this.f7359e;
        return eVar == null || eVar.mo8417e(this);
    }

    /* renamed from: m */
    private boolean m10119m() {
        C2148e eVar = this.f7359e;
        return eVar == null || eVar.mo8419g(this);
    }

    /* renamed from: n */
    private void m10120n() {
        m10116i();
        this.f7356b.mo8515c();
        this.f7368n.mo8427b(this);
        C1877k.C1883d dVar = this.f7373s;
        if (dVar != null) {
            dVar.mo7937a();
            this.f7373s = null;
        }
    }

    /* renamed from: o */
    private Drawable m10121o() {
        if (this.f7377w == null) {
            Drawable n = this.f7364j.mo8399n();
            this.f7377w = n;
            if (n == null && this.f7364j.mo8397m() > 0) {
                this.f7377w = m10125s(this.f7364j.mo8397m());
            }
        }
        return this.f7377w;
    }

    /* renamed from: p */
    private Drawable m10122p() {
        if (this.f7379y == null) {
            Drawable o = this.f7364j.mo8401o();
            this.f7379y = o;
            if (o == null && this.f7364j.mo8402q() > 0) {
                this.f7379y = m10125s(this.f7364j.mo8402q());
            }
        }
        return this.f7379y;
    }

    /* renamed from: q */
    private Drawable m10123q() {
        if (this.f7378x == null) {
            Drawable v = this.f7364j.mo8407v();
            this.f7378x = v;
            if (v == null && this.f7364j.mo8408w() > 0) {
                this.f7378x = m10125s(this.f7364j.mo8408w());
            }
        }
        return this.f7378x;
    }

    /* renamed from: r */
    private boolean m10124r() {
        C2148e eVar = this.f7359e;
        return eVar == null || !eVar.mo8412a().mo8413b();
    }

    /* renamed from: s */
    private Drawable m10125s(int i) {
        return C2059a.m9659a(this.f7361g, i, this.f7364j.mo8357C() != null ? this.f7364j.mo8357C() : this.f7360f.getTheme());
    }

    /* renamed from: t */
    private void m10126t(String str) {
        Log.v("Request", str + " this: " + this.f7355a);
    }

    /* renamed from: u */
    private static int m10127u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: v */
    private void m10128v() {
        C2148e eVar = this.f7359e;
        if (eVar != null) {
            eVar.mo8414c(this);
        }
    }

    /* renamed from: w */
    private void m10129w() {
        C2148e eVar = this.f7359e;
        if (eVar != null) {
            eVar.mo8421i(this);
        }
    }

    /* renamed from: x */
    public static <R> C2155j<R> m10130x(Context context, C1726d dVar, Object obj, Object obj2, Class<R> cls, C2144a<?> aVar, int i, int i2, C1730g gVar, C2166i<R> iVar, C2152g<R> gVar2, List<C2152g<R>> list, C2148e eVar, C1877k kVar, C2174c<? super R> cVar, Executor executor) {
        return new C2155j(context, dVar, obj, obj2, cls, aVar, i, i2, gVar, iVar, gVar2, list, eVar, kVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: y */
    private void m10131y(C1895q qVar, int i) {
        boolean z;
        this.f7356b.mo8515c();
        synchronized (this.f7357c) {
            qVar.setOrigin(this.f7354C);
            int h = this.f7361g.mo7607h();
            if (h <= i) {
                Log.w("Glide", "Load failed for " + this.f7362h + " with size [" + this.f7380z + "x" + this.f7352A + "]", qVar);
                if (h <= 4) {
                    qVar.logRootCauses("Glide");
                }
            }
            this.f7373s = null;
            this.f7376v = C2156a.FAILED;
            boolean z2 = true;
            this.f7353B = true;
            try {
                List<C2152g<R>> list = this.f7369o;
                if (list != null) {
                    z = false;
                    for (C2152g<R> onLoadFailed : list) {
                        z |= onLoadFailed.onLoadFailed(qVar, this.f7362h, this.f7368n, m10124r());
                    }
                } else {
                    z = false;
                }
                C2152g<R> gVar = this.f7358d;
                if (gVar == null || !gVar.onLoadFailed(qVar, this.f7362h, this.f7368n, m10124r())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m10115A();
                }
                this.f7353B = false;
                m10128v();
            } catch (Throwable th) {
                this.f7353B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7 A[Catch:{ all -> 0x00b8 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10132z(com.bumptech.glide.load.p030n.C1902v<R> r10, R r11, com.bumptech.glide.load.C1744a r12, boolean r13) {
        /*
            r9 = this;
            boolean r13 = r9.m10124r()
            com.bumptech.glide.q.j$a r0 = com.bumptech.glide.p047q.C2155j.C2156a.COMPLETE
            r9.f7376v = r0
            r9.f7372r = r10
            com.bumptech.glide.d r10 = r9.f7361g
            int r10 = r10.mo7607h()
            r0 = 3
            if (r10 > r0) goto L_0x006a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Finished loading "
            r10.append(r0)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            java.lang.String r0 = " from "
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " for "
            r10.append(r0)
            java.lang.Object r0 = r9.f7362h
            r10.append(r0)
            java.lang.String r0 = " with size ["
            r10.append(r0)
            int r0 = r9.f7380z
            r10.append(r0)
            java.lang.String r0 = "x"
            r10.append(r0)
            int r0 = r9.f7352A
            r10.append(r0)
            java.lang.String r0 = "] in "
            r10.append(r0)
            long r0 = r9.f7374t
            double r0 = com.bumptech.glide.p051s.C2188f.m10252a(r0)
            r10.append(r0)
            java.lang.String r0 = " ms"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r10)
        L_0x006a:
            r10 = 1
            r9.f7353B = r10
            r6 = 0
            java.util.List<com.bumptech.glide.q.g<R>> r0 = r9.f7369o     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b8 }
            r8 = 0
        L_0x0077:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.q.g r0 = (com.bumptech.glide.p047q.C2152g) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r9.f7362h     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.q.l.i<R> r3 = r9.f7368n     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            r8 = r8 | r0
            goto L_0x0077
        L_0x0090:
            r8 = 0
        L_0x0091:
            com.bumptech.glide.q.g<R> r0 = r9.f7358d     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r9.f7362h     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.q.l.i<R> r3 = r9.f7368n     // Catch:{ all -> 0x00b8 }
            r1 = r11
            r4 = r12
            r5 = r13
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            r10 = r10 | r8
            if (r10 != 0) goto L_0x00b2
            com.bumptech.glide.q.m.c<? super R> r10 = r9.f7370p     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.q.m.b r10 = r10.mo8459a(r12, r13)     // Catch:{ all -> 0x00b8 }
            com.bumptech.glide.q.l.i<R> r12 = r9.f7368n     // Catch:{ all -> 0x00b8 }
            r12.mo8222c(r11, r10)     // Catch:{ all -> 0x00b8 }
        L_0x00b2:
            r9.f7353B = r6
            r9.m10129w()
            return
        L_0x00b8:
            r10 = move-exception
            r9.f7353B = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2155j.m10132z(com.bumptech.glide.load.n.v, java.lang.Object, com.bumptech.glide.load.a, boolean):void");
    }

    /* renamed from: Q */
    public void mo8411Q() {
        synchronized (this.f7357c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: a */
    public void mo8442a(C1895q qVar) {
        m10131y(qVar, 5);
    }

    /* renamed from: b */
    public boolean mo8413b() {
        boolean z;
        synchronized (this.f7357c) {
            z = this.f7376v == C2156a.COMPLETE;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.bumptech.glide.load.n.k$d, com.bumptech.glide.load.n.v<R>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.bumptech.glide.load.n.v] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.f7375u.mo7932k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8443c(com.bumptech.glide.load.p030n.C1902v<?> r6, com.bumptech.glide.load.C1744a r7, boolean r8) {
        /*
            r5 = this;
            com.bumptech.glide.s.l.c r0 = r5.f7356b
            r0.mo8515c()
            r0 = 0
            java.lang.Object r1 = r5.f7357c     // Catch:{ all -> 0x00b9 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b9 }
            r5.f7373s = r0     // Catch:{ all -> 0x00b6 }
            if (r6 != 0) goto L_0x002f
            com.bumptech.glide.load.n.q r6 = new com.bumptech.glide.load.n.q     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = "Expected to receive a Resource<R> with an object of "
            r7.append(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.Class<R> r8 = r5.f7363i     // Catch:{ all -> 0x00b6 }
            r7.append(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = " inside, but instead got null."
            r7.append(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b6 }
            r5.mo8442a(r6)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x002f:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x005c
            java.lang.Class<R> r3 = r5.f7363i     // Catch:{ all -> 0x00b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            boolean r3 = r5.m10119m()     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0057
            r5.f7372r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.q.j$a r7 = com.bumptech.glide.p047q.C2155j.C2156a.COMPLETE     // Catch:{ all -> 0x00b2 }
            r5.f7376v = r7     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0056
            com.bumptech.glide.load.n.k r7 = r5.f7375u
            r7.mo7932k(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.m10132z(r6, r2, r7, r8)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x005c:
            r5.f7372r = r0     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.load.n.q r7 = new com.bumptech.glide.load.n.q     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r8.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "Expected to receive an object of "
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r0 = r5.f7363i     // Catch:{ all -> 0x00b2 }
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = " but instead got "
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007b
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = ""
        L_0x007d:
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "{"
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            r8.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "} inside Resource{"
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            r8.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "}."
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r0 = ""
            goto L_0x009c
        L_0x009a:
            java.lang.String r0 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x009c:
            r8.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b2 }
            r7.<init>(r8)     // Catch:{ all -> 0x00b2 }
            r5.mo8442a(r7)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x00b1
            com.bumptech.glide.load.n.k r7 = r5.f7375u
            r7.mo7932k(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = move-exception
        L_0x00b7:
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r6 = move-exception
            if (r0 == 0) goto L_0x00c1
            com.bumptech.glide.load.n.k r7 = r5.f7375u
            r7.mo7932k(r0)
        L_0x00c1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2155j.mo8443c(com.bumptech.glide.load.n.v, com.bumptech.glide.load.a, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f7375u.mo7932k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7357c
            monitor-enter(r0)
            r5.m10116i()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.s.l.c r1 = r5.f7356b     // Catch:{ all -> 0x0039 }
            r1.mo8515c()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.q.j$a r1 = r5.f7376v     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.q.j$a r2 = com.bumptech.glide.p047q.C2155j.C2156a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.m10120n()     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.n.v<R> r1 = r5.f7372r     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f7372r = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.m10117k()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            com.bumptech.glide.q.l.i<R> r3 = r5.f7368n     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.m10123q()     // Catch:{ all -> 0x0039 }
            r3.mo8225k(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f7376v = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.n.k r0 = r5.f7375u
            r0.mo7932k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2155j.clear():void");
    }

    /* renamed from: d */
    public boolean mo8416d(C2147d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C2144a<?> aVar;
        C1730g gVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C2144a<?> aVar2;
        C1730g gVar2;
        int size2;
        C2147d dVar2 = dVar;
        if (!(dVar2 instanceof C2155j)) {
            return false;
        }
        synchronized (this.f7357c) {
            i = this.f7365k;
            i2 = this.f7366l;
            obj = this.f7362h;
            cls = this.f7363i;
            aVar = this.f7364j;
            gVar = this.f7367m;
            List<C2152g<R>> list = this.f7369o;
            size = list != null ? list.size() : 0;
        }
        C2155j jVar = (C2155j) dVar2;
        synchronized (jVar.f7357c) {
            i3 = jVar.f7365k;
            i4 = jVar.f7366l;
            obj2 = jVar.f7362h;
            cls2 = jVar.f7363i;
            aVar2 = jVar.f7364j;
            gVar2 = jVar.f7367m;
            List<C2152g<R>> list2 = jVar.f7369o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && C2194k.m10273c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    /* renamed from: e */
    public void mo8445e(int i, int i2) {
        Object obj;
        this.f7356b.mo8515c();
        Object obj2 = this.f7357c;
        synchronized (obj2) {
            try {
                boolean z = f7351D;
                if (z) {
                    m10126t("Got onSizeReady in " + C2188f.m10252a(this.f7374t));
                }
                if (this.f7376v == C2156a.WAITING_FOR_SIZE) {
                    C2156a aVar = C2156a.RUNNING;
                    this.f7376v = aVar;
                    float B = this.f7364j.mo8356B();
                    this.f7380z = m10127u(i, B);
                    this.f7352A = m10127u(i2, B);
                    if (z) {
                        m10126t("finished setup for calling load in " + C2188f.m10252a(this.f7374t));
                    }
                    C2156a aVar2 = aVar;
                    boolean z2 = z;
                    C2156a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f7373s = this.f7375u.mo7931f(this.f7361g, this.f7362h, this.f7364j.mo8355A(), this.f7380z, this.f7352A, this.f7364j.mo8410z(), this.f7363i, this.f7367m, this.f7364j.mo8395l(), this.f7364j.mo8358D(), this.f7364j.mo8366N(), this.f7364j.mo8364J(), this.f7364j.mo8404s(), this.f7364j.mo8362H(), this.f7364j.mo8360F(), this.f7364j.mo8359E(), this.f7364j.mo8403r(), this, this.f7371q);
                        if (this.f7376v != aVar3) {
                            this.f7373s = null;
                        }
                        if (z2) {
                            m10126t("finished onSizeReady in " + C2188f.m10252a(this.f7374t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo8418f() {
        boolean z;
        synchronized (this.f7357c) {
            z = this.f7376v == C2156a.CLEARED;
        }
        return z;
    }

    /* renamed from: g */
    public Object mo8444g() {
        this.f7356b.mo8515c();
        return this.f7357c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8420h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7357c
            monitor-enter(r0)
            r5.m10116i()     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.s.l.c r1 = r5.f7356b     // Catch:{ all -> 0x00a8 }
            r1.mo8515c()     // Catch:{ all -> 0x00a8 }
            long r1 = com.bumptech.glide.p051s.C2188f.m10253b()     // Catch:{ all -> 0x00a8 }
            r5.f7374t = r1     // Catch:{ all -> 0x00a8 }
            java.lang.Object r1 = r5.f7362h     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f7365k     // Catch:{ all -> 0x00a8 }
            int r2 = r5.f7366l     // Catch:{ all -> 0x00a8 }
            boolean r1 = com.bumptech.glide.p051s.C2194k.m10290t(r1, r2)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f7365k     // Catch:{ all -> 0x00a8 }
            r5.f7380z = r1     // Catch:{ all -> 0x00a8 }
            int r1 = r5.f7366l     // Catch:{ all -> 0x00a8 }
            r5.f7352A = r1     // Catch:{ all -> 0x00a8 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.m10122p()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.n.q r2 = new com.bumptech.glide.load.n.q     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a8 }
            r5.m10131y(r2, r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x003c:
            com.bumptech.glide.q.j$a r1 = r5.f7376v     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.q.j$a r2 = com.bumptech.glide.p047q.C2155j.C2156a.RUNNING     // Catch:{ all -> 0x00a8 }
            if (r1 == r2) goto L_0x00a0
            com.bumptech.glide.q.j$a r3 = com.bumptech.glide.p047q.C2155j.C2156a.COMPLETE     // Catch:{ all -> 0x00a8 }
            if (r1 != r3) goto L_0x0050
            com.bumptech.glide.load.n.v<R> r1 = r5.f7372r     // Catch:{ all -> 0x00a8 }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.C1744a.MEMORY_CACHE     // Catch:{ all -> 0x00a8 }
            r3 = 0
            r5.mo8443c(r1, r2, r3)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0050:
            com.bumptech.glide.q.j$a r1 = com.bumptech.glide.p047q.C2155j.C2156a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a8 }
            r5.f7376v = r1     // Catch:{ all -> 0x00a8 }
            int r3 = r5.f7365k     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f7366l     // Catch:{ all -> 0x00a8 }
            boolean r3 = com.bumptech.glide.p051s.C2194k.m10290t(r3, r4)     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x0066
            int r3 = r5.f7365k     // Catch:{ all -> 0x00a8 }
            int r4 = r5.f7366l     // Catch:{ all -> 0x00a8 }
            r5.mo8445e(r3, r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x006b
        L_0x0066:
            com.bumptech.glide.q.l.i<R> r3 = r5.f7368n     // Catch:{ all -> 0x00a8 }
            r3.mo8437l(r5)     // Catch:{ all -> 0x00a8 }
        L_0x006b:
            com.bumptech.glide.q.j$a r3 = r5.f7376v     // Catch:{ all -> 0x00a8 }
            if (r3 == r2) goto L_0x0071
            if (r3 != r1) goto L_0x0080
        L_0x0071:
            boolean r1 = r5.m10118l()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0080
            com.bumptech.glide.q.l.i<R> r1 = r5.f7368n     // Catch:{ all -> 0x00a8 }
            android.graphics.drawable.Drawable r2 = r5.m10123q()     // Catch:{ all -> 0x00a8 }
            r1.mo8433i(r2)     // Catch:{ all -> 0x00a8 }
        L_0x0080:
            boolean r1 = f7351D     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            long r2 = r5.f7374t     // Catch:{ all -> 0x00a8 }
            double r2 = com.bumptech.glide.p051s.C2188f.m10252a(r2)     // Catch:{ all -> 0x00a8 }
            r1.append(r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a8 }
            r5.m10126t(r1)     // Catch:{ all -> 0x00a8 }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return
        L_0x00a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2155j.mo8420h():void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7357c) {
            C2156a aVar = this.f7376v;
            if (aVar != C2156a.RUNNING) {
                if (aVar != C2156a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo8423j() {
        boolean z;
        synchronized (this.f7357c) {
            z = this.f7376v == C2156a.COMPLETE;
        }
        return z;
    }
}
