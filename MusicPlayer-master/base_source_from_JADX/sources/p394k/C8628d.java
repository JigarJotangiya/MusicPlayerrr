package p394k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.d */
/* compiled from: AsyncTimeout.kt */
public class C8628d extends C8622b0 {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final long f34960h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f34961i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C8628d f34962j;

    /* renamed from: k */
    public static final C8629a f34963k = new C8629a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f34964e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8628d f34965f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f34966g;

    /* renamed from: k.d$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C8629a {
        private C8629a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m46861d(C8628d dVar) {
            synchronized (C8628d.class) {
                if (!dVar.f34964e) {
                    return false;
                }
                dVar.f34964e = false;
                for (C8628d h = C8628d.f34962j; h != null; h = h.f34965f) {
                    if (h.f34965f == dVar) {
                        h.f34965f = dVar.f34965f;
                        dVar.f34965f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m46862e(C8628d dVar, long j, boolean z) {
            Class<C8628d> cls = C8628d.class;
            synchronized (cls) {
                if (!dVar.f34964e) {
                    dVar.f34964e = true;
                    if (C8628d.f34962j == null) {
                        C8628d.f34962j = new C8628d();
                        new C8630b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        dVar.f34966g = Math.min(j, dVar.mo30646b() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        dVar.f34966g = j + nanoTime;
                    } else if (z) {
                        dVar.f34966g = dVar.mo30646b();
                    } else {
                        throw new AssertionError();
                    }
                    long n = dVar.m46851v(nanoTime);
                    C8628d h = C8628d.f34962j;
                    C8594l.m46769c(h);
                    while (true) {
                        if (h.f34965f == null) {
                            break;
                        }
                        C8628d l = h.f34965f;
                        C8594l.m46769c(l);
                        if (n < l.m46851v(nanoTime)) {
                            break;
                        }
                        h = h.f34965f;
                        C8594l.m46769c(h);
                    }
                    dVar.f34965f = h.f34965f;
                    h.f34965f = dVar;
                    if (h == C8628d.f34962j) {
                        cls.notify();
                    }
                    C8457t tVar = C8457t.f34900a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        /* renamed from: c */
        public final C8628d mo30658c() throws InterruptedException {
            Class<C8628d> cls = C8628d.class;
            C8628d h = C8628d.f34962j;
            C8594l.m46769c(h);
            C8628d l = h.f34965f;
            if (l == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C8628d.f34960h);
                C8628d h2 = C8628d.f34962j;
                C8594l.m46769c(h2);
                if (h2.f34965f != null || System.nanoTime() - nanoTime < C8628d.f34961i) {
                    return null;
                }
                return C8628d.f34962j;
            }
            long n = l.m46851v(System.nanoTime());
            if (n > 0) {
                long j = n / 1000000;
                cls.wait(j, (int) (n - (1000000 * j)));
                return null;
            }
            C8628d h3 = C8628d.f34962j;
            C8594l.m46769c(h3);
            h3.f34965f = l.f34965f;
            l.f34965f = null;
            return l;
        }

        public /* synthetic */ C8629a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: k.d$b */
    /* compiled from: AsyncTimeout.kt */
    private static final class C8630b extends Thread {
        public C8630b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.mo29465y();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<k.d> r0 = p394k.C8628d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                k.d$a r1 = p394k.C8628d.f34963k     // Catch:{ all -> 0x001e }
                k.d r1 = r1.mo30658c()     // Catch:{ all -> 0x001e }
                k.d r2 = p394k.C8628d.f34962j     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p394k.C8628d.f34962j = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                i.t r2 = p369i.C8457t.f34900a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo29465y()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p394k.C8628d.C8630b.run():void");
        }
    }

    /* renamed from: k.d$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C8631c implements C8659y {

        /* renamed from: g */
        final /* synthetic */ C8628d f34967g;

        /* renamed from: h */
        final /* synthetic */ C8659y f34968h;

        C8631c(C8628d dVar, C8659y yVar) {
            this.f34967g = dVar;
            this.f34968h = yVar;
        }

        /* renamed from: b0 */
        public void mo29321b0(C8633e eVar, long j) {
            C8594l.m46771e(eVar, "source");
            C8624c.m46824b(eVar.mo30688U0(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C8656v vVar = eVar.f34971g;
                    C8594l.m46769c(vVar);
                    while (true) {
                        if (j2 >= ((long) 65536)) {
                            break;
                        }
                        j2 += (long) (vVar.f35014c - vVar.f35013b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            vVar = vVar.f35017f;
                            C8594l.m46769c(vVar);
                        }
                    }
                    C8628d dVar = this.f34967g;
                    dVar.mo30653s();
                    try {
                        this.f34968h.mo29321b0(eVar, j2);
                        C8457t tVar = C8457t.f34900a;
                        if (!dVar.mo30654t()) {
                            j -= j2;
                        } else {
                            throw dVar.mo30652m((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (dVar.mo30654t()) {
                            e = dVar.mo30652m(e);
                        }
                        throw e;
                    } finally {
                        boolean t = dVar.mo30654t();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: c */
        public C8628d timeout() {
            return this.f34967g;
        }

        public void close() {
            C8628d dVar = this.f34967g;
            dVar.mo30653s();
            try {
                this.f34968h.close();
                C8457t tVar = C8457t.f34900a;
                if (dVar.mo30654t()) {
                    throw dVar.mo30652m((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo30654t()) {
                    e = dVar.mo30652m(e);
                }
                throw e;
            } finally {
                boolean t = dVar.mo30654t();
            }
        }

        public void flush() {
            C8628d dVar = this.f34967g;
            dVar.mo30653s();
            try {
                this.f34968h.flush();
                C8457t tVar = C8457t.f34900a;
                if (dVar.mo30654t()) {
                    throw dVar.mo30652m((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo30654t()) {
                    e = dVar.mo30652m(e);
                }
                throw e;
            } finally {
                boolean t = dVar.mo30654t();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f34968h + ')';
        }
    }

    /* renamed from: k.d$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C8632d implements C8620a0 {

        /* renamed from: g */
        final /* synthetic */ C8628d f34969g;

        /* renamed from: h */
        final /* synthetic */ C8620a0 f34970h;

        C8632d(C8628d dVar, C8620a0 a0Var) {
            this.f34969g = dVar;
            this.f34970h = a0Var;
        }

        /* renamed from: c */
        public C8628d timeout() {
            return this.f34969g;
        }

        public void close() {
            C8628d dVar = this.f34969g;
            dVar.mo30653s();
            try {
                this.f34970h.close();
                C8457t tVar = C8457t.f34900a;
                if (dVar.mo30654t()) {
                    throw dVar.mo30652m((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo30654t()) {
                    e = dVar.mo30652m(e);
                }
                throw e;
            } finally {
                boolean t = dVar.mo30654t();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f34970h + ')';
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) {
            C8594l.m46771e(eVar, "sink");
            C8628d dVar = this.f34969g;
            dVar.mo30653s();
            try {
                long w0 = this.f34970h.mo29326w0(eVar, j);
                if (!dVar.mo30654t()) {
                    return w0;
                }
                throw dVar.mo30652m((IOException) null);
            } catch (IOException e) {
                e = e;
                if (dVar.mo30654t()) {
                    e = dVar.mo30652m(e);
                }
                throw e;
            } finally {
                boolean t = dVar.mo30654t();
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f34960h = millis;
        f34961i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final long m46851v(long j) {
        return this.f34966g - j;
    }

    /* renamed from: m */
    public final IOException mo30652m(IOException iOException) {
        return mo30655u(iOException);
    }

    /* renamed from: s */
    public final void mo30653s() {
        long g = mo30651g();
        boolean d = mo30648d();
        if (g != 0 || d) {
            f34963k.m46862e(this, g, d);
        }
    }

    /* renamed from: t */
    public final boolean mo30654t() {
        return f34963k.m46861d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public IOException mo30655u(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: w */
    public final C8659y mo30656w(C8659y yVar) {
        C8594l.m46771e(yVar, "sink");
        return new C8631c(this, yVar);
    }

    /* renamed from: x */
    public final C8620a0 mo30657x(C8620a0 a0Var) {
        C8594l.m46771e(a0Var, "source");
        return new C8632d(this, a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo29465y() {
    }
}
