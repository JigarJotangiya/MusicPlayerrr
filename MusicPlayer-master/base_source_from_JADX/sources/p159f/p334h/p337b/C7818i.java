package p159f.p334h.p337b;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.p338z.C7854f;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p339j.C7868e;
import p159f.p334h.p337b.p338z.p339j.C7878g;
import p159f.p334h.p337b.p338z.p339j.C7883i;
import p159f.p334h.p337b.p338z.p339j.C7884j;
import p159f.p334h.p337b.p338z.p339j.C7890o;
import p159f.p334h.p337b.p338z.p339j.C7892q;
import p159f.p334h.p337b.p338z.p340k.C7921o;
import p159f.p334h.p337b.p338z.p341l.C7940b;
import p394k.C8620a0;

/* renamed from: f.h.b.i */
/* compiled from: Connection */
public final class C7818i {

    /* renamed from: a */
    private final C7819j f33253a;

    /* renamed from: b */
    private final C7846x f33254b;

    /* renamed from: c */
    private Socket f33255c;

    /* renamed from: d */
    private boolean f33256d = false;

    /* renamed from: e */
    private C7868e f33257e;

    /* renamed from: f */
    private C7921o f33258f;

    /* renamed from: g */
    private C7835s f33259g = C7835s.HTTP_1_1;

    /* renamed from: h */
    private long f33260h;

    /* renamed from: i */
    private C7826n f33261i;

    /* renamed from: j */
    private int f33262j;

    /* renamed from: k */
    private Object f33263k;

    public C7818i(C7819j jVar, C7846x xVar) {
        this.f33253a = jVar;
        this.f33254b = xVar;
    }

