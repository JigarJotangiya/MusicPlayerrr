package kotlinx.coroutines;

import p369i.C8447l;

/* renamed from: kotlinx.coroutines.c0 */
/* compiled from: CompletableDeferred.kt */
public final class C8680c0 {
    /* renamed from: a */
    public static final <T> C8663a0<T> m47097a(C8665a2 a2Var) {
        return new C8675b0(a2Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C8663a0 m47098b(C8665a2 a2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            a2Var = null;
        }
        return m47097a(a2Var);
    }

    /* renamed from: c */
    public static final <T> boolean m47099c(C8663a0<T> a0Var, Object obj) {
        Throwable r0 = C8447l.m50329exceptionOrNullimpl(obj);
        return r0 == null ? a0Var.mo30857o0(obj) : a0Var.mo30856n0(r0);
    }
}
