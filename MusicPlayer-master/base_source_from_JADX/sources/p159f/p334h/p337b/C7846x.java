package p159f.p334h.p337b;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: f.h.b.x */
/* compiled from: Route */
public final class C7846x {

    /* renamed from: a */
    final C7805a f33361a;

    /* renamed from: b */
    final Proxy f33362b;

    /* renamed from: c */
    final InetSocketAddress f33363c;

    /* renamed from: d */
    final C7821k f33364d;

    /* renamed from: e */
    final boolean f33365e;

    public C7846x(C7805a aVar, Proxy proxy, InetSocketAddress inetSocketAddress, C7821k kVar, boolean z) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        Objects.requireNonNull(kVar, "connectionConfiguration == null");
        this.f33361a = aVar;
        this.f33362b = proxy;
        this.f33363c = inetSocketAddress;
        this.f33364d = kVar;
        this.f33365e = z;
    }

    /* renamed from: a */
    public C7805a mo29266a() {
        return this.f33361a;
    }

    /* renamed from: b */
    public Proxy mo29267b() {
        return this.f33362b;
    }

    /* renamed from: c */
    public boolean mo29268c() {
        return this.f33361a.f33212e != null && this.f33362b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7846x)) {
            return false;
        }
        C7846x xVar = (C7846x) obj;
        if (!this.f33361a.equals(xVar.f33361a) || !this.f33362b.equals(xVar.f33362b) || !this.f33363c.equals(xVar.f33363c) || !this.f33364d.equals(xVar.f33364d) || this.f33365e != xVar.f33365e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.f33361a.hashCode()) * 31) + this.f33362b.hashCode()) * 31) + this.f33363c.hashCode()) * 31) + this.f33364d.hashCode()) * 31) + (this.f33365e ? 1 : 0);
    }
}
