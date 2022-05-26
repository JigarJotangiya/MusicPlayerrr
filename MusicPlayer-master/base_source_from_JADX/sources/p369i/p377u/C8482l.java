package p369i.p377u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.u.l */
/* compiled from: Collections.kt */
class C8482l extends C8481k {
    /* renamed from: c */
    public static final <T> Collection<T> m46662c(T[] tArr) {
        C8594l.m46771e(tArr, "$this$asCollection");
        return new C8467c(tArr, false);
    }

    /* renamed from: d */
    public static final <T extends Comparable<? super T>> int m46663d(List<? extends T> list, T t, int i, int i2) {
        C8594l.m46771e(list, "$this$binarySearch");
        m46670k(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C8498b.m46698a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: e */
    public static /* synthetic */ int m46664e(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m46663d(list, comparable, i, i2);
    }

    /* renamed from: f */
    public static <T> List<T> m46665f() {
        return C8492v.INSTANCE;
    }

    /* renamed from: g */
    public static <T> int m46666g(List<? extends T> list) {
        C8594l.m46771e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: h */
    public static <T> List<T> m46667h(T... tArr) {
        C8594l.m46771e(tArr, "elements");
        return tArr.length > 0 ? C8475g.m46615b(tArr) : m46665f();
    }

    /* renamed from: i */
    public static <T> List<T> m46668i(T... tArr) {
        C8594l.m46771e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C8467c(tArr, true));
    }

    /* renamed from: j */
    public static <T> List<T> m46669j(List<? extends T> list) {
        C8594l.m46771e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return m46665f();
        }
        if (size != 1) {
            return list;
        }
        return C8481k.m46661b(list.get(0));
    }

    /* renamed from: k */
    private static final void m46670k(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: l */
    public static void m46671l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
