package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.C7845w;
import p394k.C8620a0;
import p394k.C8645n;
import p394k.C8659y;

/* renamed from: f.h.b.z.j.i */
/* compiled from: HttpTransport */
public final class C7883i implements C7892q {

    /* renamed from: a */
    private final C7878g f33464a;

    /* renamed from: b */
    private final C7868e f33465b;

    public C7883i(C7878g gVar, C7868e eVar) {
        this.f33464a = gVar;
        this.f33465b = eVar;
    }

    /* renamed from: i */
    private C8620a0 m43186i(C7842v vVar) throws IOException {
        if (!C7878g.m43156p(vVar)) {
            return this.f33465b.mo29310q(0);
        }
        if ("chunked".equalsIgnoreCase(vVar.mo29240p("Transfer-Encoding"))) {
            return this.f33465b.mo29308o(this.f33464a);
        }
        long e = C7884j.m43199e(vVar);
        if (e != -1) {
            return this.f33465b.mo29310q(e);
        }
        return this.f33465b.mo29311r();
    }

    /* renamed from: a */
    public C8659y mo29344a(C7836t tVar, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(tVar.mo29216i("Transfer-Encoding"))) {
            return this.f33465b.mo29307n();
        }
        if (j != -1) {
            return this.f33465b.mo29309p(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: b */
    public void mo29345b() throws IOException {
        if (mo29350g()) {
            this.f33465b.mo29312s();
        } else {
            this.f33465b.mo29303j();
        }
    }

    /* renamed from: c */
    public void mo29346c(C7836t tVar) throws IOException {
        this.f33464a.mo29332G();
        this.f33465b.mo29316w(tVar.mo29217j(), C7887l.m43209a(tVar, this.f33464a.mo29335l().mo29116g().mo29267b().type(), this.f33464a.mo29335l().mo29115f()));
    }

    /* renamed from: d */
    public void mo29347d() throws IOException {
        this.f33465b.mo29304k();
    }

    /* renamed from: e */
    public void mo29348e(C7888m mVar) throws IOException {
        this.f33465b.mo29317x(mVar);
    }

    /* renamed from: f */
    public C7842v.C7844b mo29349f() throws IOException {
        return this.f33465b.mo29314u();
    }

    /* renamed from: g */
    public boolean mo29350g() {
        if (!"close".equalsIgnoreCase(this.f33464a.mo29336m().mo29216i("Connection")) && !"close".equalsIgnoreCase(this.f33464a.mo29337n().mo29240p("Connection")) && !this.f33465b.mo29305l()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C7845w mo29351h(C7842v vVar) throws IOException {
        return new C7886k(vVar.mo29242r(), C8645n.m46985b(m43186i(vVar)));
    }
}
