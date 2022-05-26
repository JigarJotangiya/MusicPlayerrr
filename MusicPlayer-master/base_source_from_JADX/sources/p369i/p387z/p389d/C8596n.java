package p369i.p387z.p389d;

/* renamed from: i.z.d.n */
/* compiled from: PackageReference.kt */
public final class C8596n implements C8586d {

    /* renamed from: g */
    private final Class<?> f34935g;

    public C8596n(Class<?> cls, String str) {
        C8594l.m46771e(cls, "jClass");
        C8594l.m46771e(str, "moduleName");
        this.f34935g = cls;
    }

    /* renamed from: a */
    public Class<?> mo30621a() {
        return this.f34935g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8596n) && C8594l.m46767a(mo30621a(), ((C8596n) obj).mo30621a());
    }

    public int hashCode() {
        return mo30621a().hashCode();
    }

    public String toString() {
        return mo30621a().toString() + " (Kotlin reflection is not available)";
    }
}
