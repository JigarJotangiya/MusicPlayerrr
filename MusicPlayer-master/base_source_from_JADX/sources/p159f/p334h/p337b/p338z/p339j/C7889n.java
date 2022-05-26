package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;
import p159f.p334h.p337b.C7805a;
import p159f.p334h.p337b.C7821k;
import p159f.p334h.p337b.C7833r;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7846x;
import p159f.p334h.p337b.p338z.C7848a;
import p159f.p334h.p337b.p338z.C7851d;
import p159f.p334h.p337b.p338z.C7858g;
import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.z.j.n */
/* compiled from: RouteSelector */
public final class C7889n {

    /* renamed from: a */
    private final C7805a f33476a;

    /* renamed from: b */
    private final URI f33477b;

    /* renamed from: c */
    private final C7851d f33478c;

    /* renamed from: d */
    private final C7833r f33479d;

    /* renamed from: e */
    private final C7858g f33480e;

    /* renamed from: f */
    private final C7836t f33481f;

    /* renamed from: g */
    private Proxy f33482g;

    /* renamed from: h */
    private InetSocketAddress f33483h;

    /* renamed from: i */
    private C7821k f33484i;

    /* renamed from: j */
    private List<Proxy> f33485j = Collections.emptyList();

    /* renamed from: k */
    private int f33486k;

    /* renamed from: l */
    private List<InetSocketAddress> f33487l = Collections.emptyList();

    /* renamed from: m */
    private int f33488m;

    /* renamed from: n */
    private List<C7821k> f33489n = Collections.emptyList();

    /* renamed from: o */
    private int f33490o;

    /* renamed from: p */
    private final List<C7846x> f33491p = new ArrayList();

    private C7889n(C7805a aVar, URI uri, C7833r rVar, C7836t tVar) {
        this.f33476a = aVar;
        this.f33477b = uri;
        this.f33479d = rVar;
        this.f33480e = C7848a.f33368b.mo29210j(rVar);
        this.f33478c = C7848a.f33368b.mo29206f(rVar);
        this.f33481f = tVar;
        m43228p(uri, aVar.mo29078b());
    }

    /* renamed from: b */
    public static C7889n m43216b(C7805a aVar, C7836t tVar, C7833r rVar) throws IOException {
        return new C7889n(aVar, tVar.mo29221n(), rVar, tVar);
    }

