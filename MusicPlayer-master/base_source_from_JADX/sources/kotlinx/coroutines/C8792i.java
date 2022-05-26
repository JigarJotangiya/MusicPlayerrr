package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.i */
/* compiled from: Builders.kt */
final class C8792i<T> extends C8684d<T> {

    /* renamed from: i */
    private final Thread f35176i;

    /* renamed from: j */
    private final C8866k1 f35177j;

    public C8792i(C8513g gVar, Thread thread, C8866k1 k1Var) {
        super(gVar, true, true);
        this.f35176i = thread;
        this.f35177j = k1Var;
    }

    /* renamed from: B0 */
    public final T mo31049B0() {
        C8690e a = C8723f.m47251a();
        if (a != null) {
            a.mo30909c();
        }
        try {
            C8866k1 k1Var = this.f35177j;
            C8724f0 f0Var = null;
            if (k1Var != null) {
                C8866k1.m47679V0(k1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                C8866k1 k1Var2 = this.f35177j;
                long Y0 = k1Var2 == null ? Long.MAX_VALUE : k1Var2.mo31185Y0();
                if (mo31056O()) {
                    C8866k1 k1Var3 = this.f35177j;
                    if (k1Var3 != null) {
                        C8866k1.m47677Q0(k1Var3, false, 1, (Object) null);
                    }
                    C8690e a2 = C8723f.m47251a();
                    if (a2 != null) {
                        a2.mo30913g();
                    }
                    T h = C8863j2.m47671h(mo31053J());
                    if (h instanceof C8724f0) {
                        f0Var = (C8724f0) h;
                    }
                    if (f0Var == null) {
                        return h;
                    }
                    throw f0Var.f35091a;
                }
                C8690e a3 = C8723f.m47251a();
                if (a3 == null) {
                    LockSupport.parkNanos(this, Y0);
                } else {
                    a3.mo30908b(this, Y0);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo31066o(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C8690e a4 = C8723f.m47251a();
            if (a4 != null) {
                a4.mo30913g();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo31050P() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo30891l(Object obj) {
        if (!C8594l.m46767a(Thread.currentThread(), this.f35176i)) {
            Thread thread = this.f35176i;
            C8690e a = C8723f.m47251a();
            if (a == null) {
                LockSupport.unpark(thread);
            } else {
                a.mo30912f(thread);
            }
        }
    }
}
