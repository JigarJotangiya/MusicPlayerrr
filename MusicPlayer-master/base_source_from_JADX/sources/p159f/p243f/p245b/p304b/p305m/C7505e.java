package p159f.p243f.p245b.p304b.p305m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: f.f.b.b.m.e */
/* compiled from: DrawableAlphaProperty */
public class C7505e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f32706b = new C7505e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f32707a = new WeakHashMap<>();

    private C7505e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f32707a.containsKey(drawable)) {
            return this.f32707a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f32707a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
