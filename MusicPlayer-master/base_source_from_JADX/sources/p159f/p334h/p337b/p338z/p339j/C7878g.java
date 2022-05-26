package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.helper.HttpConnection;
import p159f.p334h.p337b.C7805a;
import p159f.p334h.p337b.C7813f;
import p159f.p334h.p337b.C7818i;
import p159f.p334h.p337b.C7819j;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7830p;
import p159f.p334h.p337b.C7832q;
import p159f.p334h.p337b.C7833r;
import p159f.p334h.p337b.C7835s;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7839u;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.C7845w;
import p159f.p334h.p337b.C7846x;
import p159f.p334h.p337b.p338z.C7848a;
import p159f.p334h.p337b.p338z.C7849b;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.C7861i;
import p159f.p334h.p337b.p338z.p339j.C7864c;
import p394k.C8620a0;
import p394k.C8622b0;
import p394k.C8633e;
import p394k.C8636f;
import p394k.C8637g;
import p394k.C8642k;
import p394k.C8645n;
import p394k.C8659y;

/* renamed from: f.h.b.z.j.g */
/* compiled from: HttpEngine */
public final class C7878g {

    /* renamed from: u */
    private static final C7845w f33436u = new C7879a();

    /* renamed from: a */
    final C7833r f33437a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7818i f33438b;

    /* renamed from: c */
    private C7805a f33439c;

    /* renamed from: d */
    private C7889n f33440d;

    /* renamed from: e */
    private C7846x f33441e;

    /* renamed from: f */
    private final C7842v f33442f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C7892q f33443g;

    /* renamed from: h */
    long f33444h = -1;

    /* renamed from: i */
    private boolean f33445i;

    /* renamed from: j */
    public final boolean f33446j;

    /* renamed from: k */
    private final C7836t f33447k;

    /* renamed from: l */
    private C7836t f33448l;

    /* renamed from: m */
    private C7842v f33449m;

    /* renamed from: n */
    private C7842v f33450n;

    /* renamed from: o */
    private C8659y f33451o;

    /* renamed from: p */
    private C8636f f33452p;

    /* renamed from: q */
    private final boolean f33453q;

    /* renamed from: r */
    private final boolean f33454r;

    /* renamed from: s */
    private C7863b f33455s;

    /* renamed from: t */
    private C7864c f33456t;

    /* renamed from: f.h.b.z.j.g$a */
    /* compiled from: HttpEngine */
    static class C7879a extends C7845w {
        C7879a() {
        }

        /* renamed from: d */
        public long mo29263d() {
            return 0;
        }

        /* renamed from: p */
        public C7832q mo29264p() {
            return null;
        }

        /* renamed from: x */
        public C8637g mo29265x() {
            return new C8633e();
        }
    }

    /* renamed from: f.h.b.z.j.g$b */
    /* compiled from: HttpEngine */
    class C7880b implements C8620a0 {

        /* renamed from: g */
        boolean f33457g;

        /* renamed from: h */
        final /* synthetic */ C8637g f33458h;

        /* renamed from: i */
        final /* synthetic */ C7863b f33459i;

        /* renamed from: j */
        final /* synthetic */ C8636f f33460j;

        C7880b(C7878g gVar, C8637g gVar2, C7863b bVar, C8636f fVar) {
            this.f33458h = gVar2;
            this.f33459i = bVar;
            this.f33460j = fVar;
        }

        public void close() throws IOException {
            if (!this.f33457g && !C7859h.m43081e(this, 100, TimeUnit.MILLISECONDS)) {
                this.f33457g = true;
                this.f33459i.abort();
            }
            this.f33458h.close();
        }

        public C8622b0 timeout() {
            return this.f33458h.timeout();
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            try {
                long w0 = this.f33458h.mo29326w0(eVar, j);
                if (w0 == -1) {
                    if (!this.f33457g) {
                        this.f33457g = true;
                        this.f33460j.close();
                    }
                    return -1;
                }
                eVar.mo30685T(this.f33460j.mo30702e(), eVar.mo30688U0() - w0, w0);
                this.f33460j.mo30673J();
                return w0;
            } catch (IOException e) {
                if (!this.f33457g) {
                    this.f33457g = true;
                    this.f33459i.abort();
                }
                throw e;
            }
        }
    }

