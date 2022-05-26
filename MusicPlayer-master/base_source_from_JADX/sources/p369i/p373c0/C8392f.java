package p369i.p373c0;

/* renamed from: i.c0.f */
/* compiled from: _Ranges.kt */
class C8392f extends C8391e {
    /* renamed from: a */
    public static int m46450a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m46451b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public static int m46452c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: d */
    public static long m46453d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: e */
    public static int m46454e(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    /* renamed from: f */
    public static C8385a m46455f(int i, int i2) {
        return C8385a.f34870j.mo30364a(i, i2, -1);
    }

    /* renamed from: g */
    public static C8388c m46456g(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C8388c.f34879l.mo30369a();
        }
        return new C8388c(i, i2 - 1);
    }
}
