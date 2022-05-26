package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1567c;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p020j.C1570f;
import com.airbnb.lottie.p019v.p021k.C1584f;
import com.airbnb.lottie.p019v.p021k.C1585g;
import com.airbnb.lottie.p019v.p021k.C1598q;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.x.q */
/* compiled from: GradientStrokeParser */
class C1664q {

    /* renamed from: a */
    private static C1657c.C1658a f6291a = C1657c.C1658a.m8335a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C1657c.C1658a f6292b = C1657c.C1658a.m8335a("p", "k");

    /* renamed from: c */
    private static final C1657c.C1658a f6293c = C1657c.C1658a.m8335a("n", "v");

    /* renamed from: a */
    static C1584f m8370a(C1657c cVar, C1464d dVar) throws IOException {
        C1567c cVar2;
        C1657c cVar3 = cVar;
        C1464d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C1585g gVar = null;
        C1567c cVar4 = null;
        C1570f fVar = null;
        C1570f fVar2 = null;
        C1566b bVar = null;
        C1598q.C1600b bVar2 = null;
        C1598q.C1601c cVar5 = null;
        float f = 0.0f;
        C1566b bVar3 = null;
        boolean z = false;
        C1568d dVar3 = null;
        while (cVar.mo7427H()) {
            switch (cVar3.mo7439v0(f6291a)) {
                case 0:
                    str = cVar.mo7435i0();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo7438p();
                    while (cVar.mo7427H()) {
                        int v0 = cVar3.mo7439v0(f6292b);
                        if (v0 != 0) {
                            cVar2 = cVar4;
                            if (v0 != 1) {
                                cVar.mo7441z0();
                                cVar.mo7425A0();
                            } else {
                                cVar4 = C1634d.m8280g(cVar3, dVar2, i);
                            }
                        } else {
                            cVar2 = cVar4;
                            i = cVar.mo7431T();
                        }
                        cVar4 = cVar2;
                    }
                    C1567c cVar6 = cVar4;
                    cVar.mo7426E();
                    break;
                case 2:
                    dVar3 = C1634d.m8281h(cVar, dVar);
                    break;
                case 3:
                    gVar = cVar.mo7431T() == 1 ? C1585g.LINEAR : C1585g.RADIAL;
                    break;
                case 4:
                    fVar = C1634d.m8282i(cVar, dVar);
                    break;
                case 5:
                    fVar2 = C1634d.m8282i(cVar, dVar);
                    break;
                case 6:
                    bVar = C1634d.m8278e(cVar, dVar);
                    break;
                case 7:
                    bVar2 = C1598q.C1600b.values()[cVar.mo7431T() - 1];
                    break;
                case 8:
                    cVar5 = C1598q.C1601c.values()[cVar.mo7431T() - 1];
                    break;
                case 9:
                    f = (float) cVar.mo7430Q();
                    break;
                case 10:
                    z = cVar.mo7429K();
                    break;
                case 11:
                    cVar.mo7433d();
                    while (cVar.mo7427H()) {
                        cVar.mo7438p();
                        String str2 = null;
                        C1566b bVar4 = null;
                        while (cVar.mo7427H()) {
                            int v02 = cVar3.mo7439v0(f6293c);
                            if (v02 != 0) {
                                C1566b bVar5 = bVar3;
                                if (v02 != 1) {
                                    cVar.mo7441z0();
                                    cVar.mo7425A0();
                                } else {
                                    bVar4 = C1634d.m8278e(cVar, dVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                C1566b bVar6 = bVar3;
                                str2 = cVar.mo7435i0();
                            }
                        }
                        C1566b bVar7 = bVar3;
                        cVar.mo7426E();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar2.mo7023u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    C1566b bVar8 = bVar3;
                    cVar.mo7440x();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    break;
                default:
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
        }
        if (dVar3 == null) {
            dVar3 = new C1568d(Collections.singletonList(new C1688a(100)));
        }
        return new C1584f(str, gVar, cVar4, dVar3, fVar, fVar2, bVar, bVar2, cVar5, f, arrayList, bVar3, z);
    }
}
