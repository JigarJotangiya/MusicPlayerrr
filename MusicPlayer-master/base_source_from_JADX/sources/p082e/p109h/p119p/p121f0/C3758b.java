package p082e.p109h.p119p.p121f0;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: e.h.p.f0.b */
/* compiled from: PathInterpolatorCompat */
public final class C3758b {
    /* renamed from: a */
    public static Interpolator m16089a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C3757a(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m16090b(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new C3757a(path);
    }
}