    /* renamed from: f.h.b.z.j.g$c */
    /* compiled from: HttpEngine */
    class C7881c implements C7830p.C7831a {

        /* renamed from: a */
        private final int f33461a;

        /* renamed from: b */
        private int f33462b;

        C7881c(int i, C7836t tVar) {
            this.f33461a = i;
        }

        /* renamed from: a */
        public C7842v mo29102a(C7836t tVar) throws IOException {
            this.f33462b++;
            if (this.f33461a > 0) {
                C7830p pVar = C7878g.this.f33437a.mo29174B().get(this.f33461a - 1);
                C7805a a = mo29343b().mo29116g().mo29266a();
                if (!tVar.mo29222o().getHost().equals(a.mo29080d()) || C7859h.m43086j(tVar.mo29222o()) != a.mo29081e()) {
                    throw new IllegalStateException("network interceptor " + pVar + " must retain the same host and port");
                } else if (this.f33462b > 1) {
                    throw new IllegalStateException("network interceptor " + pVar + " must call proceed() exactly once");
                }
            }
            if (this.f33461a < C7878g.this.f33437a.mo29174B().size()) {
                C7878g gVar = C7878g.this;
                C7881c cVar = new C7881c(this.f33461a + 1, tVar);
                C7830p pVar2 = gVar.f33437a.mo29174B().get(this.f33461a);
                C7842v a2 = pVar2.mo29168a(cVar);
                if (cVar.f33462b == 1) {
                    return a2;
                }
                throw new IllegalStateException("network interceptor " + pVar2 + " must call proceed() exactly once");
            }
            C7878g.this.f33443g.mo29346c(tVar);
            if (C7878g.this.mo29339v() && tVar.mo29214g() != null) {
                C8636f a3 = C8645n.m46984a(C7878g.this.f33443g.mo29344a(tVar, tVar.mo29214g().contentLength()));
                tVar.mo29214g().writeTo(a3);
                a3.close();
            }
            return C7878g.this.m43162w();
        }

        /* renamed from: b */
        public C7818i mo29343b() {
            return C7878g.this.f33438b;
        }
    }

    public C7878g(C7833r rVar, C7836t tVar, boolean z, boolean z2, boolean z3, C7818i iVar, C7889n nVar, C7888m mVar, C7842v vVar) {
        this.f33437a = rVar;
        this.f33447k = tVar;
        this.f33446j = z;
        this.f33453q = z2;
        this.f33454r = z3;
        this.f33438b = iVar;
        this.f33440d = nVar;
        this.f33451o = mVar;
        this.f33442f = vVar;
        if (iVar != null) {
            C7848a.f33368b.mo29211k(iVar, this);
            this.f33441e = iVar.mo29116g();
            return;
        }
        this.f33441e = null;
    }

    /* renamed from: D */
    private static C7842v m43144D(C7842v vVar) {
        if (vVar == null || vVar.mo29235k() == null) {
            return vVar;
        }
        C7842v.C7844b t = vVar.mo29244t();
        t.mo29249l((C7845w) null);
        return t.mo29250m();
    }

    /* renamed from: E */
    private C7842v m43145E(C7842v vVar) throws IOException {
        if (!this.f33445i || !"gzip".equalsIgnoreCase(this.f33450n.mo29240p(HttpConnection.CONTENT_ENCODING)) || vVar.mo29235k() == null) {
            return vVar;
        }
        C8642k kVar = new C8642k(vVar.mo29235k().mo29265x());
        C7827o.C7829b e = vVar.mo29242r().mo29159e();
        e.mo29166f(HttpConnection.CONTENT_ENCODING);
        e.mo29166f("Content-Length");
        C7827o e2 = e.mo29165e();
        C7842v.C7844b t = vVar.mo29244t();
        t.mo29255t(e2);
        t.mo29249l(new C7886k(e2, C8645n.m46985b(kVar)));
        return t.mo29250m();
    }

