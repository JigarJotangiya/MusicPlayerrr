package com.airbnb.lottie.p019v.p020j;

import android.graphics.PointF;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1549n;
import com.airbnb.lottie.p027z.C1688a;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.j.i */
/* compiled from: AnimatableSplitDimensionPathValue */
public class C1573i implements C1577m<PointF, PointF> {

    /* renamed from: a */
    private final C1566b f6010a;

    /* renamed from: b */
    private final C1566b f6011b;

    public C1573i(C1566b bVar, C1566b bVar2) {
        this.f6010a = bVar;
        this.f6011b = bVar2;
    }

    /* renamed from: a */
    public C1529a<PointF, PointF> mo7245a() {
        return new C1549n(this.f6010a.mo7245a(), this.f6011b.mo7245a());
    }

    /* renamed from: b */
    public List<C1688a<PointF>> mo7246b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: c */
    public boolean mo7247c() {
        return this.f6010a.mo7247c() && this.f6011b.mo7247c();
    }
}
