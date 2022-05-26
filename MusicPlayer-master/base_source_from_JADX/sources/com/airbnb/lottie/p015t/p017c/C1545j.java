package com.airbnb.lottie.p015t.p017c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.j */
/* compiled from: PathKeyframeAnimation */
public class C1545j extends C1542g<PointF> {

    /* renamed from: i */
    private final PointF f5934i = new PointF();

    /* renamed from: j */
    private final float[] f5935j = new float[2];

    /* renamed from: k */
    private final PathMeasure f5936k = new PathMeasure();

    /* renamed from: l */
    private C1544i f5937l;

    public C1545j(List<? extends C1688a<PointF>> list) {
        super(list);
    }

    /* renamed from: p */
    public PointF mo7158i(C1688a<PointF> aVar, float f) {
        C1544i iVar = (C1544i) aVar;
        Path j = iVar.mo7191j();
        if (j == null) {
            return (PointF) aVar.f6334b;
        }
        C1690c<A> cVar = this.f5910e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo7508b(iVar.f6339g, iVar.f6340h.floatValue(), iVar.f6334b, iVar.f6335c, mo7155e(), f, mo7156f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f5937l != iVar) {
            this.f5936k.setPath(j, false);
            this.f5937l = iVar;
        }
        PathMeasure pathMeasure = this.f5936k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f5935j, (float[]) null);
        PointF pointF2 = this.f5934i;
        float[] fArr = this.f5935j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f5934i;
    }
}
