package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8810a;

/* renamed from: kotlinx.coroutines.k1 */
/* compiled from: EventLoop.common.kt */
public abstract class C8866k1 extends C8876m0 {

    /* renamed from: h */
    private long f35266h;

    /* renamed from: i */
    private boolean f35267i;

    /* renamed from: j */
    private C8810a<C8686d1<?>> f35268j;

    /* renamed from: Q0 */
    public static /* synthetic */ void m47677Q0(C8866k1 k1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            k1Var.mo31179P0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: R0 */
    private final long m47678R0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m47679V0(C8866k1 k1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            k1Var.mo31182U0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: P0 */
    public final void mo31179P0(boolean z) {
        long R0 = this.f35266h - m47678R0(z);
        this.f35266h = R0;
        if (R0 <= 0) {
            if (C8919v0.m47824a()) {
                if (!(this.f35266h == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f35267i) {
                shutdown();
            }
        }
    }

    /* renamed from: S0 */
    public final void mo31180S0(C8686d1<?> d1Var) {
        C8810a<C8686d1<?>> aVar = this.f35268j;
        if (aVar == null) {
            aVar = new C8810a<>();
            this.f35268j = aVar;
        }
        aVar.mo31098a(d1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public long mo31181T0() {
        C8810a<C8686d1<?>> aVar = this.f35268j;
        if (aVar != null && !aVar.mo31099c()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: U0 */
    public final void mo31182U0(boolean z) {
        this.f35266h += m47678R0(z);
        if (!z) {
            this.f35267i = true;
        }
    }

    /* renamed from: W0 */
    public final boolean mo31183W0() {
        return this.f35266h >= m47678R0(true);
    }

    /* renamed from: X0 */
    public final boolean mo31184X0() {
        C8810a<C8686d1<?>> aVar = this.f35268j;
        if (aVar == null) {
            return true;
        }
        return aVar.mo31099c();
    }

    /* renamed from: Y0 */
    public long mo31185Y0() {
        return !mo31186Z0() ? Long.MAX_VALUE : 0;
    }

    /* renamed from: Z0 */
    public final boolean mo31186Z0() {
        C8686d1 d;
        C8810a<C8686d1<?>> aVar = this.f35268j;
        if (aVar == null || (d = aVar.mo31100d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    /* renamed from: a1 */
    public boolean mo31187a1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }
}
