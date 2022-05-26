package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: androidx.transition.m */
/* compiled from: ObjectAnimatorUtils */
class C1137m {
    /* renamed from: a */
    static <T> ObjectAnimator m6461a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1139n(property, path), new float[]{0.0f, 1.0f});
    }
}
