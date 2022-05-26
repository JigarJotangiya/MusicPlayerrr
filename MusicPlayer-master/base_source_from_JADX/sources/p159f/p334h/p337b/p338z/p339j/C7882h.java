package p159f.p334h.p337b.p338z.p339j;

/* renamed from: f.h.b.z.j.h */
/* compiled from: HttpMethod */
public final class C7882h {
    /* renamed from: a */
    public static boolean m43183a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE");
    }

    /* renamed from: b */
    public static boolean m43184b(String str) {
        return m43185c(str) || str.equals("DELETE");
    }

    /* renamed from: c */
    public static boolean m43185c(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH");
    }
}
