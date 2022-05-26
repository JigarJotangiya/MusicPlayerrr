package com.airbnb.lottie.p015t.p017c;

import android.graphics.PointF;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.k */
/* compiled from: PointKeyframeAnimation */
public class C1546k extends C1542g<PointF> {

    /* renamed from: i */
    private final PointF f5938i = new PointF();

    public C1546k(List<C1688a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo7158i(C1688a<PointF> aVar, float f) {
        return mo7159j(aVar, f, f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public PointF mo7159j(C1688a<PointF> aVar, float f, float f2, float f3) {
        T t;
        T t2 = aVar.f6334b;
        if (t2 == null || (t = aVar.f6335c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.mo7508b(aVar.f6339g, aVar.f6340h.floatValue(), pointF, pointF2, f, mo7155e(), mo7156f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f5938i;
        float f4 = pointF.x;
        float f5 = f4 + (f2 * (pointF2.x - f4));
        float f6 = pointF.y;
        pointF4.set(f5, f6 + (f3 * (pointF2.y - f6)));
        return this.f5938i;
    }
}
