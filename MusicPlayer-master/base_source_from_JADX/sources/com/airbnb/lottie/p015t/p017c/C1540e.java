package com.airbnb.lottie.p015t.p017c;

import com.airbnb.lottie.p019v.p021k.C1582d;
import com.airbnb.lottie.p027z.C1688a;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.c.e */
/* compiled from: GradientColorKeyframeAnimation */
public class C1540e extends C1542g<C1582d> {

    /* renamed from: i */
    private final C1582d f5928i;

    public C1540e(List<C1688a<C1582d>> list) {
        super(list);
        int i = 0;
        C1582d dVar = (C1582d) list.get(0).f6334b;
        i = dVar != null ? dVar.mo7269c() : i;
        this.f5928i = new C1582d(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C1582d mo7158i(C1688a<C1582d> aVar, float f) {
        this.f5928i.mo7270d((C1582d) aVar.f6334b, (C1582d) aVar.f6335c, f);
        return this.f5928i;
    }
}
