package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8842o;
import p369i.C8457t;

/* renamed from: kotlinx.coroutines.q2 */
/* compiled from: CancellableContinuation.kt */
final class C8900q2 extends C8772h {

    /* renamed from: g */
    private final C8842o f35289g;

    public C8900q2(C8842o oVar) {
        this.f35289g = oVar;
    }

    /* renamed from: a */
    public void mo30936a(Throwable th) {
        this.f35289g.mo31140u();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo30936a((Throwable) obj);
        return C8457t.f34900a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f35289g + ']';
    }
}
