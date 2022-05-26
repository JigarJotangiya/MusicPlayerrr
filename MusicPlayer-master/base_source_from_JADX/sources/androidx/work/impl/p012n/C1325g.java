package androidx.work.impl.p012n;

/* renamed from: androidx.work.impl.n.g */
/* compiled from: SystemIdInfo */
public class C1325g {

    /* renamed from: a */
    public final String f5298a;

    /* renamed from: b */
    public final int f5299b;

    public C1325g(String str, int i) {
        this.f5298a = str;
        this.f5299b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1325g)) {
            return false;
        }
        C1325g gVar = (C1325g) obj;
        if (this.f5299b != gVar.f5299b) {
            return false;
        }
        return this.f5298a.equals(gVar.f5298a);
    }

    public int hashCode() {
        return (this.f5298a.hashCode() * 31) + this.f5299b;
    }
}
