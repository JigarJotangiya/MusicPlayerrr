package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.internal.C8841n;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8855v;
import kotlinx.coroutines.internal.C8858y;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.i2 */
/* compiled from: JobSupport.kt */
public class C8795i2 implements C8665a2, C8930y, C8893p2 {

    /* renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35179g = AtomicReferenceFieldUpdater.newUpdater(C8795i2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: kotlinx.coroutines.i2$a */
    /* compiled from: JobSupport.kt */
    private static final class C8796a<T> extends C8901r<T> {

        /* renamed from: o */
        private final C8795i2 f35180o;

        public C8796a(C8508d<? super T> dVar, C8795i2 i2Var) {
            super(dVar, 1);
            this.f35180o = i2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public String mo31073E() {
            return "AwaitContinuation";
        }

        /* renamed from: u */
        public Throwable mo31074u(C8665a2 a2Var) {
            Throwable f;
            Object J = this.f35180o.mo31053J();
            if ((J instanceof C8798c) && (f = ((C8798c) J).mo31076f()) != null) {
                return f;
            }
            if (J instanceof C8724f0) {
                return ((C8724f0) J).f35091a;
            }
            return a2Var.mo30860K();
        }
    }

    /* renamed from: kotlinx.coroutines.i2$b */
    /* compiled from: JobSupport.kt */
    private static final class C8797b extends C8775h2 {

        /* renamed from: k */
        private final C8795i2 f35181k;

        /* renamed from: l */
        private final C8798c f35182l;

        /* renamed from: m */
        private final C8926x f35183m;

        /* renamed from: n */
        private final Object f35184n;

        public C8797b(C8795i2 i2Var, C8798c cVar, C8926x xVar, Object obj) {
            this.f35181k = i2Var;
            this.f35182l = cVar;
            this.f35183m = xVar;
            this.f35184n = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo31007z((Throwable) obj);
            return C8457t.f34900a;
        }

        /* renamed from: z */
        public void mo31007z(Throwable th) {
            this.f35181k.m47424y(this.f35182l, this.f35183m, this.f35184n);
        }
    }

    /* renamed from: kotlinx.coroutines.i2$c */
    /* compiled from: JobSupport.kt */
    private static final class C8798c implements C8920v1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: g */
        private final C8880m2 f35185g;

