package p159f.p243f.p245b.p304b.p311s;

/* renamed from: f.f.b.b.s.a */
/* compiled from: MathUtils */
public final class C7518a {
    /* renamed from: a */
    public static float m41999a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m42000b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m42003e(m41999a(f, f2, f3, f4), m41999a(f, f2, f5, f4), m41999a(f, f2, f5, f6), m41999a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static boolean m42001c(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: d */
    public static float m42002d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: e */
    private static float m42003e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
