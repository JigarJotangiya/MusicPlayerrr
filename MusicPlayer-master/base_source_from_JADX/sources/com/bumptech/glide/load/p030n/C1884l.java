package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.C1862h;
import com.bumptech.glide.load.p030n.C1893p;
import com.bumptech.glide.load.p030n.p033c0.C1849a;
import com.bumptech.glide.p047q.C2154i;
import com.bumptech.glide.p051s.C2185e;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.p052l.C2196a;
import com.bumptech.glide.p051s.p052l.C2205c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.l */
/* compiled from: EngineJob */
class C1884l<R> implements C1862h.C1864b<R>, C2196a.C2202f {

    /* renamed from: F */
    private static final C1887c f6795F = new C1887c();

    /* renamed from: A */
    private boolean f6796A;

    /* renamed from: B */
    C1893p<?> f6797B;

    /* renamed from: C */
    private C1862h<R> f6798C;

    /* renamed from: D */
    private volatile boolean f6799D;

    /* renamed from: E */
    private boolean f6800E;

    /* renamed from: g */
    final C1889e f6801g;

    /* renamed from: h */
    private final C2205c f6802h;

    /* renamed from: i */
    private final C1893p.C1894a f6803i;

    /* renamed from: j */
    private final C3700f<C1884l<?>> f6804j;

    /* renamed from: k */
    private final C1887c f6805k;

    /* renamed from: l */
    private final C1890m f6806l;

    /* renamed from: m */
    private final C1849a f6807m;

    /* renamed from: n */
    private final C1849a f6808n;

    /* renamed from: o */
    private final C1849a f6809o;

    /* renamed from: p */
    private final C1849a f6810p;

    /* renamed from: q */
    private final AtomicInteger f6811q;

    /* renamed from: r */
    private C1786g f6812r;

    /* renamed from: s */
    private boolean f6813s;

    /* renamed from: t */
    private boolean f6814t;

    /* renamed from: u */
    private boolean f6815u;

    /* renamed from: v */
    private boolean f6816v;

    /* renamed from: w */
    private C1902v<?> f6817w;

    /* renamed from: x */
    C1744a f6818x;

    /* renamed from: y */
    private boolean f6819y;

    /* renamed from: z */
    C1895q f6820z;

    /* renamed from: com.bumptech.glide.load.n.l$a */
    /* compiled from: EngineJob */
    private class C1885a implements Runnable {

        /* renamed from: g */
        private final C2154i f6821g;

        C1885a(C2154i iVar) {
            this.f6821g = iVar;
        }

