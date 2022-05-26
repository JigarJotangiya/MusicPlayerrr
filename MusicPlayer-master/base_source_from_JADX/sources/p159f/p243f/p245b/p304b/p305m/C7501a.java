package p159f.p243f.p245b.p304b.p305m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p082e.p137o.p138a.p139a.C4096a;
import p082e.p137o.p138a.p139a.C4097b;
import p082e.p137o.p138a.p139a.C4098c;

/* renamed from: f.f.b.b.m.a */
/* compiled from: AnimationUtils */
public class C7501a {

    /* renamed from: a */
    public static final TimeInterpolator f32699a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f32700b = new C4097b();

    /* renamed from: c */
    public static final TimeInterpolator f32701c = new C4096a();

    /* renamed from: d */
    public static final TimeInterpolator f32702d = new C4098c();

    /* renamed from: e */
    public static final TimeInterpolator f32703e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m41940a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m41941b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : m41940a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m41942c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
