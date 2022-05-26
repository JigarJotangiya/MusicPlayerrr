package kotlinx.coroutines;

import java.util.concurrent.Future;
import p369i.C8457t;

/* renamed from: kotlinx.coroutines.n */
/* compiled from: Future.kt */
final class C8881n extends C8885o {

    /* renamed from: g */
    private final Future<?> f35280g;

    public C8881n(Future<?> future) {
        this.f35280g = future;
    }

    /* renamed from: a */
    public void mo30936a(Throwable th) {
        if (th != null) {
            this.f35280g.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo30936a((Throwable) obj);
        return C8457t.f34900a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f35280g + ']';
    }
}
