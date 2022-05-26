package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.p0 */
/* compiled from: MapFieldSchemas */
final class C4001p0 {

    /* renamed from: a */
    private static final C3993n0 f12149a = m17480c();

    /* renamed from: b */
    private static final C3993n0 f12150b = new C3996o0();

    /* renamed from: a */
    static C3993n0 m17478a() {
        return f12149a;
    }

    /* renamed from: b */
    static C3993n0 m17479b() {
        return f12150b;
    }

    /* renamed from: c */
    private static C3993n0 m17480c() {
        try {
            return (C3993n0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
