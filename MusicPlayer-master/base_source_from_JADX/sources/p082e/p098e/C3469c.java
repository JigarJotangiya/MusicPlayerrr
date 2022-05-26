package p082e.p098e;

/* renamed from: e.e.c */
/* compiled from: ContainerHelpers */
class C3469c {

    /* renamed from: a */
    static final int[] f11004a = new int[0];

    /* renamed from: b */
    static final long[] f11005b = new long[0];

    /* renamed from: c */
    static final Object[] f11006c = new Object[0];

    /* renamed from: a */
    static int m14781a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: b */
    static int m14782b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* renamed from: c */
    public static boolean m14783c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m14784d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m14785e(int i) {
        return m14784d(i * 4) / 4;
    }

    /* renamed from: f */
    public static int m14786f(int i) {
        return m14784d(i * 8) / 8;
    }
}
