package p159f.p334h.p337b;

import java.util.Collections;
import java.util.List;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.p338z.p339j.C7884j;

/* renamed from: f.h.b.v */
/* compiled from: Response */
public final class C7842v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7836t f33340a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7835s f33341b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f33342c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f33343d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7826n f33344e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7827o f33345f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7845w f33346g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7842v f33347h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7842v f33348i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C7842v f33349j;

    /* renamed from: k */
    private volatile C7808d f33350k;

    /* renamed from: f.h.b.v$b */
    /* compiled from: Response */
    public static class C7844b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7836t f33351a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C7835s f33352b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f33353c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f33354d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7826n f33355e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C7827o.C7829b f33356f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C7845w f33357g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C7842v f33358h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C7842v f33359i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C7842v f33360j;

        /* renamed from: o */
        private void m43002o(C7842v vVar) {
            if (vVar.f33346g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: p */
        private void m43003p(String str, C7842v vVar) {
            if (vVar.f33346g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (vVar.f33347h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (vVar.f33348i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (vVar.f33349j != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        /* renamed from: k */
        public C7844b mo29248k(String str, String str2) {
            this.f33356f.mo29163b(str, str2);
            return this;
        }

        /* renamed from: l */
        public C7844b mo29249l(C7845w wVar) {
            this.f33357g = wVar;
            return this;
        }

        /* renamed from: m */
        public C7842v mo29250m() {
            if (this.f33351a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f33352b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f33353c >= 0) {
                return new C7842v(this);
            } else {
                throw new IllegalStateException("code < 0: " + this.f33353c);
            }
        }

        /* renamed from: n */
        public C7844b mo29251n(C7842v vVar) {
            if (vVar != null) {
                m43003p("cacheResponse", vVar);
            }
            this.f33359i = vVar;
            return this;
        }

        /* renamed from: q */
        public C7844b mo29252q(int i) {
            this.f33353c = i;
            return this;
        }

        /* renamed from: r */
        public C7844b mo29253r(C7826n nVar) {
            this.f33355e = nVar;
            return this;
        }

        /* renamed from: s */
        public C7844b mo29254s(String str, String str2) {
            this.f33356f.mo29167g(str, str2);
            return this;
        }

        /* renamed from: t */
        public C7844b mo29255t(C7827o oVar) {
            this.f33356f = oVar.mo29159e();
            return this;
        }

        /* renamed from: u */
        public C7844b mo29256u(String str) {
            this.f33354d = str;
            return this;
        }

        /* renamed from: v */
        public C7844b mo29257v(C7842v vVar) {
            if (vVar != null) {
                m43003p("networkResponse", vVar);
            }
            this.f33358h = vVar;
            return this;
        }

        /* renamed from: w */
        public C7844b mo29258w(C7842v vVar) {
            if (vVar != null) {
                m43002o(vVar);
            }
            this.f33360j = vVar;
            return this;
        }

        /* renamed from: x */
        public C7844b mo29259x(C7835s sVar) {
            this.f33352b = sVar;
            return this;
        }

        /* renamed from: y */
        public C7844b mo29260y(C7836t tVar) {
            this.f33351a = tVar;
            return this;
        }

        public C7844b() {
            this.f33353c = -1;
            this.f33356f = new C7827o.C7829b();
        }

        private C7844b(C7842v vVar) {
            this.f33353c = -1;
            this.f33351a = vVar.f33340a;
            this.f33352b = vVar.f33341b;
            this.f33353c = vVar.f33342c;
            this.f33354d = vVar.f33343d;
            this.f33355e = vVar.f33344e;
            this.f33356f = vVar.f33345f.mo29159e();
            this.f33357g = vVar.f33346g;
            this.f33358h = vVar.f33347h;
            this.f33359i = vVar.f33348i;
            this.f33360j = vVar.f33349j;
        }
    }

    /* renamed from: k */
    public C7845w mo29235k() {
        return this.f33346g;
    }

    /* renamed from: l */
    public C7808d mo29236l() {
        C7808d dVar = this.f33350k;
        if (dVar != null) {
            return dVar;
        }
        C7808d k = C7808d.m42801k(this.f33345f);
        this.f33350k = k;
        return k;
    }

    /* renamed from: m */
    public List<C7816g> mo29237m() {
        String str;
        int i = this.f33342c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C7884j.m43201g(mo29242r(), str);
    }

    /* renamed from: n */
    public int mo29238n() {
        return this.f33342c;
    }

    /* renamed from: o */
    public C7826n mo29239o() {
        return this.f33344e;
    }

    /* renamed from: p */
    public String mo29240p(String str) {
        return mo29241q(str, (String) null);
    }

    /* renamed from: q */
    public String mo29241q(String str, String str2) {
        String a = this.f33345f.mo29156a(str);
        return a != null ? a : str2;
    }

    /* renamed from: r */
    public C7827o mo29242r() {
        return this.f33345f;
    }

    /* renamed from: s */
    public String mo29243s() {
        return this.f33343d;
    }

    /* renamed from: t */
    public C7844b mo29244t() {
        return new C7844b();
    }

    public String toString() {
        return "Response{protocol=" + this.f33341b + ", code=" + this.f33342c + ", message=" + this.f33343d + ", url=" + this.f33340a.mo29223p() + '}';
    }

    /* renamed from: u */
    public C7835s mo29246u() {
        return this.f33341b;
    }

    /* renamed from: v */
    public C7836t mo29247v() {
        return this.f33340a;
    }

    private C7842v(C7844b bVar) {
        this.f33340a = bVar.f33351a;
        this.f33341b = bVar.f33352b;
        this.f33342c = bVar.f33353c;
        this.f33343d = bVar.f33354d;
        this.f33344e = bVar.f33355e;
        this.f33345f = bVar.f33356f.mo29165e();
        this.f33346g = bVar.f33357g;
        this.f33347h = bVar.f33358h;
        this.f33348i = bVar.f33359i;
        this.f33349j = bVar.f33360j;
    }
}
