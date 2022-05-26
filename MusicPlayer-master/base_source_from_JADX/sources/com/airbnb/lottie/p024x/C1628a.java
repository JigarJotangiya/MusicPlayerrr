package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1569e;
import com.airbnb.lottie.p019v.p020j.C1573i;
import com.airbnb.lottie.p019v.p020j.C1577m;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.x.a */
/* compiled from: AnimatablePathValueParser */
public class C1628a {

    /* renamed from: a */
    private static final C1657c.C1658a f6225a = C1657c.C1658a.m8335a("k", "x", "y");

    /* renamed from: a */
    public static C1569e m8258a(C1657c cVar, C1464d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY) {
            cVar.mo7433d();
            while (cVar.mo7427H()) {
                arrayList.add(C1675z.m8400a(cVar, dVar));
            }
            cVar.mo7440x();
            C1669u.m8389b(arrayList);
        } else {
            arrayList.add(new C1688a(C1666s.m8377e(cVar, C1683h.m8459e())));
        }
        return new C1569e(arrayList);
    }

    /* renamed from: b */
    static C1577m<PointF, PointF> m8259b(C1657c cVar, C1464d dVar) throws IOException {
        cVar.mo7438p();
        C1569e eVar = null;
        C1566b bVar = null;
        C1566b bVar2 = null;
        boolean z = false;
        while (cVar.mo7436n0() != C1657c.C1659b.END_OBJECT) {
            int v0 = cVar.mo7439v0(f6225a);
            if (v0 != 0) {
                if (v0 != 1) {
                    if (v0 != 2) {
                        cVar.mo7441z0();
                        cVar.mo7425A0();
                    } else if (cVar.mo7436n0() == C1657c.C1659b.STRING) {
                        cVar.mo7425A0();
                    } else {
                        bVar2 = C1634d.m8278e(cVar, dVar);
                    }
                } else if (cVar.mo7436n0() == C1657c.C1659b.STRING) {
                    cVar.mo7425A0();
                } else {
                    bVar = C1634d.m8278e(cVar, dVar);
                }
                z = true;
            } else {
                eVar = m8258a(cVar, dVar);
            }
        }
        cVar.mo7426E();
        if (z) {
            dVar.mo7002a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C1573i(bVar, bVar2);
    }
}
