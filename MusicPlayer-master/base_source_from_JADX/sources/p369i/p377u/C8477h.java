package p369i.p377u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.h */
/* compiled from: _Arrays.kt */
class C8477h extends C8475g {
    /* renamed from: l */
    public static boolean m46627l(long[] jArr, long j) {
        C8594l.m46771e(jArr, "$this$contains");
        return m46629n(jArr, j) >= 0;
    }

    /* renamed from: m */
    public static <T> boolean m46628m(T[] tArr, T t) {
        C8594l.m46771e(tArr, "$this$contains");
        return m46630o(tArr, t) >= 0;
    }

    /* renamed from: n */
    public static final int m46629n(long[] jArr, long j) {
        C8594l.m46771e(jArr, "$this$indexOf");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static final <T> int m46630o(T[] tArr, T t) {
        C8594l.m46771e(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C8594l.m46767a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: p */
    public static char m46631p(char[] cArr) {
        C8594l.m46771e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: q */
    public static <T> T m46632q(T[] tArr) {
        C8594l.m46771e(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: r */
    public static final <T> T[] m46633r(T[] tArr, Comparator<? super T> comparator) {
        C8594l.m46771e(tArr, "$this$sortedArrayWith");
        C8594l.m46771e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, size)");
        C8475g.m46624k(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: s */
    public static <T> List<T> m46634s(T[] tArr, Comparator<? super T> comparator) {
        C8594l.m46771e(tArr, "$this$sortedWith");
        C8594l.m46771e(comparator, "comparator");
        return C8475g.m46615b(m46633r(tArr, comparator));
    }

    /* renamed from: t */
    public static <T> List<T> m46635t(T[] tArr) {
        C8594l.m46771e(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return C8482l.m46665f();
        }
        if (length != 1) {
            return m46637v(tArr);
        }
        return C8481k.m46661b(tArr[0]);
    }

    /* renamed from: u */
    public static List<Long> m46636u(long[] jArr) {
        C8594l.m46771e(jArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: v */
    public static <T> List<T> m46637v(T[] tArr) {
        C8594l.m46771e(tArr, "$this$toMutableList");
        return new ArrayList(C8482l.m46662c(tArr));
    }
}
