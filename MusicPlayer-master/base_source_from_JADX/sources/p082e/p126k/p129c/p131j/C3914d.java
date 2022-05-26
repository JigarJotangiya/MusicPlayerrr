package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.d */
/* compiled from: Android */
final class C3914d {

    /* renamed from: a */
    private static final Class<?> f11985a = m16665a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f11986b = (m16665a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m16665a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m16666b() {
        return f11985a;
    }

    /* renamed from: c */
    static boolean m16667c() {
        return f11985a != null && !f11986b;
    }
}
