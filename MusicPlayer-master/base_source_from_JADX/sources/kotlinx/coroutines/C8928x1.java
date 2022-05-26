package kotlinx.coroutines;

import p369i.C8457t;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.x1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C8928x1 extends C8885o {

    /* renamed from: g */
    private final C8570l<Throwable, C8457t> f35314g;

    public C8928x1(C8570l<? super Throwable, C8457t> lVar) {
        this.f35314g = lVar;
    }

    /* renamed from: a */
    public void mo30936a(Throwable th) {
        this.f35314g.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo30936a((Throwable) obj);
        return C8457t.f34900a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C8923w0.m47833a(this.f35314g) + '@' + C8923w0.m47834b(this) + ']';
    }
}
