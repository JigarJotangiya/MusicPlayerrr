package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import com.airbnb.lottie.p027z.C1691d;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.l */
/* compiled from: ScaleKeyframeAnimation */
public class C1547l extends C1542g<C1691d> {

    /* renamed from: i */
    private final C1691d f5939i = new C1691d();

    public C1547l(List<C1688a<C1691d>> list) {
        super(list);
    }

    /* renamed from: p */
    public C1691d mo7158i(C1688a<C1691d> aVar, float f) {
        T t;
        T t2 = aVar.f6334b;
        if (t2 == null || (t = aVar.f6335c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1691d dVar = (C1691d) t2;
        C1691d dVar2 = (C1691d) t;
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            C1691d dVar3 = (C1691d) cVar.mo7508b(aVar.f6339g, aVar.f6340h.floatValue(), dVar, dVar2, f, mo7155e(), mo7156f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f5939i.mo7513d(C1682g.m8452k(dVar.mo7511b(), dVar2.mo7511b(), f), C1682g.m8452k(dVar.mo7512c(), dVar2.mo7512c(), f));
        return this.f5939i;
    }
}
