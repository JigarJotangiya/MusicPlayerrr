package kotlinx.coroutines.p396e3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.C8923w0;
import kotlinx.coroutines.internal.C8839l;
import kotlinx.coroutines.internal.C8840m;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8859z;
import kotlinx.coroutines.p396e3.C8708h;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8606x;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: kotlinx.coroutines.e3.c */
/* compiled from: AbstractChannel.kt */
public abstract class C8700c<E> implements C8722s<E> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35068d = AtomicReferenceFieldUpdater.newUpdater(C8700c.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    protected final C8570l<E, C8457t> f35069b;

    /* renamed from: c */
    private final C8840m f35070c = new C8840m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.e3.c$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C8701a<E> extends C8721r {

        /* renamed from: j */
        public final E f35071j;

        public C8701a(E e) {
            this.f35071j = e;
        }

        /* renamed from: A */
        public Object mo30950A() {
            return this.f35071j;
        }

        /* renamed from: B */
        public C8859z mo30951B(C8842o.C8845c cVar) {
            C8859z zVar = C8905s.f35297a;
            if (cVar == null) {
                return zVar;
            }
            cVar.mo31154d();
            throw null;
        }

        public String toString() {
            return "SendBuffered@" + C8923w0.m47834b(this) + '(' + this.f35071j + ')';
        }

        /* renamed from: z */
        public void mo30952z() {
        }
    }

    public C8700c(C8570l<? super E, C8457t> lVar) {
        this.f35069b = lVar;
    }

    /* renamed from: e */
    private final int m47170e() {
        C8840m mVar = this.f35070c;
        int i = 0;
        for (C8842o oVar = (C8842o) mVar.mo31145o(); !C8594l.m46767a(oVar, mVar); oVar = oVar.mo31146p()) {
            if (oVar instanceof C8842o) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    private final String m47171i() {
        String str;
        C8842o p = this.f35070c.mo31146p();
        if (p == this.f35070c) {
            return "EmptyQueue";
        }
        if (p instanceof C8712i) {
            str = p.toString();
        } else if (p instanceof C8717n) {
            str = "ReceiveQueued";
        } else if (p instanceof C8721r) {
            str = "SendQueued";
        } else {
            str = C8594l.m46777k("UNEXPECTED:", p);
        }
        C8842o q = this.f35070c.mo31147q();
        if (q == p) {
            return str;
        }
        String str2 = str + ",queueSize=" + m47170e();
        if (!(q instanceof C8712i)) {
            return str2;
        }
        return str2 + ",closedForSend=" + q;
    }

    /* renamed from: j */
    private final void m47172j(C8712i<?> iVar) {
        Object b = C8839l.m47575b((Object) null, 1, (C8589g) null);
        while (true) {
            C8842o q = iVar.mo31147q();
            C8717n nVar = q instanceof C8717n ? (C8717n) q : null;
            if (nVar == null) {
                break;
            } else if (!nVar.mo31140u()) {
                nVar.mo31148r();
            } else {
                b = C8839l.m47576c(b, nVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C8717n) b).mo30930B(iVar);
            } else {
                Objects.requireNonNull(b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((C8717n) arrayList.get(size)).mo30930B(iVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo30946n(iVar);
    }

    /* renamed from: k */
    private final Throwable m47173k(C8712i<?> iVar) {
        m47172j(iVar);
        return iVar.mo30967G();
    }

    /* renamed from: l */
    private final void m47174l(Throwable th) {
        C8859z zVar;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (zVar = C8699b.f35067e) && f35068d.compareAndSet(this, obj, zVar)) {
            C8606x.m46798b(obj, 1);
            ((C8570l) obj).invoke(th);
        }
    }

    /* renamed from: c */
    public boolean mo30940c(Throwable th) {
        boolean z;
        C8712i iVar = new C8712i(th);
        C8840m mVar = this.f35070c;
        while (true) {
            C8842o q = mVar.mo31147q();
            z = true;
            if (!(q instanceof C8712i)) {
                if (q.mo31143i(iVar, mVar)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            iVar = (C8712i) this.f35070c.mo31147q();
        }
        m47172j(iVar);
        if (z) {
            m47174l(th);
        }
        return z;
    }

    /* renamed from: d */
    public final Object mo30941d(E e) {
        Object m = mo30945m(e);
        if (m == C8699b.f35064b) {
            C8708h.C8710b bVar = C8708h.f35082b;
            C8457t tVar = C8457t.f34900a;
            bVar.mo30963c(tVar);
            return tVar;
        } else if (m == C8699b.f35065c) {
            C8712i<?> g = mo30943g();
            if (g == null) {
                return C8708h.f35082b.mo30962b();
            }
            return C8708h.f35082b.mo30961a(m47173k(g));
        } else if (m instanceof C8712i) {
            return C8708h.f35082b.mo30961a(m47173k((C8712i) m));
        } else {
            throw new IllegalStateException(C8594l.m46777k("trySend returned ", m).toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo30942f() {
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C8712i<?> mo30943g() {
        C8842o q = this.f35070c.mo31147q();
        C8712i<?> iVar = q instanceof C8712i ? (C8712i) q : null;
        if (iVar == null) {
            return null;
        }
        m47172j(iVar);
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C8840m mo30944h() {
        return this.f35070c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo30945m(E e) {
        C8719p p;
        C8859z f;
        do {
            p = mo30923p();
            if (p == null) {
                return C8699b.f35065c;
            }
            f = p.mo30933f(e, (C8842o.C8845c) null);
        } while (f == null);
        if (C8919v0.m47824a()) {
            if (!(f == C8905s.f35297a)) {
                throw new AssertionError();
            }
        }
        p.mo30932e(e);
        return p.mo30968a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo30946n(C8842o oVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C8719p<?> mo30947o(E e) {
        C8842o q;
        C8840m mVar = this.f35070c;
        C8701a aVar = new C8701a(e);
        do {
            q = mVar.mo31147q();
            if (q instanceof C8719p) {
                return (C8719p) q;
            }
        } while (!q.mo31143i(aVar, mVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C8719p<E> mo30923p() {
        C8842o oVar;
        C8842o w;
        C8840m mVar = this.f35070c;
        while (true) {
            oVar = (C8842o) mVar.mo31145o();
            if (oVar != mVar && (oVar instanceof C8719p)) {
                if (((((C8719p) oVar) instanceof C8712i) && !oVar.mo31139t()) || (w = oVar.mo31151w()) == null) {
                    break;
                }
                w.mo31149s();
            }
        }
        oVar = null;
        return (C8719p) oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C8721r mo30948q() {
        C8842o oVar;
        C8842o w;
        C8840m mVar = this.f35070c;
        while (true) {
            oVar = (C8842o) mVar.mo31145o();
            if (oVar != mVar && (oVar instanceof C8721r)) {
                if (((((C8721r) oVar) instanceof C8712i) && !oVar.mo31139t()) || (w = oVar.mo31151w()) == null) {
                    break;
                }
                w.mo31149s();
            }
        }
        oVar = null;
        return (C8721r) oVar;
    }

    public String toString() {
        return C8923w0.m47833a(this) + '@' + C8923w0.m47834b(this) + '{' + m47171i() + '}' + mo30942f();
    }
}
