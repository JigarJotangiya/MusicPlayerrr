package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1572h;
import com.airbnb.lottie.p019v.p021k.C1597p;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.j0 */
/* compiled from: ShapePathParser */
class C1647j0 {

    /* renamed from: a */
    static C1657c.C1658a f6252a = C1657c.C1658a.m8335a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C1597p m8306a(C1657c cVar, C1464d dVar) throws IOException {
        int i = 0;
        String str = null;
        C1572h hVar = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6252a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                i = cVar.mo7431T();
            } else if (v0 == 2) {
                hVar = C1634d.m8284k(cVar, dVar);
            } else if (v0 != 3) {
                cVar.mo7425A0();
            } else {
                z = cVar.mo7429K();
            }
        }
        return new C1597p(str, i, hVar, z);
    }
}
