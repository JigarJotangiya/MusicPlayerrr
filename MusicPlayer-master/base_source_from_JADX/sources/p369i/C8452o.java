package p369i;

import java.io.Serializable;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.o */
/* compiled from: Tuples.kt */
public final class C8452o<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public C8452o(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public static /* synthetic */ C8452o copy$default(C8452o oVar, A a, B b, C c, int i, Object obj) {
        if ((i & 1) != 0) {
            a = oVar.first;
        }
        if ((i & 2) != 0) {
            b = oVar.second;
        }
        if ((i & 4) != 0) {
            c = oVar.third;
        }
        return oVar.copy(a, b, c);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final C8452o<A, B, C> copy(A a, B b, C c) {
        return new C8452o<>(a, b, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8452o)) {
            return false;
        }
        C8452o oVar = (C8452o) obj;
        return C8594l.m46767a(this.first, oVar.first) && C8594l.m46767a(this.second, oVar.second) && C8594l.m46767a(this.third, oVar.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.third;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
