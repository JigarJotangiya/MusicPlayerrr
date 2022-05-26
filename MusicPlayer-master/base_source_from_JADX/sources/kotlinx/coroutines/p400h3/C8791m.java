package kotlinx.coroutines.p400h3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8919v0;

/* renamed from: kotlinx.coroutines.h3.m */
/* compiled from: WorkQueue.kt */
public final class C8791m {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35171b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35172c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35173d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35174e;

    /* renamed from: a */
    private final AtomicReferenceArray<C8787i> f35175a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C8791m> cls = C8791m.class;
        f35171b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f35172c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f35173d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f35174e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C8787i m47379b(C8791m mVar, C8787i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mVar.mo31042a(iVar, z);
    }

    /* renamed from: c */
    private final C8787i m47380c(C8787i iVar) {
        boolean z = true;
        if (iVar.f35164h.mo31036Y() != 1) {
            z = false;
        }
        if (z) {
            f35174e.incrementAndGet(this);
        }
        if (mo31043e() == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.f35175a.get(i) != null) {
            Thread.yield();
        }
        this.f35175a.lazySet(i, iVar);
        f35172c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m47381d(C8787i iVar) {
        if (iVar != null) {
            boolean z = false;
            if (iVar.f35164h.mo31036Y() == 1) {
                int decrementAndGet = f35174e.decrementAndGet(this);
                if (C8919v0.m47824a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final C8787i m47382i() {
        C8787i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f35173d.compareAndSet(this, i, i + 1) && (andSet = this.f35175a.getAndSet(i2, (Object) null)) != null) {
                m47381d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m47383j(C8782d dVar) {
        C8787i i = m47382i();
        if (i == null) {
            return false;
        }
        dVar.mo31155a(i);
        return true;
    }

    /* renamed from: m */
    private final long m47384m(C8791m mVar, boolean z) {
        C8787i iVar;
        do {
            iVar = (C8787i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f35164h.mo31036Y() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C8790l.f35170e.mo31039a() - iVar.f35163g;
            long j = C8790l.f35166a;
            if (a < j) {
                return j - a;
            }
        } while (!f35171b.compareAndSet(mVar, iVar, (Object) null));
        m47379b(this, iVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C8787i mo31042a(C8787i iVar, boolean z) {
        if (z) {
            return m47380c(iVar);
        }
        C8787i iVar2 = (C8787i) f35171b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return m47380c(iVar2);
    }

    /* renamed from: e */
    public final int mo31043e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo31044f() {
        return this.lastScheduledTask != null ? mo31043e() + 1 : mo31043e();
    }

    /* renamed from: g */
    public final void mo31045g(C8782d dVar) {
        C8787i iVar = (C8787i) f35171b.getAndSet(this, (Object) null);
        if (iVar != null) {
            dVar.mo31155a(iVar);
        }
        do {
        } while (m47383j(dVar));
    }

    /* renamed from: h */
    public final C8787i mo31046h() {
        C8787i iVar = (C8787i) f35171b.getAndSet(this, (Object) null);
        return iVar == null ? m47382i() : iVar;
    }

    /* renamed from: k */
    public final long mo31047k(C8791m mVar) {
        if (C8919v0.m47824a()) {
            if (!(mo31043e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = mVar.producerIndex;
        AtomicReferenceArray<C8787i> atomicReferenceArray = mVar.f35175a;
        for (int i2 = mVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            C8787i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if ((iVar.f35164h.mo31036Y() == 1) && atomicReferenceArray.compareAndSet(i3, iVar, (Object) null)) {
                    f35174e.decrementAndGet(mVar);
                    m47379b(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m47384m(mVar, true);
    }

    /* renamed from: l */
    public final long mo31048l(C8791m mVar) {
        boolean z = true;
        if (C8919v0.m47824a()) {
            if (!(mo31043e() == 0)) {
                throw new AssertionError();
            }
        }
        C8787i i = mVar.m47382i();
        if (i == null) {
            return m47384m(mVar, false);
        }
        C8787i b = m47379b(this, i, false, 2, (Object) null);
        if (!C8919v0.m47824a()) {
            return -1;
        }
        if (b != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}
