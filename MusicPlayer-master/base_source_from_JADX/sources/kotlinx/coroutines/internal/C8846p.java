package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.p */
/* compiled from: LockFreeTaskQueue.kt */
public class C8846p<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35237a = AtomicReferenceFieldUpdater.newUpdater(C8846p.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C8846p(boolean z) {
        this._cur = new C8847q(8, z);
    }

    /* renamed from: a */
    public final boolean mo31155a(E e) {
        while (true) {
            C8847q qVar = (C8847q) this._cur;
            int a = qVar.mo31159a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f35237a.compareAndSet(this, qVar, qVar.mo31163i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo31156b() {
        while (true) {
            C8847q qVar = (C8847q) this._cur;
            if (!qVar.mo31160d()) {
                f35237a.compareAndSet(this, qVar, qVar.mo31163i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo31157c() {
        return ((C8847q) this._cur).mo31161f();
    }

    /* renamed from: d */
    public final E mo31158d() {
        while (true) {
            C8847q qVar = (C8847q) this._cur;
            E j = qVar.mo31164j();
            if (j != C8847q.f35241h) {
                return j;
            }
            f35237a.compareAndSet(this, qVar, qVar.mo31163i());
        }
    }
}
