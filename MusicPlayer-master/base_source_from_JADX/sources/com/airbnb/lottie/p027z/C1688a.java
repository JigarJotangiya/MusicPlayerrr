package com.airbnb.lottie.p027z;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1464d;

/* renamed from: com.airbnb.lottie.z.a */
/* compiled from: Keyframe */
public class C1688a<T> {

    /* renamed from: a */
    private final C1464d f6333a;

    /* renamed from: b */
    public final T f6334b;

    /* renamed from: c */
    public T f6335c;

    /* renamed from: d */
    public final Interpolator f6336d;

    /* renamed from: e */
    public final Interpolator f6337e;

    /* renamed from: f */
    public final Interpolator f6338f;

    /* renamed from: g */
    public final float f6339g;

    /* renamed from: h */
    public Float f6340h;

    /* renamed from: i */
    private float f6341i;

    /* renamed from: j */
    private float f6342j;

    /* renamed from: k */
    private int f6343k;

    /* renamed from: l */
    private int f6344l;

    /* renamed from: m */
    private float f6345m;

    /* renamed from: n */
    private float f6346n;

    /* renamed from: o */
    public PointF f6347o;

    /* renamed from: p */
    public PointF f6348p;

    public C1688a(C1464d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f6341i = -3987645.8f;
        this.f6342j = -3987645.8f;
        this.f6343k = 784923401;
        this.f6344l = 784923401;
        this.f6345m = Float.MIN_VALUE;
        this.f6346n = Float.MIN_VALUE;
        this.f6347o = null;
        this.f6348p = null;
        this.f6333a = dVar;
        this.f6334b = t;
        this.f6335c = t2;
        this.f6336d = interpolator;
        this.f6337e = null;
        this.f6338f = null;
        this.f6339g = f;
        this.f6340h = f2;
    }

    /* renamed from: a */
    public boolean mo7498a(float f) {
        return f >= mo7502e() && f < mo7499b();
    }

    /* renamed from: b */
    public float mo7499b() {
        if (this.f6333a == null) {
            return 1.0f;
        }
        if (this.f6346n == Float.MIN_VALUE) {
            if (this.f6340h == null) {
                this.f6346n = 1.0f;
            } else {
                this.f6346n = mo7502e() + ((this.f6340h.floatValue() - this.f6339g) / this.f6333a.mo7006e());
            }
        }
        return this.f6346n;
    }

    /* renamed from: c */
    public float mo7500c() {
        if (this.f6342j == -3987645.8f) {
            this.f6342j = ((Float) this.f6335c).floatValue();
        }
        return this.f6342j;
    }

    /* renamed from: d */
    public int mo7501d() {
        if (this.f6344l == 784923401) {
            this.f6344l = ((Integer) this.f6335c).intValue();
        }
        return this.f6344l;
    }

    /* renamed from: e */
    public float mo7502e() {
        C1464d dVar = this.f6333a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f6345m == Float.MIN_VALUE) {
            this.f6345m = (this.f6339g - dVar.mo7017p()) / this.f6333a.mo7006e();
        }
        return this.f6345m;
    }

    /* renamed from: f */
    public float mo7503f() {
        if (this.f6341i == -3987645.8f) {
            this.f6341i = ((Float) this.f6334b).floatValue();
        }
        return this.f6341i;
    }

    /* renamed from: g */
    public int mo7504g() {
        if (this.f6343k == 784923401) {
            this.f6343k = ((Integer) this.f6334b).intValue();
        }
        return this.f6343k;
    }

    /* renamed from: h */
    public boolean mo7505h() {
        return this.f6336d == null && this.f6337e == null && this.f6338f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f6334b + ", endValue=" + this.f6335c + ", startFrame=" + this.f6339g + ", endFrame=" + this.f6340h + ", interpolator=" + this.f6336d + '}';
    }

    public C1688a(C1464d dVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f6341i = -3987645.8f;
        this.f6342j = -3987645.8f;
        this.f6343k = 784923401;
        this.f6344l = 784923401;
        this.f6345m = Float.MIN_VALUE;
        this.f6346n = Float.MIN_VALUE;
        this.f6347o = null;
        this.f6348p = null;
        this.f6333a = dVar;
        this.f6334b = t;
        this.f6335c = t2;
        this.f6336d = null;
        this.f6337e = interpolator;
        this.f6338f = interpolator2;
        this.f6339g = f;
        this.f6340h = f2;
    }

    protected C1688a(C1464d dVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f6341i = -3987645.8f;
        this.f6342j = -3987645.8f;
        this.f6343k = 784923401;
        this.f6344l = 784923401;
        this.f6345m = Float.MIN_VALUE;
        this.f6346n = Float.MIN_VALUE;
        this.f6347o = null;
        this.f6348p = null;
        this.f6333a = dVar;
        this.f6334b = t;
        this.f6335c = t2;
        this.f6336d = interpolator;
        this.f6337e = interpolator2;
        this.f6338f = interpolator3;
        this.f6339g = f;
        this.f6340h = f2;
    }

    public C1688a(T t) {
        this.f6341i = -3987645.8f;
        this.f6342j = -3987645.8f;
        this.f6343k = 784923401;
        this.f6344l = 784923401;
        this.f6345m = Float.MIN_VALUE;
        this.f6346n = Float.MIN_VALUE;
        this.f6347o = null;
        this.f6348p = null;
        this.f6333a = null;
        this.f6334b = t;
        this.f6335c = t;
        this.f6336d = null;
        this.f6337e = null;
        this.f6338f = null;
        this.f6339g = Float.MIN_VALUE;
        this.f6340h = Float.valueOf(Float.MAX_VALUE);
    }
}
