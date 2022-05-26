package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import com.airbnb.lottie.p019v.C1555a;
import com.airbnb.lottie.p019v.p021k.C1594m;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1682g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.x.g0 */
/* compiled from: ShapeDataParser */
public class C1641g0 implements C1653m0<C1594m> {

    /* renamed from: a */
    public static final C1641g0 f6240a = new C1641g0();

    /* renamed from: b */
    private static final C1657c.C1658a f6241b = C1657c.C1658a.m8335a("c", "v", "i", "o");

    private C1641g0() {
    }

    /* renamed from: b */
    public C1594m mo7411a(C1657c cVar, float f) throws IOException {
        if (cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY) {
            cVar.mo7433d();
        }
        cVar.mo7438p();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6241b);
            if (v0 == 0) {
                z = cVar.mo7429K();
            } else if (v0 == 1) {
                list = C1666s.m8378f(cVar, f);
            } else if (v0 == 2) {
                list2 = C1666s.m8378f(cVar, f);
            } else if (v0 != 3) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                list3 = C1666s.m8378f(cVar, f);
            }
        }
        cVar.mo7426E();
        if (cVar.mo7436n0() == C1657c.C1659b.END_ARRAY) {
            cVar.mo7440x();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C1594m(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C1555a(C1682g.m8442a(list.get(i2), list3.get(i2)), C1682g.m8442a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C1555a(C1682g.m8442a(list.get(i3), list3.get(i3)), C1682g.m8442a(pointF3, list2.get(0)), pointF3));
            }
            return new C1594m(pointF, z, arrayList);
        }
    }
}
