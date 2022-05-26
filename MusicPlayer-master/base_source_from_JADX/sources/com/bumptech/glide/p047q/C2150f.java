package com.bumptech.glide.p047q;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.p030n.C1895q;
import com.bumptech.glide.p047q.p048l.C2165h;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p047q.p049m.C2172b;
import com.bumptech.glide.p051s.C2194k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.q.f */
/* compiled from: RequestFutureTarget */
public class C2150f<R> implements C2146c<R>, C2152g<R> {

    /* renamed from: q */
    private static final C2151a f7340q = new C2151a();

    /* renamed from: g */
    private final int f7341g;

    /* renamed from: h */
    private final int f7342h;

    /* renamed from: i */
    private final boolean f7343i;

    /* renamed from: j */
    private final C2151a f7344j;

    /* renamed from: k */
    private R f7345k;

    /* renamed from: l */
    private C2147d f7346l;

    /* renamed from: m */
    private boolean f7347m;

    /* renamed from: n */
    private boolean f7348n;

    /* renamed from: o */
    private boolean f7349o;

    /* renamed from: p */
    private C1895q f7350p;

    /* renamed from: com.bumptech.glide.q.f$a */
    /* compiled from: RequestFutureTarget */
    static class C2151a {
        C2151a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8440a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8441b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public C2150f(int i, int i2) {
        this(i, i2, true, f7340q);
    }

    /* renamed from: m */
    private synchronized R m10096m(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f7343i && !isDone()) {
            C2194k.m10271a();
        }
        if (this.f7347m) {
            throw new CancellationException();
        } else if (this.f7349o) {
            throw new ExecutionException(this.f7350p);
        } else if (this.f7348n) {
            return this.f7345k;
        } else {
            if (l == null) {
                this.f7344j.mo8441b(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f7344j.mo8441b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f7349o) {
                throw new ExecutionException(this.f7350p);
            } else if (this.f7347m) {
                throw new CancellationException();
            } else if (this.f7348n) {
                return this.f7345k;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: a */
    public void mo7648a() {
    }

    /* renamed from: b */
    public void mo8427b(C2165h hVar) {
    }

    /* renamed from: c */
    public synchronized void mo8222c(R r, C2172b<? super R> bVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f7347m = r0     // Catch:{ all -> 0x0021 }
            com.bumptech.glide.q.f$a r1 = r2.f7344j     // Catch:{ all -> 0x0021 }
            r1.mo8440a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            com.bumptech.glide.q.d r3 = r2.f7346l     // Catch:{ all -> 0x0021 }
            r2.f7346l = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p047q.C2150f.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public synchronized void mo8429e(C2147d dVar) {
        this.f7346l = dVar;
    }

    /* renamed from: f */
    public synchronized void mo8430f(Drawable drawable) {
    }

    /* renamed from: g */
    public void mo7650g() {
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m10096m((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public void mo8433i(Drawable drawable) {
    }

    public synchronized boolean isCancelled() {
        return this.f7347m;
    }

    public synchronized boolean isDone() {
        return this.f7347m || this.f7348n || this.f7349o;
    }

    /* renamed from: j */
    public synchronized C2147d mo8436j() {
        return this.f7346l;
    }

    /* renamed from: k */
    public void mo8225k(Drawable drawable) {
    }

    /* renamed from: l */
    public void mo8437l(C2165h hVar) {
        hVar.mo8445e(this.f7341g, this.f7342h);
    }

    public void onDestroy() {
    }

    public synchronized boolean onLoadFailed(C1895q qVar, Object obj, C2166i<R> iVar, boolean z) {
        this.f7349o = true;
        this.f7350p = qVar;
        this.f7344j.mo8440a(this);
        return false;
    }

    public synchronized boolean onResourceReady(R r, Object obj, C2166i<R> iVar, C1744a aVar, boolean z) {
        this.f7348n = true;
        this.f7345k = r;
        this.f7344j.mo8440a(this);
        return false;
    }

    C2150f(int i, int i2, boolean z, C2151a aVar) {
        this.f7341g = i;
        this.f7342h = i2;
        this.f7343i = z;
        this.f7344j = aVar;
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m10096m(Long.valueOf(timeUnit.toMillis(j)));
    }
}
