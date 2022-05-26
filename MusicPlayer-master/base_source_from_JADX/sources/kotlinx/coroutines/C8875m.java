package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8817d0;
import kotlinx.coroutines.internal.C8857x;
import kotlinx.coroutines.p399g3.C8770a;
import kotlinx.coroutines.p399g3.C8771b;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.m */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C8875m {
    /* renamed from: a */
    public static final C8665a2 m47724a(C8902r0 r0Var, C8513g gVar, C8910t0 t0Var, C8574p<? super C8902r0, ? super C8508d<? super C8457t>, ? extends Object> pVar) {
        C8684d dVar;
        C8513g c = C8869l0.m47694c(r0Var, gVar);
        if (t0Var.isLazy()) {
            dVar = new C8867k2(c, pVar);
        } else {
            dVar = new C8913t2(c, true);
        }
        dVar.mo30892A0(t0Var, dVar, pVar);
        return dVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C8665a2 m47725b(C8902r0 r0Var, C8513g gVar, C8910t0 t0Var, C8574p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C8519h.INSTANCE;
        }
        if ((i & 2) != 0) {
            t0Var = C8910t0.DEFAULT;
        }
        return C8864k.m47672a(r0Var, gVar, t0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static final <T> Object m47726c(C8513g gVar, C8574p<? super C8902r0, ? super C8508d<? super T>, ? extends Object> pVar, C8508d<? super T> dVar) {
        Object obj;
        C8513g context = dVar.getContext();
        C8513g plus = context.plus(gVar);
        C8693e2.m47146f(plus);
        if (plus == context) {
            C8857x xVar = new C8857x(plus, dVar);
            obj = C8771b.m47318c(xVar, xVar, pVar);
        } else {
            C8509e.C8511b bVar = C8509e.f34913d;
            if (C8594l.m46767a(plus.get(bVar), context.get(bVar))) {
                C8678b3 b3Var = new C8678b3(plus, dVar);
                Object c = C8817d0.m47527c(plus, (Object) null);
                try {
                    Object c2 = C8771b.m47318c(b3Var, b3Var, pVar);
                    C8817d0.m47525a(plus, c);
                    obj = c2;
                } catch (Throwable th) {
                    C8817d0.m47525a(plus, c);
                    throw th;
                }
            } else {
                C8681c1 c1Var = new C8681c1(plus, dVar);
                C8770a.m47315f(pVar, c1Var, c1Var, (C8570l) null, 4, (Object) null);
                obj = c1Var.mo30890C0();
            }
        }
        if (obj == C8527d.m46722d()) {
            C8535h.m46737c(dVar);
        }
        return obj;
    }
}
