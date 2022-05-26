package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.p0 */
/* compiled from: ViewUtilsBase */
class C1144p0 {

    /* renamed from: b */
    private static Method f4716b;

    /* renamed from: c */
    private static boolean f4717c;

    /* renamed from: d */
    private static Field f4718d;

    /* renamed from: e */
    private static boolean f4719e;

    /* renamed from: a */
    private float[] f4720a;

    C1144p0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m6474b() {
        if (!f4717c) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f4716b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f4717c = true;
        }
    }

    /* renamed from: a */
    public void mo6069a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1143p.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: c */
    public float mo6070c(View view) {
        Float f = (Float) view.getTag(C1143p.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo6071d(View view) {
        int i = C1143p.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo6105e(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f4720a;
        if (fArr == null) {
            fArr = new float[9];
            this.f4720a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f * f)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    /* renamed from: f */
    public void mo6108f(View view, int i, int i2, int i3, int i4) {
        m6474b();
        Method method = f4716b;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: g */
    public void mo6072g(View view, float f) {
        Float f2 = (Float) view.getTag(C1143p.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: h */
    public void mo6113h(View view, int i) {
        if (!f4719e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4718d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4719e = true;
        }
        Field field = f4718d;
        if (field != null) {
            try {
                f4718d.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public void mo6106i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo6106i(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: j */
    public void mo6107j(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo6107j(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
