package androidx.work.impl.utils.p013o;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p159f.p243f.p327d.p330c.p331a.C7738a;

/* renamed from: androidx.work.impl.utils.o.a */
/* compiled from: AbstractFuture */
public abstract class C1384a<V> implements C7738a<V> {

    /* renamed from: j */
    static final boolean f5421j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k */
    private static final Logger f5422k = Logger.getLogger(C1384a.class.getName());

    /* renamed from: l */
    static final C1386b f5423l;

    /* renamed from: m */
    private static final Object f5424m = new Object();

    /* renamed from: g */
    volatile Object f5425g;

    /* renamed from: h */
    volatile C1390e f5426h;

    /* renamed from: i */
    volatile C1394i f5427i;

    /* renamed from: androidx.work.impl.utils.o.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C1386b {
        private C1386b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo6792a(C1384a<?> aVar, C1390e eVar, C1390e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo6793b(C1384a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo6794c(C1384a<?> aVar, C1394i iVar, C1394i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo6795d(C1394i iVar, C1394i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6796e(C1394i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.o.a$c */
    /* compiled from: AbstractFuture */
    private static final class C1387c {

        /* renamed from: c */
        static final C1387c f5428c;

        /* renamed from: d */
        static final C1387c f5429d;

        /* renamed from: a */
        final boolean f5430a;

        /* renamed from: b */
        final Throwable f5431b;

        static {
            if (C1384a.f5421j) {
                f5429d = null;
                f5428c = null;
                return;
            }
            f5429d = new C1387c(false, (Throwable) null);
            f5428c = new C1387c(true, (Throwable) null);
        }

