package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7613s;

/* renamed from: f.f.b.c.a.d.t */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7647t<ResultT> extends C7632e<ResultT> {

    /* renamed from: a */
    private final Object f33011a = new Object();

    /* renamed from: b */
    private final C7642o<ResultT> f33012b = new C7642o<>();

    /* renamed from: c */
    private boolean f33013c;

    /* renamed from: d */
    private ResultT f33014d;

    /* renamed from: e */
    private Exception f33015e;

    C7647t() {
    }

    /* renamed from: l */
    private final void m42470l() {
        C7613s.m42416b(this.f33013c, "Task is not yet complete");
    }

    /* renamed from: m */
    private final void m42471m() {
        C7613s.m42416b(!this.f33013c, "Task is already complete");
    }

    /* renamed from: n */
    private final void m42472n() {
        synchronized (this.f33011a) {
            if (this.f33013c) {
                this.f33012b.mo28631b(this);
            }
        }
    }

    /* renamed from: a */
    public final C7632e<ResultT> mo28619a(C7628a<ResultT> aVar) {
        this.f33012b.mo28630a(new C7636i(C7633f.f32989a, aVar));
        m42472n();
        return this;
    }

    /* renamed from: b */
    public final C7632e<ResultT> mo28620b(Executor executor, C7629b bVar) {
        this.f33012b.mo28630a(new C7638k(executor, bVar));
        m42472n();
        return this;
    }

    /* renamed from: c */
    public final C7632e<ResultT> mo28621c(Executor executor, C7630c<? super ResultT> cVar) {
        this.f33012b.mo28630a(new C7640m(executor, cVar));
        m42472n();
        return this;
    }

    /* renamed from: d */
    public final Exception mo28622d() {
        Exception exc;
        synchronized (this.f33011a) {
            exc = this.f33015e;
        }
        return exc;
    }

    /* renamed from: e */
    public final ResultT mo28623e() {
        ResultT resultt;
        synchronized (this.f33011a) {
            m42470l();
            Exception exc = this.f33015e;
            if (exc == null) {
                resultt = this.f33014d;
            } else {
                throw new C7631d(exc);
            }
        }
        return resultt;
    }

    /* renamed from: f */
    public final boolean mo28624f() {
        boolean z;
        synchronized (this.f33011a) {
            z = this.f33013c;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo28625g() {
        boolean z;
        synchronized (this.f33011a) {
            z = false;
            if (this.f33013c && this.f33015e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final void mo28639h(Exception exc) {
        synchronized (this.f33011a) {
            m42471m();
            this.f33013c = true;
            this.f33015e = exc;
        }
        this.f33012b.mo28631b(this);
    }

    /* renamed from: i */
    public final void mo28640i(ResultT resultt) {
        synchronized (this.f33011a) {
            m42471m();
            this.f33013c = true;
            this.f33014d = resultt;
        }
        this.f33012b.mo28631b(this);
    }

    /* renamed from: j */
    public final boolean mo28641j(Exception exc) {
        synchronized (this.f33011a) {
            if (this.f33013c) {
                return false;
            }
            this.f33013c = true;
            this.f33015e = exc;
            this.f33012b.mo28631b(this);
            return true;
        }
    }

    /* renamed from: k */
    public final boolean mo28642k(ResultT resultt) {
        synchronized (this.f33011a) {
            if (this.f33013c) {
                return false;
            }
            this.f33013c = true;
            this.f33014d = resultt;
            this.f33012b.mo28631b(this);
            return true;
        }
    }
}
