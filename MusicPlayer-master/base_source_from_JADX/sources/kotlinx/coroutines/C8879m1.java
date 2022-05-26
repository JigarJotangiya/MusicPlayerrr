package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C8870l1;

/* renamed from: kotlinx.coroutines.m1 */
/* compiled from: EventLoop.kt */
public abstract class C8879m1 extends C8866k1 {
    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public abstract Thread mo31177b1();

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void mo31201c1(long j, C8870l1.C8872b bVar) {
        if (C8919v0.m47824a()) {
            if (!(this != C8927x0.f35312m)) {
                throw new AssertionError();
            }
        }
        C8927x0.f35312m.mo31192n1(j, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public final void mo31202d1() {
        Thread b1 = mo31177b1();
        if (Thread.currentThread() != b1) {
            C8690e a = C8723f.m47251a();
            if (a == null) {
                LockSupport.unpark(b1);
            } else {
                a.mo30912f(b1);
            }
        }
    }
}
