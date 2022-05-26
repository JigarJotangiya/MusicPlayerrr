package p369i.p379w.p381j.p382a;

import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;

/* renamed from: i.w.j.a.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C8538j extends C8528a {
    public C8538j(C8508d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C8519h.INSTANCE)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C8513g getContext() {
        return C8519h.INSTANCE;
    }
}
