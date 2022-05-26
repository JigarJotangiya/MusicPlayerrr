package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import p159f.p334h.p337b.C7806b;

/* renamed from: f.h.b.z.j.a */
/* compiled from: AuthenticatorAdapter */
public final class C7862a implements C7806b {

    /* renamed from: a */
    public static final C7806b f33395a = new C7862a();

    /* renamed from: c */
    private InetAddress m43096c(Proxy proxy, URL url) throws IOException {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(url.getHost());
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r2 = (java.net.InetSocketAddress) r14.address();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p159f.p334h.p337b.C7836t mo29084a(java.net.Proxy r14, p159f.p334h.p337b.C7842v r15) throws java.io.IOException {
        /*
            r13 = this;
            java.util.List r0 = r15.mo29237m()
            f.h.b.t r15 = r15.mo29247v()
            java.net.URL r9 = r15.mo29222o()
            int r10 = r0.size()
            r1 = 0
            r11 = 0
        L_0x0012:
            if (r11 >= r10) goto L_0x0077
            java.lang.Object r1 = r0.get(r11)
            f.h.b.g r1 = (p159f.p334h.p337b.C7816g) r1
            java.lang.String r2 = r1.mo29106b()
            java.lang.String r3 = "Basic"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0027
            goto L_0x0055
        L_0x0027:
            java.net.SocketAddress r2 = r14.address()
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            java.lang.String r3 = r2.getHostName()
            java.net.InetAddress r4 = r13.m43096c(r14, r9)
            int r5 = r2.getPort()
            java.lang.String r6 = r9.getProtocol()
            java.lang.String r7 = r1.mo29105a()
            java.lang.String r8 = r1.mo29106b()
            java.net.Authenticator$RequestorType r12 = java.net.Authenticator.RequestorType.PROXY
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r12
            java.net.PasswordAuthentication r1 = java.net.Authenticator.requestPasswordAuthentication(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0058
        L_0x0055:
            int r11 = r11 + 1
            goto L_0x0012
        L_0x0058:
            java.lang.String r14 = r1.getUserName()
            java.lang.String r0 = new java.lang.String
            char[] r1 = r1.getPassword()
            r0.<init>(r1)
            java.lang.String r14 = p159f.p334h.p337b.C7824l.m42876a(r14, r0)
            f.h.b.t$b r15 = r15.mo29220m()
            java.lang.String r0 = "Proxy-Authorization"
            r15.mo29227i(r0, r14)
            f.h.b.t r14 = r15.mo29226h()
            return r14
        L_0x0077:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p339j.C7862a.mo29084a(java.net.Proxy, f.h.b.v):f.h.b.t");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r2 = r9.getHost();
        r3 = m43096c(r13, r9);
        r4 = r9.getPort();
        r5 = r9.getProtocol();
        r6 = r1.mo29105a();
        r7 = r1.mo29106b();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p159f.p334h.p337b.C7836t mo29085b(java.net.Proxy r13, p159f.p334h.p337b.C7842v r14) throws java.io.IOException {
        /*
            r12 = this;
            java.util.List r0 = r14.mo29237m()
            f.h.b.t r14 = r14.mo29247v()
            java.net.URL r9 = r14.mo29222o()
            int r10 = r0.size()
            r1 = 0
            r11 = 0
        L_0x0012:
            if (r11 >= r10) goto L_0x0070
            java.lang.Object r1 = r0.get(r11)
            f.h.b.g r1 = (p159f.p334h.p337b.C7816g) r1
            java.lang.String r2 = r1.mo29106b()
            java.lang.String r3 = "Basic"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x0027
            goto L_0x004e
        L_0x0027:
            java.lang.String r2 = r9.getHost()
            java.net.InetAddress r3 = r12.m43096c(r13, r9)
            int r4 = r9.getPort()
            java.lang.String r5 = r9.getProtocol()
            java.lang.String r6 = r1.mo29105a()
            java.lang.String r7 = r1.mo29106b()
            java.net.Authenticator$RequestorType r8 = java.net.Authenticator.RequestorType.SERVER
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            java.net.PasswordAuthentication r1 = java.net.Authenticator.requestPasswordAuthentication(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0051
        L_0x004e:
            int r11 = r11 + 1
            goto L_0x0012
        L_0x0051:
            java.lang.String r13 = r1.getUserName()
            java.lang.String r0 = new java.lang.String
            char[] r1 = r1.getPassword()
            r0.<init>(r1)
            java.lang.String r13 = p159f.p334h.p337b.C7824l.m42876a(r13, r0)
            f.h.b.t$b r14 = r14.mo29220m()
            java.lang.String r0 = "Authorization"
            r14.mo29227i(r0, r13)
            f.h.b.t r13 = r14.mo29226h()
            return r13
        L_0x0070:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p339j.C7862a.mo29085b(java.net.Proxy, f.h.b.v):f.h.b.t");
    }
}
