package com.airbnb.lottie.p026y;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p015t.p016b.C1518k;
import com.airbnb.lottie.p019v.C1555a;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1594m;
import java.util.List;

/* renamed from: com.airbnb.lottie.y.g */
/* compiled from: MiscUtils */
public class C1682g {

    /* renamed from: a */
    private static PointF f6326a = new PointF();

    /* renamed from: a */
    public static PointF m8442a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m8443b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m8444c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m8445d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m8446e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    private static int m8447f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: g */
    static int m8448g(float f, float f2) {
        return m8449h((int) f, (int) f2);
    }

    /* renamed from: h */
    private static int m8449h(int i, int i2) {
        return i - (i2 * m8447f(i, i2));
    }

    /* renamed from: i */
    public static void m8450i(C1594m mVar, Path path) {
        path.reset();
        PointF b = mVar.mo7322b();
        path.moveTo(b.x, b.y);
        f6326a.set(b.x, b.y);
        for (int i = 0; i < mVar.mo7321a().size(); i++) {
            C1555a aVar = mVar.mo7321a().get(i);
            PointF a = aVar.mo7216a();
            PointF b2 = aVar.mo7217b();
            PointF c = aVar.mo7218c();
            if (!a.equals(f6326a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f6326a.set(c.x, c.y);
        }
        if (mVar.mo7324d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m8451j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m8452k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m8453l(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: m */
    public static void m8454m(C1560e eVar, int i, List<C1560e> list, C1560e eVar2, C1518k kVar) {
        if (eVar.mo7231c(kVar.getName(), i)) {
            list.add(eVar2.mo7230a(kVar.getName()).mo7236i(kVar));
        }
    }
}
