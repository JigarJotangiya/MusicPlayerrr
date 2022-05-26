package com.airbnb.lottie.p024x;

import com.airbnb.lottie.p019v.C1556b;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.x.i */
/* compiled from: DocumentDataParser */
public class C1644i implements C1653m0<C1556b> {

    /* renamed from: a */
    public static final C1644i f6244a = new C1644i();

    /* renamed from: b */
    private static final C1657c.C1658a f6245b = C1657c.C1658a.m8335a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C1644i() {
    }

    /* renamed from: b */
    public C1556b mo7411a(C1657c cVar, float f) throws IOException {
        C1556b.C1557a aVar = C1556b.C1557a.CENTER;
        cVar.mo7438p();
        C1556b.C1557a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (cVar.mo7427H()) {
            switch (cVar.mo7439v0(f6245b)) {
                case 0:
                    str = cVar.mo7435i0();
                    break;
                case 1:
                    str2 = cVar.mo7435i0();
                    break;
                case 2:
                    f2 = (float) cVar.mo7430Q();
                    break;
                case 3:
                    int T = cVar.mo7431T();
                    aVar2 = C1556b.C1557a.CENTER;
                    if (T <= aVar2.ordinal() && T >= 0) {
                        aVar2 = C1556b.C1557a.values()[T];
                        break;
                    }
                case 4:
                    i = cVar.mo7431T();
                    break;
                case 5:
                    f3 = (float) cVar.mo7430Q();
                    break;
                case 6:
                    f4 = (float) cVar.mo7430Q();
                    break;
                case 7:
                    i2 = C1666s.m8376d(cVar);
                    break;
                case 8:
                    i3 = C1666s.m8376d(cVar);
                    break;
                case 9:
                    f5 = (float) cVar.mo7430Q();
                    break;
                case 10:
                    z = cVar.mo7429K();
                    break;
                default:
                    cVar.mo7441z0();
                    cVar.mo7425A0();
                    break;
            }
        }
        C1657c cVar2 = cVar;
        cVar.mo7426E();
        return new C1556b(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
