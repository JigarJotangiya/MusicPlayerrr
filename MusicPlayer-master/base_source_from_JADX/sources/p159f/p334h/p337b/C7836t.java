package p159f.p334h.p337b;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.p338z.C7854f;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p339j.C7882h;

/* renamed from: f.h.b.t */
/* compiled from: Request */
public final class C7836t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f33320a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f33321b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7827o f33322c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7839u f33323d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f33324e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile URL f33325f;

    /* renamed from: g */
    private volatile URI f33326g;

    /* renamed from: h */
    private volatile C7808d f33327h;

    /* renamed from: f.h.b.t$b */
    /* compiled from: Request */
    public static class C7838b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f33328a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public URL f33329b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f33330c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C7827o.C7829b f33331d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7839u f33332e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Object f33333f;

        /* renamed from: g */
        public C7838b mo29225g(String str, String str2) {
            this.f33331d.mo29163b(str, str2);
            return this;
        }

        /* renamed from: h */
        public C7836t mo29226h() {
            if (this.f33328a != null) {
                return new C7836t(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: i */
        public C7838b mo29227i(String str, String str2) {
            this.f33331d.mo29167g(str, str2);
            return this;
        }

        /* renamed from: j */
        public C7838b mo29228j(String str, C7839u uVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (uVar == null || C7882h.m43184b(str)) {
                if (uVar == null && C7882h.m43184b(str)) {
                    uVar = C7839u.create((C7832q) null, C7859h.f33390a);
                }
                this.f33330c = str;
                this.f33332e = uVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
        }

        /* renamed from: k */
        public C7838b mo29229k(String str) {
            this.f33331d.mo29166f(str);
            return this;
        }

        /* renamed from: l */
        public C7838b mo29230l(String str) {
            if (str != null) {
                this.f33328a = str;
                this.f33329b = null;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        /* renamed from: m */
        public C7838b mo29231m(URL url) {
            if (url != null) {
                this.f33329b = url;
                this.f33328a = url.toString();
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public C7838b() {
            this.f33330c = "GET";
            this.f33331d = new C7827o.C7829b();
        }

        private C7838b(C7836t tVar) {
            this.f33328a = tVar.f33320a;
            this.f33329b = tVar.f33325f;
            this.f33330c = tVar.f33321b;
            this.f33332e = tVar.f33323d;
            this.f33333f = tVar.f33324e;
            this.f33331d = tVar.f33322c.mo29159e();
        }
    }

    /* renamed from: g */
    public C7839u mo29214g() {
        return this.f33323d;
    }

    /* renamed from: h */
    public C7808d mo29215h() {
        C7808d dVar = this.f33327h;
        if (dVar != null) {
            return dVar;
        }
        C7808d k = C7808d.m42801k(this.f33322c);
        this.f33327h = k;
        return k;
    }

    /* renamed from: i */
    public String mo29216i(String str) {
        return this.f33322c.mo29156a(str);
    }

    /* renamed from: j */
    public C7827o mo29217j() {
        return this.f33322c;
    }

    /* renamed from: k */
    public boolean mo29218k() {
        return mo29222o().getProtocol().equals("https");
    }

    /* renamed from: l */
    public String mo29219l() {
        return this.f33321b;
    }

    /* renamed from: m */
    public C7838b mo29220m() {
        return new C7838b();
    }

    /* renamed from: n */
    public URI mo29221n() throws IOException {
        try {
            URI uri = this.f33326g;
            if (uri != null) {
                return uri;
            }
            URI k = C7854f.m43054f().mo29292k(mo29222o());
            this.f33326g = k;
            return k;
        } catch (URISyntaxException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: o */
    public URL mo29222o() {
        try {
            URL url = this.f33325f;
            if (url != null) {
                return url;
            }
            URL url2 = new URL(this.f33320a);
            this.f33325f = url2;
            return url2;
        } catch (MalformedURLException e) {
            throw new RuntimeException("Malformed URL: " + this.f33320a, e);
        }
    }

    /* renamed from: p */
    public String mo29223p() {
        return this.f33320a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f33321b);
        sb.append(", url=");
        sb.append(this.f33320a);
        sb.append(", tag=");
        Object obj = this.f33324e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private C7836t(C7838b bVar) {
        this.f33320a = bVar.f33328a;
        this.f33321b = bVar.f33330c;
        this.f33322c = bVar.f33331d.mo29165e();
        this.f33323d = bVar.f33332e;
        this.f33324e = bVar.f33333f != null ? bVar.f33333f : this;
        this.f33325f = bVar.f33329b;
    }
}
