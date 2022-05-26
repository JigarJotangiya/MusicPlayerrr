package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.internal.C8825g;
import kotlinx.coroutines.internal.C8858y;
import kotlinx.coroutines.internal.C8859z;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.r */
/* compiled from: CancellableContinuationImpl.kt */
public class C8901r<T> extends C8686d1<T> implements C8894q<T>, C8532e {

    /* renamed from: m */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f35290m = AtomicIntegerFieldUpdater.newUpdater(C8901r.class, "_decision");

    /* renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35291n = AtomicReferenceFieldUpdater.newUpdater(C8901r.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: j */
    private final C8508d<T> f35292j;

    /* renamed from: k */
    private final C8513g f35293k;

    /* renamed from: l */
    private C8774h1 f35294l;

    public C8901r(C8508d<? super T> dVar, int i) {
        super(i);
        this.f35292j = dVar;
        if (C8919v0.m47824a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f35293k = dVar.getContext();
        this._decision = 0;
        this._state = C8766g.f35119g;
    }

    /* renamed from: B */
    private final boolean m47762B() {
        return C8692e1.m47138c(this.f35048i) && ((C8825g) this.f35292j).mo31123o();
    }

    /* renamed from: C */
    private final C8885o m47763C(C8570l<? super Throwable, C8457t> lVar) {
        return lVar instanceof C8885o ? (C8885o) lVar : new C8928x1(lVar);
    }

    /* renamed from: D */
    private final void m47764D(C8570l<? super Throwable, C8457t> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: G */
    private final void m47765G() {
        C8508d<T> dVar = this.f35292j;
        Throwable th = null;
        C8825g gVar = dVar instanceof C8825g ? (C8825g) dVar : null;
        if (gVar != null) {
            th = gVar.mo31126r(this);
        }
        if (th != null) {
            mo31233r();
            mo31232p(th);
        }
    }

    /* renamed from: I */
    private final void m47766I(Object obj, int i, C8570l<? super Throwable, C8457t> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C8888o2) {
            } else {
                if (obj2 instanceof C8914u) {
                    C8914u uVar = (C8914u) obj2;
                    if (uVar.mo31246c()) {
                        if (lVar != null) {
                            mo31231o(lVar, uVar.f35091a);
                            return;
                        }
                        return;
                    }
                }
                m47772l(obj);
                throw null;
            }
        } while (!f35291n.compareAndSet(this, obj2, m47768K((C8888o2) obj2, obj, i, lVar, (Object) null)));
        m47775s();
        m47776t(i);
    }

    /* renamed from: J */
    static /* synthetic */ void m47767J(C8901r rVar, Object obj, int i, C8570l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            rVar.m47766I(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: K */
    private final Object m47768K(C8888o2 o2Var, Object obj, int i, C8570l<? super Throwable, C8457t> lVar, Object obj2) {
        if (obj instanceof C8724f0) {
            boolean z = true;
            if (C8919v0.m47824a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C8919v0.m47824a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!C8692e1.m47137b(i) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(o2Var instanceof C8885o) || (o2Var instanceof C8772h)) && obj2 == null)) {
                return obj;
            }
            return new C8691e0(obj, o2Var instanceof C8885o ? (C8885o) o2Var : null, lVar, obj2, (Throwable) null, 16, (C8589g) null);
        }
    }

