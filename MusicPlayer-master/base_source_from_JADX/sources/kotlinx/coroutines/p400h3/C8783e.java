package kotlinx.coroutines.p400h3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C8897q1;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.h3.e */
/* compiled from: Dispatcher.kt */
final class C8783e extends C8897q1 implements C8788j, Executor {

    /* renamed from: m */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35154m = AtomicIntegerFieldUpdater.newUpdater(C8783e.class, "inFlightTasks");

    /* renamed from: h */
    private final C8781c f35155h;

    /* renamed from: i */
    private final int f35156i;
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: j */
    private final String f35157j;

    /* renamed from: k */
    private final int f35158k;

    /* renamed from: l */
    private final ConcurrentLinkedQueue<Runnable> f35159l = new ConcurrentLinkedQueue<>();

    public C8783e(C8781c cVar, int i, String str, int i2) {
        this.f35155h = cVar;
        this.f35156i = i;
        this.f35157j = str;
        this.f35158k = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47369P0(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f35154m
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f35156i
            if (r1 > r2) goto L_0x0010
            kotlinx.coroutines.h3.c r0 = r3.f35155h
            r0.mo31034Q0(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f35159l
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f35156i
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f35159l
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p400h3.C8783e.m47369P0(java.lang.Runnable, boolean):void");
    }

    /* renamed from: E */
    public void mo31035E() {
        Runnable poll = this.f35159l.poll();
        if (poll != null) {
            this.f35155h.mo31034Q0(poll, this, true);
            return;
        }
        f35154m.decrementAndGet(this);
        Runnable poll2 = this.f35159l.poll();
        if (poll2 != null) {
            m47369P0(poll2, true);
        }
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        m47369P0(runnable, false);
    }

    /* renamed from: Y */
    public int mo31036Y() {
        return this.f35158k;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        m47369P0(runnable, false);
    }

    public String toString() {
        String str = this.f35157j;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f35155h + ']';
    }
}