        public C8798c(C8880m2 m2Var, boolean z, Throwable th) {
            this.f35185g = m2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m47463d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m47464e() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m47465l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo31075a(Throwable th) {
            Throwable f = mo31076f();
            if (f == null) {
                mo31082m(th);
            } else if (th != f) {
                Object e = m47464e();
                if (e == null) {
                    m47465l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> d = m47463d();
                        d.add(e);
                        d.add(th);
                        C8457t tVar = C8457t.f34900a;
                        m47465l(d);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(C8594l.m46777k("State is ", e).toString());
                }
            }
        }

        /* renamed from: b */
        public C8880m2 mo31011b() {
            return this.f35185g;
        }

        /* renamed from: c */
        public boolean mo31012c() {
            return mo31076f() == null;
        }

        /* renamed from: f */
        public final Throwable mo31076f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean mo31077g() {
            return mo31076f() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean mo31078h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo31079i() {
            return m47464e() == C8863j2.f35263e;
        }

        /* renamed from: j */
        public final List<Throwable> mo31080j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = m47464e();
            if (e == null) {
                arrayList = m47463d();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> d = m47463d();
                d.add(e);
                arrayList = d;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(C8594l.m46777k("State is ", e).toString());
            }
            Throwable f = mo31076f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !C8594l.m46767a(th, f)) {
                arrayList.add(th);
            }
            m47465l(C8863j2.f35263e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo31081k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo31082m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo31077g() + ", completing=" + mo31078h() + ", rootCause=" + mo31076f() + ", exceptions=" + m47464e() + ", list=" + mo31011b() + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.i2$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C8799d extends C8842o.C8844b {

        /* renamed from: d */
        final /* synthetic */ C8795i2 f35186d;

        /* renamed from: e */
        final /* synthetic */ Object f35187e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8799d(C8842o oVar, C8795i2 i2Var, Object obj) {
            super(oVar);
            this.f35186d = i2Var;
            this.f35187e = obj;
        }

        /* renamed from: i */
        public Object mo30938g(C8842o oVar) {
            if (this.f35186d.mo31053J() == this.f35187e) {
                return null;
            }
            return C8841n.m47580a();
        }
    }

    public C8795i2(boolean z) {
        this._state = z ? C8863j2.f35265g : C8863j2.f35264f;
        this._parentHandle = null;
    }

    /* renamed from: A */
    private final Object m47396A(C8798c cVar, Object obj) {
        boolean g;
        Throwable D;
        boolean z = true;
        if (C8919v0.m47824a()) {
            if (!(mo31053J() == cVar)) {
                throw new AssertionError();
            }
        }
        if (C8919v0.m47824a() && !(!cVar.mo31079i())) {
            throw new AssertionError();
        } else if (!C8919v0.m47824a() || cVar.mo31078h()) {
            C8724f0 f0Var = obj instanceof C8724f0 ? (C8724f0) obj : null;
            Throwable th = f0Var == null ? null : f0Var.f35091a;
            synchronized (cVar) {
                g = cVar.mo31077g();
                List<Throwable> j = cVar.mo31080j(th);
                D = m47399D(cVar, j);
                if (D != null) {
                    m47413k(D, j);
                }
            }
            if (!(D == null || D == th)) {
                obj = new C8724f0(D, false, 2, (C8589g) null);
            }
            if (D != null) {
                if (!m47420t(D) && !mo31054L(D)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((C8724f0) obj).mo30972b();
                }
            }
            if (!g) {
                mo31060a0(D);
            }
            mo30895b0(obj);
            boolean compareAndSet = f35179g.compareAndSet(this, cVar, C8863j2.m47670g(obj));
            if (!C8919v0.m47824a() || compareAndSet) {
                m47423w(cVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: B */
    private final C8926x m47397B(C8920v1 v1Var) {
        C8926x xVar = v1Var instanceof C8926x ? (C8926x) v1Var : null;
        if (xVar != null) {
            return xVar;
        }
        C8880m2 b = v1Var.mo31011b();
        if (b == null) {
            return null;
        }
        return m47403X(b);
    }

    /* renamed from: C */
    private final Throwable m47398C(Object obj) {
        C8724f0 f0Var = obj instanceof C8724f0 ? (C8724f0) obj : null;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f35091a;
    }

    /* renamed from: D */
    private final Throwable m47399D(C8798c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof C8937z2) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof C8937z2)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.mo31077g()) {
            return new C8677b2(mo30896u(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: G */
    private final C8880m2 m47400G(C8920v1 v1Var) {
        C8880m2 b = v1Var.mo31011b();
        if (b != null) {
            return b;
        }
        if (v1Var instanceof C8862j1) {
            return new C8880m2();
        }
        if (v1Var instanceof C8775h2) {
            m47408e0((C8775h2) v1Var);
            return null;
        }
        throw new IllegalStateException(C8594l.m46777k("State should have list: ", v1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m47404Y(((kotlinx.coroutines.C8795i2.C8798c) r2).mo31011b(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return kotlinx.coroutines.C8863j2.m47664a();
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m47401R(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo31053J()
            boolean r3 = r2 instanceof kotlinx.coroutines.C8795i2.C8798c
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.i2$c r3 = (kotlinx.coroutines.C8795i2.C8798c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo31079i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35262d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.i2$c r3 = (kotlinx.coroutines.C8795i2.C8798c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo31077g()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m47425z(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.i2$c r7 = (kotlinx.coroutines.C8795i2.C8798c) r7     // Catch:{ all -> 0x004f }
            r7.mo31075a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.i2$c r7 = (kotlinx.coroutines.C8795i2.C8798c) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo31076f()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            kotlinx.coroutines.i2$c r2 = (kotlinx.coroutines.C8795i2.C8798c) r2
            kotlinx.coroutines.m2 r7 = r2.mo31011b()
            r6.m47404Y(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35259a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.C8920v1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m47425z(r7)
        L_0x005c:
            r3 = r2
            kotlinx.coroutines.v1 r3 = (kotlinx.coroutines.C8920v1) r3
            boolean r4 = r3.mo31012c()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m47417r0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35259a
            return r7
        L_0x0070:
            kotlinx.coroutines.f0 r3 = new kotlinx.coroutines.f0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m47419s0(r2, r3)
            kotlinx.coroutines.internal.z r4 = kotlinx.coroutines.C8863j2.f35259a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.z r2 = kotlinx.coroutines.C8863j2.f35261c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.String r7 = "Cannot happen in "
            java.lang.String r7 = p369i.p387z.p389d.C8594l.m46777k(r7, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x009a:
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35262d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8795i2.m47401R(java.lang.Object):java.lang.Object");
    }

    /* renamed from: V */
    private final C8775h2 m47402V(C8570l<? super Throwable, C8457t> lVar, boolean z) {
        C8775h2 h2Var = null;
        if (z) {
            if (lVar instanceof C8682c2) {
                h2Var = (C8682c2) lVar;
            }
            if (h2Var == null) {
                h2Var = new C8932y1(lVar);
            }
        } else {
            C8775h2 h2Var2 = lVar instanceof C8775h2 ? (C8775h2) lVar : null;
            if (h2Var2 != null) {
                if (!C8919v0.m47824a() || (!(h2Var2 instanceof C8682c2))) {
                    h2Var = h2Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (h2Var == null) {
                h2Var = new C8936z1(lVar);
            }
        }
        h2Var.mo31010B(this);
        return h2Var;
    }

    /* renamed from: X */
    private final C8926x m47403X(C8842o oVar) {
        while (oVar.mo31139t()) {
            oVar = oVar.mo31147q();
        }
        while (true) {
            oVar = oVar.mo31146p();
            if (!oVar.mo31139t()) {
                if (oVar instanceof C8926x) {
                    return (C8926x) oVar;
                }
                if (oVar instanceof C8880m2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: Y */
    private final void m47404Y(C8880m2 m2Var, Throwable th) {
        C8793i0 i0Var;
        mo31060a0(th);
        C8793i0 i0Var2 = null;
        for (C8842o oVar = (C8842o) m2Var.mo31145o(); !C8594l.m46767a(oVar, m2Var); oVar = oVar.mo31146p()) {
            if (oVar instanceof C8682c2) {
                C8775h2 h2Var = (C8775h2) oVar;
                try {
                    h2Var.mo31007z(th);
                } catch (Throwable th2) {
                    if (i0Var2 == null) {
                        i0Var = null;
                    } else {
                        C8375b.m46425a(i0Var2, th2);
                        i0Var = i0Var2;
                    }
                    if (i0Var == null) {
                        i0Var2 = new C8793i0("Exception in completion handler " + h2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (i0Var2 != null) {
            mo30893M(i0Var2);
        }
        m47420t(th);
    }

    /* renamed from: Z */
    private final void m47405Z(C8880m2 m2Var, Throwable th) {
        C8793i0 i0Var;
        C8793i0 i0Var2 = null;
        for (C8842o oVar = (C8842o) m2Var.mo31145o(); !C8594l.m46767a(oVar, m2Var); oVar = oVar.mo31146p()) {
            if (oVar instanceof C8775h2) {
                C8775h2 h2Var = (C8775h2) oVar;
                try {
                    h2Var.mo31007z(th);
                } catch (Throwable th2) {
                    if (i0Var2 == null) {
                        i0Var = null;
                    } else {
                        C8375b.m46425a(i0Var2, th2);
                        i0Var = i0Var2;
                    }
                    if (i0Var == null) {
                        i0Var2 = new C8793i0("Exception in completion handler " + h2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (i0Var2 != null) {
            mo30893M(i0Var2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.u1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m47407d0(kotlinx.coroutines.C8862j1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.m2 r0 = new kotlinx.coroutines.m2
            r0.<init>()
            boolean r1 = r3.mo31012c()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.u1 r1 = new kotlinx.coroutines.u1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f35179g
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8795i2.m47407d0(kotlinx.coroutines.j1):void");
    }

    /* renamed from: e0 */
    private final void m47408e0(C8775h2 h2Var) {
        h2Var.mo31144j(new C8880m2());
        f35179g.compareAndSet(this, h2Var, h2Var.mo31146p());
    }

    /* renamed from: h0 */
    private final int m47409h0(Object obj) {
        if (obj instanceof C8862j1) {
            if (((C8862j1) obj).mo31012c()) {
                return 0;
            }
            if (!f35179g.compareAndSet(this, obj, C8863j2.f35265g)) {
                return -1;
            }
            mo31061c0();
            return 1;
        } else if (!(obj instanceof C8916u1)) {
            return 0;
        } else {
            if (!f35179g.compareAndSet(this, obj, ((C8916u1) obj).mo31011b())) {
                return -1;
            }
            mo31061c0();
            return 1;
        }
    }

    /* renamed from: j */
    private final boolean m47411j(Object obj, C8880m2 m2Var, C8775h2 h2Var) {
        int y;
        C8799d dVar = new C8799d(h2Var, this, obj);
        do {
            y = m2Var.mo31147q().mo31152y(h2Var, m2Var, dVar);
            if (y == 1) {
                return true;
            }
        } while (y != 2);
        return false;
    }

    /* renamed from: j0 */
    private final String m47412j0(Object obj) {
        if (obj instanceof C8798c) {
            C8798c cVar = (C8798c) obj;
            if (cVar.mo31077g()) {
                return "Cancelling";
            }
            if (cVar.mo31078h()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof C8920v1)) {
            return obj instanceof C8724f0 ? "Cancelled" : "Completed";
        } else {
            if (((C8920v1) obj).mo31012c()) {
                return "Active";
            }
            return "New";
        }
    }

    /* renamed from: k */
    private final void m47413k(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable l = !C8919v0.m47827d() ? th : C8858y.m47656l(th);
            for (Throwable th2 : list) {
                if (C8919v0.m47827d()) {
                    th2 = C8858y.m47656l(th2);
                }
                if (th2 != th && th2 != l && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C8375b.m46425a(th, th2);
                }
            }
        }
    }

    /* renamed from: l0 */
    public static /* synthetic */ CancellationException m47414l0(C8795i2 i2Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return i2Var.mo31064k0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: n */
    private final Object m47415n(C8508d<Object> dVar) {
        C8796a aVar = new C8796a(C8522c.m46721c(dVar), this);
        aVar.mo31237y();
        C8909t.m47813a(aVar, mo30863i0(new C8904r2(aVar)));
        Object v = aVar.mo31235v();
        if (v == C8527d.m46722d()) {
            C8535h.m46737c(dVar);
        }
        return v;
    }

    /* renamed from: q0 */
    private final boolean m47416q0(C8920v1 v1Var, Object obj) {
        if (C8919v0.m47824a()) {
            if (!((v1Var instanceof C8862j1) || (v1Var instanceof C8775h2))) {
                throw new AssertionError();
            }
        }
        if (C8919v0.m47824a() && !(!(obj instanceof C8724f0))) {
            throw new AssertionError();
        } else if (!f35179g.compareAndSet(this, v1Var, C8863j2.m47670g(obj))) {
            return false;
        } else {
            mo31060a0((Throwable) null);
            mo30895b0(obj);
            m47423w(v1Var, obj);
            return true;
        }
    }

    /* renamed from: r0 */
    private final boolean m47417r0(C8920v1 v1Var, Throwable th) {
        if (C8919v0.m47824a() && !(!(v1Var instanceof C8798c))) {
            throw new AssertionError();
        } else if (!C8919v0.m47824a() || v1Var.mo31012c()) {
            C8880m2 G = m47400G(v1Var);
            if (G == null) {
                return false;
            }
            if (!f35179g.compareAndSet(this, v1Var, new C8798c(G, false, th))) {
                return false;
            }
            m47404Y(G, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: s */
    private final Object m47418s(Object obj) {
        Object s0;
        do {
            Object J = mo31053J();
            if (!(J instanceof C8920v1) || ((J instanceof C8798c) && ((C8798c) J).mo31078h())) {
                return C8863j2.f35259a;
            }
            s0 = m47419s0(J, new C8724f0(m47425z(obj), false, 2, (C8589g) null));
        } while (s0 == C8863j2.f35261c);
        return s0;
    }

    /* renamed from: s0 */
    private final Object m47419s0(Object obj, Object obj2) {
        if (!(obj instanceof C8920v1)) {
            return C8863j2.f35259a;
        }
        if ((!(obj instanceof C8862j1) && !(obj instanceof C8775h2)) || (obj instanceof C8926x) || (obj2 instanceof C8724f0)) {
            return m47421t0((C8920v1) obj, obj2);
        }
        if (m47416q0((C8920v1) obj, obj2)) {
            return obj2;
        }
        return C8863j2.f35261c;
    }

    /* renamed from: t */
    private final boolean m47420t(Throwable th) {
        if (mo31050P()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C8922w I = mo31052I();
        if (I == null || I == C8884n2.f35282g) {
            return z;
        }
        if (I.mo31205d(th) || z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        m47404Y(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r7 = m47397B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (m47422u0(r1, r7, r8) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        return kotlinx.coroutines.C8863j2.f35260b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        return m47396A(r1, r8);
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m47421t0(kotlinx.coroutines.C8920v1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.m2 r0 = r6.m47400G(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35261c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof kotlinx.coroutines.C8795i2.C8798c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            kotlinx.coroutines.i2$c r1 = (kotlinx.coroutines.C8795i2.C8798c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.i2$c r1 = new kotlinx.coroutines.i2$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo31078h()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35259a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo31081k(r3)     // Catch:{ all -> 0x008c }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f35179g     // Catch:{ all -> 0x008c }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35261c     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = kotlinx.coroutines.C8919v0.m47824a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.mo31079i()     // Catch:{ all -> 0x008c }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008c }
            r7.<init>()     // Catch:{ all -> 0x008c }
            throw r7     // Catch:{ all -> 0x008c }
        L_0x0052:
            boolean r4 = r1.mo31077g()     // Catch:{ all -> 0x008c }
            boolean r5 = r8 instanceof kotlinx.coroutines.C8724f0     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x005e
            r5 = r8
            kotlinx.coroutines.f0 r5 = (kotlinx.coroutines.C8724f0) r5     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            java.lang.Throwable r5 = r5.f35091a     // Catch:{ all -> 0x008c }
            r1.mo31075a(r5)     // Catch:{ all -> 0x008c }
        L_0x0067:
            java.lang.Throwable r5 = r1.mo31076f()     // Catch:{ all -> 0x008c }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006f
            r2 = r5
        L_0x006f:
            i.t r3 = p369i.C8457t.f34900a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.m47404Y(r0, r2)
        L_0x0078:
            kotlinx.coroutines.x r7 = r6.m47397B(r7)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r6.m47422u0(r1, r7, r8)
            if (r7 == 0) goto L_0x0087
            kotlinx.coroutines.internal.z r7 = kotlinx.coroutines.C8863j2.f35260b
            return r7
        L_0x0087:
            java.lang.Object r7 = r6.m47396A(r1, r8)
            return r7
        L_0x008c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8795i2.m47421t0(kotlinx.coroutines.v1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: u0 */
    private final boolean m47422u0(C8798c cVar, C8926x xVar, Object obj) {
        while (C8665a2.C8666a.m47075d(xVar.f35311k, false, false, new C8797b(this, cVar, xVar, obj), 1, (Object) null) == C8884n2.f35282g) {
            xVar = m47403X(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    private final void m47423w(C8920v1 v1Var, Object obj) {
        C8922w I = mo31052I();
        if (I != null) {
            I.mo31008k();
            mo31063g0(C8884n2.f35282g);
        }
        Throwable th = null;
        C8724f0 f0Var = obj instanceof C8724f0 ? (C8724f0) obj : null;
        if (f0Var != null) {
            th = f0Var.f35091a;
        }
        if (v1Var instanceof C8775h2) {
            try {
                ((C8775h2) v1Var).mo31007z(th);
            } catch (Throwable th2) {
                mo30893M(new C8793i0("Exception in completion handler " + v1Var + " for " + this, th2));
            }
        } else {
            C8880m2 b = v1Var.mo31011b();
            if (b != null) {
                m47405Z(b, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m47424y(C8798c cVar, C8926x xVar, Object obj) {
        if (C8919v0.m47824a()) {
            if (!(mo31053J() == cVar)) {
                throw new AssertionError();
            }
        }
        C8926x X = m47403X(xVar);
        if (X == null || !m47422u0(cVar, X, obj)) {
            mo30891l(m47396A(cVar, obj));
        }
    }

    /* renamed from: z */
    private final Throwable m47425z(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C8677b2(mo30896u(), (Throwable) null, this);
            }
            return th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C8893p2) obj).mo31072v0();
    }

    /* renamed from: E */
    public boolean mo30906E() {
        return true;
    }

    /* renamed from: F */
    public boolean mo30879F() {
        return false;
    }

    /* renamed from: H */
    public final C8774h1 mo30859H(boolean z, boolean z2, C8570l<? super Throwable, C8457t> lVar) {
        C8775h2 V = m47402V(lVar, z);
        while (true) {
            Object J = mo31053J();
            if (J instanceof C8862j1) {
                C8862j1 j1Var = (C8862j1) J;
                if (!j1Var.mo31012c()) {
                    m47407d0(j1Var);
                } else if (f35179g.compareAndSet(this, J, V)) {
                    return V;
                }
            } else {
                Throwable th = null;
                if (J instanceof C8920v1) {
                    C8880m2 b = ((C8920v1) J).mo31011b();
                    if (b == null) {
                        Objects.requireNonNull(J, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m47408e0((C8775h2) J);
                    } else {
                        C8774h1 h1Var = C8884n2.f35282g;
                        if (z && (J instanceof C8798c)) {
                            synchronized (J) {
                                th = ((C8798c) J).mo31076f();
                                if (th == null || ((lVar instanceof C8926x) && !((C8798c) J).mo31078h())) {
                                    if (m47411j(J, b, V)) {
                                        if (th == null) {
                                            return V;
                                        }
                                        h1Var = V;
                                    }
                                }
                                C8457t tVar = C8457t.f34900a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return h1Var;
                        } else if (m47411j(J, b, V)) {
                            return V;
                        }
                    }
                } else {
                    if (z2) {
                        C8724f0 f0Var = J instanceof C8724f0 ? (C8724f0) J : null;
                        if (f0Var != null) {
                            th = f0Var.f35091a;
                        }
                        lVar.invoke(th);
                    }
                    return C8884n2.f35282g;
                }
            }
        }
    }

    /* renamed from: I */
    public final C8922w mo31052I() {
        return (C8922w) this._parentHandle;
    }

    /* renamed from: J */
    public final Object mo31053J() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C8855v)) {
                return obj;
            }
            ((C8855v) obj).mo31102c(this);
        }
    }

    /* renamed from: K */
    public final CancellationException mo30860K() {
        Object J = mo31053J();
        if (J instanceof C8798c) {
            Throwable f = ((C8798c) J).mo31076f();
            if (f != null) {
                return mo31064k0(f, C8594l.m46777k(C8923w0.m47833a(this), " is cancelling"));
            }
            throw new IllegalStateException(C8594l.m46777k("Job is still new or active: ", this).toString());
        } else if (J instanceof C8920v1) {
            throw new IllegalStateException(C8594l.m46777k("Job is still new or active: ", this).toString());
        } else if (J instanceof C8724f0) {
            return m47414l0(this, ((C8724f0) J).f35091a, (String) null, 1, (Object) null);
        } else {
            return new C8677b2(C8594l.m46777k(C8923w0.m47833a(this), " has completed normally"), (Throwable) null, this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo31054L(Throwable th) {
        return false;
    }

    /* renamed from: L0 */
    public final C8922w mo30861L0(C8930y yVar) {
        return (C8922w) C8665a2.C8666a.m47075d(this, true, false, new C8926x(yVar), 2, (Object) null);
    }

    /* renamed from: M */
    public void mo30893M(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo31055N(C8665a2 a2Var) {
        if (C8919v0.m47824a()) {
            if (!(mo31052I() == null)) {
                throw new AssertionError();
            }
        }
        if (a2Var == null) {
            mo31063g0(C8884n2.f35282g);
            return;
        }
        a2Var.start();
        C8922w L0 = a2Var.mo30861L0(this);
        mo31063g0(L0);
        if (mo31056O()) {
            L0.mo31008k();
            mo31063g0(C8884n2.f35282g);
        }
    }

    /* renamed from: O */
    public final boolean mo31056O() {
        return !(mo31053J() instanceof C8920v1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo31050P() {
        return false;
    }

    /* renamed from: S */
    public final boolean mo31057S(Object obj) {
        Object s0;
        do {
            s0 = m47419s0(mo31053J(), obj);
            if (s0 == C8863j2.f35259a) {
                return false;
            }
            if (s0 == C8863j2.f35260b) {
                return true;
            }
        } while (s0 == C8863j2.f35261c);
        mo30891l(s0);
        return true;
    }

    /* renamed from: T */
    public final void mo31058T(C8893p2 p2Var) {
        mo31068q(p2Var);
    }

    /* renamed from: U */
    public final Object mo31059U(Object obj) {
        Object s0;
        do {
            s0 = m47419s0(mo31053J(), obj);
            if (s0 == C8863j2.f35259a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m47398C(obj));
            }
        } while (s0 == C8863j2.f35261c);
        return s0;
    }

    /* renamed from: W */
    public String mo30894W() {
        return C8923w0.m47833a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo31060a0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo30895b0(Object obj) {
    }

    /* renamed from: c */
    public boolean mo30862c() {
        Object J = mo31053J();
        return (J instanceof C8920v1) && ((C8920v1) J).mo31012c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo31061c0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31062f0(kotlinx.coroutines.C8775h2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo31053J()
            boolean r1 = r0 instanceof kotlinx.coroutines.C8775h2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f35179g
            kotlinx.coroutines.j1 r2 = kotlinx.coroutines.C8863j2.f35265g
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C8920v1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.v1 r0 = (kotlinx.coroutines.C8920v1) r0
            kotlinx.coroutines.m2 r0 = r0.mo31011b()
            if (r0 == 0) goto L_0x0027
            r4.mo31140u()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8795i2.mo31062f0(kotlinx.coroutines.h2):void");
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        return C8665a2.C8666a.m47073b(this, r, pVar);
    }

    /* renamed from: g0 */
    public final void mo31063g0(C8922w wVar) {
        this._parentHandle = wVar;
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        return C8665a2.C8666a.m47074c(this, cVar);
    }

    public final C8513g.C8518c<?> getKey() {
        return C8665a2.f35030f;
    }

    /* renamed from: i0 */
    public final C8774h1 mo30863i0(C8570l<? super Throwable, C8457t> lVar) {
        return mo30859H(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final CancellationException mo31064k0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo30896u();
            }
            cancellationException = new C8677b2(str, th, this);
        }
        return cancellationException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo30891l(Object obj) {
    }

    /* renamed from: m */
    public final Object mo31065m(C8508d<Object> dVar) {
        Object J;
        do {
            J = mo31053J();
            if (!(J instanceof C8920v1)) {
                if (!(J instanceof C8724f0)) {
                    return C8863j2.m47671h(J);
                }
                Throwable th = ((C8724f0) J).f35091a;
                if (!C8919v0.m47827d()) {
                    throw th;
                } else if (!(dVar instanceof C8532e)) {
                    throw th;
                } else {
                    throw C8858y.m47654j(th, (C8532e) dVar);
                }
            }
        } while (m47409h0(J) < 0);
        return m47415n(dVar);
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        return C8665a2.C8666a.m47076e(this, cVar);
    }

    /* renamed from: o */
    public final boolean mo31066o(Throwable th) {
        return mo31068q(th);
    }

    /* renamed from: p0 */
    public final String mo31067p0() {
        return mo30894W() + '{' + m47412j0(mo31053J()) + '}';
    }

    public C8513g plus(C8513g gVar) {
        return C8665a2.C8666a.m47077f(this, gVar);
    }

    /* renamed from: q */
    public final boolean mo31068q(Object obj) {
        Object a = C8863j2.f35259a;
        if (mo30879F() && (a = m47418s(obj)) == C8863j2.f35260b) {
            return true;
        }
        if (a == C8863j2.f35259a) {
            a = m47401R(obj);
        }
        if (a == C8863j2.f35259a || a == C8863j2.f35260b) {
            return true;
        }
        if (a == C8863j2.f35262d) {
            return false;
        }
        mo30891l(a);
        return true;
    }

    /* renamed from: r */
    public void mo31069r(Throwable th) {
        mo31068q(th);
    }

    public final boolean start() {
        int h0;
        do {
            h0 = m47409h0(mo31053J());
            if (h0 == 0) {
                return false;
            }
        } while (h0 != 1);
        return true;
    }

    public String toString() {
        return mo31067p0() + '@' + C8923w0.m47834b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo30896u() {
        return "Job was cancelled";
    }

    /* renamed from: v */
    public boolean mo31071v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo31068q(th) || !mo30906E()) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    public CancellationException mo31072v0() {
        Throwable th;
        Object J = mo31053J();
        CancellationException cancellationException = null;
        if (J instanceof C8798c) {
            th = ((C8798c) J).mo31076f();
        } else if (J instanceof C8724f0) {
            th = ((C8724f0) J).f35091a;
        } else if (!(J instanceof C8920v1)) {
            th = null;
        } else {
            throw new IllegalStateException(C8594l.m46777k("Cannot be cancelling child in this state: ", J).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C8677b2(C8594l.m46777k("Parent job is ", m47412j0(J)), th, this) : cancellationException;
    }

    /* renamed from: z0 */
    public void mo30865z0(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C8677b2(mo30896u(), (Throwable) null, this);
        }
        mo31069r(cancellationException);
    }
}
