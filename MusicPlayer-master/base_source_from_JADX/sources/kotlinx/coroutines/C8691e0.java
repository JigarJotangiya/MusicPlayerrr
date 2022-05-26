package kotlinx.coroutines;

import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.e0 */
/* compiled from: CancellableContinuationImpl.kt */
final class C8691e0 {

    /* renamed from: a */
    public final Object f35052a;

    /* renamed from: b */
    public final C8885o f35053b;

    /* renamed from: c */
    public final C8570l<Throwable, C8457t> f35054c;

    /* renamed from: d */
    public final Object f35055d;

    /* renamed from: e */
    public final Throwable f35056e;

    public C8691e0(Object obj, C8885o oVar, C8570l<? super Throwable, C8457t> lVar, Object obj2, Throwable th) {
        this.f35052a = obj;
        this.f35053b = oVar;
        this.f35054c = lVar;
        this.f35055d = obj2;
        this.f35056e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C8691e0 m47132b(C8691e0 e0Var, Object obj, C8885o oVar, C8570l<Throwable, C8457t> lVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = e0Var.f35052a;
        }
        if ((i & 2) != 0) {
            oVar = e0Var.f35053b;
        }
        C8885o oVar2 = oVar;
        if ((i & 4) != 0) {
            lVar = e0Var.f35054c;
        }
        C8570l<Throwable, C8457t> lVar2 = lVar;
        if ((i & 8) != 0) {
            obj2 = e0Var.f35055d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = e0Var.f35056e;
        }
        return e0Var.mo30915a(obj, oVar2, lVar2, obj4, th);
    }

    /* renamed from: a */
    public final C8691e0 mo30915a(Object obj, C8885o oVar, C8570l<? super Throwable, C8457t> lVar, Object obj2, Throwable th) {
        return new C8691e0(obj, oVar, lVar, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo30916c() {
        return this.f35056e != null;
    }

    /* renamed from: d */
    public final void mo30917d(C8901r<?> rVar, Throwable th) {
        C8885o oVar = this.f35053b;
        if (oVar != null) {
            rVar.mo31230n(oVar, th);
        }
        C8570l<Throwable, C8457t> lVar = this.f35054c;
        if (lVar != null) {
            rVar.mo31231o(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8691e0)) {
            return false;
        }
        C8691e0 e0Var = (C8691e0) obj;
        return C8594l.m46767a(this.f35052a, e0Var.f35052a) && C8594l.m46767a(this.f35053b, e0Var.f35053b) && C8594l.m46767a(this.f35054c, e0Var.f35054c) && C8594l.m46767a(this.f35055d, e0Var.f35055d) && C8594l.m46767a(this.f35056e, e0Var.f35056e);
    }

    public int hashCode() {
        Object obj = this.f35052a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C8885o oVar = this.f35053b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C8570l<Throwable, C8457t> lVar = this.f35054c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f35055d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f35056e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f35052a + ", cancelHandler=" + this.f35053b + ", onCancellation=" + this.f35054c + ", idempotentResume=" + this.f35055d + ", cancelCause=" + this.f35056e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8691e0(Object obj, C8885o oVar, C8570l lVar, Object obj2, Throwable th, int i, C8589g gVar) {
        this(obj, (i & 2) != 0 ? null : oVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
