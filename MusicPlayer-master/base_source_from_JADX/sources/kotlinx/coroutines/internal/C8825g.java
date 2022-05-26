package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8686d1;
import kotlinx.coroutines.C8767g0;
import kotlinx.coroutines.C8861j0;
import kotlinx.coroutines.C8866k1;
import kotlinx.coroutines.C8876m0;
import kotlinx.coroutines.C8894q;
import kotlinx.coroutines.C8901r;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.C8923w0;
import kotlinx.coroutines.C8929x2;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.internal.g */
/* compiled from: DispatchedContinuation.kt */
public final class C8825g<T> extends C8686d1<T> implements C8532e, C8508d<T> {

    /* renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35214n = AtomicReferenceFieldUpdater.newUpdater(C8825g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: j */
    public final C8876m0 f35215j;

    /* renamed from: k */
    public final C8508d<T> f35216k;

    /* renamed from: l */
    public Object f35217l = C8827h.f35223a;

    /* renamed from: m */
    public final Object f35218m = C8817d0.m47526b(getContext());

    public C8825g(C8876m0 m0Var, C8508d<? super T> dVar) {
        super(-1);
        this.f35215j = m0Var;
        this.f35216k = dVar;
    }

    /* renamed from: n */
    private final C8901r<?> m47547n() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C8901r) {
            return (C8901r) obj;
        }
        return null;
    }

    /* renamed from: a */
    public void mo30899a(Object obj, Throwable th) {
        if (obj instanceof C8767g0) {
            ((C8767g0) obj).f35121b.invoke(th);
        }
    }

    /* renamed from: c */
    public C8508d<T> mo30900c() {
        return this;
    }

    public C8532e getCallerFrame() {
        C8508d<T> dVar = this.f35216k;
        if (dVar instanceof C8532e) {
            return (C8532e) dVar;
        }
        return null;
    }

    public C8513g getContext() {
        return this.f35216k.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: k */
    public Object mo30904k() {
        Object obj = this.f35217l;
        if (C8919v0.m47824a()) {
            if (!(obj != C8827h.f35223a)) {
                throw new AssertionError();
            }
        }
        this.f35217l = C8827h.f35223a;
        return obj;
    }

    /* renamed from: l */
    public final void mo31121l() {
        do {
        } while (this._reusableCancellableContinuation == C8827h.f35224b);
    }

    /* renamed from: m */
    public final C8901r<T> mo31122m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C8827h.f35224b;
                return null;
            } else if (obj instanceof C8901r) {
                if (f35214n.compareAndSet(this, obj, C8827h.f35224b)) {
                    return (C8901r) obj;
                }
            } else if (obj != C8827h.f35224b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(C8594l.m46777k("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: o */
    public final boolean mo31123o() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: p */
    public final boolean mo31124p(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C8859z zVar = C8827h.f35224b;
            if (C8594l.m46767a(obj, zVar)) {
                if (f35214n.compareAndSet(this, zVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f35214n.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo31125q() {
        mo31121l();
        C8901r<?> n = m47547n();
        if (n != null) {
            n.mo31233r();
        }
    }

    /* renamed from: r */
    public final Throwable mo31126r(C8894q<?> qVar) {
        C8859z zVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            zVar = C8827h.f35224b;
            if (obj != zVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C8594l.m46777k("Inconsistent state ", obj).toString());
                } else if (f35214n.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f35214n.compareAndSet(this, zVar, qVar));
        return null;
    }

    public void resumeWith(Object obj) {
        C8513g context;
        Object c;
        C8513g context2 = this.f35216k.getContext();
        Object d = C8861j0.m47661d(obj, (C8570l) null, 1, (Object) null);
        if (this.f35215j.mo30867O0(context2)) {
            this.f35217l = d;
            this.f35048i = 0;
            this.f35215j.mo30866N0(context2, this);
            return;
        }
        boolean a = C8919v0.m47824a();
        C8866k1 b = C8929x2.f35315a.mo31251b();
        if (b.mo31183W0()) {
            this.f35217l = d;
            this.f35048i = 0;
            b.mo31180S0(this);
            return;
        }
        b.mo31182U0(true);
        try {
            context = getContext();
            c = C8817d0.m47527c(context, this.f35218m);
            this.f35216k.resumeWith(obj);
            C8457t tVar = C8457t.f34900a;
            C8817d0.m47525a(context, c);
            do {
            } while (b.mo31186Z0());
        } catch (Throwable th) {
            try {
                mo30903j(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo31179P0(true);
                throw th2;
            }
        }
        b.mo31179P0(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f35215j + ", " + C8923w0.m47835c(this.f35216k) + ']';
    }
}
