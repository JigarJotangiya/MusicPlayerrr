package com.bumptech.glide.p047q;

import com.bumptech.glide.p047q.C2148e;

/* renamed from: com.bumptech.glide.q.k */
/* compiled from: ThumbnailRequestCoordinator */
public class C2157k implements C2148e, C2147d {

    /* renamed from: a */
    private final C2148e f7382a;

    /* renamed from: b */
    private final Object f7383b;

    /* renamed from: c */
    private volatile C2147d f7384c;

    /* renamed from: d */
    private volatile C2147d f7385d;

    /* renamed from: e */
    private C2148e.C2149a f7386e;

    /* renamed from: f */
    private C2148e.C2149a f7387f;

    /* renamed from: g */
    private boolean f7388g;

    public C2157k(Object obj, C2148e eVar) {
        C2148e.C2149a aVar = C2148e.C2149a.CLEARED;
        this.f7386e = aVar;
        this.f7387f = aVar;
        this.f7383b = obj;
        this.f7382a = eVar;
    }

    /* renamed from: l */
    private boolean m10143l() {
        C2148e eVar = this.f7382a;
        return eVar == null || eVar.mo8424k(this);
    }

    /* renamed from: m */
    private boolean m10144m() {
        C2148e eVar = this.f7382a;
        return eVar == null || eVar.mo8417e(this);
    }

    /* renamed from: n */
    private boolean m10145n() {
        C2148e eVar = this.f7382a;
        return eVar == null || eVar.mo8419g(this);
    }

    /* renamed from: Q */
    public void mo8411Q() {
        synchronized (this.f7383b) {
            if (!this.f7387f.isComplete()) {
                this.f7387f = C2148e.C2149a.PAUSED;
                this.f7385d.mo8411Q();
            }
            if (!this.f7386e.isComplete()) {
                this.f7386e = C2148e.C2149a.PAUSED;
                this.f7384c.mo8411Q();
            }
        }
    }

    /* renamed from: a */
    public C2148e mo8412a() {
        C2148e a;
        synchronized (this.f7383b) {
            C2148e eVar = this.f7382a;
            a = eVar != null ? eVar.mo8412a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo8413b() {
        boolean z;
        synchronized (this.f7383b) {
            if (!this.f7385d.mo8413b()) {
                if (!this.f7384c.mo8413b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8414c(com.bumptech.glide.p047q.C2147d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7383b
            monitor-enter(r0)
            com.bumptech.glide.q.d r1 = r2.f7384c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.FAILED     // Catch:{ all -> 0x001e }
            r2.f7387f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.FAILED     // Catch:{ all -> 0x001e }
            r2.f7386e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.q.e r3 = r2.f7382a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo8414c(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2157k.mo8414c(com.bumptech.glide.q.d):void");
    }

    public void clear() {
        synchronized (this.f7383b) {
            this.f7388g = false;
            C2148e.C2149a aVar = C2148e.C2149a.CLEARED;
            this.f7386e = aVar;
            this.f7387f = aVar;
            this.f7385d.clear();
            this.f7384c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8416d(com.bumptech.glide.p047q.C2147d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.p047q.C2157k
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.q.k r4 = (com.bumptech.glide.p047q.C2157k) r4
            com.bumptech.glide.q.d r0 = r3.f7384c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.q.d r0 = r4.f7384c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.q.d r0 = r3.f7384c
            com.bumptech.glide.q.d r2 = r4.f7384c
            boolean r0 = r0.mo8416d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.q.d r0 = r3.f7385d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.q.d r4 = r4.f7385d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.q.d r0 = r3.f7385d
            com.bumptech.glide.q.d r4 = r4.f7385d
            boolean r4 = r0.mo8416d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2157k.mo8416d(com.bumptech.glide.q.d):boolean");
    }

    /* renamed from: e */
    public boolean mo8417e(C2147d dVar) {
        boolean z;
        synchronized (this.f7383b) {
            z = m10144m() && dVar.equals(this.f7384c) && !mo8413b();
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo8418f() {
        boolean z;
        synchronized (this.f7383b) {
            z = this.f7386e == C2148e.C2149a.CLEARED;
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo8419g(C2147d dVar) {
        boolean z;
        synchronized (this.f7383b) {
            z = m10145n() && (dVar.equals(this.f7384c) || this.f7386e != C2148e.C2149a.SUCCESS);
        }
        return z;
    }

    /* renamed from: h */
    public void mo8420h() {
        C2148e.C2149a aVar;
        C2148e.C2149a aVar2;
        synchronized (this.f7383b) {
            this.f7388g = true;
            try {
                if (!(this.f7386e == C2148e.C2149a.SUCCESS || this.f7387f == (aVar2 = C2148e.C2149a.RUNNING))) {
                    this.f7387f = aVar2;
                    this.f7385d.mo8420h();
                }
                if (this.f7388g && this.f7386e != (aVar = C2148e.C2149a.RUNNING)) {
                    this.f7386e = aVar;
                    this.f7384c.mo8420h();
                }
            } finally {
                this.f7388g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8421i(com.bumptech.glide.p047q.C2147d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7383b
            monitor-enter(r0)
            com.bumptech.glide.q.d r1 = r2.f7385d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7387f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.q.e$a r3 = com.bumptech.glide.p047q.C2148e.C2149a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7386e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.q.e r3 = r2.f7382a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo8421i(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.q.e$a r3 = r2.f7387f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            com.bumptech.glide.q.d r3 = r2.f7385d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2157k.mo8421i(com.bumptech.glide.q.d):void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7383b) {
            z = this.f7386e == C2148e.C2149a.RUNNING;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo8423j() {
        boolean z;
        synchronized (this.f7383b) {
            z = this.f7386e == C2148e.C2149a.SUCCESS;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo8424k(C2147d dVar) {
        boolean z;
        synchronized (this.f7383b) {
            z = m10143l() && dVar.equals(this.f7384c) && this.f7386e != C2148e.C2149a.PAUSED;
        }
        return z;
    }

    /* renamed from: o */
    public void mo8446o(C2147d dVar, C2147d dVar2) {
        this.f7384c = dVar;
        this.f7385d = dVar2;
    }
}
