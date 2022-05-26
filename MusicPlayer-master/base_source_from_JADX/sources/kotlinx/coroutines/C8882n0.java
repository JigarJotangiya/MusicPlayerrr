package kotlinx.coroutines;

import java.util.List;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.n0 */
/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class C8882n0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f35281a = C8414h.m46466f(C8411f.m46461a(C0000a.m0a()));

    /* renamed from: a */
    public static final void m47738a(C8513g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : f35281a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C8886o0.m47743b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
