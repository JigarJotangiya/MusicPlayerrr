package p159f.p334h.p337b;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import p159f.p334h.p337b.p338z.C7859h;
import p394k.C8638h;

/* renamed from: f.h.b.f */
/* compiled from: CertificatePinner */
public final class C7813f {

    /* renamed from: b */
    public static final C7813f f33247b = new C7815b().mo29104b();

    /* renamed from: a */
    private final Map<String, List<C8638h>> f33248a;

    /* renamed from: f.h.b.f$b */
    /* compiled from: CertificatePinner */
    public static final class C7815b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<String, List<C8638h>> f33249a = new LinkedHashMap();

        /* renamed from: b */
        public C7813f mo29104b() {
            return new C7813f(this);
        }
    }

    /* renamed from: b */
    public static String m42820b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + m42821c((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: c */
    private static C8638h m42821c(X509Certificate x509Certificate) {
        return C7859h.m43092p(C8638h.m46960of(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public void mo29103a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List list2 = this.f33248a.get(str);
        if (list2 != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (!list2.contains(m42821c((X509Certificate) list.get(i)))) {
                    i++;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m42820b(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sb.append("\n    sha1/");
                sb.append(((C8638h) list2.get(i3)).base64());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    private C7813f(C7815b bVar) {
        this.f33248a = C7859h.m43089m(bVar.f33249a);
    }
}
