package p369i.p371b0;

import p369i.p387z.p389d.C8594l;

/* renamed from: i.b0.d */
/* compiled from: Random.kt */
public final class C8382d {
    /* renamed from: a */
    public static final String m46427a(Object obj, Object obj2) {
        C8594l.m46771e(obj, "from");
        C8594l.m46771e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: b */
    public static final void m46428b(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(m46427a(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    /* renamed from: c */
    public static final void m46429c(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(m46427a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: d */
    public static final void m46430d(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(m46427a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    /* renamed from: e */
    public static final int m46431e(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: f */
    public static final int m46432f(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