    /* renamed from: c */
    static String m43217c(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: e */
    private boolean m43218e() {
        return this.f33490o < this.f33489n.size();
    }

    /* renamed from: f */
    private boolean m43219f() {
        return this.f33488m < this.f33487l.size();
    }

    /* renamed from: g */
    private boolean m43220g() {
        return !this.f33491p.isEmpty();
    }

    /* renamed from: h */
    private boolean m43221h() {
        return this.f33486k < this.f33485j.size();
    }

    /* renamed from: j */
    private C7821k m43222j() throws IOException {
        String str = "//";
        if (this.f33489n.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("No route to ");
            if (this.f33477b.getScheme() != null) {
                str = this.f33477b.getScheme() + "://";
            }
            sb.append(str);
            sb.append(this.f33476a.mo29080d());
            sb.append("; no connection specs");
            throw new UnknownServiceException(sb.toString());
        } else if (!m43218e()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            if (this.f33477b.getScheme() != null) {
                str = this.f33477b.getScheme() + "://";
            }
            sb2.append(str);
            sb2.append(this.f33476a.mo29080d());
            sb2.append("; exhausted connection specs: ");
            sb2.append(this.f33489n);
            throw new SocketException(sb2.toString());
        } else {
            List<C7821k> list = this.f33489n;
            int i = this.f33490o;
            this.f33490o = i + 1;
            return list.get(i);
        }
    }

    /* renamed from: k */
    private InetSocketAddress m43223k() throws IOException {
        if (m43219f()) {
            List<InetSocketAddress> list = this.f33487l;
            int i = this.f33488m;
            this.f33488m = i + 1;
            InetSocketAddress inetSocketAddress = list.get(i);
            m43226n();
            return inetSocketAddress;
        }
        throw new SocketException("No route to " + this.f33476a.mo29080d() + "; exhausted inet socket addresses: " + this.f33487l);
    }

    /* renamed from: l */
    private C7846x m43224l() {
        return this.f33491p.remove(0);
    }

    /* renamed from: m */
    private Proxy m43225m() throws IOException {
        if (m43221h()) {
            List<Proxy> list = this.f33485j;
            int i = this.f33486k;
            this.f33486k = i + 1;
            Proxy proxy = list.get(i);
            m43227o(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33476a.mo29080d() + "; exhausted proxy configurations: " + this.f33485j);
    }

    /* renamed from: n */
    private void m43226n() {
        this.f33489n = new ArrayList();
        List<C7821k> a = this.f33476a.mo29077a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C7821k kVar = a.get(i);
            if (this.f33481f.mo29218k() == kVar.mo29138e()) {
                this.f33489n.add(kVar);
            }
        }
        this.f33490o = 0;
    }

    /* renamed from: o */
    private void m43227o(Proxy proxy) throws IOException {
        int i;
        String str;
        this.f33487l = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f33476a.mo29080d();
            i = C7859h.m43085i(this.f33477b);
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m43217c(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        }
        for (InetAddress inetSocketAddress2 : this.f33478c.mo29279a(str)) {
            this.f33487l.add(new InetSocketAddress(inetSocketAddress2, i));
        }
        this.f33488m = 0;
    }

    /* renamed from: p */
    private void m43228p(URI uri, Proxy proxy) {
        if (proxy != null) {
            this.f33485j = Collections.singletonList(proxy);
        } else {
            this.f33485j = new ArrayList();
            List<Proxy> select = this.f33479d.mo29194s().select(uri);
            if (select != null) {
                this.f33485j.addAll(select);
            }
            this.f33485j.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f33485j.add(Proxy.NO_PROXY);
        }
        this.f33486k = 0;
    }

    /* renamed from: q */
    private boolean m43229q(C7821k kVar) {
        if (kVar == this.f33489n.get(0) || !kVar.mo29138e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo29356a(C7846x xVar, IOException iOException) {
        if (!(xVar.mo29267b().type() == Proxy.Type.DIRECT || this.f33476a.mo29079c() == null)) {
            this.f33476a.mo29079c().connectFailed(this.f33477b, xVar.mo29267b().address(), iOException);
        }
        this.f33480e.mo29296b(xVar);
        if (!(iOException instanceof SSLHandshakeException) && !(iOException instanceof SSLProtocolException)) {
            while (this.f33490o < this.f33489n.size()) {
                List<C7821k> list = this.f33489n;
                int i = this.f33490o;
                this.f33490o = i + 1;
                C7821k kVar = list.get(i);
                this.f33480e.mo29296b(new C7846x(this.f33476a, this.f33482g, this.f33483h, kVar, m43229q(kVar)));
            }
        }
    }

    /* renamed from: d */
    public boolean mo29357d() {
        return m43218e() || m43219f() || m43221h() || m43220g();
    }

    /* renamed from: i */
    public C7846x mo29358i() throws IOException {
        if (!m43218e()) {
            if (!m43219f()) {
                if (m43221h()) {
                    this.f33482g = m43225m();
                } else if (m43220g()) {
                    return m43224l();
                } else {
                    throw new NoSuchElementException();
                }
            }
            this.f33483h = m43223k();
        }
        C7821k j = m43222j();
        this.f33484i = j;
        C7846x xVar = new C7846x(this.f33476a, this.f33482g, this.f33483h, this.f33484i, m43229q(j));
        if (!this.f33480e.mo29297c(xVar)) {
            return xVar;
        }
        this.f33491p.add(xVar);
        return mo29358i();
    }
}
