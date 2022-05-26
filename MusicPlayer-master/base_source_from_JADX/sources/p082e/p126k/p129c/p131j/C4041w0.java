package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p082e.p126k.p129c.p131j.C3920e0;
import p082e.p126k.p129c.p131j.C4028v;
import p082e.p126k.p129c.p131j.C4042w1;

/* renamed from: e.k.c.j.w0 */
/* compiled from: MessageSetSchema */
final class C4041w0<T> implements C3963j1<T> {

    /* renamed from: a */
    private final C4012s0 f12217a;

    /* renamed from: b */
    private final C4006q1<?, ?> f12218b;

    /* renamed from: c */
    private final boolean f12219c;

    /* renamed from: d */
    private final C4007r<?> f12220d;

    private C4041w0(C4006q1<?, ?> q1Var, C4007r<?> rVar, C4012s0 s0Var) {
        this.f12218b = q1Var;
        this.f12219c = rVar.mo13936e(s0Var);
        this.f12220d = rVar;
        this.f12217a = s0Var;
    }

    /* renamed from: j */
    private <UT, UB> int m17888j(C4006q1<UT, UB> q1Var, T t) {
        return q1Var.mo13920i(q1Var.mo13918g(t));
    }

    /* renamed from: k */
    private <UT, UB, ET extends C4028v.C4030b<ET>> void m17889k(C4006q1<UT, UB> q1Var, C4007r<ET> rVar, T t, C3933h1 h1Var, C4003q qVar) throws IOException {
        UB f = q1Var.mo13917f(t);
        C4028v<ET> d = rVar.mo13935d(t);
        do {
            try {
                if (h1Var.mo13524z() == Integer.MAX_VALUE) {
                    q1Var.mo13926o(t, f);
                    return;
                }
            } finally {
                q1Var.mo13926o(t, f);
            }
        } while (m17891m(h1Var, qVar, rVar, d, q1Var, f));
    }

    /* renamed from: l */
    static <T> C4041w0<T> m17890l(C4006q1<?, ?> q1Var, C4007r<?> rVar, C4012s0 s0Var) {
        return new C4041w0<>(q1Var, rVar, s0Var);
    }

    /* renamed from: m */
    private <UT, UB, ET extends C4028v.C4030b<ET>> boolean m17891m(C3933h1 h1Var, C4003q qVar, C4007r<ET> rVar, C4028v<ET> vVar, C4006q1<UT, UB> q1Var, UB ub) throws IOException {
        int W = h1Var.mo13493W();
        if (W == C4042w1.f12221a) {
            int i = 0;
            Object obj = null;
            C3934i iVar = null;
            while (h1Var.mo13524z() != Integer.MAX_VALUE) {
                int W2 = h1Var.mo13493W();
                if (W2 == C4042w1.f12223c) {
                    i = h1Var.mo13510n();
                    obj = rVar.mo13933b(qVar, this.f12217a, i);
                } else if (W2 == C4042w1.f12224d) {
                    if (obj != null) {
                        rVar.mo13939h(h1Var, obj, qVar, vVar);
                    } else {
                        iVar = h1Var.mo13480C();
                    }
                } else if (!h1Var.mo13484G()) {
                    break;
                }
            }
            if (h1Var.mo13493W() == C4042w1.f12222b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo13940i(iVar, obj, qVar, vVar);
                    } else {
                        q1Var.mo13915d(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C3911c0.invalidEndTag();
        } else if (C4042w1.m17903b(W) != 2) {
            return h1Var.mo13484G();
        } else {
            Object b = rVar.mo13933b(qVar, this.f12217a, C4042w1.m17902a(W));
            if (b == null) {
                return q1Var.mo13924m(ub, h1Var);
            }
            rVar.mo13939h(h1Var, b, qVar, vVar);
            return true;
        }
    }

    /* renamed from: n */
    private <UT, UB> void m17892n(C4006q1<UT, UB> q1Var, T t, C4052x1 x1Var) throws IOException {
        q1Var.mo13930s(q1Var.mo13918g(t), x1Var);
    }

    /* renamed from: a */
    public void mo13704a(T t, T t2) {
        C3978l1.m17300G(this.f12218b, t, t2);
        if (this.f12219c) {
            C3978l1.m17298E(this.f12220d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo13705b(T t, C3933h1 h1Var, C4003q qVar) throws IOException {
        m17889k(this.f12218b, this.f12220d, t, h1Var, qVar);
    }

    /* renamed from: c */
    public void mo13706c(T t) {
        this.f12218b.mo13921j(t);
        this.f12220d.mo13937f(t);
    }

    /* renamed from: d */
    public final boolean mo13707d(T t) {
        return this.f12220d.mo13934c(t).mo14034p();
    }

    /* renamed from: e */
    public void mo13708e(T t, C4052x1 x1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> s = this.f12220d.mo13934c(t).mo14035s();
        while (s.hasNext()) {
            Map.Entry next = s.next();
            C4028v.C4030b bVar = (C4028v.C4030b) next.getKey();
            if (bVar.mo14043m() != C4042w1.C4049c.MESSAGE || bVar.mo14039e() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C3920e0.C3922b) {
                x1Var.mo13799c(bVar.getNumber(), ((C3920e0.C3922b) next).mo13529a().mo13560e());
            } else {
                x1Var.mo13799c(bVar.getNumber(), next.getValue());
            }
        }
        m17892n(this.f12218b, t, x1Var);
    }

    /* renamed from: f */
    public boolean mo13709f(T t, T t2) {
        if (!this.f12218b.mo13918g(t).equals(this.f12218b.mo13918g(t2))) {
            return false;
        }
        if (this.f12219c) {
            return this.f12220d.mo13934c(t).equals(this.f12220d.mo13934c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public int mo13710g(T t) {
        int j = m17888j(this.f12218b, t) + 0;
        return this.f12219c ? j + this.f12220d.mo13934c(t).mo14030j() : j;
    }

    /* renamed from: h */
    public T mo13711h() {
        return this.f12217a.mo13955g().mo13958x();
    }

    /* renamed from: i */
    public int mo13712i(T t) {
        int hashCode = this.f12218b.mo13918g(t).hashCode();
        return this.f12219c ? (hashCode * 53) + this.f12220d.mo13934c(t).hashCode() : hashCode;
    }
}
