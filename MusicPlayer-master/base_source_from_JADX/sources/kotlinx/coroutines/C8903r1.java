package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C8821e;
import p369i.C8457t;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.r1 */
/* compiled from: Executors.kt */
public final class C8903r1 extends C8897q1 implements C8664a1 {

    /* renamed from: h */
    private final Executor f35295h;

    public C8903r1(Executor executor) {
        this.f35295h = executor;
        C8821e.m47528a(mo31238Q0());
    }

    /* renamed from: P0 */
    private final void m47802P0(C8513g gVar, RejectedExecutionException rejectedExecutionException) {
        C8693e2.m47143c(gVar, C8892p1.m47753a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: R0 */
    private final ScheduledFuture<?> m47803R0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C8513g gVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m47802P0(gVar, e);
            return null;
        }
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        try {
            Executor Q0 = mo31238Q0();
            C8690e a = C8723f.m47251a();
            Q0.execute(a == null ? runnable : a.mo30914h(runnable));
        } catch (RejectedExecutionException e) {
            C8690e a2 = C8723f.m47251a();
            if (a2 != null) {
                a2.mo30911e();
            }
            m47802P0(gVar, e);
            C8768g1.m47302b().mo30866N0(gVar, runnable);
        }
    }

    /* renamed from: Q0 */
    public Executor mo31238Q0() {
        return this.f35295h;
    }

    public void close() {
        Executor Q0 = mo31238Q0();
        ExecutorService executorService = Q0 instanceof ExecutorService ? (ExecutorService) Q0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8903r1) && ((C8903r1) obj).mo31238Q0() == mo31238Q0();
    }

    public int hashCode() {
        return System.identityHashCode(mo31238Q0());
    }

    public String toString() {
        return mo31238Q0().toString();
    }

    /* renamed from: x */
    public void mo30858x(long j, C8894q<? super C8457t> qVar) {
        Executor Q0 = mo31238Q0();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = Q0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) Q0 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = m47803R0(scheduledExecutorService, new C8908s2(this, qVar), qVar.getContext(), j);
        }
        if (scheduledFuture != null) {
            C8693e2.m47145e(qVar, scheduledFuture);
        } else {
            C8927x0.f35312m.mo30858x(j, qVar);
        }
    }
}
