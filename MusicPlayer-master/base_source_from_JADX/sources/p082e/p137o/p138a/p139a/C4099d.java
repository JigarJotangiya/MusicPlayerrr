package p082e.p137o.p138a.p139a;

import android.view.animation.Interpolator;

/* renamed from: e.o.a.a.d */
/* compiled from: LookupTableInterpolator */
abstract class C4099d implements Interpolator {

    /* renamed from: a */
    private final float[] f12373a;

    /* renamed from: b */
    private final float f12374b;

    protected C4099d(float[] fArr) {
        this.f12373a = fArr;
        this.f12374b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f12373a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f12374b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f12373a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
