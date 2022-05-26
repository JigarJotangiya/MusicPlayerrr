package com.airbnb.lottie.p024x;

import android.graphics.Color;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.g */
/* compiled from: ColorParser */
public class C1640g implements C1653m0<Integer> {

    /* renamed from: a */
    public static final C1640g f6239a = new C1640g();

    private C1640g() {
    }

    /* renamed from: b */
    public Integer mo7411a(C1657c cVar, float f) throws IOException {
        boolean z = cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY;
        if (z) {
            cVar.mo7433d();
        }
        double Q = cVar.mo7430Q();
        double Q2 = cVar.mo7430Q();
        double Q3 = cVar.mo7430Q();
        double Q4 = cVar.mo7436n0() == C1657c.C1659b.NUMBER ? cVar.mo7430Q() : 1.0d;
        if (z) {
            cVar.mo7440x();
        }
        if (Q <= 1.0d && Q2 <= 1.0d && Q3 <= 1.0d) {
            Q *= 255.0d;
            Q2 *= 255.0d;
            Q3 *= 255.0d;
            if (Q4 <= 1.0d) {
                Q4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) Q4, (int) Q, (int) Q2, (int) Q3));
    }
}
