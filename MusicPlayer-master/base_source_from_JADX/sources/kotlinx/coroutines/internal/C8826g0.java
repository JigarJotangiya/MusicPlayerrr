package kotlinx.coroutines.internal;

import kotlinx.coroutines.C8925w2;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.internal.g0 */
/* compiled from: ThreadContext.kt */
final class C8826g0 {

    /* renamed from: a */
    public final C8513g f35219a;

    /* renamed from: b */
    private final Object[] f35220b;

    /* renamed from: c */
    private final C8925w2<Object>[] f35221c;

    /* renamed from: d */
    private int f35222d;

    public C8826g0(C8513g gVar, int i) {
        this.f35219a = gVar;
        this.f35220b = new Object[i];
        this.f35221c = new C8925w2[i];
    }

    /* renamed from: a */
    public final void mo31128a(C8925w2<?> w2Var, Object obj) {
        Object[] objArr = this.f35220b;
        int i = this.f35222d;
        objArr[i] = obj;
        C8925w2<Object>[] w2VarArr = this.f35221c;
        this.f35222d = i + 1;
        w2VarArr[i] = w2Var;
    }

    /* renamed from: b */
    public final void mo31129b(C8513g gVar) {
        int length = this.f35221c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C8925w2<Object> w2Var = this.f35221c[length];
                C8594l.m46769c(w2Var);
                w2Var.mo31214m0(gVar, this.f35220b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
