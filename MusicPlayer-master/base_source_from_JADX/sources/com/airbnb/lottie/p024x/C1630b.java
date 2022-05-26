package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p020j.C1565a;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1575k;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.b */
/* compiled from: AnimatableTextPropertiesParser */
public class C1630b {

    /* renamed from: a */
    private static C1657c.C1658a f6227a = C1657c.C1658a.m8335a("a");

    /* renamed from: b */
    private static C1657c.C1658a f6228b = C1657c.C1658a.m8335a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C1575k m8262a(C1657c cVar, C1464d dVar) throws IOException {
        cVar.mo7438p();
        C1575k kVar = null;
        while (cVar.mo7427H()) {
            if (cVar.mo7439v0(f6227a) != 0) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                kVar = m8263b(cVar, dVar);
            }
        }
        cVar.mo7426E();
        return kVar == null ? new C1575k((C1565a) null, (C1565a) null, (C1566b) null, (C1566b) null) : kVar;
    }

    /* renamed from: b */
    private static C1575k m8263b(C1657c cVar, C1464d dVar) throws IOException {
        cVar.mo7438p();
        C1565a aVar = null;
        C1565a aVar2 = null;
        C1566b bVar = null;
        C1566b bVar2 = null;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6228b);
            if (v0 == 0) {
                aVar = C1634d.m8276c(cVar, dVar);
            } else if (v0 == 1) {
                aVar2 = C1634d.m8276c(cVar, dVar);
            } else if (v0 == 2) {
                bVar = C1634d.m8278e(cVar, dVar);
            } else if (v0 != 3) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                bVar2 = C1634d.m8278e(cVar, dVar);
            }
        }
        cVar.mo7426E();
        return new C1575k(aVar, aVar2, bVar, bVar2);
    }
}
