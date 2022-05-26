package p159f.p334h.p337b.p338z.p339j;

import java.net.Proxy;
import java.net.URL;
import p159f.p334h.p337b.C7835s;
import p159f.p334h.p337b.C7836t;

/* renamed from: f.h.b.z.j.l */
/* compiled from: RequestLine */
public final class C7887l {
    /* renamed from: a */
    static String m43209a(C7836t tVar, Proxy.Type type, C7835s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.mo29219l());
        sb.append(' ');
        if (m43210b(tVar, type)) {
            sb.append(tVar.mo29222o());
        } else {
            sb.append(m43211c(tVar.mo29222o()));
        }
        sb.append(' ');
        sb.append(m43212d(sVar));
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m43210b(C7836t tVar, Proxy.Type type) {
        return !tVar.mo29218k() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m43211c(URL url) {
        String file = url.getFile();
        if (file == null) {
            return "/";
        }
        if (file.startsWith("/")) {
            return file;
        }
        return "/" + file;
    }

    /* renamed from: d */
    public static String m43212d(C7835s sVar) {
        return sVar == C7835s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
