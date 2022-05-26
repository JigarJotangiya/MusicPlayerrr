package com.airbnb.lottie.p026y;

/* renamed from: com.airbnb.lottie.y.f */
/* compiled from: MeanCalculator */
public class C1681f {

    /* renamed from: a */
    private float f6324a;

    /* renamed from: b */
    private int f6325b;

    /* renamed from: a */
    public void mo7489a(float f) {
        float f2 = this.f6324a + f;
        this.f6324a = f2;
        int i = this.f6325b + 1;
        this.f6325b = i;
        if (i == Integer.MAX_VALUE) {
            this.f6324a = f2 / 2.0f;
            this.f6325b = i / 2;
        }
    }
}
