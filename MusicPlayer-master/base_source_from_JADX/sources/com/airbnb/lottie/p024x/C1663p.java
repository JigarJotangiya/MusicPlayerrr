package com.airbnb.lottie.p024x;

import android.graphics.Path;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1567c;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p020j.C1570f;
import com.airbnb.lottie.p019v.p021k.C1583e;
import com.airbnb.lottie.p019v.p021k.C1585g;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.x.p */
/* compiled from: GradientFillParser */
class C1663p {

    /* renamed from: a */
    private static final C1657c.C1658a f6289a = C1657c.C1658a.m8335a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final C1657c.C1658a f6290b = C1657c.C1658a.m8335a("p", "k");

    /* renamed from: a */
    static C1583e m8369a(C1657c cVar, C1464d dVar) throws IOException {
        C1568d dVar2 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C1585g gVar = null;
        C1567c cVar2 = null;
        C1570f fVar = null;
        C1570f fVar2 = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            switch (cVar.mo7439v0(f6289a)) {
                case 0:
                    str = cVar.mo7435i0();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo7438p();
                    while (cVar.mo7427H()) {
                        int v0 = cVar.mo7439v0(f6290b);
                        if (v0 == 0) {
                            i = cVar.mo7431T();
                        } else if (v0 != 1) {
                            cVar.mo7441z0();
                            cVar.mo7425A0();
                        } else {
                            cVar2 = C1634d.m8280g(cVar, dVar, i);
                        }
                    }
                    cVar.mo7426E();
                    break;
                case 2:
                    dVar2 = C1634d.m8281h(cVar, dVar);
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
                    fillType = cVar.mo7431T() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.mo7429K();
                    break;
                default:
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
        }
        return new C1583e(str, gVar, fillType, cVar2, dVar2 == null ? new C1568d(Collections.singletonList(new C1688a(100))) : dVar2, fVar, fVar2, (C1566b) null, (C1566b) null, z);
    }
}
