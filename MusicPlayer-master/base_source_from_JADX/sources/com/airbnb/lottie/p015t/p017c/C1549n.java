package com.airbnb.lottie.p015t.p017c;

import android.graphics.PointF;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.t.c.n */
/* compiled from: SplitDimensionPathKeyframeAnimation */
public class C1549n extends C1529a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f5942i = new PointF();

    /* renamed from: j */
    private final PointF f5943j = new PointF();

    /* renamed from: k */
    private final C1529a<Float, Float> f5944k;

    /* renamed from: l */
    private final C1529a<Float, Float> f5945l;

    /* renamed from: m */
    protected C1690c<Float> f5946m;

    /* renamed from: n */
    protected C1690c<Float> f5947n;

    public C1549n(C1529a<Float, Float> aVar, C1529a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f5944k = aVar;
        this.f5945l = aVar2;
        mo7162m(mo7156f());
    }

    /* renamed from: m */
    public void mo7162m(float f) {
        this.f5944k.mo7162m(f);
        this.f5945l.mo7162m(f);
        this.f5942i.set(this.f5944k.mo7157h().floatValue(), this.f5945l.mo7157h().floatValue());
        for (int i = 0; i < this.f5906a.size(); i++) {
            this.f5906a.get(i).mo7132a();
        }
    }

    /* renamed from: p */
    public PointF mo7157h() {
        return mo7158i((C1688a<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public PointF mo7158i(C1688a<PointF> aVar, float f) {
        Float f2;
        C1688a<Float> b;
        float f3;
        C1688a<Float> b2;
        float f4;
        Float f5 = null;
        if (this.f5946m == null || (b2 = this.f5944k.mo7152b()) == null) {
            f2 = null;
        } else {
            float d = this.f5944k.mo7154d();
            Float f6 = b2.f6340h;
            C1690c<Float> cVar = this.f5946m;
            float f7 = b2.f6339g;
            if (f6 == null) {
                f4 = f7;
            } else {
                f4 = f6.floatValue();
            }
            f2 = cVar.mo7508b(f7, f4, b2.f6334b, b2.f6335c, f, f, d);
        }
        if (!(this.f5947n == null || (b = this.f5945l.mo7152b()) == null)) {
            float d2 = this.f5945l.mo7154d();
            Float f8 = b.f6340h;
            C1690c<Float> cVar2 = this.f5947n;
            float f9 = b.f6339g;
            if (f8 == null) {
                f3 = f9;
            } else {
                f3 = f8.floatValue();
            }
            f5 = cVar2.mo7508b(f9, f3, b.f6334b, b.f6335c, f, f, d2);
        }
        if (f2 == null) {
            this.f5943j.set(this.f5942i.x, 0.0f);
        } else {
            this.f5943j.set(f2.floatValue(), 0.0f);
        }
        if (f5 == null) {
            PointF pointF = this.f5943j;
            pointF.set(pointF.x, this.f5942i.y);
        } else {
            PointF pointF2 = this.f5943j;
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.f5943j;
    }

    /* renamed from: r */
    public void mo7199r(C1690c<Float> cVar) {
        C1690c<Float> cVar2 = this.f5946m;
        if (cVar2 != null) {
            cVar2.mo7509c((C1529a<?, ?>) null);
        }
        this.f5946m = cVar;
        if (cVar != null) {
            cVar.mo7509c(this);
        }
    }

    /* renamed from: s */
    public void mo7200s(C1690c<Float> cVar) {
        C1690c<Float> cVar2 = this.f5947n;
        if (cVar2 != null) {
            cVar2.mo7509c((C1529a<?, ?>) null);
        }
        this.f5947n = cVar;
        if (cVar != null) {
            cVar.mo7509c(this);
        }
    }
}
