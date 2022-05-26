package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1158x;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: P */
    private static final String[] f4520P = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: Q */
    private static final TypeEvaluator<Matrix> f4521Q = new C1070a();

    /* renamed from: R */
    private static final Property<ImageView, Matrix> f4522R = new C1071b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    static class C1070a implements TypeEvaluator<Matrix> {
        C1070a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    static class C1071b extends Property<ImageView, Matrix> {
        C1071b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C1132k.m6450a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    static /* synthetic */ class C1072c {

        /* renamed from: a */
        static final /* synthetic */ int[] f4523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4523a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4523a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C1072c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: m0 */
    private void m6142m0(C1160y yVar) {
        View view = yVar.f4752b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = yVar.f4751a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m6144o0(imageView));
            }
        }
    }

    /* renamed from: n0 */
    private static Matrix m6143n0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: o0 */
    private static Matrix m6144o0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C1072c.f4523a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m6147r0(imageView);
            }
            if (i == 2) {
                return m6143n0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: p0 */
    private ObjectAnimator m6145p0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f4522R, new C1158x.C1159a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: q0 */
    private ObjectAnimator m6146q0(ImageView imageView) {
        Property<ImageView, Matrix> property = f4522R;
        TypeEvaluator<Matrix> typeEvaluator = f4521Q;
        Matrix matrix = C1134l.f4704a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    /* renamed from: r0 */
    private static Matrix m6147r0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4520P;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6142m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6142m0(yVar);
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Rect rect = (Rect) yVar.f4751a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) yVar2.f4751a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) yVar.f4751a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) yVar2.f4751a.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) yVar2.f4752b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m6146q0(imageView);
        }
        if (matrix == null) {
            matrix = C1134l.f4704a;
        }
        if (matrix2 == null) {
            matrix2 = C1134l.f4704a;
        }
        f4522R.set(imageView, matrix);
        return m6145p0(imageView, matrix, matrix2);
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
