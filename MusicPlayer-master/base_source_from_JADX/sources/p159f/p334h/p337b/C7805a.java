package p159f.p334h.p337b;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.a */
/* compiled from: Address */
public final class C7805a {

    /* renamed from: a */
    final Proxy f33208a;

    /* renamed from: b */
    final String f33209b;

    /* renamed from: c */
    final int f33210c;

    /* renamed from: d */
    final SocketFactory f33211d;

    /* renamed from: e */
    final SSLSocketFactory f33212e;

    /* renamed from: f */
    final HostnameVerifier f33213f;

    /* renamed from: g */
    final C7813f f33214g;

    /* renamed from: h */
    final C7806b f33215h;

    /* renamed from: i */
    final List<C7835s> f33216i;

    /* renamed from: j */
    final List<C7821k> f33217j;

    /* renamed from: k */
    final ProxySelector f33218k;

    public C7805a(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C7813f fVar, C7806b bVar, Proxy proxy, List<C7835s> list, List<C7821k> list2, ProxySelector proxySelector) {
        Objects.requireNonNull(str, "uriHost == null");
        if (i <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i);
        } else if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        } else if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        } else if (proxySelector != null) {
            this.f33208a = proxy;
            this.f33209b = str;
            this.f33210c = i;
            this.f33211d = socketFactory;
            this.f33212e = sSLSocketFactory;
            this.f33213f = hostnameVerifier;
            this.f33214g = fVar;
            this.f33215h = bVar;
            this.f33216i = C7859h.m43087k(list);
            this.f33217j = C7859h.m43087k(list2);
            this.f33218k = proxySelector;
        } else {
            throw new IllegalArgumentException("proxySelector == null");
        }
    }

    /* renamed from: a */
    public List<C7821k> mo29077a() {
        return this.f33217j;
    }

    /* renamed from: b */
    public Proxy mo29078b() {
        return this.f33208a;
    }

    /* renamed from: c */
    public ProxySelector mo29079c() {
        return this.f33218k;
    }

    /* renamed from: d */
    public String mo29080d() {
        return this.f33209b;
    }

    /* renamed from: e */
    public int mo29081e() {
        return this.f33210c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7805a)) {
            return false;
        }
        C7805a aVar = (C7805a) obj;
        if (!C7859h.m43082f(this.f33208a, aVar.f33208a) || !this.f33209b.equals(aVar.f33209b) || this.f33210c != aVar.f33210c || !C7859h.m43082f(this.f33212e, aVar.f33212e) || !C7859h.m43082f(this.f33213f, aVar.f33213f) || !C7859h.m43082f(this.f33214g, aVar.f33214g) || !C7859h.m43082f(this.f33215h, aVar.f33215h) || !C7859h.m43082f(this.f33216i, aVar.f33216i) || !C7859h.m43082f(this.f33217j, aVar.f33217j) || !C7859h.m43082f(this.f33218k, aVar.f33218k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Proxy proxy = this.f33208a;
        int i = 0;
        int hashCode = (((((527 + (proxy != null ? proxy.hashCode() : 0)) * 31) + this.f33209b.hashCode()) * 31) + this.f33210c) * 31;
        SSLSocketFactory sSLSocketFactory = this.f33212e;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f33213f;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C7813f fVar = this.f33214g;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return ((((((((hashCode3 + i) * 31) + this.f33215h.hashCode()) * 31) + this.f33216i.hashCode()) * 31) + this.f33217j.hashCode()) * 31) + this.f33218k.hashCode();
    }
}
