package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.l */
/* compiled from: MatrixUtils */
class C1134l {

    /* renamed from: a */
    static final Matrix f4704a = new C1135a();

    /* renamed from: androidx.transition.l$a */
    /* compiled from: MatrixUtils */
    static class C1135a extends Matrix {
        C1135a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6073a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo6073a();
            throw null;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo6073a();
            throw null;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public boolean postTranslate(float f, float f2) {
            mo6073a();
            throw null;
        }

        public boolean preConcat(Matrix matrix) {
            mo6073a();
            throw null;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo6073a();
            throw null;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public boolean preTranslate(float f, float f2) {
            mo6073a();
            throw null;
        }

        public void reset() {
            mo6073a();
            throw null;
        }

        public void set(Matrix matrix) {
            mo6073a();
            throw null;
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo6073a();
            throw null;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo6073a();
            throw null;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo6073a();
            throw null;
        }

        public void setRotate(float f, float f2, float f3) {
            mo6073a();
            throw null;
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo6073a();
            throw null;
        }

        public void setTranslate(float f, float f2) {
            mo6073a();
            throw null;
        }

        public void setValues(float[] fArr) {
            mo6073a();
            throw null;
        }

        public boolean postRotate(float f) {
            mo6073a();
            throw null;
        }

        public boolean postScale(float f, float f2) {
            mo6073a();
            throw null;
        }

        public boolean postSkew(float f, float f2) {
            mo6073a();
            throw null;
        }

        public boolean preRotate(float f) {
            mo6073a();
            throw null;
        }

        public boolean preScale(float f, float f2) {
            mo6073a();
            throw null;
        }

        public boolean preSkew(float f, float f2) {
            mo6073a();
            throw null;
        }

        public void setRotate(float f) {
            mo6073a();
            throw null;
        }

        public void setScale(float f, float f2) {
            mo6073a();
            throw null;
        }

        public void setSinCos(float f, float f2) {
            mo6073a();
            throw null;
        }

        public void setSkew(float f, float f2) {
            mo6073a();
            throw null;
        }
    }
}
