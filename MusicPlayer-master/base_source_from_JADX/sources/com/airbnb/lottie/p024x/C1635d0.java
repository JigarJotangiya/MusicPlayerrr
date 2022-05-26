package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1570f;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p019v.p021k.C1592k;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.d0 */
/* compiled from: RectangleShapeParser */
class C1635d0 {

    /* renamed from: a */
    private static C1657c.C1658a f6233a = C1657c.C1658a.m8335a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C1592k m8285a(C1657c cVar, C1464d dVar) throws IOException {
        String str = null;
        C1577m<PointF, PointF> mVar = null;
        C1570f fVar = null;
        C1566b bVar = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6233a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                mVar = C1628a.m8259b(cVar, dVar);
            } else if (v0 == 2) {
                fVar = C1634d.m8282i(cVar, dVar);
            } else if (v0 == 3) {
                bVar = C1634d.m8278e(cVar, dVar);
            } else if (v0 != 4) {
                cVar.mo7425A0();
            } else {
                z = cVar.mo7429K();
            }
        }
        return new C1592k(str, mVar, fVar, bVar, z);
    }
}
