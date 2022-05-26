package p082e.p109h.p118o;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.h.o.d */
/* compiled from: ObjectsCompat */
public class C3698d {
    /* renamed from: a */
    public static boolean m15814a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m15815b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
