package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.n */
/* compiled from: PathProperty */
class C1139n<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f4709a;

    /* renamed from: b */
    private final PathMeasure f4710b;

    /* renamed from: c */
    private final float f4711c;

    /* renamed from: d */
    private final float[] f4712d = new float[2];

    /* renamed from: e */
    private final PointF f4713e = new PointF();

    /* renamed from: f */
    private float f4714f;

    C1139n(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f4709a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f4710b = pathMeasure;
        this.f4711c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f4714f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f4714f = f.floatValue();
        this.f4710b.getPosTan(this.f4711c * f.floatValue(), this.f4712d, (float[]) null);
        PointF pointF = this.f4713e;
        float[] fArr = this.f4712d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f4709a.set(t, pointF);
    }
}