        public void run() {
            synchronized (this.f6821g.mo8444g()) {
                synchronized (C1884l.this) {
                    if (C1884l.this.f6801g.mo7959p(this.f6821g)) {
                        C1884l.this.mo7939e(this.f6821g);
                    }
                    C1884l.this.mo7942h();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$b */
    /* compiled from: EngineJob */
    private class C1886b implements Runnable {

        /* renamed from: g */
        private final C2154i f6823g;

        C1886b(C2154i iVar) {
            this.f6823g = iVar;
        }

        public void run() {
            synchronized (this.f6823g.mo8444g()) {
                synchronized (C1884l.this) {
                    if (C1884l.this.f6801g.mo7959p(this.f6823g)) {
                        C1884l.this.f6797B.mo7966b();
                        C1884l.this.mo7940f(this.f6823g);
                        C1884l.this.mo7948r(this.f6823g);
                    }
                    C1884l.this.mo7942h();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$c */
    /* compiled from: EngineJob */
    static class C1887c {
        C1887c() {
        }

        /* renamed from: a */
        public <R> C1893p<R> mo7952a(C1902v<R> vVar, boolean z, C1786g gVar, C1893p.C1894a aVar) {
            return new C1893p(vVar, z, true, gVar, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$d */
    /* compiled from: EngineJob */
    static final class C1888d {

        /* renamed from: a */
        final C2154i f6825a;

        /* renamed from: b */
        final Executor f6826b;

        C1888d(C2154i iVar, Executor executor) {
            this.f6825a = iVar;
            this.f6826b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1888d) {
                return this.f6825a.equals(((C1888d) obj).f6825a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6825a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$e */
    /* compiled from: EngineJob */
    static final class C1889e implements Iterable<C1888d> {

        /* renamed from: g */
        private final List<C1888d> f6827g;

        C1889e() {
            this(new ArrayList(2));
        }

        /* renamed from: t */
        private static C1888d m9159t(C2154i iVar) {
            return new C1888d(iVar, C2185e.m10250a());
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f6827g.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7956d(C2154i iVar, Executor executor) {
            this.f6827g.add(new C1888d(iVar, executor));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f6827g.isEmpty();
        }

        public Iterator<C1888d> iterator() {
            return this.f6827g.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo7959p(C2154i iVar) {
            return this.f6827g.contains(m9159t(iVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C1889e mo7960s() {
            return new C1889e(new ArrayList(this.f6827g));
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f6827g.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo7962u(C2154i iVar) {
            this.f6827g.remove(m9159t(iVar));
        }

        C1889e(List<C1888d> list) {
            this.f6827g = list;
        }
    }

    C1884l(C1849a aVar, C1849a aVar2, C1849a aVar3, C1849a aVar4, C1890m mVar, C1893p.C1894a aVar5, C3700f<C1884l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, fVar, f6795F);
    }

    /* renamed from: i */
    private C1849a m9139i() {
        if (this.f6814t) {
            return this.f6809o;
        }
        return this.f6815u ? this.f6810p : this.f6808n;
    }

    /* renamed from: m */
    private boolean m9140m() {
        return this.f6796A || this.f6819y || this.f6799D;
    }

    /* renamed from: q */
    private synchronized void m9141q() {
        if (this.f6812r != null) {
            this.f6801g.clear();
            this.f6812r = null;
            this.f6797B = null;
            this.f6817w = null;
            this.f6796A = false;
            this.f6799D = false;
            this.f6819y = false;
            this.f6800E = false;
            this.f6798C.mo7902E(false);
            this.f6798C = null;
            this.f6820z = null;
            this.f6818x = null;
            this.f6804j.mo8512a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo7909a(C1895q qVar) {
        synchronized (this) {
            this.f6820z = qVar;
        }
        mo7945n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo7938b(C2154i iVar, Executor executor) {
        this.f6802h.mo8515c();
        this.f6801g.mo7956d(iVar, executor);
        boolean z = true;
        if (this.f6819y) {
            mo7943k(1);
            executor.execute(new C1886b(iVar));
        } else if (this.f6796A) {
            mo7943k(1);
            executor.execute(new C1885a(iVar));
        } else {
            if (this.f6799D) {
                z = false;
            }
            C2193j.m10266a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: c */
    public void mo7910c(C1902v<R> vVar, C1744a aVar, boolean z) {
        synchronized (this) {
            this.f6817w = vVar;
            this.f6818x = aVar;
            this.f6800E = z;
        }
        mo7946o();
    }

    /* renamed from: d */
    public void mo7911d(C1862h<?> hVar) {
        m9139i().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7939e(C2154i iVar) {
        try {
            iVar.mo8442a(this.f6820z);
        } catch (Throwable th) {
            throw new C1825b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7940f(C2154i iVar) {
        try {
            iVar.mo8443c(this.f6797B, this.f6818x, this.f6800E);
        } catch (Throwable th) {
            throw new C1825b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7941g() {
        if (!m9140m()) {
            this.f6799D = true;
            this.f6798C.mo7905k();
            this.f6806l.mo7929c(this, this.f6812r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7942h() {
        C1893p<?> pVar;
        synchronized (this) {
            this.f6802h.mo8515c();
            C2193j.m10266a(m9140m(), "Not yet complete!");
            int decrementAndGet = this.f6811q.decrementAndGet();
            C2193j.m10266a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                pVar = this.f6797B;
                m9141q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.mo7971g();
        }
    }

    /* renamed from: j */
    public C2205c mo7849j() {
        return this.f6802h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo7943k(int i) {
        C1893p<?> pVar;
        C2193j.m10266a(m9140m(), "Not yet complete!");
        if (this.f6811q.getAndAdd(i) == 0 && (pVar = this.f6797B) != null) {
            pVar.mo7966b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C1884l<R> mo7944l(C1786g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f6812r = gVar;
        this.f6813s = z;
        this.f6814t = z2;
        this.f6815u = z3;
        this.f6816v = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f6806l.mo7928b(r4, r1, (com.bumptech.glide.load.p030n.C1893p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f6826b.execute(new com.bumptech.glide.load.p030n.C1884l.C1885a(r4, r1.f6825a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo7942h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7945n() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.s.l.c r0 = r4.f6802h     // Catch:{ all -> 0x0066 }
            r0.mo8515c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f6799D     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m9141q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.n.l$e r0 = r4.f6801g     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f6796A     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f6796A = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.f6812r     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r4.f6801g     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r2.mo7960s()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo7943k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.m r0 = r4.f6806l
            r3 = 0
            r0.mo7928b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p030n.C1884l.C1888d) r1
            java.util.concurrent.Executor r2 = r1.f6826b
            com.bumptech.glide.load.n.l$a r3 = new com.bumptech.glide.load.n.l$a
            com.bumptech.glide.q.i r1 = r1.f6825a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo7942h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.C1884l.mo7945n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f6806l.mo7928b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f6826b.execute(new com.bumptech.glide.load.p030n.C1884l.C1886b(r5, r1.f6825a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo7942h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7946o() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.s.l.c r0 = r5.f6802h     // Catch:{ all -> 0x007c }
            r0.mo8515c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f6799D     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.n.v<?> r0 = r5.f6817w     // Catch:{ all -> 0x007c }
            r0.mo7965a()     // Catch:{ all -> 0x007c }
            r5.m9141q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.n.l$e r0 = r5.f6801g     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f6819y     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.n.l$c r0 = r5.f6805k     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.v<?> r1 = r5.f6817w     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f6813s     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r3 = r5.f6812r     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p$a r4 = r5.f6803i     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p r0 = r0.mo7952a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f6797B = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f6819y = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.l$e r1 = r5.f6801g     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.l$e r1 = r1.mo7960s()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo7943k(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r0 = r5.f6812r     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.p<?> r2 = r5.f6797B     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.n.m r3 = r5.f6806l
            r3.mo7928b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p030n.C1884l.C1888d) r1
            java.util.concurrent.Executor r2 = r1.f6826b
            com.bumptech.glide.load.n.l$b r3 = new com.bumptech.glide.load.n.l$b
            com.bumptech.glide.q.i r1 = r1.f6825a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo7942h()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.C1884l.mo7946o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo7947p() {
        return this.f6816v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo7948r(C2154i iVar) {
        boolean z;
        this.f6802h.mo8515c();
        this.f6801g.mo7962u(iVar);
        if (this.f6801g.isEmpty()) {
            mo7941g();
            if (!this.f6819y) {
                if (!this.f6796A) {
                    z = false;
                    if (z && this.f6811q.get() == 0) {
                        m9141q();
                    }
                }
            }
            z = true;
            m9141q();
        }
    }

    /* renamed from: s */
    public synchronized void mo7949s(C1862h<R> hVar) {
        this.f6798C = hVar;
        (hVar.mo7903K() ? this.f6807m : m9139i()).execute(hVar);
    }

    C1884l(C1849a aVar, C1849a aVar2, C1849a aVar3, C1849a aVar4, C1890m mVar, C1893p.C1894a aVar5, C3700f<C1884l<?>> fVar, C1887c cVar) {
        this.f6801g = new C1889e();
        this.f6802h = C2205c.m10314a();
        this.f6811q = new AtomicInteger();
        this.f6807m = aVar;
        this.f6808n = aVar2;
        this.f6809o = aVar3;
        this.f6810p = aVar4;
        this.f6806l = mVar;
        this.f6803i = aVar5;
        this.f6804j = fVar;
        this.f6805k = cVar;
    }
}
