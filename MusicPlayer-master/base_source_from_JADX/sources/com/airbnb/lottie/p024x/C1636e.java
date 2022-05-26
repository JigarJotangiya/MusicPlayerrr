package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.p021k.C1579a;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.e */
/* compiled from: BlurEffectParser */
class C1636e {

    /* renamed from: a */
    private static final C1657c.C1658a f6234a = C1657c.C1658a.m8335a("ef");

    /* renamed from: b */
    private static final C1657c.C1658a f6235b = C1657c.C1658a.m8335a("ty", "v");

    /* renamed from: a */
    private static C1579a m8286a(C1657c cVar, C1464d dVar) throws IOException {
        cVar.mo7438p();
        C1579a aVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (cVar.mo7427H()) {
                    int v0 = cVar.mo7439v0(f6235b);
                    if (v0 != 0) {
                        if (v0 != 1) {
                            cVar.mo7441z0();
                            cVar.mo7425A0();
                        } else if (z) {
                            aVar = new C1579a(C1634d.m8278e(cVar, dVar));
                        } else {
                            cVar.mo7425A0();
                        }
                    } else if (cVar.mo7431T() == 0) {
                        z = true;
                    }
                } else {
                    cVar.mo7426E();
                    return aVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C1579a m8287b(C1657c cVar, C1464d dVar) throws IOException {
        C1579a aVar = null;
        while (cVar.mo7427H()) {
            if (cVar.mo7439v0(f6234a) != 0) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                cVar.mo7433d();
                while (cVar.mo7427H()) {
                    C1579a a = m8286a(cVar, dVar);
                    if (a != null) {
                        aVar = a;
                    }
                }
                cVar.mo7440x();
            }
        }
        return aVar;
    }
}
