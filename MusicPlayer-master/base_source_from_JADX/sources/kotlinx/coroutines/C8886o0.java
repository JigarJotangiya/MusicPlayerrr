package kotlinx.coroutines;

import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.o0 */
/* compiled from: CoroutineExceptionHandler.kt */
public final class C8886o0 {
    /* renamed from: a */
    public static final void m47742a(C8513g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f35027e);
            if (coroutineExceptionHandler == null) {
                C8882n0.m47738a(gVar, th);
            } else {
                coroutineExceptionHandler.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C8882n0.m47738a(gVar, m47743b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m47743b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C8375b.m46425a(runtimeException, th);
        return runtimeException;
    }
}
