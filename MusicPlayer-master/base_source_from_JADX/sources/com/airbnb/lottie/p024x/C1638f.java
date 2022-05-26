package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1570f;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p019v.p021k.C1580b;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.f */
/* compiled from: CircleShapeParser */
class C1638f {

    /* renamed from: a */
    private static C1657c.C1658a f6237a = C1657c.C1658a.m8335a("nm", "p", "s", "hd", "d");

    /* renamed from: a */
    static C1580b m8289a(C1657c cVar, C1464d dVar, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        C1577m<PointF, PointF> mVar = null;
        C1570f fVar = null;
        boolean z2 = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6237a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                mVar = C1628a.m8259b(cVar, dVar);
            } else if (v0 == 2) {
                fVar = C1634d.m8282i(cVar, dVar);
            } else if (v0 == 3) {
                z2 = cVar.mo7429K();
            } else if (v0 != 4) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                z = cVar.mo7431T() == 3;
            }
        }
        return new C1580b(str, mVar, fVar, z, z2);
    }
}
