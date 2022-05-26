package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p026y.C1677b;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.b */
/* compiled from: ColorKeyframeAnimation */
public class C1536b extends C1542g<Integer> {
    public C1536b(List<C1688a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo7170p() {
        return mo7171q(mo7152b(), mo7154d());
    }

    /* renamed from: q */
    public int mo7171q(C1688a<Integer> aVar, float f) {
        T t = aVar.f6334b;
        if (t == null || aVar.f6335c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f6335c).intValue();
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo7508b(aVar.f6339g, aVar.f6340h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo7155e(), mo7156f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C1677b.m8408c(C1682g.m8444c(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo7158i(C1688a<Integer> aVar, float f) {
        return Integer.valueOf(mo7171q(aVar, f));
    }
}
