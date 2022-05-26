package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.f */
/* compiled from: IntegerKeyframeAnimation */
public class C1541f extends C1542g<Integer> {
    public C1541f(List<C1688a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int mo7184p() {
        return mo7185q(mo7152b(), mo7154d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo7185q(C1688a<Integer> aVar, float f) {
        if (aVar.f6334b == null || aVar.f6335c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo7508b(aVar.f6339g, aVar.f6340h.floatValue(), aVar.f6334b, aVar.f6335c, f, mo7155e(), mo7156f());
            if (num != null) {
                return num.intValue();
            }
        }
        return C1682g.m8453l(aVar.mo7504g(), aVar.mo7501d(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo7158i(C1688a<Integer> aVar, float f) {
        return Integer.valueOf(mo7185q(aVar, f));
    }
}
