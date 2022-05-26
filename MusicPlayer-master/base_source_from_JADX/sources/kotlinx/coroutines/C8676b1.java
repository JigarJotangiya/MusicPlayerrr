package kotlinx.coroutines;

import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8535h;

/* renamed from: kotlinx.coroutines.b1 */
/* compiled from: Delay.kt */
public final class C8676b1 {
    /* renamed from: a */
    public static final Object m47092a(long j, C8508d<? super C8457t> dVar) {
        if (j <= 0) {
            return C8457t.f34900a;
        }
        C8901r rVar = new C8901r(C8522c.m46721c(dVar), 1);
        rVar.mo31237y();
        if (j < Long.MAX_VALUE) {
            m47093b(rVar.getContext()).mo30858x(j, rVar);
        }
        Object v = rVar.mo31235v();
        if (v == C8527d.m46722d()) {
            C8535h.m46737c(dVar);
        }
        return v == C8527d.m46722d() ? v : C8457t.f34900a;
    }

    /* renamed from: b */
    public static final C8664a1 m47093b(C8513g gVar) {
        C8513g.C8516b bVar = gVar.get(C8509e.f34913d);
        C8664a1 a1Var = bVar instanceof C8664a1 ? (C8664a1) bVar : null;
        return a1Var == null ? C8931y0.m47851a() : a1Var;
    }
}
