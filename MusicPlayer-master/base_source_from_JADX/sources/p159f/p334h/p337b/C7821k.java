package p159f.p334h.p337b;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p159f.p334h.p337b.p338z.C7854f;
import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.k */
/* compiled from: ConnectionSpec */
public final class C7821k {

    /* renamed from: e */
    public static final C7821k f33271e;

    /* renamed from: f */
    public static final C7821k f33272f;

    /* renamed from: g */
    public static final C7821k f33273g = new C7823b(false).mo29144e();

    /* renamed from: a */
    final boolean f33274a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String[] f33275b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f33276c;

    /* renamed from: d */
    final boolean f33277d;

    static {
        C7823b bVar = new C7823b(true);
        bVar.mo29145f(C7817h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C7817h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C7817h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C7817h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C7817h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C7817h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C7817h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C7817h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C7817h.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, C7817h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C7817h.TLS_RSA_WITH_AES_128_GCM_SHA256, C7817h.TLS_RSA_WITH_AES_128_CBC_SHA, C7817h.TLS_RSA_WITH_AES_256_CBC_SHA, C7817h.TLS_RSA_WITH_3DES_EDE_CBC_SHA);
        C7847y yVar = C7847y.TLS_1_0;
        bVar.mo29148i(C7847y.TLS_1_2, C7847y.TLS_1_1, yVar);
        bVar.mo29147h(true);
        C7821k e = bVar.mo29144e();
        f33271e = e;
        C7823b bVar2 = new C7823b(e);
        bVar2.mo29148i(yVar);
        bVar2.mo29147h(true);
        f33272f = bVar2.mo29144e();
    }

    /* renamed from: f */
    private C7821k m42860f(SSLSocket sSLSocket) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f33275b != null) {
            strArr = (String[]) C7859h.m43091o(cls, this.f33275b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C7823b bVar = new C7823b(this);
        bVar.mo29146g(strArr);
        bVar.mo29149j((String[]) C7859h.m43091o(cls, this.f33276c, enabledProtocols));
        return bVar.mo29144e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo29136c(SSLSocket sSLSocket, C7846x xVar) {
        C7821k f = m42860f(sSLSocket);
        sSLSocket.setEnabledProtocols(f.f33276c);
        String[] strArr = f.f33275b;
        if (xVar.f33365e && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
        C7854f f2 = C7854f.m43054f();
        if (f.f33277d) {
            C7805a aVar = xVar.f33361a;
            f2.mo29286c(sSLSocket, aVar.f33209b, aVar.f33216i);
        }
    }

    /* renamed from: d */
    public List<C7817h> mo29137d() {
        String[] strArr = this.f33275b;
        if (strArr == null) {
            return null;
        }
        C7817h[] hVarArr = new C7817h[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f33275b;
            if (i >= strArr2.length) {
                return C7859h.m43088l(hVarArr);
            }
            hVarArr[i] = C7817h.forJavaName(strArr2[i]);
            i++;
        }
    }

    /* renamed from: e */
    public boolean mo29138e() {
        return this.f33274a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7821k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C7821k kVar = (C7821k) obj;
        boolean z = this.f33274a;
        if (z != kVar.f33274a) {
            return false;
        }
        return !z || (Arrays.equals(this.f33275b, kVar.f33275b) && Arrays.equals(this.f33276c, kVar.f33276c) && this.f33277d == kVar.f33277d);
    }

    /* renamed from: g */
    public boolean mo29140g() {
        return this.f33277d;
    }

    /* renamed from: h */
    public List<C7847y> mo29141h() {
        C7847y[] yVarArr = new C7847y[this.f33276c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f33276c;
            if (i >= strArr.length) {
                return C7859h.m43088l(yVarArr);
            }
            yVarArr[i] = C7847y.forJavaName(strArr[i]);
            i++;
        }
    }

    public int hashCode() {
        if (this.f33274a) {
            return ((((527 + Arrays.hashCode(this.f33275b)) * 31) + Arrays.hashCode(this.f33276c)) * 31) + (this.f33277d ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f33274a) {
            return "ConnectionSpec()";
        }
        List<C7817h> d = mo29137d();
        if (d == null) {
            str = "[use default]";
        } else {
            str = d.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + mo29141h() + ", supportsTlsExtensions=" + this.f33277d + ")";
    }

    /* renamed from: f.h.b.k$b */
    /* compiled from: ConnectionSpec */
    public static final class C7823b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f33278a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f33279b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f33280c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f33281d;

        C7823b(boolean z) {
            this.f33278a = z;
        }

        /* renamed from: e */
        public C7821k mo29144e() {
            return new C7821k(this);
        }

        /* renamed from: f */
        public C7823b mo29145f(C7817h... hVarArr) {
            if (this.f33278a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].javaName;
                }
                this.f33279b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: g */
        public C7823b mo29146g(String... strArr) {
            if (this.f33278a) {
                if (strArr == null) {
                    this.f33279b = null;
                } else {
                    this.f33279b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: h */
        public C7823b mo29147h(boolean z) {
            if (this.f33278a) {
                this.f33281d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: i */
        public C7823b mo29148i(C7847y... yVarArr) {
            if (this.f33278a) {
                String[] strArr = new String[yVarArr.length];
                for (int i = 0; i < yVarArr.length; i++) {
                    strArr[i] = yVarArr[i].javaName;
                }
                this.f33280c = strArr;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: j */
        public C7823b mo29149j(String... strArr) {
            if (this.f33278a) {
                if (strArr == null) {
                    this.f33280c = null;
                } else {
                    this.f33280c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C7823b(C7821k kVar) {
            this.f33278a = kVar.f33274a;
            this.f33279b = kVar.f33275b;
            this.f33280c = kVar.f33276c;
            this.f33281d = kVar.f33277d;
        }
    }

    private C7821k(C7823b bVar) {
        this.f33274a = bVar.f33278a;
        this.f33275b = bVar.f33279b;
        this.f33276c = bVar.f33280c;
        this.f33277d = bVar.f33281d;
    }
}
