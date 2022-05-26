package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.p */
/* compiled from: ExtensionRegistryFactory */
final class C4000p {

    /* renamed from: a */
    static final Class<?> f12148a = m17477c();

    /* renamed from: a */
    public static C4003q m17475a() {
        if (f12148a != null) {
            try {
                return m17476b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C4003q.f12153d;
    }

    /* renamed from: b */
    private static final C4003q m17476b(String str) throws Exception {
        return (C4003q) f12148a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: c */
    static Class<?> m17477c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
