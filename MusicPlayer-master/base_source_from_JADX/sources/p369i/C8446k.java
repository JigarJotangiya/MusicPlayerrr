package p369i;

import java.io.Serializable;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.k */
/* compiled from: Tuples.kt */
public final class C8446k<A, B> implements Serializable {
    private final A first;
    private final B second;

    public C8446k(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public static /* synthetic */ C8446k copy$default(C8446k kVar, A a, B b, int i, Object obj) {
        if ((i & 1) != 0) {
            a = kVar.first;
        }
        if ((i & 2) != 0) {
            b = kVar.second;
        }
        return kVar.copy(a, b);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C8446k<A, B> copy(A a, B b) {
        return new C8446k<>(a, b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8446k)) {
            return false;
        }
        C8446k kVar = (C8446k) obj;
        return C8594l.m46767a(this.first, kVar.first) && C8594l.m46767a(this.second, kVar.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.second;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
