package p159f.p334h.p337b.p338z.p341l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: f.h.b.z.l.b */
/* compiled from: OkHostnameVerifier */
public final class C7940b implements HostnameVerifier {

    /* renamed from: a */
    public static final C7940b f33663a = new C7940b();

    /* renamed from: b */
    private static final Pattern f33664b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C7940b() {
    }

    /* renamed from: a */
    public static List<String> m43539a(X509Certificate x509Certificate) {
        List<String> b = m43540b(x509Certificate, 7);
        List<String> b2 = m43540b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b.size() + b2.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m43540b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    static boolean m43541d(String str) {
        return f33664b.matcher(str).matches();
    }

    /* renamed from: e */
    private boolean m43542e(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m43543f(String str, X509Certificate x509Certificate) {
        String b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> b2 = m43540b(x509Certificate, 2);
        int size = b2.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m43542e(lowerCase, b2.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (b = new C7939a(x509Certificate.getSubjectX500Principal()).mo29467b("cn")) == null) {
            return false;
        }
        return m43542e(lowerCase, b);
    }

    /* renamed from: g */
    private boolean m43544g(String str, X509Certificate x509Certificate) {
        List<String> b = m43540b(x509Certificate, 7);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo29468c(String str, X509Certificate x509Certificate) {
        if (m43541d(str)) {
            return m43544g(str, x509Certificate);
        }
        return m43543f(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo29468c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
