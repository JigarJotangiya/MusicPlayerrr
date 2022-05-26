package com.airbnb.lottie.p024x;

import com.airbnb.lottie.p019v.p021k.C1588i;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.y */
/* compiled from: MergePathsParser */
class C1674y {

    /* renamed from: a */
    private static final C1657c.C1658a f6310a = C1657c.C1658a.m8335a("nm", "mm", "hd");

    /* renamed from: a */
    static C1588i m8399a(C1657c cVar) throws IOException {
        String str = null;
        C1588i.C1589a aVar = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6310a);
            if (v0 == 0) {
                str = cVar.mo7435i0();
            } else if (v0 == 1) {
                aVar = C1588i.C1589a.forId(cVar.mo7431T());
            } else if (v0 != 2) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                z = cVar.mo7429K();
            }
        }
        return new C1588i(str, aVar, z);
    }
}
