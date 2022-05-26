package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.l0 */
/* compiled from: ShapeTrimPathParser */
class C1651l0 {

    /* renamed from: a */
    private static C1657c.C1658a f6263a = C1657c.C1658a.m8335a("s", "e", "o", "nm", "m", "hd");

    /* renamed from: a */
    static C1602r m8312a(C1657c cVar, C1464d dVar) throws IOException {
        String str = null;
        C1602r.C1603a aVar = null;
        C1566b bVar = null;
        C1566b bVar2 = null;
        C1566b bVar3 = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6263a);
            if (v0 == 0) {
                bVar = C1634d.m8279f(cVar, dVar, false);
            } else if (v0 == 1) {
                bVar2 = C1634d.m8279f(cVar, dVar, false);
            } else if (v0 == 2) {
                bVar3 = C1634d.m8279f(cVar, dVar, false);
            } else if (v0 == 3) {
                str = cVar.mo7435i0();
            } else if (v0 == 4) {
                aVar = C1602r.C1603a.forId(cVar.mo7431T());
            } else if (v0 != 5) {
                cVar.mo7425A0();
            } else {
                z = cVar.mo7429K();
            }
        }
        return new C1602r(str, aVar, bVar, bVar2, bVar3, z);
    }
}
