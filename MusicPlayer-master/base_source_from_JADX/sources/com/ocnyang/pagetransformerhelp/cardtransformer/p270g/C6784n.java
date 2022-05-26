package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.n */
/* compiled from: TabletTransformer */
public class C6784n extends C6771a {

    /* renamed from: a */
    private static final Matrix f30278a = new Matrix();

    /* renamed from: b */
    private static final Camera f30279b = new Camera();

    /* renamed from: c */
    private static final float[] f30280c = new float[2];

    /* renamed from: h */
    protected static final float m38664h(float f, int i, int i2) {
        Matrix matrix = f30278a;
        matrix.reset();
        Camera camera = f30279b;
        camera.save();
        camera.rotateY(Math.abs(f));
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(((float) (-i)) * 0.5f, ((float) (-i2)) * 0.5f);
        float f2 = (float) i;
        float f3 = (float) i2;
        matrix.postTranslate(f2 * 0.5f, 0.5f * f3);
        float[] fArr = f30280c;
        fArr[0] = f2;
        fArr[1] = f3;
        matrix.mapPoints(fArr);
        return (f2 - fArr[0]) * (f > 0.0f ? 1.0f : -1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float abs = (f < 0.0f ? 30.0f : -30.0f) * Math.abs(f);
        view.setTranslationX(m38664h(abs, view.getWidth(), view.getHeight()));
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(0.0f);
        view.setRotationY(abs);
    }
}
