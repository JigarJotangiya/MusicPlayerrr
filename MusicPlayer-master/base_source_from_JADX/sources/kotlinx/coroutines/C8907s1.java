package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: kotlinx.coroutines.s1 */
/* compiled from: Executors.kt */
public final class C8907s1 {
    /* renamed from: a */
    public static final C8876m0 m47811a(Executor executor) {
        C8725f1 f1Var = executor instanceof C8725f1 ? (C8725f1) executor : null;
        return f1Var == null ? new C8903r1(executor) : f1Var.f35092g;
    }

    /* renamed from: b */
    public static final C8897q1 m47812b(ExecutorService executorService) {
        return new C8903r1(executorService);
    }
}
