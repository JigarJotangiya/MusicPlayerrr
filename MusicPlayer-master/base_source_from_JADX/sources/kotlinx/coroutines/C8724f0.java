package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.f0 */
/* compiled from: CompletionState.kt */
public class C8724f0 {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35090b = AtomicIntegerFieldUpdater.newUpdater(C8724f0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f35091a;

    public C8724f0(Throwable th, boolean z) {
        this.f35091a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo30971a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo30972b() {
        return f35090b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C8923w0.m47833a(this) + '[' + this.f35091a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8724f0(Throwable th, boolean z, int i, C8589g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
