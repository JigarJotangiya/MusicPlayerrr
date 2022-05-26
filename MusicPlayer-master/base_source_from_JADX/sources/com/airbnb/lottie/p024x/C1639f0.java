package com.airbnb.lottie.p024x;

import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p027z.C1691d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.f0 */
/* compiled from: ScaleXYParser */
public class C1639f0 implements C1653m0<C1691d> {

    /* renamed from: a */
    public static final C1639f0 f6238a = new C1639f0();

    private C1639f0() {
    }

    /* renamed from: b */
    public C1691d mo7411a(C1657c cVar, float f) throws IOException {
        boolean z = cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY;
        if (z) {
            cVar.mo7433d();
        }
        float Q = (float) cVar.mo7430Q();
        float Q2 = (float) cVar.mo7430Q();
        while (cVar.mo7427H()) {
            cVar.mo7425A0();
        }
        if (z) {
            cVar.mo7440x();
        }
        return new C1691d((Q / 100.0f) * f, (Q2 / 100.0f) * f);
    }
}
