package kotlinx.coroutines;

import p369i.C8457t;

/* renamed from: kotlinx.coroutines.i1 */
/* compiled from: CancellableContinuation.kt */
final class C8794i1 extends C8885o {

    /* renamed from: g */
    private final C8774h1 f35178g;

    public C8794i1(C8774h1 h1Var) {
        this.f35178g = h1Var;
    }

    /* renamed from: a */
    public void mo30936a(Throwable th) {
        this.f35178g.mo31008k();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo30936a((Throwable) obj);
        return C8457t.f34900a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f35178g + ']';
    }
}
