package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8825g;
import kotlinx.coroutines.internal.C8842o;
import p369i.p379w.C8508d;

/* renamed from: kotlinx.coroutines.t */
/* compiled from: CancellableContinuation.kt */
public final class C8909t {
    /* renamed from: a */
    public static final void m47813a(C8894q<?> qVar, C8774h1 h1Var) {
        qVar.mo31216b(new C8794i1(h1Var));
    }

    /* renamed from: b */
    public static final <T> C8901r<T> m47814b(C8508d<? super T> dVar) {
        if (!(dVar instanceof C8825g)) {
            return new C8901r<>(dVar, 1);
        }
        C8901r<T> m = ((C8825g) dVar).mo31122m();
        if (m == null || !m.mo31229H()) {
            m = null;
        }
        return m == null ? new C8901r<>(dVar, 2) : m;
    }

    /* renamed from: c */
    public static final void m47815c(C8894q<?> qVar, C8842o oVar) {
        qVar.mo31216b(new C8900q2(oVar));
    }
}
