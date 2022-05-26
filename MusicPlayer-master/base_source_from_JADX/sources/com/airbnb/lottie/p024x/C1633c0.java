package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p019v.p021k.C1590j;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.c0 */
/* compiled from: PolystarShapeParser */
class C1633c0 {

    /* renamed from: a */
    private static final C1657c.C1658a f6232a = C1657c.C1658a.m8335a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    static C1590j m8273a(C1657c cVar, C1464d dVar) throws IOException {
        String str = null;
        C1590j.C1591a aVar = null;
        C1566b bVar = null;
        C1577m<PointF, PointF> mVar = null;
        C1566b bVar2 = null;
        C1566b bVar3 = null;
        C1566b bVar4 = null;
        C1566b bVar5 = null;
        C1566b bVar6 = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            switch (cVar.mo7439v0(f6232a)) {
                case 0:
                    str = cVar.mo7435i0();
                    break;
                case 1:
                    aVar = C1590j.C1591a.forValue(cVar.mo7431T());
                    break;
                case 2:
                    bVar = C1634d.m8279f(cVar, dVar, false);
                    break;
                case 3:
                    mVar = C1628a.m8259b(cVar, dVar);
                    break;
                case 4:
                    bVar2 = C1634d.m8279f(cVar, dVar, false);
                    break;
                case 5:
                    bVar4 = C1634d.m8278e(cVar, dVar);
                    break;
                case 6:
                    bVar6 = C1634d.m8279f(cVar, dVar, false);
                    break;
                case 7:
                    bVar3 = C1634d.m8278e(cVar, dVar);
                    break;
                case 8:
                    bVar5 = C1634d.m8279f(cVar, dVar, false);
                    break;
                case 9:
                    z = cVar.mo7429K();
                    break;
                default:
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
        }
        return new C1590j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