    /* renamed from: L */
    private final boolean m47769L() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35290m.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: M */
    private final C8859z m47770M(Object obj, Object obj2, C8570l<? super Throwable, C8457t> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C8888o2) {
            } else if (!(obj3 instanceof C8691e0) || obj2 == null) {
                return null;
            } else {
                C8691e0 e0Var = (C8691e0) obj3;
                if (e0Var.f35055d != obj2) {
                    return null;
                }
                if (!C8919v0.m47824a() || C8594l.m46767a(e0Var.f35052a, obj)) {
                    return C8905s.f35297a;
                }
                throw new AssertionError();
            }
        } while (!f35291n.compareAndSet(this, obj3, m47768K((C8888o2) obj3, obj, this.f35048i, lVar, obj2)));
        m47775s();
        return C8905s.f35297a;
    }

    /* renamed from: N */
    private final boolean m47771N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35290m.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: l */
    private final Void m47772l(Object obj) {
        throw new IllegalStateException(C8594l.m46777k("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: m */
    private final void m47773m(C8570l<? super Throwable, C8457t> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C8886o0.m47742a(getContext(), new C8793i0(C8594l.m46777k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: q */
    private final boolean m47774q(Throwable th) {
        if (!m47762B()) {
            return false;
        }
        return ((C8825g) this.f35292j).mo31124p(th);
    }

    /* renamed from: s */
    private final void m47775s() {
        if (!m47762B()) {
            mo31233r();
        }
    }

    /* renamed from: t */
    private final void m47776t(int i) {
        if (!m47769L()) {
            C8692e1.m47136a(this, i);
        }
    }

    /* renamed from: x */
    private final String m47777x() {
        Object w = mo31236w();
        if (w instanceof C8888o2) {
            return "Active";
        }
        return w instanceof C8914u ? "Cancelled" : "Completed";
    }

    /* renamed from: z */
    private final C8774h1 m47778z() {
        C8665a2 a2Var = (C8665a2) getContext().get(C8665a2.f35030f);
        if (a2Var == null) {
            return null;
        }
        C8774h1 d = C8665a2.C8666a.m47075d(a2Var, true, false, new C8918v(this), 2, (Object) null);
        this.f35294l = d;
        return d;
    }

    /* renamed from: A */
    public boolean mo31227A() {
        return !(mo31236w() instanceof C8888o2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public String mo31073E() {
        return "CancellableContinuation";
    }

    /* renamed from: F */
    public final void mo31228F(Throwable th) {
        if (!m47774q(th)) {
            mo31232p(th);
            m47775s();
        }
    }

    /* renamed from: H */
    public final boolean mo31229H() {
        if (C8919v0.m47824a()) {
            if (!(this.f35048i == 2)) {
                throw new AssertionError();
            }
        }
        if (C8919v0.m47824a()) {
            if (!(this.f35294l != C8884n2.f35282g)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (C8919v0.m47824a() && !(!(obj instanceof C8888o2))) {
            throw new AssertionError();
        } else if (!(obj instanceof C8691e0) || ((C8691e0) obj).f35055d == null) {
            this._decision = 0;
            this._state = C8766g.f35119g;
            return true;
        } else {
            mo31233r();
            return false;
        }
    }

    /* renamed from: a */
    public void mo30899a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C8888o2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C8724f0)) {
                if (obj2 instanceof C8691e0) {
                    C8691e0 e0Var = (C8691e0) obj2;
                    if (!e0Var.mo30916c()) {
                        if (f35291n.compareAndSet(this, obj2, C8691e0.m47132b(e0Var, (Object) null, (C8885o) null, (C8570l) null, (Object) null, th, 15, (Object) null))) {
                            e0Var.mo30917d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f35291n.compareAndSet(this, obj2, new C8691e0(obj2, (C8885o) null, (C8570l) null, (Object) null, th, 14, (C8589g) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo31216b(C8570l<? super Throwable, C8457t> lVar) {
        C8885o C = m47763C(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C8766g)) {
                Throwable th = null;
                if (!(obj instanceof C8885o)) {
                    boolean z = obj instanceof C8724f0;
                    if (z) {
                        C8724f0 f0Var = (C8724f0) obj;
                        if (!f0Var.mo30972b()) {
                            m47764D(lVar, obj);
                            throw null;
                        } else if (obj instanceof C8914u) {
                            if (!z) {
                                f0Var = null;
                            }
                            if (f0Var != null) {
                                th = f0Var.f35091a;
                            }
                            m47773m(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof C8691e0) {
                        C8691e0 e0Var = (C8691e0) obj;
                        if (e0Var.f35053b != null) {
                            m47764D(lVar, obj);
                            throw null;
                        } else if (!(C instanceof C8772h)) {
                            if (e0Var.mo30916c()) {
                                m47773m(lVar, e0Var.f35056e);
                                return;
                            }
                            if (f35291n.compareAndSet(this, obj, C8691e0.m47132b(e0Var, (Object) null, C, (C8570l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(C instanceof C8772h)) {
                        if (f35291n.compareAndSet(this, obj, new C8691e0(obj, C, (C8570l) null, (Object) null, (Throwable) null, 28, (C8589g) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    m47764D(lVar, obj);
                    throw null;
                }
            } else if (f35291n.compareAndSet(this, obj, C)) {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C8508d<T> mo30900c() {
        return this.f35292j;
    }

    /* renamed from: d */
    public Throwable mo30901d(Object obj) {
        Throwable d = super.mo30901d(obj);
        if (d == null) {
            return null;
        }
        C8508d c = mo30900c();
        return (!C8919v0.m47827d() || !(c instanceof C8532e)) ? d : C8858y.m47654j(d, (C8532e) c);
    }

    /* renamed from: e */
    public Object mo31217e(T t, Object obj, C8570l<? super Throwable, C8457t> lVar) {
        return m47770M(t, obj, lVar);
    }

    /* renamed from: f */
    public void mo31218f(C8876m0 m0Var, T t) {
        C8508d<T> dVar = this.f35292j;
        C8876m0 m0Var2 = null;
        C8825g gVar = dVar instanceof C8825g ? (C8825g) dVar : null;
        if (gVar != null) {
            m0Var2 = gVar.f35215j;
        }
        m47767J(this, t, m0Var2 == m0Var ? 4 : this.f35048i, (C8570l) null, 4, (Object) null);
    }

    /* renamed from: g */
    public void mo31219g(T t, C8570l<? super Throwable, C8457t> lVar) {
        m47766I(t, this.f35048i, lVar);
    }

    public C8532e getCallerFrame() {
        C8508d<T> dVar = this.f35292j;
        if (dVar instanceof C8532e) {
            return (C8532e) dVar;
        }
        return null;
    }

    public C8513g getContext() {
        return this.f35293k;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public void mo31220h(Object obj) {
        if (C8919v0.m47824a()) {
            if (!(obj == C8905s.f35297a)) {
                throw new AssertionError();
            }
        }
        m47776t(this.f35048i);
    }

    /* renamed from: i */
    public <T> T mo30902i(Object obj) {
        return obj instanceof C8691e0 ? ((C8691e0) obj).f35052a : obj;
    }

    /* renamed from: k */
    public Object mo30904k() {
        return mo31236w();
    }

    /* renamed from: n */
    public final void mo31230n(C8885o oVar, Throwable th) {
        try {
            oVar.mo30936a(th);
        } catch (Throwable th2) {
            C8886o0.m47742a(getContext(), new C8793i0(C8594l.m46777k("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: o */
    public final void mo31231o(C8570l<? super Throwable, C8457t> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C8886o0.m47742a(getContext(), new C8793i0(C8594l.m46777k("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: p */
    public boolean mo31232p(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C8888o2)) {
                return false;
            }
            z = obj instanceof C8885o;
        } while (!f35291n.compareAndSet(this, obj, new C8914u(this, th, z)));
        C8885o oVar = z ? (C8885o) obj : null;
        if (oVar != null) {
            mo31230n(oVar, th);
        }
        m47775s();
        m47776t(this.f35048i);
        return true;
    }

    /* renamed from: r */
    public final void mo31233r() {
        C8774h1 h1Var = this.f35294l;
        if (h1Var != null) {
            h1Var.mo31008k();
            this.f35294l = C8884n2.f35282g;
        }
    }

    public void resumeWith(Object obj) {
        m47767J(this, C8861j0.m47660c(obj, this), this.f35048i, (C8570l) null, 4, (Object) null);
    }

    public String toString() {
        return mo31073E() + '(' + C8923w0.m47835c(this.f35292j) + "){" + m47777x() + "}@" + C8923w0.m47834b(this);
    }

    /* renamed from: u */
    public Throwable mo31074u(C8665a2 a2Var) {
        return a2Var.mo30860K();
    }

    /* renamed from: v */
    public final Object mo31235v() {
        C8665a2 a2Var;
        boolean B = m47762B();
        if (m47771N()) {
            if (this.f35294l == null) {
                m47778z();
            }
            if (B) {
                m47765G();
            }
            return C8527d.m46722d();
        }
        if (B) {
            m47765G();
        }
        Object w = mo31236w();
        if (w instanceof C8724f0) {
            Throwable th = ((C8724f0) w).f35091a;
            if (C8919v0.m47827d()) {
                th = C8858y.m47654j(th, this);
            }
            throw th;
        } else if (!C8692e1.m47137b(this.f35048i) || (a2Var = (C8665a2) getContext().get(C8665a2.f35030f)) == null || a2Var.mo30862c()) {
            return mo30902i(w);
        } else {
            Throwable K = a2Var.mo30860K();
            mo30899a(w, K);
            if (C8919v0.m47827d()) {
                K = C8858y.m47654j(K, this);
            }
            throw K;
        }
    }

    /* renamed from: w */
    public final Object mo31236w() {
        return this._state;
    }

    /* renamed from: y */
    public void mo31237y() {
        C8774h1 z = m47778z();
        if (z != null && mo31227A()) {
            z.mo31008k();
            this.f35294l = C8884n2.f35282g;
        }
    }
}
