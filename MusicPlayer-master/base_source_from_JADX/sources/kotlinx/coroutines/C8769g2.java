package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.g2 */
/* compiled from: Job.kt */
final /* synthetic */ class C8769g2 {
    /* renamed from: a */
    public static final C8685d0 m47304a(C8665a2 a2Var) {
        return new C8687d2(a2Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C8685d0 m47305b(C8665a2 a2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            a2Var = null;
        }
        return C8693e2.m47141a(a2Var);
    }

    /* renamed from: c */
    public static final void m47306c(C8513g gVar, CancellationException cancellationException) {
        C8665a2 a2Var = (C8665a2) gVar.get(C8665a2.f35030f);
        if (a2Var != null) {
            a2Var.mo30865z0(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m47307d(C8513g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C8693e2.m47143c(gVar, cancellationException);
    }

    /* renamed from: e */
    public static final void m47308e(C8513g gVar) {
        C8665a2 a2Var = (C8665a2) gVar.get(C8665a2.f35030f);
        if (a2Var != null) {
            C8693e2.m47147g(a2Var);
        }
    }

    /* renamed from: f */
    public static final void m47309f(C8665a2 a2Var) {
        if (!a2Var.mo30862c()) {
            throw a2Var.mo30860K();
        }
    }
}
