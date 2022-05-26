package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.d */
/* compiled from: FloatKeyframeAnimation */
public class C1539d extends C1542g<Float> {
    public C1539d(List<C1688a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float mo7180p() {
        return mo7181q(mo7152b(), mo7154d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo7181q(C1688a<Float> aVar, float f) {
        if (aVar.f6334b == null || aVar.f6335c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo7508b(aVar.f6339g, aVar.f6340h.floatValue(), aVar.f6334b, aVar.f6335c, f, mo7155e(), mo7156f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C1682g.m8452k(aVar.mo7503f(), aVar.mo7500c(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Float mo7158i(C1688a<Float> aVar, float f) {
        return Float.valueOf(mo7181q(aVar, f));
    }
}
