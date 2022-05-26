package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.t */
/* compiled from: ExtensionSchemas */
final class C4015t {

    /* renamed from: a */
    private static final C4007r<?> f12164a = new C4010s();

    /* renamed from: b */
    private static final C4007r<?> f12165b = m17592c();

    /* renamed from: a */
    static C4007r<?> m17590a() {
        C4007r<?> rVar = f12165b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C4007r<?> m17591b() {
        return f12164a;
    }

    /* renamed from: c */
    private static C4007r<?> m17592c() {
        try {
            return (C4007r) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
