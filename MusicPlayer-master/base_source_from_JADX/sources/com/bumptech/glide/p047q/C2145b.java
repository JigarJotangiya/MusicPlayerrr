package com.bumptech.glide.p047q;

import com.bumptech.glide.p047q.C2148e;

/* renamed from: com.bumptech.glide.q.b */
/* compiled from: ErrorRequestCoordinator */
public final class C2145b implements C2148e, C2147d {

    /* renamed from: a */
    private final Object f7333a;

    /* renamed from: b */
    private final C2148e f7334b;

    /* renamed from: c */
    private volatile C2147d f7335c;

    /* renamed from: d */
    private volatile C2147d f7336d;

    /* renamed from: e */
    private C2148e.C2149a f7337e;

    /* renamed from: f */
    private C2148e.C2149a f7338f;

    public C2145b(Object obj, C2148e eVar) {
        C2148e.C2149a aVar = C2148e.C2149a.CLEARED;
        this.f7337e = aVar;
        this.f7338f = aVar;
        this.f7333a = obj;
        this.f7334b = eVar;
    }

    /* renamed from: l */
    private boolean m10066l(C2147d dVar) {
        return dVar.equals(this.f7335c) || (this.f7337e == C2148e.C2149a.FAILED && dVar.equals(this.f7336d));
    }

    /* renamed from: m */
    private boolean m10067m() {
        C2148e eVar = this.f7334b;
        return eVar == null || eVar.mo8424k(this);
    }

    /* renamed from: n */
    private boolean m10068n() {
        C2148e eVar = this.f7334b;
        return eVar == null || eVar.mo8417e(this);
    }

    /* renamed from: o */
    private boolean m10069o() {
        C2148e eVar = this.f7334b;
        return eVar == null || eVar.mo8419g(this);
    }

    /* renamed from: Q */
    public void mo8411Q() {
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = this.f7337e;
            C2148e.C2149a aVar2 = C2148e.C2149a.RUNNING;
            if (aVar == aVar2) {
                this.f7337e = C2148e.C2149a.PAUSED;
                this.f7335c.mo8411Q();
            }
            if (this.f7338f == aVar2) {
                this.f7338f = C2148e.C2149a.PAUSED;
                this.f7336d.mo8411Q();
            }
        }
    }

    /* renamed from: a */
    public C2148e mo8412a() {
        C2148e a;
        synchronized (this.f7333a) {
            C2148e eVar = this.f7334b;
            a = eVar != null ? eVar.mo8412a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo8413b() {
        boolean z;
        synchronized (this.f7333a) {
            if (!this.f7335c.mo8413b()) {
                if (!this.f7336d.mo8413b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8414c(com.bumptech.glide.p047q.C2147d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7333a
            monitor-enter(r0)
            com.bumptech.glide.q.d r1 = r2.f7336d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.FAILED     // Catch:{ all -> 0x002b }
            r2.f7337e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.q.e$a r3 = r2.f7338f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.q.e$a r1 = com.bumptech.glide.p047q.C2148e.C2149a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f7338f = r1     // Catch:{ all -> 0x002b }
            com.bumptech.glide.q.d r3 = r2.f7336d     // Catch:{ all -> 0x002b }
            r3.mo8420h()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.FAILED     // Catch:{ all -> 0x002b }
            r2.f7338f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.q.e r3 = r2.f7334b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo8414c(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2145b.mo8414c(com.bumptech.glide.q.d):void");
    }

    public void clear() {
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = C2148e.C2149a.CLEARED;
            this.f7337e = aVar;
            this.f7335c.clear();
            if (this.f7338f != aVar) {
                this.f7338f = aVar;
                this.f7336d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo8416d(C2147d dVar) {
        if (!(dVar instanceof C2145b)) {
            return false;
        }
        C2145b bVar = (C2145b) dVar;
        if (!this.f7335c.mo8416d(bVar.f7335c) || !this.f7336d.mo8416d(bVar.f7336d)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo8417e(C2147d dVar) {
        boolean z;
        synchronized (this.f7333a) {
            z = m10068n() && m10066l(dVar);
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo8418f() {
        boolean z;
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = this.f7337e;
            C2148e.C2149a aVar2 = C2148e.C2149a.CLEARED;
            z = aVar == aVar2 && this.f7338f == aVar2;
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo8419g(C2147d dVar) {
        boolean z;
        synchronized (this.f7333a) {
            z = m10069o() && m10066l(dVar);
        }
        return z;
    }

    /* renamed from: h */
    public void mo8420h() {
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = this.f7337e;
            C2148e.C2149a aVar2 = C2148e.C2149a.RUNNING;
            if (aVar != aVar2) {
                this.f7337e = aVar2;
                this.f7335c.mo8420h();
            }
        }
    }

    /* renamed from: i */
    public void mo8421i(C2147d dVar) {
        synchronized (this.f7333a) {
            if (dVar.equals(this.f7335c)) {
                this.f7337e = C2148e.C2149a.SUCCESS;
            } else if (dVar.equals(this.f7336d)) {
                this.f7338f = C2148e.C2149a.SUCCESS;
            }
            C2148e eVar = this.f7334b;
            if (eVar != null) {
                eVar.mo8421i(this);
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = this.f7337e;
            C2148e.C2149a aVar2 = C2148e.C2149a.RUNNING;
            if (aVar != aVar2) {
                if (this.f7338f != aVar2) {
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
        synchronized (this.f7333a) {
            C2148e.C2149a aVar = this.f7337e;
            C2148e.C2149a aVar2 = C2148e.C2149a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f7338f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo8424k(C2147d dVar) {
        boolean z;
        synchronized (this.f7333a) {
            z = m10067m() && m10066l(dVar);
        }
        return z;
    }

    /* renamed from: p */
    public void mo8425p(C2147d dVar, C2147d dVar2) {
        this.f7335c = dVar;
        this.f7336d = dVar2;
    }
}
