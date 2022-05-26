package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.d */
/* compiled from: FloatArrayEvaluator */
class C1109d implements TypeEvaluator<float[]> {

    /* renamed from: a */
    private float[] f4654a;

    C1109d(float[] fArr) {
        this.f4654a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f4654a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
