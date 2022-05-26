package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p021k.C1581c;
import com.airbnb.lottie.p019v.p021k.C1596o;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.x.i0 */
/* compiled from: ShapeGroupParser */
class C1645i0 {

    /* renamed from: a */
    private static C1657c.C1658a f6246a = C1657c.C1658a.m8335a("nm", "hd", "it");

    /* renamed from: a */
    static C1596o m8300a(C1657c cVar, C1464d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6246a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                z = cVar.mo7429K();
            } else if (v0 != 2) {
                cVar.mo7425A0();
            } else {
                cVar.mo7433d();
                while (cVar.mo7427H()) {
                    C1581c a = C1642h.m8296a(cVar, dVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                cVar.mo7440x();
            }
        }
        return new C1596o(str, arrayList, z);
    }
}
