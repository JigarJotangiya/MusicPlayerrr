package p082e.p109h.p118o;

/* renamed from: e.h.o.e */
/* compiled from: Pair */
public class C3699e<F, S> {

    /* renamed from: a */
    public final F f11713a;

    /* renamed from: b */
    public final S f11714b;

    public C3699e(F f, S s) {
        this.f11713a = f;
        this.f11714b = s;
    }

    /* renamed from: a */
    public static <A, B> C3699e<A, B> m15816a(A a, B b) {
        return new C3699e<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3699e)) {
            return false;
        }
        C3699e eVar = (C3699e) obj;
        if (!C3698d.m15814a(eVar.f11713a, this.f11713a) || !C3698d.m15814a(eVar.f11714b, this.f11714b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f11713a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f11714b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f11713a + " " + this.f11714b + "}";
    }
}
