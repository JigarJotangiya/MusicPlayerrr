package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p015t.p017c.C1544i;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.x.u */
/* compiled from: KeyframesParser */
class C1669u {

    /* renamed from: a */
    static C1657c.C1658a f6301a = C1657c.C1658a.m8335a("k");

    /* renamed from: a */
    static <T> List<C1688a<T>> m8388a(C1657c cVar, C1464d dVar, float f, C1653m0<T> m0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo7436n0() == C1657c.C1659b.STRING) {
            dVar.mo7002a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo7438p();
        while (cVar.mo7427H()) {
            if (cVar.mo7439v0(f6301a) != 0) {
                cVar.mo7425A0();
            } else if (cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY) {
                cVar.mo7433d();
                if (cVar.mo7436n0() == C1657c.C1659b.NUMBER) {
                    arrayList.add(C1668t.m8382c(cVar, dVar, f, m0Var, false, z));
                } else {
                    while (cVar.mo7427H()) {
                        arrayList.add(C1668t.m8382c(cVar, dVar, f, m0Var, true, z));
                    }
                }
                cVar.mo7440x();
            } else {
                arrayList.add(C1668t.m8382c(cVar, dVar, f, m0Var, false, z));
            }
        }
        cVar.mo7426E();
        m8389b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m8389b(List<? extends C1688a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1688a aVar = (C1688a) list.get(i2);
            i2++;
            C1688a aVar2 = (C1688a) list.get(i2);
            aVar.f6340h = Float.valueOf(aVar2.f6339g);
            if (aVar.f6335c == null && (t = aVar2.f6334b) != null) {
                aVar.f6335c = t;
                if (aVar instanceof C1544i) {
                    ((C1544i) aVar).mo7190i();
                }
            }
        }
        C1688a aVar3 = (C1688a) list.get(i);
        if ((aVar3.f6334b == null || aVar3.f6335c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
