package com.airbnb.lottie.p024x;

import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p019v.C1559d;
import com.airbnb.lottie.p019v.p021k.C1596o;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.x.m */
/* compiled from: FontCharacterParser */
class C1652m {

    /* renamed from: a */
    private static final C1657c.C1658a f6264a = C1657c.C1658a.m8335a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final C1657c.C1658a f6265b = C1657c.C1658a.m8335a("shapes");

    /* renamed from: a */
    static C1559d m8313a(C1657c cVar, C1464d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo7438p();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6264a);
            if (v0 == 0) {
                c = cVar.mo7435i0().charAt(0);
            } else if (v0 == 1) {
                d = cVar.mo7430Q();
            } else if (v0 == 2) {
                d2 = cVar.mo7430Q();
            } else if (v0 == 3) {
                str = cVar.mo7435i0();
            } else if (v0 == 4) {
                str2 = cVar.mo7435i0();
            } else if (v0 != 5) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                cVar.mo7438p();
                while (cVar.mo7427H()) {
                    if (cVar.mo7439v0(f6265b) != 0) {
                        cVar.mo7441z0();
                        cVar.mo7425A0();
                    } else {
                        cVar.mo7433d();
                        while (cVar.mo7427H()) {
                            arrayList.add((C1596o) C1642h.m8296a(cVar, dVar));
                        }
                        cVar.mo7440x();
                    }
                }
                cVar.mo7426E();
            }
        }
        cVar.mo7426E();
        return new C1559d(arrayList, c, d, d2, str, str2);
    }
}
