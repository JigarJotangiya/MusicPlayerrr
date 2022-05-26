package com.airbnb.lottie.p024x;

import android.graphics.Path;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1565a;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p021k.C1595n;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.x.h0 */
/* compiled from: ShapeFillParser */
class C1643h0 {

    /* renamed from: a */
    private static final C1657c.C1658a f6243a = C1657c.C1658a.m8335a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C1595n m8297a(C1657c cVar, C1464d dVar) throws IOException {
        C1568d dVar2 = null;
        String str = null;
        C1565a aVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6243a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                aVar = C1634d.m8276c(cVar, dVar);
            } else if (v0 == 2) {
                dVar2 = C1634d.m8281h(cVar, dVar);
            } else if (v0 == 3) {
                z = cVar.mo7429K();
            } else if (v0 == 4) {
                i = cVar.mo7431T();
            } else if (v0 != 5) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                z2 = cVar.mo7429K();
            }
        }
        return new C1595n(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar2 == null ? new C1568d(Collections.singletonList(new C1688a(100))) : dVar2, z2);
    }
}
