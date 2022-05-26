package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p159f.p334h.p337b.C7806b;
import p159f.p334h.p337b.C7816g;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.p338z.C7854f;

/* renamed from: f.h.b.z.j.j */
/* compiled from: OkHeaders */
public final class C7884j {

    /* renamed from: a */
    private static final Comparator<String> f33466a = new C7885a();

    /* renamed from: b */
    static final String f33467b;

    /* renamed from: c */
    public static final String f33468c;

    /* renamed from: d */
    public static final String f33469d;

    /* renamed from: e */
    public static final String f33470e;

    /* renamed from: f.h.b.z.j.j$a */
    /* compiled from: OkHeaders */
    static class C7885a implements Comparator<String> {
        C7885a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        String g = C7854f.m43054f().mo29288g();
        f33467b = g;
        f33468c = g + "-Sent-Millis";
        f33469d = g + "-Received-Millis";
        f33470e = g + "-Selected-Protocol";
    }

    /* renamed from: a */
    public static void m43195a(C7836t.C7838b bVar, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) next.getValue()).isEmpty()) {
                bVar.mo29225g(str, m43196b((List) next.getValue()));
            }
        }
    }

    /* renamed from: b */
    private static String m43196b(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static long m43197c(C7827o oVar) {
        return m43203i(oVar.mo29156a("Content-Length"));
    }

    /* renamed from: d */
    public static long m43198d(C7836t tVar) {
        return m43197c(tVar.mo29217j());
    }

    /* renamed from: e */
    public static long m43199e(C7842v vVar) {
        return m43197c(vVar.mo29242r());
    }

    /* renamed from: f */
    static boolean m43200f(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: g */
    public static List<C7816g> m43201g(C7827o oVar, String str) {
        ArrayList arrayList = new ArrayList();
        int f = oVar.mo29160f();
        for (int i = 0; i < f; i++) {
            if (str.equalsIgnoreCase(oVar.mo29158d(i))) {
                String g = oVar.mo29161g(i);
                int i2 = 0;
                while (i2 < g.length()) {
                    int b = C7867d.m43107b(g, i2, " ");
                    String trim = g.substring(i2, b).trim();
                    int c = C7867d.m43108c(g, b);
                    if (!g.regionMatches(true, c, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = c + 7;
                    int b2 = C7867d.m43107b(g, i3, "\"");
                    String substring = g.substring(i3, b2);
                    i2 = C7867d.m43108c(g, C7867d.m43107b(g, b2 + 1, ",") + 1);
                    arrayList.add(new C7816g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static C7836t m43202h(C7806b bVar, C7842v vVar, Proxy proxy) throws IOException {
        if (vVar.mo29238n() == 407) {
            return bVar.mo29084a(proxy, vVar);
        }
        return bVar.mo29085b(proxy, vVar);
    }

    /* renamed from: i */
    private static long m43203i(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public static Map<String, List<String>> m43204j(C7827o oVar, String str) {
        TreeMap treeMap = new TreeMap(f33466a);
        int f = oVar.mo29160f();
        for (int i = 0; i < f; i++) {
            String d = oVar.mo29158d(i);
            String g = oVar.mo29161g(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(d);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(g);
            treeMap.put(d, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put((Object) null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
