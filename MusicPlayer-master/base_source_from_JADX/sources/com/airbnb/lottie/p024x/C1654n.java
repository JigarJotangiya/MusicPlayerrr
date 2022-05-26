package com.airbnb.lottie.p024x;

import com.airbnb.lottie.p019v.C1558c;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.n */
/* compiled from: FontParser */
class C1654n {

    /* renamed from: a */
    private static final C1657c.C1658a f6266a = C1657c.C1658a.m8335a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C1558c m8315a(C1657c cVar) throws IOException {
        cVar.mo7438p();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6266a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                str2 = cVar.mo7435i0();
            } else if (v0 == 2) {
                str3 = cVar.mo7435i0();
            } else if (v0 != 3) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                f = (float) cVar.mo7430Q();
            }
        }
        cVar.mo7426E();
        return new C1558c(str, str2, str3, f);
    }
}
