package p159f.p243f.p245b.p246a.p303f;

import com.google.android.gms.common.internal.C3292l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.b0 */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7463b0<TResult> extends C7470h<TResult> {

    /* renamed from: a */
    private final Object f32636a = new Object();

    /* renamed from: b */
    private final C7487y<TResult> f32637b = new C7487y<>();

    /* renamed from: c */
    private boolean f32638c;

    /* renamed from: d */
    private volatile boolean f32639d;

    /* renamed from: e */
    private TResult f32640e;

    /* renamed from: f */
    private Exception f32641f;

    C7463b0() {
    }

    /* renamed from: s */
    private final void m41869s() {
        C3292l.m14243k(this.f32638c, "Task is not yet complete");
    }

    /* renamed from: t */
    private final void m41870t() {
        if (this.f32638c) {
            throw C7462b.m41868of(this);
        }
    }

    /* renamed from: u */
    private final void m41871u() {
        if (this.f32639d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: v */
    private final void m41872v() {
        synchronized (this.f32636a) {
            if (this.f32638c) {
                this.f32637b.mo28365b(this);
            }
        }
    }

    /* renamed from: a */
    public final C7470h<TResult> mo28331a(Executor executor, C7464c cVar) {
        this.f32637b.mo28364a(new C7479q(executor, cVar));
        m41872v();
        return this;
    }

    /* renamed from: b */
    public final C7470h<TResult> mo28332b(C7466d<TResult> dVar) {
        this.f32637b.mo28364a(new C7481s(C7472j.f32645a, dVar));
        m41872v();
        return this;
    }

    /* renamed from: c */
    public final C7470h<TResult> mo28333c(Executor executor, C7466d<TResult> dVar) {
        this.f32637b.mo28364a(new C7481s(executor, dVar));
        m41872v();
        return this;
    }

    /* renamed from: d */
    public final C7470h<TResult> mo28334d(Executor executor, C7467e eVar) {
        this.f32637b.mo28364a(new C7483u(executor, eVar));
        m41872v();
        return this;
    }

    /* renamed from: e */
    public final C7470h<TResult> mo28335e(Executor executor, C7468f<? super TResult> fVar) {
        this.f32637b.mo28364a(new C7485w(executor, fVar));
        m41872v();
        return this;
    }

    /* renamed from: f */
    public final <TContinuationResult> C7470h<TContinuationResult> mo28336f(Executor executor, C7460a<TResult, TContinuationResult> aVar) {
        C7463b0 b0Var = new C7463b0();
        this.f32637b.mo28364a(new C7475m(executor, aVar, b0Var));
        m41872v();
        return b0Var;
    }

    /* renamed from: g */
    public final <TContinuationResult> C7470h<TContinuationResult> mo28337g(C7460a<TResult, C7470h<TContinuationResult>> aVar) {
        return mo28338h(C7472j.f32645a, aVar);
    }

    /* renamed from: h */
    public final <TContinuationResult> C7470h<TContinuationResult> mo28338h(Executor executor, C7460a<TResult, C7470h<TContinuationResult>> aVar) {
        C7463b0 b0Var = new C7463b0();
        this.f32637b.mo28364a(new C7477o(executor, aVar, b0Var));
        m41872v();
        return b0Var;
    }

    /* renamed from: i */
    public final Exception mo28339i() {
        Exception exc;
        synchronized (this.f32636a) {
            exc = this.f32641f;
        }
        return exc;
    }

    /* renamed from: j */
    public final TResult mo28340j() {
        TResult tresult;
        synchronized (this.f32636a) {
            m41869s();
            m41871u();
            Exception exc = this.f32641f;
            if (exc == null) {
                tresult = this.f32640e;
            } else {
                throw new C7469g(exc);
            }
        }
        return tresult;
    }

    /* renamed from: k */
    public final boolean mo28341k() {
        return this.f32639d;
    }

    /* renamed from: l */
    public final boolean mo28342l() {
        boolean z;
        synchronized (this.f32636a) {
            z = this.f32638c;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo28343m() {
        boolean z;
        synchronized (this.f32636a) {
            z = false;
            if (this.f32638c && !this.f32639d && this.f32641f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: n */
    public final void mo28344n(TResult tresult) {
        synchronized (this.f32636a) {
            m41870t();
            this.f32638c = true;
            this.f32640e = tresult;
        }
        this.f32637b.mo28365b(this);
    }

    /* renamed from: o */
    public final boolean mo28345o(TResult tresult) {
        synchronized (this.f32636a) {
            if (this.f32638c) {
                return false;
            }
            this.f32638c = true;
            this.f32640e = tresult;
            this.f32637b.mo28365b(this);
            return true;
        }
    }

    /* renamed from: p */
    public final void mo28346p(Exception exc) {
        C3292l.m14241i(exc, "Exception must not be null");
        synchronized (this.f32636a) {
            m41870t();
            this.f32638c = true;
            this.f32641f = exc;
        }
        this.f32637b.mo28365b(this);
    }

    /* renamed from: q */
    public final boolean mo28347q(Exception exc) {
        C3292l.m14241i(exc, "Exception must not be null");
        synchronized (this.f32636a) {
            if (this.f32638c) {
                return false;
            }
            this.f32638c = true;
            this.f32641f = exc;
            this.f32637b.mo28365b(this);
            return true;
        }
    }

    /* renamed from: r */
    public final boolean mo28348r() {
        synchronized (this.f32636a) {
            if (this.f32638c) {
                return false;
            }
            this.f32638c = true;
            this.f32639d = true;
            this.f32637b.mo28365b(this);
            return true;
        }
    }
}
