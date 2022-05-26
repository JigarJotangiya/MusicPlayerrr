package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.j1 */
/* compiled from: JobSupport.kt */
final class C8862j1 implements C8920v1 {

    /* renamed from: g */
    private final boolean f35258g;

    public C8862j1(boolean z) {
        this.f35258g = z;
    }

    /* renamed from: b */
    public C8880m2 mo31011b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo31012c() {
        return this.f35258g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo31012c() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
