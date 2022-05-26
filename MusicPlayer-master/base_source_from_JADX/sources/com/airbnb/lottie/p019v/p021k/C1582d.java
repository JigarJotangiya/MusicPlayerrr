package com.airbnb.lottie.p019v.p021k;

import com.airbnb.lottie.p026y.C1677b;
import com.airbnb.lottie.p026y.C1682g;

/* renamed from: com.airbnb.lottie.v.k.d */
/* compiled from: GradientColor */
public class C1582d {

    /* renamed from: a */
    private final float[] f6032a;

    /* renamed from: b */
    private final int[] f6033b;

    public C1582d(float[] fArr, int[] iArr) {
        this.f6032a = fArr;
        this.f6033b = iArr;
    }

    /* renamed from: a */
    public int[] mo7267a() {
        return this.f6033b;
    }

    /* renamed from: b */
    public float[] mo7268b() {
        return this.f6032a;
    }

    /* renamed from: c */
    public int mo7269c() {
        return this.f6033b.length;
    }

    /* renamed from: d */
    public void mo7270d(C1582d dVar, C1582d dVar2, float f) {
        if (dVar.f6033b.length == dVar2.f6033b.length) {
            for (int i = 0; i < dVar.f6033b.length; i++) {
                this.f6032a[i] = C1682g.m8452k(dVar.f6032a[i], dVar2.f6032a[i], f);
                this.f6033b[i] = C1677b.m8408c(f, dVar.f6033b[i], dVar2.f6033b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f6033b.length + " vs " + dVar2.f6033b.length + ")");
    }
}
