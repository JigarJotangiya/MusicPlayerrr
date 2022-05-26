package kotlinx.coroutines.internal;

import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8684d;
import kotlinx.coroutines.C8861j0;
import kotlinx.coroutines.C8922w;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.internal.x */
/* compiled from: Scopes.kt */
public class C8857x<T> extends C8684d<T> implements C8532e {

    /* renamed from: i */
    public final C8508d<T> f35254i;

    public C8857x(C8513g gVar, C8508d<? super T> dVar) {
        super(gVar, true, true);
        this.f35254i = dVar;
    }

    /* renamed from: B0 */
    public final C8665a2 mo31175B0() {
        C8922w I = mo31052I();
        if (I == null) {
            return null;
        }
        return I.getParent();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final boolean mo31050P() {
        return true;
    }

    public final C8532e getCallerFrame() {
        C8508d<T> dVar = this.f35254i;
        if (dVar instanceof C8532e) {
            return (C8532e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo30891l(Object obj) {
        C8827h.m47561c(C8522c.m46721c(this.f35254i), C8861j0.m47658a(obj, this.f35254i), (C8570l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo30888w0(Object obj) {
        C8508d<T> dVar = this.f35254i;
        dVar.resumeWith(C8861j0.m47658a(obj, dVar));
    }
}
