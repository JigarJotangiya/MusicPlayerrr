package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C8822e0;
import kotlinx.coroutines.internal.C8824f0;
import kotlinx.coroutines.internal.C8847q;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.l1 */
/* compiled from: EventLoop.common.kt */
public abstract class C8870l1 extends C8879m1 implements C8664a1 {

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35271k;

    /* renamed from: l */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35272l;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: kotlinx.coroutines.l1$a */
    /* compiled from: EventLoop.common.kt */
    private final class C8871a extends C8872b {

        /* renamed from: j */
        private final C8894q<C8457t> f35273j;

        public C8871a(long j, C8894q<? super C8457t> qVar) {
            super(j);
            this.f35273j = qVar;
        }

        public void run() {
            this.f35273j.mo31218f(C8870l1.this, C8457t.f34900a);
        }

        public String toString() {
            return C8594l.m46777k(super.toString(), this.f35273j);
        }
    }

    /* renamed from: kotlinx.coroutines.l1$b */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C8872b implements Runnable, Comparable<C8872b>, C8774h1, C8824f0 {

        /* renamed from: g */
        public long f35275g;

        /* renamed from: h */
        private Object f35276h;

        /* renamed from: i */
        private int f35277i = -1;

        public C8872b(long j) {
            this.f35275g = j;
        }

        /* renamed from: c */
        public void mo31117c(C8822e0<?> e0Var) {
            if (this.f35276h != C8887o1.f35283a) {
                this.f35276h = e0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        public C8822e0<?> mo31118h() {
            Object obj = this.f35276h;
            if (obj instanceof C8822e0) {
                return (C8822e0) obj;
            }
            return null;
        }

        /* renamed from: j */
        public void mo31119j(int i) {
            this.f35277i = i;
        }

        /* renamed from: k */
        public final synchronized void mo31008k() {
            Object obj = this.f35276h;
            if (obj != C8887o1.f35283a) {
                C8873c cVar = obj instanceof C8873c ? (C8873c) obj : null;
                if (cVar != null) {
                    cVar.mo31113g(this);
                }
                this.f35276h = C8887o1.f35283a;
            }
        }

        /* renamed from: l */
        public int mo31120l() {
            return this.f35277i;
        }

        /* renamed from: o */
        public int compareTo(C8872b bVar) {
            int i = ((this.f35275g - bVar.f35275g) > 0 ? 1 : ((this.f35275g - bVar.f35275g) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: p */
        public final synchronized int mo31197p(long j, C8873c cVar, C8870l1 l1Var) {
            if (this.f35276h == C8887o1.f35283a) {
                return 2;
            }
            synchronized (cVar) {
                C8872b bVar = (C8872b) cVar.mo31109b();
                if (l1Var.m47701j1()) {
                    return 1;
                }
                if (bVar == null) {
                    cVar.f35278b = j;
                } else {
                    long j2 = bVar.f35275g;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - cVar.f35278b > 0) {
                        cVar.f35278b = j;
                    }
                }
                long j3 = this.f35275g;
                long j4 = cVar.f35278b;
                if (j3 - j4 < 0) {
                    this.f35275g = j4;
                }
                cVar.mo31108a(this);
                return 0;
            }
        }

        /* renamed from: q */
        public final boolean mo31198q(long j) {
            return j - this.f35275g >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f35275g + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.l1$c */
    /* compiled from: EventLoop.common.kt */
    public static final class C8873c extends C8822e0<C8872b> {

        /* renamed from: b */
        public long f35278b;

        public C8873c(long j) {
            this.f35278b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C8870l1> cls2 = C8870l1.class;
        f35271k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f35272l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: f1 */
    private final void m47698f1() {
        if (!C8919v0.m47824a() || m47701j1()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f35271k.compareAndSet(this, (Object) null, C8887o1.f35284b)) {
                        return;
                    }
                } else if (obj instanceof C8847q) {
                    ((C8847q) obj).mo31160d();
                    return;
                } else if (obj != C8887o1.f35284b) {
                    C8847q qVar = new C8847q(8, true);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    qVar.mo31159a((Runnable) obj);
                    if (f35271k.compareAndSet(this, obj, qVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: g1 */
    private final Runnable m47699g1() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C8847q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C8847q qVar = (C8847q) obj;
                Object j = qVar.mo31164j();
                if (j != C8847q.f35241h) {
                    return (Runnable) j;
                }
                f35271k.compareAndSet(this, obj, qVar.mo31163i());
            } else if (obj == C8887o1.f35284b) {
                return null;
            } else {
                if (f35271k.compareAndSet(this, obj, (Object) null)) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: i1 */
    private final boolean m47700i1(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m47701j1()) {
                return false;
            }
            if (obj == null) {
                if (f35271k.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C8847q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C8847q qVar = (C8847q) obj;
                int a = qVar.mo31159a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    f35271k.compareAndSet(this, obj, qVar.mo31163i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C8887o1.f35284b) {
                return false;
            } else {
                C8847q qVar2 = new C8847q(8, true);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                qVar2.mo31159a((Runnable) obj);
                qVar2.mo31159a(runnable);
                if (f35271k.compareAndSet(this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public final boolean m47701j1() {
        return this._isCompleted;
    }

    /* renamed from: l1 */
    private final void m47702l1() {
        C8690e a = C8723f.m47251a();
        long nanoTime = a == null ? System.nanoTime() : a.mo30907a();
        while (true) {
            C8873c cVar = (C8873c) this._delayed;
            C8872b bVar = cVar == null ? null : (C8872b) cVar.mo31115i();
            if (bVar != null) {
                mo31201c1(nanoTime, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: o1 */
    private final int m47703o1(long j, C8872b bVar) {
        if (m47701j1()) {
            return 1;
        }
        C8873c cVar = (C8873c) this._delayed;
        if (cVar == null) {
            f35272l.compareAndSet(this, (Object) null, new C8873c(j));
            Object obj = this._delayed;
            C8594l.m46769c(obj);
            cVar = (C8873c) obj;
        }
        return bVar.mo31197p(j, cVar, this);
    }

    /* renamed from: p1 */
    private final void m47704p1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: q1 */
    private final boolean m47705q1(C8872b bVar) {
        C8873c cVar = (C8873c) this._delayed;
        return (cVar == null ? null : (C8872b) cVar.mo31112e()) == bVar;
    }

    /* renamed from: N0 */
    public final void mo30866N0(C8513g gVar, Runnable runnable) {
        mo31189h1(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public long mo31181T0() {
        if (super.mo31181T0() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C8847q) {
                if (!((C8847q) obj).mo31162g()) {
                    return 0;
                }
            } else if (obj == C8887o1.f35284b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C8873c cVar = (C8873c) this._delayed;
        C8872b bVar = cVar == null ? null : (C8872b) cVar.mo31112e();
        if (bVar == null) {
            return Long.MAX_VALUE;
        }
        long j = bVar.f35275g;
        C8690e a = C8723f.m47251a();
        return C8392f.m46451b(j - (a == null ? System.nanoTime() : a.mo30907a()), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0057  */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo31185Y0() {
        /*
            r9 = this;
            boolean r0 = r9.mo31186Z0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.l1$c r0 = (kotlinx.coroutines.C8870l1.C8873c) r0
            if (r0 == 0) goto L_0x004d
            boolean r3 = r0.mo31111d()
            if (r3 != 0) goto L_0x004d
            kotlinx.coroutines.e r3 = kotlinx.coroutines.C8723f.m47251a()
            if (r3 != 0) goto L_0x0020
            long r3 = java.lang.System.nanoTime()
            goto L_0x0024
        L_0x0020:
            long r3 = r3.mo30907a()
        L_0x0024:
            monitor-enter(r0)
            kotlinx.coroutines.internal.f0 r5 = r0.mo31109b()     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 != 0) goto L_0x002e
            monitor-exit(r0)
            goto L_0x0045
        L_0x002e:
            kotlinx.coroutines.l1$b r5 = (kotlinx.coroutines.C8870l1.C8872b) r5     // Catch:{ all -> 0x004a }
            boolean r7 = r5.mo31198q(r3)     // Catch:{ all -> 0x004a }
            r8 = 0
            if (r7 == 0) goto L_0x003c
            boolean r5 = r9.m47700i1(r5)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x0044
            kotlinx.coroutines.internal.f0 r5 = r0.mo31114h(r8)     // Catch:{ all -> 0x004a }
            r6 = r5
        L_0x0044:
            monitor-exit(r0)
        L_0x0045:
            kotlinx.coroutines.l1$b r6 = (kotlinx.coroutines.C8870l1.C8872b) r6
            if (r6 != 0) goto L_0x0024
            goto L_0x004d
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r9.m47699g1()
            if (r0 == 0) goto L_0x0057
            r0.run()
            return r1
        L_0x0057:
            long r0 = r9.mo31181T0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8870l1.mo31185Y0():long");
    }

    /* renamed from: h1 */
    public final void mo31189h1(Runnable runnable) {
        if (m47700i1(runnable)) {
            mo31202d1();
        } else {
            C8927x0.f35312m.mo31189h1(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k1 */
    public boolean mo31190k1() {
        if (!mo31184X0()) {
            return false;
        }
        C8873c cVar = (C8873c) this._delayed;
        if (cVar != null && !cVar.mo31111d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C8847q) {
                return ((C8847q) obj).mo31162g();
            }
            if (obj == C8887o1.f35284b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public final void mo31191m1() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: n1 */
    public final void mo31192n1(long j, C8872b bVar) {
        int o1 = m47703o1(j, bVar);
        if (o1 != 0) {
            if (o1 == 1) {
                mo31201c1(j, bVar);
            } else if (o1 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m47705q1(bVar)) {
            mo31202d1();
        }
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C8929x2.f35315a.mo31252c();
        m47704p1(true);
        m47698f1();
        do {
        } while (mo31185Y0() <= 0);
        m47702l1();
    }

    /* renamed from: x */
    public void mo30858x(long j, C8894q<? super C8457t> qVar) {
        long c = C8887o1.m47746c(j);
        if (c < 4611686018427387903L) {
            C8690e a = C8723f.m47251a();
            long nanoTime = a == null ? System.nanoTime() : a.mo30907a();
            C8871a aVar = new C8871a(c + nanoTime, qVar);
            C8909t.m47813a(qVar, aVar);
            mo31192n1(nanoTime, aVar);
        }
    }
}
