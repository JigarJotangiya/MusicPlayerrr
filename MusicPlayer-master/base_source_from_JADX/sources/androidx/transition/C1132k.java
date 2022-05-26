package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.k */
/* compiled from: ImageViewUtils */
class C1132k {

    /* renamed from: a */
    private static boolean f4700a = true;

    /* renamed from: b */
    private static Field f4701b;

    /* renamed from: c */
    private static boolean f4702c;

    /* renamed from: a */
    static void m6450a(ImageView imageView, Matrix matrix) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else if (i >= 21) {
            m6452c(imageView, matrix);
        } else {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                Matrix matrix2 = null;
                m6451b();
                Field field = f4701b;
                if (field != null) {
                    try {
                        Matrix matrix3 = (Matrix) field.get(imageView);
                        if (matrix3 == null) {
                            try {
                                matrix2 = new Matrix();
                                f4701b.set(imageView, matrix2);
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        matrix2 = matrix3;
                    } catch (IllegalAccessException unused2) {
                    }
                }
                if (matrix2 != null) {
                    matrix2.set(matrix);
                }
                imageView.invalidate();
            }
        }
    }

    /* renamed from: b */
    private static void m6451b() {
        if (!f4702c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f4701b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4702c = true;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m6452c(ImageView imageView, Matrix matrix) {
        if (f4700a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f4700a = false;
            }
        }
    }
}