    /* renamed from: o */
    private void m42827o(C7836t tVar, int i, int i2) throws IOException {
        C7868e eVar = new C7868e(this.f33253a, this, this.f33255c);
        eVar.mo29315v(i, i2);
        URL o = tVar.mo29222o();
        String str = "CONNECT " + o.getHost() + ":" + o.getPort() + " HTTP/1.1";
        do {
            eVar.mo29316w(tVar.mo29217j(), str);
            eVar.mo29304k();
            C7842v.C7844b u = eVar.mo29314u();
            u.mo29260y(tVar);
            C7842v m = u.mo29250m();
            long e = C7884j.m43199e(m);
            if (e == -1) {
                e = 0;
            }
            C8620a0 q = eVar.mo29310q(e);
            C7859h.m43093q(q, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            q.close();
            int n = m.mo29238n();
            if (n != 200) {
                if (n == 407) {
                    C7846x xVar = this.f33254b;
                    tVar = C7884j.m43202h(xVar.f33361a.f33215h, m, xVar.f33362b);
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + m.mo29238n());
                }
            } else if (eVar.mo29302i() > 0) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (tVar != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: v */
    private C7836t m42828v(C7836t tVar) throws IOException {
        String str;
        if (!this.f33254b.mo29268c()) {
            return null;
        }
        String host = tVar.mo29222o().getHost();
        int j = C7859h.m43086j(tVar.mo29222o());
        if (j == C7859h.m43083g("https")) {
            str = host;
        } else {
            str = host + ":" + j;
        }
        C7836t.C7838b bVar = new C7836t.C7838b();
        bVar.mo29231m(new URL("https", host, j, "/"));
        bVar.mo29227i("Host", str);
        bVar.mo29227i("Proxy-Connection", "Keep-Alive");
        String i = tVar.mo29216i("User-Agent");
        if (i != null) {
            bVar.mo29227i("User-Agent", i);
        }
        String i2 = tVar.mo29216i("Proxy-Authorization");
        if (i2 != null) {
            bVar.mo29227i("Proxy-Authorization", i2);
        }
        return bVar.mo29226h();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w */
    private void m42829w(C7836t tVar, int i, int i2) throws IOException {
        String h;
        C7854f f = C7854f.m43054f();
        if (tVar != null) {
            m42827o(tVar, i, i2);
        }
        C7805a aVar = this.f33254b.f33361a;
        Socket createSocket = aVar.f33212e.createSocket(this.f33255c, aVar.f33209b, aVar.f33210c, true);
        this.f33255c = createSocket;
        SSLSocket sSLSocket = (SSLSocket) createSocket;
        C7846x xVar = this.f33254b;
        xVar.f33364d.mo29136c(sSLSocket, xVar);
        try {
            sSLSocket.startHandshake();
            if (this.f33254b.f33364d.mo29140g() && (h = f.mo29289h(sSLSocket)) != null) {
                this.f33259g = C7835s.get(h);
            }
            f.mo29285a(sSLSocket);
            this.f33261i = C7826n.m42879b(sSLSocket.getSession());
            C7805a aVar2 = this.f33254b.f33361a;
            if (aVar2.f33213f.verify(aVar2.f33209b, sSLSocket.getSession())) {
                C7805a aVar3 = this.f33254b.f33361a;
                aVar3.f33214g.mo29103a(aVar3.f33209b, this.f33261i.mo29153c());
                C7835s sVar = this.f33259g;
                if (sVar == C7835s.SPDY_3 || sVar == C7835s.HTTP_2) {
                    sSLSocket.setSoTimeout(0);
                    C7921o.C7929h hVar = new C7921o.C7929h(this.f33254b.f33361a.mo29080d(), true, this.f33255c);
                    hVar.mo29449h(this.f33259g);
                    C7921o g = hVar.mo29448g();
                    this.f33258f = g;
                    g.mo29441e1();
                    return;
                }
                this.f33257e = new C7868e(this.f33253a, this, this.f33255c);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) sSLSocket.getSession().getPeerCertificates()[0];
            throw new SSLPeerUnverifiedException("Hostname " + this.f33254b.f33361a.f33209b + " not verified:" + "\n    certificate: " + C7813f.m42820b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C7940b.m43539a(x509Certificate));
        } catch (Throwable th) {
            f.mo29285a(sSLSocket);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo29110a() {
        synchronized (this.f33253a) {
            if (this.f33263k == null) {
                return false;
            }
            this.f33263k = null;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29111b(int i, int i2, int i3, C7836t tVar) throws IOException {
        if (!this.f33256d) {
            if (this.f33254b.f33362b.type() == Proxy.Type.DIRECT || this.f33254b.f33362b.type() == Proxy.Type.HTTP) {
                this.f33255c = this.f33254b.f33361a.f33211d.createSocket();
            } else {
                this.f33255c = new Socket(this.f33254b.f33362b);
            }
            this.f33255c.setSoTimeout(i2);
            C7854f.m43054f().mo29287d(this.f33255c, this.f33254b.f33363c, i);
            if (this.f33254b.f33361a.f33212e != null) {
                m42829w(tVar, i2, i3);
            } else {
                this.f33257e = new C7868e(this.f33253a, this, this.f33255c);
            }
            this.f33256d = true;
            return;
        }
        throw new IllegalStateException("already connected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo29112c(C7833r rVar, Object obj, C7836t tVar) throws IOException {
        mo29127s(obj);
        if (!mo29120k()) {
            mo29111b(rVar.mo29184g(), rVar.mo29195t(), rVar.mo29199y(), m42828v(tVar));
            if (mo29123n()) {
                rVar.mo29185h().mo29134h(this);
            }
            rVar.mo29176D().mo29295a(mo29116g());
        }
        mo29130u(rVar.mo29195t(), rVar.mo29199y());
    }

    /* renamed from: d */
    public C7826n mo29113d() {
        return this.f33261i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo29114e() {
        C7921o oVar = this.f33258f;
        return oVar == null ? this.f33260h : oVar.mo29434R0();
    }

    /* renamed from: f */
    public C7835s mo29115f() {
        return this.f33259g;
    }

    /* renamed from: g */
    public C7846x mo29116g() {
        return this.f33254b;
    }

    /* renamed from: h */
    public Socket mo29117h() {
        return this.f33255c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo29118i() {
        this.f33262j++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo29119j() {
        return !this.f33255c.isClosed() && !this.f33255c.isInputShutdown() && !this.f33255c.isOutputShutdown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo29120k() {
        return this.f33256d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo29121l() {
        C7921o oVar = this.f33258f;
        return oVar == null || oVar.mo29437U0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo29122m() {
        C7868e eVar = this.f33257e;
        if (eVar != null) {
            return eVar.mo29306m();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo29123n() {
        return this.f33258f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C7892q mo29124p(C7878g gVar) throws IOException {
        return this.f33258f != null ? new C7890o(gVar, this.f33258f) : new C7883i(gVar, this.f33257e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo29125q() {
        return this.f33262j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo29126r() {
        if (this.f33258f == null) {
            this.f33260h = System.nanoTime();
            return;
        }
        throw new IllegalStateException("spdyConnection != null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo29127s(Object obj) {
        if (!mo29123n()) {
            synchronized (this.f33253a) {
                if (this.f33263k == null) {
                    this.f33263k = obj;
                } else {
                    throw new IllegalStateException("Connection already has an owner!");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo29128t(C7835s sVar) {
        if (sVar != null) {
            this.f33259g = sVar;
            return;
        }
        throw new IllegalArgumentException("protocol == null");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f33254b.f33361a.f33209b);
        sb.append(":");
        sb.append(this.f33254b.f33361a.f33210c);
        sb.append(", proxy=");
        sb.append(this.f33254b.f33362b);
        sb.append(" hostAddress=");
        sb.append(this.f33254b.f33363c.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        C7826n nVar = this.f33261i;
        sb.append(nVar != null ? nVar.mo29152a() : "none");
        sb.append(" protocol=");
        sb.append(this.f33259g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo29130u(int i, int i2) throws IOException {
        if (!this.f33256d) {
            throw new IllegalStateException("setTimeouts - not connected");
        } else if (this.f33257e != null) {
            this.f33255c.setSoTimeout(i);
            this.f33257e.mo29315v(i, i2);
        }
    }
}
