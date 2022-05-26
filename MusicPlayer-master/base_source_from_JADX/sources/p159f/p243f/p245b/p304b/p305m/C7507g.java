package p159f.p243f.p245b.p304b.p305m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: f.f.b.b.m.g */
/* compiled from: MatrixEvaluator */
public class C7507g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f32709a = new float[9];

    /* renamed from: b */
    private final float[] f32710b = new float[9];

    /* renamed from: c */
    private final Matrix f32711c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f32709a);
        matrix2.getValues(this.f32710b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f32710b;
            float f2 = fArr[i];
            float[] fArr2 = this.f32709a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f32711c.setValues(this.f32710b);
        return this.f32711c;
    }
}
