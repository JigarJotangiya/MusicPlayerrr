package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C8827h;
import kotlinx.coroutines.internal.C8857x;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.c1 */
/* compiled from: Builders.common.kt */
public final class C8681c1<T> extends C8857x<T> {

    /* renamed from: j */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35045j = AtomicIntegerFieldUpdater.newUpdater(C8681c1.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C8681c1(C8513g gVar, C8508d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* renamed from: D0 */
    private final boolean m47100D0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35045j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: E0 */
    private final boolean m47101E0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35045j.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: C0 */
    public final Object mo30890C0() {
        if (m47101E0()) {
            return C8527d.m46722d();
        }
        Object h = C8863j2.m47671h(mo31053J());
        if (!(h instanceof C8724f0)) {
            return h;
        }
        throw ((C8724f0) h).f35091a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo30891l(Object obj) {
        mo30888w0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo30888w0(Object obj) {
        if (!m47100D0()) {
            C8827h.m47561c(C8522c.m46721c(this.f35254i), C8861j0.m47658a(obj, this.f35254i), (C8570l) null, 2, (Object) null);
        }
    }
}
