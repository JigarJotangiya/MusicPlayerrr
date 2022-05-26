package kotlinx.coroutines;

import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.a3 */
/* compiled from: Unconfined.kt */
public final class C8668a3 extends C8876m0 {

    /* renamed from: h */
    public static final C8668a3 f35032h = new C8668a3();

    private C8668a3() {
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        C8688d3 d3Var = (C8688d3) gVar.get(C8688d3.f35050h);
        if (d3Var != null) {
            d3Var.f35051g = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: O0 */
    public boolean mo30867O0(C8513g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