        C1387c(boolean z, Throwable th) {
            this.f5430a = z;
            this.f5431b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$d */
    /* compiled from: AbstractFuture */
    private static final class C1388d {

        /* renamed from: b */
        static final C1388d f5432b = new C1388d(new C1389a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f5433a;

        /* renamed from: androidx.work.impl.utils.o.a$d$a */
        /* compiled from: AbstractFuture */
        class C1389a extends Throwable {
            C1389a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1388d(Throwable th) {
            C1384a.m7401e(th);
            this.f5433a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$e */
    /* compiled from: AbstractFuture */
    private static final class C1390e {

        /* renamed from: d */
        static final C1390e f5434d = new C1390e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f5435a;

        /* renamed from: b */
        final Executor f5436b;

        /* renamed from: c */
        C1390e f5437c;

        C1390e(Runnable runnable, Executor executor) {
            this.f5435a = runnable;
            this.f5436b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$f */
    /* compiled from: AbstractFuture */
    private static final class C1391f extends C1386b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1394i, Thread> f5438a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1394i, C1394i> f5439b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1384a, C1394i> f5440c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1384a, C1390e> f5441d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1384a, Object> f5442e;

        C1391f(AtomicReferenceFieldUpdater<C1394i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1394i, C1394i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1384a, C1394i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1384a, C1390e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1384a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5438a = atomicReferenceFieldUpdater;
            this.f5439b = atomicReferenceFieldUpdater2;
            this.f5440c = atomicReferenceFieldUpdater3;
            this.f5441d = atomicReferenceFieldUpdater4;
            this.f5442e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6792a(C1384a<?> aVar, C1390e eVar, C1390e eVar2) {
            return this.f5441d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6793b(C1384a<?> aVar, Object obj, Object obj2) {
            return this.f5442e.compareAndSet(aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6794c(C1384a<?> aVar, C1394i iVar, C1394i iVar2) {
            return this.f5440c.compareAndSet(aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6795d(C1394i iVar, C1394i iVar2) {
            this.f5439b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6796e(C1394i iVar, Thread thread) {
            this.f5438a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$g */
    /* compiled from: AbstractFuture */
    private static final class C1392g<V> implements Runnable {

        /* renamed from: g */
        final C1384a<V> f5443g;

        /* renamed from: h */
        final C7738a<? extends V> f5444h;

        C1392g(C1384a<V> aVar, C7738a<? extends V> aVar2) {
            this.f5443g = aVar;
            this.f5444h = aVar2;
        }

        public void run() {
            if (this.f5443g.f5425g == this) {
                if (C1384a.f5423l.mo6793b(this.f5443g, this, C1384a.m7406k(this.f5444h))) {
                    C1384a.m7403g(this.f5443g);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$h */
    /* compiled from: AbstractFuture */
    private static final class C1393h extends C1386b {
        C1393h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6792a(C1384a<?> aVar, C1390e eVar, C1390e eVar2) {
            synchronized (aVar) {
                if (aVar.f5426h != eVar) {
                    return false;
                }
                aVar.f5426h = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6793b(C1384a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5425g != obj) {
                    return false;
                }
                aVar.f5425g = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6794c(C1384a<?> aVar, C1394i iVar, C1394i iVar2) {
            synchronized (aVar) {
                if (aVar.f5427i != iVar) {
                    return false;
                }
                aVar.f5427i = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6795d(C1394i iVar, C1394i iVar2) {
            iVar.f5447b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6796e(C1394i iVar, Thread thread) {
            iVar.f5446a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.o.a$i */
    /* compiled from: AbstractFuture */
    private static final class C1394i {

        /* renamed from: c */
        static final C1394i f5445c = new C1394i(false);

        /* renamed from: a */
        volatile Thread f5446a;

        /* renamed from: b */
        volatile C1394i f5447b;

        C1394i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6799a(C1394i iVar) {
            C1384a.f5423l.mo6795d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6800b() {
            Thread thread = this.f5446a;
            if (thread != null) {
                this.f5446a = null;
                LockSupport.unpark(thread);
            }
        }

        C1394i() {
            C1384a.f5423l.mo6796e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.o.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.o.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.o.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.o.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.o.a$i> r0 = androidx.work.impl.utils.p013o.C1384a.C1394i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f5421j = r1
            java.lang.Class<androidx.work.impl.utils.o.a> r1 = androidx.work.impl.utils.p013o.C1384a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f5422k = r1
            androidx.work.impl.utils.o.a$f r1 = new androidx.work.impl.utils.o.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.o.a> r2 = androidx.work.impl.utils.p013o.C1384a.class
            java.lang.String r5 = "i"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.o.a> r0 = androidx.work.impl.utils.p013o.C1384a.class
            java.lang.Class<androidx.work.impl.utils.o.a$e> r2 = androidx.work.impl.utils.p013o.C1384a.C1390e.class
            java.lang.String r6 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.o.a> r0 = androidx.work.impl.utils.p013o.C1384a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.o.a$h r1 = new androidx.work.impl.utils.o.a$h
            r1.<init>()
        L_0x0054:
            f5423l = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f5422k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f5424m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p013o.C1384a.<clinit>():void");
    }

    protected C1384a() {
    }

    /* renamed from: a */
    private void m7399a(StringBuilder sb) {
        try {
            Object l = m7407l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m7410t(l));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: c */
    private static CancellationException m7400c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m7401e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    private C1390e m7402f(C1390e eVar) {
        C1390e eVar2;
        do {
            eVar2 = this.f5426h;
        } while (!f5423l.mo6792a(this, eVar2, C1390e.f5434d));
        C1390e eVar3 = eVar2;
        C1390e eVar4 = eVar;
        C1390e eVar5 = eVar3;
        while (eVar5 != null) {
            C1390e eVar6 = eVar5.f5437c;
            eVar5.f5437c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: g */
    static void m7403g(C1384a<?> aVar) {
        C1390e eVar = null;
        C1384a<V> aVar2 = aVar;
        while (true) {
            aVar2.m7408o();
            aVar2.mo6779b();
            C1390e f = aVar2.m7402f(eVar);
            while (true) {
                if (f != null) {
                    eVar = f.f5437c;
                    Runnable runnable = f.f5435a;
                    if (runnable instanceof C1392g) {
                        C1392g gVar = (C1392g) runnable;
                        C1384a<V> aVar3 = gVar.f5443g;
                        if (aVar3.f5425g == gVar) {
                            if (f5423l.mo6793b(aVar3, gVar, m7406k(gVar.f5444h))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m7404i(runnable, f.f5436b);
                    }
                    f = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private static void m7404i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f5422k;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: j */
    private V m7405j(Object obj) throws ExecutionException {
        if (obj instanceof C1387c) {
            throw m7400c("Task was cancelled.", ((C1387c) obj).f5431b);
        } else if (obj instanceof C1388d) {
            throw new ExecutionException(((C1388d) obj).f5433a);
        } else if (obj == f5424m) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: k */
    static Object m7406k(C7738a<?> aVar) {
        if (aVar instanceof C1384a) {
            Object obj = ((C1384a) aVar).f5425g;
            if (!(obj instanceof C1387c)) {
                return obj;
            }
            C1387c cVar = (C1387c) obj;
            if (!cVar.f5430a) {
                return obj;
            }
            if (cVar.f5431b != null) {
                return new C1387c(false, cVar.f5431b);
            }
            return C1387c.f5429d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f5421j) && isCancelled) {
            return C1387c.f5429d;
        }
        try {
            Object l = m7407l(aVar);
            return l == null ? f5424m : l;
        } catch (ExecutionException e) {
            return new C1388d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1387c(false, e2);
            }
            return new C1388d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new C1388d(th);
        }
    }

    /* renamed from: l */
    private static <V> V m7407l(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: o */
    private void m7408o() {
        C1394i iVar;
        do {
            iVar = this.f5427i;
        } while (!f5423l.mo6794c(this, iVar, C1394i.f5445c));
        while (iVar != null) {
            iVar.mo6800b();
            iVar = iVar.f5447b;
        }
    }

    /* renamed from: p */
    private void m7409p(C1394i iVar) {
        iVar.f5446a = null;
        while (true) {
            C1394i iVar2 = this.f5427i;
            if (iVar2 != C1394i.f5445c) {
                C1394i iVar3 = null;
                while (iVar2 != null) {
                    C1394i iVar4 = iVar2.f5447b;
                    if (iVar2.f5446a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f5447b = iVar4;
                        if (iVar3.f5446a == null) {
                        }
                    } else if (!f5423l.mo6794c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: t */
    private String m7410t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6779b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, f.f.d.c.a.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5425g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013o.C1384a.C1392g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f5421j
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.o.a$c r3 = new androidx.work.impl.utils.o.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.o.a$c r3 = androidx.work.impl.utils.p013o.C1384a.C1387c.f5428c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.o.a$c r3 = androidx.work.impl.utils.p013o.C1384a.C1387c.f5429d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.o.a$b r6 = f5423l
            boolean r6 = r6.mo6793b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo6786m()
        L_0x0035:
            m7403g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013o.C1384a.C1392g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.o.a$g r0 = (androidx.work.impl.utils.p013o.C1384a.C1392g) r0
            f.f.d.c.a.a<? extends V> r0 = r0.f5444h
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013o.C1384a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.o.a r4 = (androidx.work.impl.utils.p013o.C1384a) r4
            java.lang.Object r0 = r4.f5425g
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.p013o.C1384a.C1392g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f5425g
            boolean r6 = r0 instanceof androidx.work.impl.utils.p013o.C1384a.C1392g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p013o.C1384a.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final void mo6781d(Runnable runnable, Executor executor) {
        m7401e(runnable);
        m7401e(executor);
        C1390e eVar = this.f5426h;
        if (eVar != C1390e.f5434d) {
            C1390e eVar2 = new C1390e(runnable, executor);
            do {
                eVar2.f5437c = eVar;
                if (!f5423l.mo6792a(this, eVar, eVar2)) {
                    eVar = this.f5426h;
                } else {
                    return;
                }
            } while (eVar != C1390e.f5434d);
        }
        m7404i(runnable, executor);
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5425g;
            if ((obj != null) && (!(obj instanceof C1392g))) {
                return m7405j(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1394i iVar = this.f5427i;
                if (iVar != C1394i.f5445c) {
                    C1394i iVar2 = new C1394i();
                    do {
                        iVar2.mo6799a(iVar);
                        if (f5423l.mo6794c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5425g;
                                    if ((obj2 != null) && (!(obj2 instanceof C1392g))) {
                                        return m7405j(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m7409p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7409p(iVar2);
                        } else {
                            iVar = this.f5427i;
                        }
                    } while (iVar != C1394i.f5445c);
                }
                return m7405j(this.f5425g);
            }
            while (nanos > 0) {
                Object obj3 = this.f5425g;
                if ((obj3 != null) && (!(obj3 instanceof C1392g))) {
                    return m7405j(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f5425g instanceof C1387c;
    }

    public final boolean isDone() {
        Object obj = this.f5425g;
        return (!(obj instanceof C1392g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo6786m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo6787n() {
        Object obj = this.f5425g;
        if (obj instanceof C1392g) {
            return "setFuture=[" + m7410t(((C1392g) obj).f5444h) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo6788q(V v) {
        if (v == null) {
            v = f5424m;
        }
        if (!f5423l.mo6793b(this, (Object) null, v)) {
            return false;
        }
        m7403g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo6789r(Throwable th) {
        m7401e(th);
        if (!f5423l.mo6793b(this, (Object) null, new C1388d(th))) {
            return false;
        }
        m7403g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo6790s(C7738a<? extends V> aVar) {
        C1392g gVar;
        C1388d dVar;
        m7401e(aVar);
        Object obj = this.f5425g;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f5423l.mo6793b(this, (Object) null, m7406k(aVar))) {
                    return false;
                }
                m7403g(this);
                return true;
            }
            gVar = new C1392g(this, aVar);
            if (f5423l.mo6793b(this, (Object) null, gVar)) {
                try {
                    aVar.mo6781d(gVar, C1395b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C1388d.f5432b;
                }
                return true;
            }
            obj = this.f5425g;
        }
        if (obj instanceof C1387c) {
            aVar.cancel(((C1387c) obj).f5430a);
        }
        return false;
        f5423l.mo6793b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7399a(sb);
        } else {
            try {
                str = mo6787n();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7399a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5425g;
            if ((obj2 != null) && (!(obj2 instanceof C1392g))) {
                return m7405j(obj2);
            }
            C1394i iVar = this.f5427i;
            if (iVar != C1394i.f5445c) {
                C1394i iVar2 = new C1394i();
                do {
                    iVar2.mo6799a(iVar);
                    if (f5423l.mo6794c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5425g;
                            } else {
                                m7409p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1392g))));
                        return m7405j(obj);
                    }
                    iVar = this.f5427i;
                } while (iVar != C1394i.f5445c);
            }
            return m7405j(this.f5425g);
        }
        throw new InterruptedException();
    }
}