    /* renamed from: F */
    private static boolean m43146F(C7842v vVar, C7842v vVar2) {
        Date c;
        if (vVar2.mo29238n() == 304) {
            return true;
        }
        Date c2 = vVar.mo29242r().mo29157c("Last-Modified");
        if (c2 == null || (c = vVar2.mo29242r().mo29157c("Last-Modified")) == null || c.getTime() >= c2.getTime()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private C7842v m43150d(C7863b bVar, C7842v vVar) throws IOException {
        C8659y body;
        if (bVar == null || (body = bVar.body()) == null) {
            return vVar;
        }
        C7880b bVar2 = new C7880b(this, vVar.mo29235k().mo29265x(), bVar, C8645n.m46984a(body));
        C7842v.C7844b t = vVar.mo29244t();
        t.mo29249l(new C7886k(vVar.mo29242r(), C8645n.m46985b(bVar2)));
        return t.mo29250m();
    }

    /* renamed from: f */
    private static C7827o m43151f(C7827o oVar, C7827o oVar2) throws IOException {
        C7827o.C7829b bVar = new C7827o.C7829b();
        int f = oVar.mo29160f();
        for (int i = 0; i < f; i++) {
            String d = oVar.mo29158d(i);
            String g = oVar.mo29161g(i);
            if ((!"Warning".equalsIgnoreCase(d) || !g.startsWith("1")) && (!C7884j.m43200f(d) || oVar2.mo29156a(d) == null)) {
                bVar.mo29163b(d, g);
            }
        }
        int f2 = oVar2.mo29160f();
        for (int i2 = 0; i2 < f2; i2++) {
            String d2 = oVar2.mo29158d(i2);
            if (!"Content-Length".equalsIgnoreCase(d2) && C7884j.m43200f(d2)) {
                bVar.mo29163b(d2, oVar2.mo29161g(i2));
            }
        }
        return bVar.mo29165e();
    }

    /* renamed from: g */
    private void m43152g() throws IOException {
        if (this.f33438b == null) {
            if (this.f33440d == null) {
                C7805a i = m43154i(this.f33437a, this.f33448l);
                this.f33439c = i;
                this.f33440d = C7889n.m43216b(i, this.f33448l, this.f33437a);
            }
            C7818i u = m43161u();
            this.f33438b = u;
            this.f33441e = u.mo29116g();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    private void m43153h(C7889n nVar, IOException iOException) {
        if (C7848a.f33368b.mo29209i(this.f33438b) <= 0) {
            nVar.mo29356a(this.f33438b.mo29116g(), iOException);
        }
    }

    /* renamed from: i */
    private static C7805a m43154i(C7833r rVar, C7836t tVar) throws UnknownHostException {
        C7813f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        String host = tVar.mo29222o().getHost();
        if (host == null || host.length() == 0) {
            throw new UnknownHostException(tVar.mo29222o().toString());
        }
        if (tVar.mo29218k()) {
            sSLSocketFactory = rVar.mo29198w();
            hostnameVerifier = rVar.mo29191o();
            fVar = rVar.mo29183f();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new C7805a(host, C7859h.m43086j(tVar.mo29222o()), rVar.mo29197v(), sSLSocketFactory, hostnameVerifier, fVar, rVar.mo29182e(), rVar.mo29193r(), rVar.mo29192q(), rVar.mo29186i(), rVar.mo29194s());
    }

    /* renamed from: j */
    private C7818i m43155j() throws IOException {
        C7818i c;
        C7819j h = this.f33437a.mo29185h();
        while (true) {
            c = h.mo29131c(this.f33439c);
            if (c == null) {
                return new C7818i(h, this.f33440d.mo29358i());
            }
            if (this.f33448l.mo29219l().equals("GET") || C7848a.f33368b.mo29205e(c)) {
                return c;
            }
            c.mo29117h().close();
        }
        return c;
    }

    /* renamed from: p */
    public static boolean m43156p(C7842v vVar) {
        if (vVar.mo29247v().mo29219l().equals("HEAD")) {
            return false;
        }
        int n = vVar.mo29238n();
        if (((n >= 100 && n < 200) || n == 204 || n == 304) && C7884j.m43199e(vVar) == -1 && !"chunked".equalsIgnoreCase(vVar.mo29240p("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static String m43157q(URL url) {
        if (C7859h.m43086j(url) == C7859h.m43083g(url.getProtocol())) {
            return url.getHost();
        }
        return url.getHost() + ":" + url.getPort();
    }

    /* renamed from: r */
    private boolean m43158r(IOException iOException) {
        if (this.f33437a.mo29196u() && !(iOException instanceof SSLPeerUnverifiedException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException))) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private void m43159s() throws IOException {
        C7849b d = C7848a.f33368b.mo29204d(this.f33437a);
        if (d != null) {
            if (C7864c.m43099a(this.f33450n, this.f33448l)) {
                this.f33455s = d.mo29271a(m43144D(this.f33450n));
            } else if (C7882h.m43183a(this.f33448l.mo29219l())) {
                try {
                    d.mo29274d(this.f33448l);
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: t */
    private C7836t m43160t(C7836t tVar) throws IOException {
        C7836t.C7838b m = tVar.mo29220m();
        if (tVar.mo29216i("Host") == null) {
            m.mo29227i("Host", m43157q(tVar.mo29222o()));
        }
        C7818i iVar = this.f33438b;
        if ((iVar == null || iVar.mo29115f() != C7835s.HTTP_1_0) && tVar.mo29216i("Connection") == null) {
            m.mo29227i("Connection", "Keep-Alive");
        }
        if (tVar.mo29216i("Accept-Encoding") == null) {
            this.f33445i = true;
            m.mo29227i("Accept-Encoding", "gzip");
        }
        CookieHandler j = this.f33437a.mo29187j();
        if (j != null) {
            C7884j.m43195a(m, j.get(tVar.mo29221n(), C7884j.m43204j(m.mo29226h().mo29217j(), (String) null)));
        }
        if (tVar.mo29216i("User-Agent") == null) {
            m.mo29227i("User-Agent", C7861i.m43095a());
        }
        return m.mo29226h();
    }

    /* renamed from: u */
    private C7818i m43161u() throws IOException {
        C7818i j = m43155j();
        C7848a.f33368b.mo29203c(this.f33437a, j, this, this.f33448l);
        return j;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public C7842v m43162w() throws IOException {
        this.f33443g.mo29347d();
        C7842v.C7844b f = this.f33443g.mo29349f();
        f.mo29260y(this.f33448l);
        f.mo29253r(this.f33438b.mo29113d());
        f.mo29254s(C7884j.f33468c, Long.toString(this.f33444h));
        f.mo29254s(C7884j.f33469d, Long.toString(System.currentTimeMillis()));
        C7842v m = f.mo29250m();
        if (!this.f33454r) {
            C7842v.C7844b t = m.mo29244t();
            t.mo29249l(this.f33443g.mo29351h(m));
            m = t.mo29250m();
        }
        C7848a.f33368b.mo29212l(this.f33438b, m.mo29246u());
        return m;
    }

    /* renamed from: A */
    public void mo29329A() throws IOException {
        C7892q qVar = this.f33443g;
        if (!(qVar == null || this.f33438b == null)) {
            qVar.mo29345b();
        }
        this.f33438b = null;
    }

    /* renamed from: B */
    public boolean mo29330B(URL url) {
        URL o = this.f33447k.mo29222o();
        return o.getHost().equals(url.getHost()) && C7859h.m43086j(o) == C7859h.m43086j(url) && o.getProtocol().equals(url.getProtocol());
    }

    /* renamed from: C */
    public void mo29331C() throws IOException {
        if (this.f33456t == null) {
            if (this.f33443g == null) {
                C7836t t = m43160t(this.f33447k);
                C7849b d = C7848a.f33368b.mo29204d(this.f33437a);
                C7842v c = d != null ? d.mo29273c(t) : null;
                C7864c c2 = new C7864c.C7866b(System.currentTimeMillis(), t, c).mo29301c();
                this.f33456t = c2;
                this.f33448l = c2.f33396a;
                this.f33449m = c2.f33397b;
                if (d != null) {
                    d.mo29275e(c2);
                }
                if (c != null && this.f33449m == null) {
                    C7859h.m43079c(c.mo29235k());
                }
                if (this.f33448l != null) {
                    if (this.f33438b == null) {
                        m43152g();
                    }
                    this.f33443g = C7848a.f33368b.mo29207g(this.f33438b, this);
                    if (this.f33453q && mo29339v() && this.f33451o == null) {
                        long d2 = C7884j.m43198d(t);
                        if (!this.f33446j) {
                            this.f33443g.mo29346c(this.f33448l);
                            this.f33451o = this.f33443g.mo29344a(this.f33448l, d2);
                        } else if (d2 > 2147483647L) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        } else if (d2 != -1) {
                            this.f33443g.mo29346c(this.f33448l);
                            this.f33451o = new C7888m((int) d2);
                        } else {
                            this.f33451o = new C7888m();
                        }
                    }
                } else {
                    if (this.f33438b != null) {
                        C7848a.f33368b.mo29208h(this.f33437a.mo29185h(), this.f33438b);
                        this.f33438b = null;
                    }
                    C7842v vVar = this.f33449m;
                    if (vVar != null) {
                        C7842v.C7844b t2 = vVar.mo29244t();
                        t2.mo29260y(this.f33447k);
                        t2.mo29258w(m43144D(this.f33442f));
                        t2.mo29251n(m43144D(this.f33449m));
                        this.f33450n = t2.mo29250m();
                    } else {
                        C7842v.C7844b bVar = new C7842v.C7844b();
                        bVar.mo29260y(this.f33447k);
                        bVar.mo29258w(m43144D(this.f33442f));
                        bVar.mo29259x(C7835s.HTTP_1_1);
                        bVar.mo29252q(504);
                        bVar.mo29256u("Unsatisfiable Request (only-if-cached)");
                        bVar.mo29249l(f33436u);
                        this.f33450n = bVar.mo29250m();
                    }
                    this.f33450n = m43145E(this.f33450n);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: G */
    public void mo29332G() {
        if (this.f33444h == -1) {
            this.f33444h = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public C7818i mo29333e() {
        C8636f fVar = this.f33452p;
        if (fVar != null) {
            C7859h.m43079c(fVar);
        } else {
            C8659y yVar = this.f33451o;
            if (yVar != null) {
                C7859h.m43079c(yVar);
            }
        }
        C7842v vVar = this.f33450n;
        if (vVar == null) {
            C7818i iVar = this.f33438b;
            if (iVar != null) {
                C7859h.m43080d(iVar.mo29117h());
            }
            this.f33438b = null;
            return null;
        }
        C7859h.m43079c(vVar.mo29235k());
        C7892q qVar = this.f33443g;
        if (qVar == null || this.f33438b == null || qVar.mo29350g()) {
            C7818i iVar2 = this.f33438b;
            if (iVar2 != null && !C7848a.f33368b.mo29202b(iVar2)) {
                this.f33438b = null;
            }
            C7818i iVar3 = this.f33438b;
            this.f33438b = null;
            return iVar3;
        }
        C7859h.m43080d(this.f33438b.mo29117h());
        this.f33438b = null;
        return null;
    }

    /* renamed from: k */
    public C7836t mo29334k() throws IOException {
        Proxy proxy;
        String p;
        if (this.f33450n != null) {
            if (mo29338o() != null) {
                proxy = mo29338o().mo29267b();
            } else {
                proxy = this.f33437a.mo29193r();
            }
            int n = this.f33450n.mo29238n();
            if (n != 307 && n != 308) {
                if (n != 401) {
                    if (n != 407) {
                        switch (n) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (proxy.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
                return C7884j.m43202h(this.f33437a.mo29182e(), this.f33450n, proxy);
            } else if (!this.f33447k.mo29219l().equals("GET") && !this.f33447k.mo29219l().equals("HEAD")) {
                return null;
            }
            if (!this.f33437a.mo29189m() || (p = this.f33450n.mo29240p("Location")) == null) {
                return null;
            }
            URL url = new URL(this.f33447k.mo29222o(), p);
            if (!url.getProtocol().equals("https") && !url.getProtocol().equals("http")) {
                return null;
            }
            if (!url.getProtocol().equals(this.f33447k.mo29222o().getProtocol()) && !this.f33437a.mo29190n()) {
                return null;
            }
            C7836t.C7838b m = this.f33447k.mo29220m();
            if (C7882h.m43184b(this.f33447k.mo29219l())) {
                m.mo29228j("GET", (C7839u) null);
                m.mo29229k("Transfer-Encoding");
                m.mo29229k("Content-Length");
                m.mo29229k("Content-Type");
            }
            if (!mo29330B(url)) {
                m.mo29229k("Authorization");
            }
            m.mo29231m(url);
            return m.mo29226h();
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public C7818i mo29335l() {
        return this.f33438b;
    }

    /* renamed from: m */
    public C7836t mo29336m() {
        return this.f33447k;
    }

    /* renamed from: n */
    public C7842v mo29337n() {
        C7842v vVar = this.f33450n;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public C7846x mo29338o() {
        return this.f33441e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo29339v() {
        return C7882h.m43184b(this.f33447k.mo29219l());
    }

    /* renamed from: x */
    public void mo29340x() throws IOException {
        C7842v vVar;
        if (this.f33450n == null) {
            C7836t tVar = this.f33448l;
            if (tVar == null && this.f33449m == null) {
                throw new IllegalStateException("call sendRequest() first!");
            } else if (tVar != null) {
                if (this.f33454r) {
                    this.f33443g.mo29346c(tVar);
                    vVar = m43162w();
                } else if (!this.f33453q) {
                    vVar = new C7881c(0, tVar).mo29102a(tVar);
                } else {
                    C8636f fVar = this.f33452p;
                    if (fVar != null && fVar.mo30702e().mo30688U0() > 0) {
                        this.f33452p.mo30727s();
                    }
                    if (this.f33444h == -1) {
                        if (C7884j.m43198d(this.f33448l) == -1) {
                            C8659y yVar = this.f33451o;
                            if (yVar instanceof C7888m) {
                                long c = ((C7888m) yVar).mo29354c();
                                C7836t.C7838b m = this.f33448l.mo29220m();
                                m.mo29227i("Content-Length", Long.toString(c));
                                this.f33448l = m.mo29226h();
                            }
                        }
                        this.f33443g.mo29346c(this.f33448l);
                    }
                    C8659y yVar2 = this.f33451o;
                    if (yVar2 != null) {
                        C8636f fVar2 = this.f33452p;
                        if (fVar2 != null) {
                            fVar2.close();
                        } else {
                            yVar2.close();
                        }
                        C8659y yVar3 = this.f33451o;
                        if (yVar3 instanceof C7888m) {
                            this.f33443g.mo29348e((C7888m) yVar3);
                        }
                    }
                    vVar = m43162w();
                }
                mo29341y(vVar.mo29242r());
                C7842v vVar2 = this.f33449m;
                if (vVar2 != null) {
                    if (m43146F(vVar2, vVar)) {
                        C7842v.C7844b t = this.f33449m.mo29244t();
                        t.mo29260y(this.f33447k);
                        t.mo29258w(m43144D(this.f33442f));
                        t.mo29255t(m43151f(this.f33449m.mo29242r(), vVar.mo29242r()));
                        t.mo29251n(m43144D(this.f33449m));
                        t.mo29257v(m43144D(vVar));
                        this.f33450n = t.mo29250m();
                        vVar.mo29235k().close();
                        mo29329A();
                        C7849b d = C7848a.f33368b.mo29204d(this.f33437a);
                        d.mo29272b();
                        d.mo29276f(this.f33449m, m43144D(this.f33450n));
                        this.f33450n = m43145E(this.f33450n);
                        return;
                    }
                    C7859h.m43079c(this.f33449m.mo29235k());
                }
                C7842v.C7844b t2 = vVar.mo29244t();
                t2.mo29260y(this.f33447k);
                t2.mo29258w(m43144D(this.f33442f));
                t2.mo29251n(m43144D(this.f33449m));
                t2.mo29257v(m43144D(vVar));
                C7842v m2 = t2.mo29250m();
                this.f33450n = m2;
                if (m43156p(m2)) {
                    m43159s();
                    this.f33450n = m43145E(m43150d(this.f33455s, this.f33450n));
                }
            }
        }
    }

    /* renamed from: y */
    public void mo29341y(C7827o oVar) throws IOException {
        CookieHandler j = this.f33437a.mo29187j();
        if (j != null) {
            j.put(this.f33447k.mo29221n(), C7884j.m43204j(oVar, (String) null));
        }
    }

    /* renamed from: z */
    public C7878g mo29342z(IOException iOException, C8659y yVar) {
        C7889n nVar = this.f33440d;
        if (!(nVar == null || this.f33438b == null)) {
            m43153h(nVar, iOException);
        }
        boolean z = yVar == null || (yVar instanceof C7888m);
        C7889n nVar2 = this.f33440d;
        if (nVar2 == null && this.f33438b == null) {
            return null;
        }
        if ((nVar2 != null && !nVar2.mo29357d()) || !m43158r(iOException) || !z) {
            return null;
        }
        return new C7878g(this.f33437a, this.f33447k, this.f33446j, this.f33453q, this.f33454r, mo29333e(), this.f33440d, (C7888m) yVar, this.f33442f);
    }
}
