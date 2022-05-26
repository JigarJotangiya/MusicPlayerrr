package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.b0 */
/* compiled from: PointFParser */
public class C1631b0 implements C1653m0<PointF> {

    /* renamed from: a */
    public static final C1631b0 f6229a = new C1631b0();

    private C1631b0() {
    }

    /* renamed from: b */
    public PointF mo7411a(C1657c cVar, float f) throws IOException {
        C1657c.C1659b n0 = cVar.mo7436n0();
        if (n0 == C1657c.C1659b.BEGIN_ARRAY) {
            return C1666s.m8377e(cVar, f);
        }
        if (n0 == C1657c.C1659b.BEGIN_OBJECT) {
            return C1666s.m8377e(cVar, f);
        }
        if (n0 == C1657c.C1659b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo7430Q()) * f, ((float) cVar.mo7430Q()) * f);
            while (cVar.mo7427H()) {
                cVar.mo7425A0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + n0);
    }
}
