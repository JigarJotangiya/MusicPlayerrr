package p369i.p383x;

/* renamed from: i.x.c */
/* compiled from: progressionUtil.kt */
public final class C8543c {
    /* renamed from: a */
    private static final int m46743a(int i, int i2, int i3) {
        return m46745c(m46745c(i, i3) - m46745c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m46744b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m46743a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m46743a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    private static final int m46745c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
