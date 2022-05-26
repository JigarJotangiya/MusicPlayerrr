package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1576l;
import com.airbnb.lottie.p019v.p021k.C1593l;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.e0 */
/* compiled from: RepeaterParser */
class C1637e0 {

    /* renamed from: a */
    private static C1657c.C1658a f6236a = C1657c.C1658a.m8335a("nm", "c", "o", "tr", "hd");

    /* renamed from: a */
    static C1593l m8288a(C1657c cVar, C1464d dVar) throws IOException {
        String str = null;
        C1566b bVar = null;
        C1566b bVar2 = null;
        C1576l lVar = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6236a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                bVar = C1634d.m8279f(cVar, dVar, false);
            } else if (v0 == 2) {
                bVar2 = C1634d.m8279f(cVar, dVar, false);
            } else if (v0 == 3) {
                lVar = C1632c.m8272g(cVar, dVar);
            } else if (v0 != 4) {
                cVar.mo7425A0();
            } else {
                z = cVar.mo7429K();
            }
        }
        return new C1593l(str, bVar, bVar2, lVar, z);
    }
}
