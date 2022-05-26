package p082e.p099f.p100a.p104m;

import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.k */
/* compiled from: Optimizer */
public class C3537k {

    /* renamed from: a */
    static boolean[] f11484a = new boolean[3];

    /* renamed from: a */
    static void m15379a(C3530f fVar, C3484d dVar, C3527e eVar) {
        eVar.f11385p = -1;
        eVar.f11387q = -1;
        C3527e.C3529b bVar = fVar.f11352X[0];
        C3527e.C3529b bVar2 = C3527e.C3529b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f11352X[0] == C3527e.C3529b.MATCH_PARENT) {
            int i = eVar.f11339M.f11309g;
            int V = fVar.mo12657V() - eVar.f11343O.f11309g;
            C3524d dVar2 = eVar.f11339M;
            dVar2.f11311i = dVar.mo12479q(dVar2);
            C3524d dVar3 = eVar.f11343O;
            dVar3.f11311i = dVar.mo12479q(dVar3);
            dVar.mo12470f(eVar.f11339M.f11311i, i);
            dVar.mo12470f(eVar.f11343O.f11311i, V);
            eVar.f11385p = 2;
            eVar.mo12638L0(i, V);
        }
        if (fVar.f11352X[1] != bVar2 && eVar.f11352X[1] == C3527e.C3529b.MATCH_PARENT) {
            int i2 = eVar.f11341N.f11309g;
            int z = fVar.mo12720z() - eVar.f11344P.f11309g;
            C3524d dVar4 = eVar.f11341N;
            dVar4.f11311i = dVar.mo12479q(dVar4);
            C3524d dVar5 = eVar.f11344P;
            dVar5.f11311i = dVar.mo12479q(dVar5);
            dVar.mo12470f(eVar.f11341N.f11311i, i2);
            dVar.mo12470f(eVar.f11344P.f11311i, z);
            if (eVar.f11374j0 > 0 || eVar.mo12655U() == 8) {
                C3524d dVar6 = eVar.f11345Q;
                dVar6.f11311i = dVar.mo12479q(dVar6);
                dVar.mo12470f(eVar.f11345Q.f11311i, eVar.f11374j0 + i2);
            }
            eVar.f11387q = 2;
            eVar.mo12672c1(i2, z);
        }
    }

    /* renamed from: b */
    public static final boolean m15380b(int i, int i2) {
        return (i & i2) == i2;
    }
}
