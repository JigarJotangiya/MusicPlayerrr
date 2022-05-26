package kotlinx.coroutines.p400h3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C8690e;
import kotlinx.coroutines.C8723f;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.C8923w0;
import kotlinx.coroutines.internal.C8859z;
import p369i.C8457t;
import p369i.p371b0.C8379c;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.h3.a */
/* compiled from: CoroutineScheduler.kt */
public final class C8776a implements Executor, Closeable {

    /* renamed from: n */
    private static final /* synthetic */ AtomicLongFieldUpdater f35126n = AtomicLongFieldUpdater.newUpdater(C8776a.class, "parkedWorkersStack");

    /* renamed from: o */
    static final /* synthetic */ AtomicLongFieldUpdater f35127o = AtomicLongFieldUpdater.newUpdater(C8776a.class, "controlState");

    /* renamed from: p */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35128p = AtomicIntegerFieldUpdater.newUpdater(C8776a.class, "_isTerminated");

    /* renamed from: q */
    public static final C8859z f35129q = new C8859z("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: g */
    public final int f35130g;

    /* renamed from: h */
    public final int f35131h;

    /* renamed from: i */
    public final long f35132i;

    /* renamed from: j */
    public final String f35133j;

    /* renamed from: k */
    public final C8782d f35134k;

    /* renamed from: l */
    public final C8782d f35135l;

    /* renamed from: m */
    public final AtomicReferenceArray<C8778b> f35136m;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.h3.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class C8777a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35137a;

        static {
            int[] iArr = new int[C8779c.values().length];
            iArr[C8779c.PARKING.ordinal()] = 1;
            iArr[C8779c.BLOCKING.ordinal()] = 2;
            iArr[C8779c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C8779c.DORMANT.ordinal()] = 4;
            iArr[C8779c.TERMINATED.ordinal()] = 5;
            f35137a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.h3.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public enum C8779c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C8776a(int i, int i2, long j, String str) {
        this.f35130g = i;
        this.f35131h = i2;
        this.f35132i = j;
        this.f35133j = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.f35134k = new C8782d();
                        this.f35135l = new C8782d();
                        this.parkedWorkersStack = 0;
                        this.f35136m = new AtomicReferenceArray<>(i2 + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: H */
    public static /* synthetic */ void m47326H(C8776a aVar, Runnable runnable, C8788j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C8785g.f35161g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo31013E(runnable, jVar, z);
    }

    /* renamed from: H0 */
    static /* synthetic */ boolean m47327H0(C8776a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m47336z0(j);
    }

    /* renamed from: K */
    private final int m47328K(C8778b bVar) {
        Object g = bVar.mo31026g();
        while (g != f35129q) {
            if (g == null) {
                return 0;
            }
            C8778b bVar2 = (C8778b) g;
            int f = bVar2.mo31025f();
            if (f != 0) {
                return f;
            }
            g = bVar2.mo31026g();
        }
        return -1;
    }

    /* renamed from: L0 */
    private final boolean m47329L0() {
        C8778b Q;
        do {
            Q = m47330Q();
            if (Q == null) {
                return false;
            }
        } while (!C8778b.f35138n.compareAndSet(Q, -1, 0));
        LockSupport.unpark(Q);
        return true;
    }

    /* renamed from: Q */
    private final C8778b m47330Q() {
        while (true) {
            long j = this.parkedWorkersStack;
            C8778b bVar = this.f35136m.get((int) (2097151 & j));
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int K = m47328K(bVar);
            if (K >= 0) {
                if (f35126n.compareAndSet(this, j, ((long) K) | j2)) {
                    bVar.mo31029o(f35129q);
                    return bVar;
                }
            }
        }
    }

    /* renamed from: c */
    private final boolean m47331c(C8787i iVar) {
        boolean z = true;
        if (iVar.f35164h.mo31036Y() != 1) {
            z = false;
        }
        if (z) {
            return this.f35135l.mo31155a(iVar);
        }
        return this.f35134k.mo31155a(iVar);
    }

    /* renamed from: d */
    private final int m47332d() {
        synchronized (this.f35136m) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z = false;
            int a = C8392f.m46450a(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (a >= this.f35130g) {
                return 0;
            }
            if (i >= this.f35131h) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f35136m.get(i2) == null) {
                C8778b bVar = new C8778b(i2);
                this.f35136m.set(i2, bVar);
                if (i2 == ((int) (2097151 & f35127o.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    bVar.start();
                    int i3 = a + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: n0 */
    private final void m47333n0(boolean z) {
        long addAndGet = f35127o.addAndGet(this, 2097152);
        if (!z && !m47329L0() && !m47336z0(addAndGet)) {
            m47329L0();
        }
    }

    /* renamed from: v0 */
    private final C8787i m47334v0(C8778b bVar, C8787i iVar, boolean z) {
        if (bVar == null || bVar.f35140h == C8779c.TERMINATED) {
            return iVar;
        }
        if (iVar.f35164h.mo31036Y() == 0 && bVar.f35140h == C8779c.BLOCKING) {
            return iVar;
        }
        bVar.f35144l = true;
        return bVar.f35139g.mo31042a(iVar, z);
    }

    /* renamed from: x */
    private final C8778b m47335x() {
        Thread currentThread = Thread.currentThread();
        C8778b bVar = currentThread instanceof C8778b ? (C8778b) currentThread : null;
        if (bVar != null && C8594l.m46767a(C8776a.this, this)) {
            return bVar;
        }
        return null;
    }

    /* renamed from: z0 */
    private final boolean m47336z0(long j) {
        if (C8392f.m46450a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f35130g) {
            int d = m47332d();
            if (d == 1 && this.f35130g > 1) {
                m47332d();
            }
            if (d > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void mo31013E(Runnable runnable, C8788j jVar, boolean z) {
        C8690e a = C8723f.m47251a();
        if (a != null) {
            a.mo30910d();
        }
        C8787i p = mo31022p(runnable, jVar);
        C8778b x = m47335x();
        C8787i v0 = m47334v0(x, p, z);
        if (v0 == null || m47331c(v0)) {
            boolean z2 = z && x != null;
            if (p.f35164h.mo31036Y() != 0) {
                m47333n0(z2);
            } else if (!z2) {
                mo31021o0();
            }
        } else {
            throw new RejectedExecutionException(C8594l.m46777k(this.f35133j, " was terminated"));
        }
    }

    /* renamed from: T */
    public final boolean mo31014T(C8778b bVar) {
        long j;
        long j2;
        int f;
        if (bVar.mo31026g() != f35129q) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            f = bVar.mo31025f();
            if (C8919v0.m47824a()) {
                if (!(f != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.mo31029o(this.f35136m.get(i));
        } while (!f35126n.compareAndSet(this, j, ((long) f) | j2));
        return true;
    }

    /* renamed from: Y */
    public final void mo31015Y(C8778b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m47328K(bVar) : i2;
            }
            if (i3 >= 0) {
                if (f35126n.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public void close() {
        mo31020m0(10000);
    }

    public void execute(Runnable runnable) {
        m47326H(this, runnable, (C8788j) null, false, 6, (Object) null);
    }

    /* renamed from: i0 */
    public final void mo31018i0(C8787i iVar) {
        C8690e a;
        try {
            iVar.run();
            a = C8723f.m47251a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            C8690e a2 = C8723f.m47251a();
            if (a2 != null) {
                a2.mo30911e();
            }
            throw th;
        }
        a.mo30911e();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m0 */
    public final void mo31020m0(long j) {
        int i;
        C8787i iVar;
        boolean z = false;
        if (f35128p.compareAndSet(this, 0, 1)) {
            C8778b x = m47335x();
            synchronized (this.f35136m) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C8778b bVar = this.f35136m.get(i2);
                    C8594l.m46769c(bVar);
                    C8778b bVar2 = bVar;
                    if (bVar2 != x) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(j);
                        }
                        C8779c cVar = bVar2.f35140h;
                        if (C8919v0.m47824a()) {
                            if (!(cVar == C8779c.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        bVar2.f35139g.mo31045g(this.f35135l);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f35135l.mo31156b();
            this.f35134k.mo31156b();
            while (true) {
                if (x == null) {
                    iVar = null;
                } else {
                    iVar = x.mo31024e(true);
                }
                if (iVar == null && (iVar = (C8787i) this.f35134k.mo31158d()) == null && (iVar = (C8787i) this.f35135l.mo31158d()) == null) {
                    break;
                }
                mo31018i0(iVar);
            }
            if (x != null) {
                x.mo31030r(C8779c.TERMINATED);
            }
            if (C8919v0.m47824a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f35130g) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: o0 */
    public final void mo31021o0() {
        if (!m47329L0() && !m47327H0(this, 0, 1, (Object) null)) {
            m47329L0();
        }
    }

    /* renamed from: p */
    public final C8787i mo31022p(Runnable runnable, C8788j jVar) {
        long a = C8790l.f35170e.mo31039a();
        if (!(runnable instanceof C8787i)) {
            return new C8789k(runnable, a, jVar);
        }
        C8787i iVar = (C8787i) runnable;
        iVar.f35163g = a;
        iVar.f35164h = jVar;
        return iVar;
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.f35136m.length();
        int i5 = 0;
        if (1 < length) {
            i3 = 0;
            int i6 = 0;
            i2 = 0;
            i = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                C8778b bVar = this.f35136m.get(i7);
                if (bVar != null) {
                    int f = bVar.f35139g.mo31044f();
                    int i9 = C8777a.f35137a[bVar.f35140h.ordinal()];
                    if (i9 == 1) {
                        i5++;
                    } else if (i9 == 2) {
                        i3++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(f);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i9 == 3) {
                        i6++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i9 == 4) {
                        i2++;
                        if (f > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i9 == 5) {
                        i++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i4 = i5;
            i5 = i6;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j = this.controlState;
        return this.f35133j + '@' + C8923w0.m47834b(this) + "[Pool Size {core = " + this.f35130g + ", max = " + this.f35131h + "}, Worker States {CPU = " + i5 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f35134k.mo31157c() + ", global blocking queue size = " + this.f35135l.mo31157c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f35130g - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: kotlinx.coroutines.h3.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public final class C8778b extends Thread {

        /* renamed from: n */
        static final /* synthetic */ AtomicIntegerFieldUpdater f35138n = AtomicIntegerFieldUpdater.newUpdater(C8778b.class, "workerCtl");

        /* renamed from: g */
        public final C8791m f35139g;

        /* renamed from: h */
        public C8779c f35140h;

        /* renamed from: i */
        private long f35141i;
        private volatile int indexInArray;

        /* renamed from: j */
        private long f35142j;

        /* renamed from: k */
        private int f35143k;

        /* renamed from: l */
        public boolean f35144l;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C8778b() {
            setDaemon(true);
            this.f35139g = new C8791m();
            this.f35140h = C8779c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C8776a.f35129q;
            this.f35143k = C8379c.Default.nextInt();
        }

        /* renamed from: a */
        private final void m47344a(int i) {
            if (i != 0) {
                C8776a.f35127o.addAndGet(C8776a.this, -2097152);
                C8779c cVar = this.f35140h;
                if (cVar != C8779c.TERMINATED) {
                    if (C8919v0.m47824a()) {
                        if (!(cVar == C8779c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f35140h = C8779c.DORMANT;
                }
            }
        }

        /* renamed from: b */
        private final void m47345b(int i) {
            if (i != 0 && mo31030r(C8779c.BLOCKING)) {
                C8776a.this.mo31021o0();
            }
        }

        /* renamed from: c */
        private final void m47346c(C8787i iVar) {
            int Y = iVar.f35164h.mo31036Y();
            m47348h(Y);
            m47345b(Y);
            C8776a.this.mo31018i0(iVar);
            m47344a(Y);
        }

        /* renamed from: d */
        private final C8787i m47347d(boolean z) {
            C8787i l;
            C8787i l2;
            if (z) {
                boolean z2 = mo31027j(C8776a.this.f35130g * 2) == 0;
                if (z2 && (l2 = m47351l()) != null) {
                    return l2;
                }
                C8787i h = this.f35139g.mo31046h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (l = m47351l()) != null) {
                    return l;
                }
            } else {
                C8787i l3 = m47351l();
                if (l3 != null) {
                    return l3;
                }
            }
            return m47355s(false);
        }

        /* renamed from: h */
        private final void m47348h(int i) {
            this.f35141i = 0;
            if (this.f35140h == C8779c.PARKING) {
                if (C8919v0.m47824a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f35140h = C8779c.BLOCKING;
            }
        }

        /* renamed from: i */
        private final boolean m47349i() {
            return this.nextParkedWorker != C8776a.f35129q;
        }

        /* renamed from: k */
        private final void m47350k() {
            if (this.f35141i == 0) {
                this.f35141i = System.nanoTime() + C8776a.this.f35132i;
            }
            LockSupport.parkNanos(C8776a.this.f35132i);
            if (System.nanoTime() - this.f35141i >= 0) {
                this.f35141i = 0;
                m47356t();
            }
        }

        /* renamed from: l */
        private final C8787i m47351l() {
            if (mo31027j(2) == 0) {
                C8787i iVar = (C8787i) C8776a.this.f35134k.mo31158d();
                return iVar == null ? (C8787i) C8776a.this.f35135l.mo31158d() : iVar;
            }
            C8787i iVar2 = (C8787i) C8776a.this.f35135l.mo31158d();
            return iVar2 == null ? (C8787i) C8776a.this.f35134k.mo31158d() : iVar2;
        }

        /* renamed from: m */
        private final void m47352m() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C8776a.this.isTerminated() && this.f35140h != C8779c.TERMINATED) {
                    C8787i e = mo31024e(this.f35144l);
                    if (e != null) {
                        this.f35142j = 0;
                        m47346c(e);
                    } else {
                        this.f35144l = false;
                        if (this.f35142j == 0) {
                            m47354q();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo31030r(C8779c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f35142j);
                            this.f35142j = 0;
                        }
                    }
                }
            }
            mo31030r(C8779c.TERMINATED);
        }

        /* renamed from: p */
        private final boolean m47353p() {
            boolean z;
            if (this.f35140h != C8779c.CPU_ACQUIRED) {
                C8776a aVar = C8776a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C8776a.f35127o.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f35140h = C8779c.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: q */
        private final void m47354q() {
            if (!m47349i()) {
                C8776a.this.mo31014T(this);
                return;
            }
            if (C8919v0.m47824a()) {
                if (!(this.f35139g.mo31044f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m47349i() && this.workerCtl == -1 && !C8776a.this.isTerminated() && this.f35140h != C8779c.TERMINATED) {
                mo31030r(C8779c.PARKING);
                Thread.interrupted();
                m47350k();
            }
        }

        /* renamed from: s */
        private final C8787i m47355s(boolean z) {
            long j;
            if (C8919v0.m47824a()) {
                if (!(this.f35139g.mo31044f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (C8776a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int j2 = mo31027j(i);
            C8776a aVar = C8776a.this;
            long j3 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                j2++;
                if (j2 > i) {
                    j2 = 1;
                }
                C8778b bVar = aVar.f35136m.get(j2);
                if (!(bVar == null || bVar == this)) {
                    if (C8919v0.m47824a()) {
                        if (!(this.f35139g.mo31044f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.f35139g.mo31047k(bVar.f35139g);
                    } else {
                        j = this.f35139g.mo31048l(bVar.f35139g);
                    }
                    if (j == -1) {
                        return this.f35139g.mo31046h();
                    }
                    if (j > 0) {
                        j3 = Math.min(j3, j);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f35142j = j3;
            return null;
        }

        /* renamed from: t */
        private final void m47356t() {
            C8776a aVar = C8776a.this;
            synchronized (aVar.f35136m) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f35130g) {
                        if (f35138n.compareAndSet(this, -1, 1)) {
                            int f = mo31025f();
                            mo31028n(0);
                            aVar.mo31015Y(this, f, 0);
                            int andDecrement = (int) (C8776a.f35127o.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != f) {
                                C8778b bVar = aVar.f35136m.get(andDecrement);
                                C8594l.m46769c(bVar);
                                C8778b bVar2 = bVar;
                                aVar.f35136m.set(f, bVar2);
                                bVar2.mo31028n(f);
                                aVar.mo31015Y(bVar2, andDecrement, f);
                            }
                            aVar.f35136m.set(andDecrement, (Object) null);
                            C8457t tVar = C8457t.f34900a;
                            this.f35140h = C8779c.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        public final C8787i mo31024e(boolean z) {
            C8787i iVar;
            if (m47353p()) {
                return m47347d(z);
            }
            if (z) {
                iVar = this.f35139g.mo31046h();
                if (iVar == null) {
                    iVar = (C8787i) C8776a.this.f35135l.mo31158d();
                }
            } else {
                iVar = (C8787i) C8776a.this.f35135l.mo31158d();
            }
            return iVar == null ? m47355s(true) : iVar;
        }

        /* renamed from: f */
        public final int mo31025f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object mo31026g() {
            return this.nextParkedWorker;
        }

        /* renamed from: j */
        public final int mo31027j(int i) {
            int i2 = this.f35143k;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f35143k = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: n */
        public final void mo31028n(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C8776a.this.f35133j);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: o */
        public final void mo31029o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean mo31030r(C8779c cVar) {
            C8779c cVar2 = this.f35140h;
            boolean z = cVar2 == C8779c.CPU_ACQUIRED;
            if (z) {
                C8776a.f35127o.addAndGet(C8776a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f35140h = cVar;
            }
            return z;
        }

        public void run() {
            m47352m();
        }

        public C8778b(int i) {
            this();
            mo31028n(i);
        }
    }
}
