package kotlinx.coroutines;

import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.l */
/* compiled from: Builders.kt */
final /* synthetic */ class C8868l {
    /* renamed from: a */
    public static final <T> T m47690a(C8513g gVar, C8574p<? super C8902r0, ? super C8508d<? super T>, ? extends Object> pVar) throws InterruptedException {
        C8513g gVar2;
        C8866k1 k1Var;
        Thread currentThread = Thread.currentThread();
        C8509e eVar = (C8509e) gVar.get(C8509e.f34913d);
        if (eVar == null) {
            k1Var = C8929x2.f35315a.mo31251b();
            gVar2 = C8869l0.m47694c(C8912t1.f35302g, gVar.plus(k1Var));
        } else {
            C8866k1 k1Var2 = null;
            C8866k1 k1Var3 = eVar instanceof C8866k1 ? (C8866k1) eVar : null;
            if (k1Var3 != null && k1Var3.mo31187a1()) {
                k1Var2 = k1Var3;
            }
            k1Var = k1Var2 == null ? C8929x2.f35315a.mo31250a() : k1Var2;
            gVar2 = C8869l0.m47694c(C8912t1.f35302g, gVar);
        }
        C8792i iVar = new C8792i(gVar2, currentThread, k1Var);
        iVar.mo30892A0(C8910t0.DEFAULT, iVar, pVar);
        return iVar.mo31049B0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m47691b(C8513g gVar, C8574p pVar, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            gVar = C8519h.INSTANCE;
        }
        return C8864k.m47674c(gVar, pVar);
    }
}
