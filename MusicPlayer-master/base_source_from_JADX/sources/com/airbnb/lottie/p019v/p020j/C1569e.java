package com.airbnb.lottie.p019v.p020j;

import android.graphics.PointF;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1545j;
import com.airbnb.lottie.p015t.p017c.C1546k;
import com.airbnb.lottie.p027z.C1688a;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.j.e */
/* compiled from: AnimatablePathValue */
public class C1569e implements C1577m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1688a<PointF>> f6009a;

    public C1569e(List<C1688a<PointF>> list) {
        this.f6009a = list;
    }

    /* renamed from: a */
    public C1529a<PointF, PointF> mo7245a() {
        if (this.f6009a.get(0).mo7505h()) {
            return new C1546k(this.f6009a);
        }
        return new C1545j(this.f6009a);
    }

    /* renamed from: b */
    public List<C1688a<PointF>> mo7246b() {
        return this.f6009a;
    }

    /* renamed from: c */
    public boolean mo7247c() {
        return this.f6009a.size() == 1 && this.f6009a.get(0).mo7505h();
    }
}
