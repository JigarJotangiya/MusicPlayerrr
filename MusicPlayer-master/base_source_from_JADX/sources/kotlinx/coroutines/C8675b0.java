package kotlinx.coroutines;

import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.b0 */
/* compiled from: CompletableDeferred.kt */
final class C8675b0<T> extends C8795i2 implements C8663a0<T> {
    public C8675b0(C8665a2 a2Var) {
        super(true);
        mo31055N(a2Var);
    }

    /* renamed from: F */
    public boolean mo30879F() {
        return true;
    }

    /* renamed from: Q */
    public Object mo30880Q(C8508d<? super T> dVar) {
        return mo31065m(dVar);
    }

    /* renamed from: n0 */
    public boolean mo30856n0(Throwable th) {
        return mo31057S(new C8724f0(th, false, 2, (C8589g) null));
    }

    /* renamed from: o0 */
    public boolean mo30857o0(T t) {
        return mo31057S(t);
    }
}
