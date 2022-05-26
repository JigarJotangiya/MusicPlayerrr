package kotlinx.coroutines;

import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.g0 */
/* compiled from: CompletionState.kt */
public final class C8767g0 {

    /* renamed from: a */
    public final Object f35120a;

    /* renamed from: b */
    public final C8570l<Throwable, C8457t> f35121b;

    public C8767g0(Object obj, C8570l<? super Throwable, C8457t> lVar) {
        this.f35120a = obj;
        this.f35121b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8767g0)) {
            return false;
        }
        C8767g0 g0Var = (C8767g0) obj;
        return C8594l.m46767a(this.f35120a, g0Var.f35120a) && C8594l.m46767a(this.f35121b, g0Var.f35121b);
    }

    public int hashCode() {
        Object obj = this.f35120a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f35121b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f35120a + ", onCancellation=" + this.f35121b + ')';
    }
}
