package kotlinx.coroutines.p396e3;

import kotlinx.coroutines.C8772h;
import kotlinx.coroutines.C8894q;
import kotlinx.coroutines.C8901r;
import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8909t;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.C8923w0;
import kotlinx.coroutines.internal.C8840m;
import kotlinx.coroutines.internal.C8841n;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8853u;
import kotlinx.coroutines.internal.C8859z;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.e3.a */
/* compiled from: AbstractChannel.kt */
public abstract class C8694a<E> extends C8700c<E> implements C8705f<E> {

    /* renamed from: kotlinx.coroutines.e3.a$a */
    /* compiled from: AbstractChannel.kt */
    private static class C8695a<E> extends C8717n<E> {

        /* renamed from: j */
        public final C8894q<Object> f35057j;

        /* renamed from: k */
        public final int f35058k;

        public C8695a(C8894q<Object> qVar, int i) {
            this.f35057j = qVar;
            this.f35058k = i;
        }

        /* renamed from: B */
        public void mo30930B(C8712i<?> iVar) {
            if (this.f35058k == 1) {
                C8894q<Object> qVar = this.f35057j;
                C8708h b = C8708h.m47202b(C8708h.f35082b.mo30961a(iVar.f35086j));
                C8447l.C8448a aVar = C8447l.Companion;
                qVar.resumeWith(C8447l.m50326constructorimpl(b));
                return;
            }
            C8894q<Object> qVar2 = this.f35057j;
            Throwable F = iVar.mo30966F();
            C8447l.C8448a aVar2 = C8447l.Companion;
            qVar2.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(F)));
        }

        /* renamed from: C */
        public final Object mo30931C(E e) {
            if (this.f35058k != 1) {
                return e;
            }
            C8708h.f35082b.mo30963c(e);
            return C8708h.m47202b(e);
        }

        /* renamed from: e */
        public void mo30932e(E e) {
            this.f35057j.mo31220h(C8905s.f35297a);
        }

        /* renamed from: f */
        public C8859z mo30933f(E e, C8842o.C8845c cVar) {
            Object e2 = this.f35057j.mo31217e(mo30931C(e), cVar == null ? null : cVar.f35236a, mo30935A(e));
            if (e2 == null) {
                return null;
            }
            if (C8919v0.m47824a()) {
                if (!(e2 == C8905s.f35297a)) {
                    throw new AssertionError();
                }
            }
            if (cVar == null) {
                return C8905s.f35297a;
            }
            cVar.mo31154d();
            throw null;
        }

        public String toString() {
            return "ReceiveElement@" + C8923w0.m47834b(this) + "[receiveMode=" + this.f35058k + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.e3.a$b */
    /* compiled from: AbstractChannel.kt */
    private static final class C8696b<E> extends C8695a<E> {

        /* renamed from: l */
        public final C8570l<E, C8457t> f35059l;

        public C8696b(C8894q<Object> qVar, int i, C8570l<? super E, C8457t> lVar) {
            super(qVar, i);
            this.f35059l = lVar;
        }

        /* renamed from: A */
        public C8570l<Throwable, C8457t> mo30935A(E e) {
            return C8853u.m47634a(this.f35059l, e, this.f35057j.getContext());
        }
    }

    /* renamed from: kotlinx.coroutines.e3.a$c */
    /* compiled from: AbstractChannel.kt */
    private final class C8697c extends C8772h {

        /* renamed from: g */
        private final C8717n<?> f35060g;

        public C8697c(C8717n<?> nVar) {
            this.f35060g = nVar;
        }

        /* renamed from: a */
        public void mo30936a(Throwable th) {
            if (this.f35060g.mo31140u()) {
                C8694a.this.mo30927x();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo30936a((Throwable) obj);
            return C8457t.f34900a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f35060g + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.e3.a$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C8698d extends C8842o.C8844b {

        /* renamed from: d */
        final /* synthetic */ C8694a f35062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8698d(C8842o oVar, C8694a aVar) {
            super(oVar);
            this.f35062d = aVar;
        }

        /* renamed from: i */
        public Object mo30938g(C8842o oVar) {
            if (this.f35062d.mo30926w()) {
                return null;
            }
            return C8841n.m47580a();
        }
    }

    public C8694a(C8570l<? super E, C8457t> lVar) {
        super(lVar);
    }

    /* renamed from: A */
    private final <R> Object m47148A(int i, C8508d<? super R> dVar) {
        C8695a aVar;
        C8901r<? super R> b = C8909t.m47814b(C8522c.m46721c(dVar));
        if (this.f35069b == null) {
            aVar = new C8695a(b, i);
        } else {
            aVar = new C8696b(b, i, this.f35069b);
        }
        while (true) {
            if (!m47152t(aVar)) {
                Object z = mo30929z();
                if (!(z instanceof C8712i)) {
                    if (z != C8699b.f35066d) {
                        b.mo31219g(aVar.mo30931C(z), aVar.mo30935A(z));
                        break;
                    }
                } else {
                    aVar.mo30930B((C8712i) z);
                    break;
                }
            } else {
                m47149B(b, aVar);
                break;
            }
        }
        Object v = b.mo31235v();
        if (v == C8527d.m46722d()) {
            C8535h.m46737c(dVar);
        }
        return v;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m47149B(C8894q<?> qVar, C8717n<?> nVar) {
        qVar.mo31216b(new C8697c(nVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final boolean m47152t(C8717n<? super E> nVar) {
        boolean u = mo30924u(nVar);
        if (u) {
            mo30928y();
        }
        return u;
    }

    /* renamed from: a */
    public final Object mo30921a() {
        Object z = mo30929z();
        if (z == C8699b.f35066d) {
            return C8708h.f35082b.mo30962b();
        }
        if (z instanceof C8712i) {
            return C8708h.f35082b.mo30961a(((C8712i) z).f35086j);
        }
        C8708h.f35082b.mo30963c(z);
        return z;
    }

    /* renamed from: b */
    public final Object mo30922b(C8508d<? super E> dVar) {
        Object z = mo30929z();
        if (z == C8699b.f35066d || (z instanceof C8712i)) {
            return m47148A(0, dVar);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C8719p<E> mo30923p() {
        C8719p<E> p = super.mo30923p();
        if (p != null && !(p instanceof C8712i)) {
            mo30927x();
        }
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo30924u(C8717n<? super E> nVar) {
        int y;
        C8842o q;
        if (mo30925v()) {
            C8840m h = mo30944h();
            do {
                q = h.mo31147q();
                if (!(!(q instanceof C8721r))) {
                    return false;
                }
            } while (!q.mo31143i(nVar, h));
        } else {
            C8840m h2 = mo30944h();
            C8698d dVar = new C8698d(nVar, this);
            do {
                C8842o q2 = h2.mo31147q();
                if (!(!(q2 instanceof C8721r))) {
                    return false;
                }
                y = q2.mo31152y(nVar, h2, dVar);
                if (y != 1) {
                }
            } while (y != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract boolean mo30925v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract boolean mo30926w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo30927x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo30928y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object mo30929z() {
        while (true) {
            C8721r q = mo30948q();
            if (q == null) {
                return C8699b.f35066d;
            }
            C8859z B = q.mo30951B((C8842o.C8845c) null);
            if (B != null) {
                if (C8919v0.m47824a()) {
                    if (!(B == C8905s.f35297a)) {
                        throw new AssertionError();
                    }
                }
                q.mo30952z();
                return q.mo30950A();
            }
            q.mo30970C();
        }
    }
}
