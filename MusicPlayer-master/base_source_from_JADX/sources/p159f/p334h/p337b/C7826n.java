package p159f.p334h.p337b;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.n */
/* compiled from: Handshake */
public final class C7826n {

    /* renamed from: a */
    private final String f33283a;

    /* renamed from: b */
    private final List<Certificate> f33284b;

    /* renamed from: c */
    private final List<Certificate> f33285c;

    private C7826n(String str, List<Certificate> list, List<Certificate> list2) {
        this.f33283a = str;
        this.f33284b = list;
        this.f33285c = list2;
    }

    /* renamed from: b */
    public static C7826n m42879b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            if (certificateArr != null) {
                list = C7859h.m43088l(certificateArr);
            } else {
                list = Collections.emptyList();
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = C7859h.m43088l(localCertificates);
            } else {
                list2 = Collections.emptyList();
            }
            return new C7826n(cipherSuite, list, list2);
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: a */
    public String mo29152a() {
        return this.f33283a;
    }

    /* renamed from: c */
    public List<Certificate> mo29153c() {
        return this.f33284b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7826n)) {
            return false;
        }
        C7826n nVar = (C7826n) obj;
        if (!this.f33283a.equals(nVar.f33283a) || !this.f33284b.equals(nVar.f33284b) || !this.f33285c.equals(nVar.f33285c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.f33283a.hashCode()) * 31) + this.f33284b.hashCode()) * 31) + this.f33285c.hashCode();
    }
}
