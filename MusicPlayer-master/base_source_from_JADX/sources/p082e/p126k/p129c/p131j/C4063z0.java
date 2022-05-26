package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.z0 */
/* compiled from: NewInstanceSchemas */
final class C4063z0 {

    /* renamed from: a */
    private static final C4051x0 f12244a = m18022c();

    /* renamed from: b */
    private static final C4051x0 f12245b = new C4055y0();

    /* renamed from: a */
    static C4051x0 m18020a() {
        return f12244a;
    }

    /* renamed from: b */
    static C4051x0 m18021b() {
        return f12245b;
    }

    /* renamed from: c */
    private static C4051x0 m18022c() {
        try {
            return (C4051x0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
