package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: androidx.transition.o */
/* compiled from: PropertyValuesHolderUtils */
class C1141o {
    /* renamed from: a */
    static PropertyValuesHolder m6466a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C1139n(property, path), new float[]{0.0f, 1.0f});
    }
}
