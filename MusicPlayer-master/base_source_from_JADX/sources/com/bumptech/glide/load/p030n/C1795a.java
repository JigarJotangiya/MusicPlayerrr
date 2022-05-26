package com.bumptech.glide.load.p030n;

import android.os.Process;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.C1893p;
import com.bumptech.glide.p051s.C2193j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.n.a */
/* compiled from: ActiveResources */
final class C1795a {

    /* renamed from: a */
    private final boolean f6578a;

    /* renamed from: b */
    private final Executor f6579b;

    /* renamed from: c */
    final Map<C1786g, C1800d> f6580c;

    /* renamed from: d */
    private final ReferenceQueue<C1893p<?>> f6581d;

    /* renamed from: e */
    private C1893p.C1894a f6582e;

    /* renamed from: f */
    private volatile boolean f6583f;

    /* renamed from: g */
    private volatile C1799c f6584g;

    /* renamed from: com.bumptech.glide.load.n.a$a */
    /* compiled from: ActiveResources */
    class C1796a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.n.a$a$a */
        /* compiled from: ActiveResources */
        class C1797a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ Runnable f6585g;

            C1797a(C1796a aVar, Runnable runnable) {
                this.f6585g = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f6585g.run();
            }
        }

        C1796a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C1797a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$b */
    /* compiled from: ActiveResources */
    class C1798b implements Runnable {
        C1798b() {
        }

        public void run() {
            C1795a.this.mo7753b();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$c */
    /* compiled from: ActiveResources */
    interface C1799c {
        /* renamed from: a */
        void mo7761a();
    }

    /* renamed from: com.bumptech.glide.load.n.a$d */
    /* compiled from: ActiveResources */
    static final class C1800d extends WeakReference<C1893p<?>> {

        /* renamed from: a */
        final C1786g f6587a;

        /* renamed from: b */
        final boolean f6588b;

        /* renamed from: c */
        C1902v<?> f6589c;

        C1800d(C1786g gVar, C1893p<?> pVar, ReferenceQueue<? super C1893p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            C1902v<?> vVar;
            C2193j.m10269d(gVar);
            this.f6587a = gVar;
            if (!pVar.mo7970f() || !z) {
                vVar = null;
            } else {
                C1902v<?> e = pVar.mo7969e();
                C2193j.m10269d(e);
                vVar = e;
            }
            this.f6589c = vVar;
            this.f6588b = pVar.mo7970f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7762a() {
            this.f6589c = null;
            clear();
        }
    }

    C1795a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C1796a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7752a(C1786g gVar, C1893p<?> pVar) {
        C1800d put = this.f6580c.put(gVar, new C1800d(gVar, pVar, this.f6581d, this.f6578a));
        if (put != null) {
            put.mo7762a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7753b() {
        while (!this.f6583f) {
            try {
                mo7754c((C1800d) this.f6581d.remove());
                C1799c cVar = this.f6584g;
                if (cVar != null) {
                    cVar.mo7761a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7754c(C1800d dVar) {
        synchronized (this) {
            this.f6580c.remove(dVar.f6587a);
            if (dVar.f6588b) {
                C1902v<?> vVar = dVar.f6589c;
                if (vVar != null) {
                    this.f6582e.mo7930d(dVar.f6587a, new C1893p(vVar, true, false, dVar.f6587a, this.f6582e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo7755d(C1786g gVar) {
        C1800d remove = this.f6580c.remove(gVar);
        if (remove != null) {
            remove.mo7762a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.p030n.C1893p<?> mo7756e(com.bumptech.glide.load.C1786g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, com.bumptech.glide.load.n.a$d> r0 = r1.f6580c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.a$d r2 = (com.bumptech.glide.load.p030n.C1795a.C1800d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.p r0 = (com.bumptech.glide.load.p030n.C1893p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo7754c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.C1795a.mo7756e(com.bumptech.glide.load.g):com.bumptech.glide.load.n.p");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7757f(C1893p.C1894a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f6582e = aVar;
            }
        }
    }

    C1795a(boolean z, Executor executor) {
        this.f6580c = new HashMap();
        this.f6581d = new ReferenceQueue<>();
        this.f6578a = z;
        this.f6579b = executor;
        executor.execute(new C1798b());
    }
}
