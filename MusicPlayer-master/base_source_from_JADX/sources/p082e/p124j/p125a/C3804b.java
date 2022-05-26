package p082e.p124j.p125a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: e.j.a.b */
/* compiled from: FocusStrategy */
class C3804b {

    /* renamed from: e.j.a.b$a */
    /* compiled from: FocusStrategy */
    public interface C3805a<T> {
        /* renamed from: a */
        void mo13276a(T t, Rect rect);
    }

    /* renamed from: e.j.a.b$b */
    /* compiled from: FocusStrategy */
    public interface C3806b<T, V> {
        /* renamed from: a */
        V mo13278a(T t, int i);

        /* renamed from: b */
        int mo13279b(T t);
    }

    /* renamed from: e.j.a.b$c */
    /* compiled from: FocusStrategy */
    private static class C3807c<T> implements Comparator<T> {

        /* renamed from: g */
        private final Rect f11893g = new Rect();

        /* renamed from: h */
        private final Rect f11894h = new Rect();

        /* renamed from: i */
        private final boolean f11895i;

        /* renamed from: j */
        private final C3805a<T> f11896j;

        C3807c(boolean z, C3805a<T> aVar) {
            this.f11895i = z;
            this.f11896j = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f11893g;
            Rect rect2 = this.f11894h;
            this.f11896j.mo13276a(t, rect);
            this.f11896j.mo13276a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f11895i) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f11895i) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f11895i) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f11895i) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: a */
    private static boolean m16383a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m16384b(i, rect, rect2);
        if (m16384b(i, rect, rect3) || !b) {
            return false;
        }
        if (m16392j(i, rect, rect3) && i != 17 && i != 66 && m16393k(i, rect, rect2) >= m16395m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m16384b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static <L, T> T m16385c(L l, C3806b<L, T> bVar, C3805a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int b = bVar.mo13279b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < b; i2++) {
            T a = bVar.mo13278a(l, i2);
            if (a != t) {
                aVar.mo13276a(a, rect3);
                if (m16390h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m16386d(L l, C3806b<L, T> bVar, C3805a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b = bVar.mo13279b(l);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo13278a(l, i2));
        }
        Collections.sort(arrayList, new C3807c(z, aVar));
        if (i == 1) {
            return m16388f(t, arrayList, z2);
        }
        if (i == 2) {
            return m16387e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m16387e(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m16388f(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m16389g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m16390h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m16391i(rect, rect2, i)) {
            return false;
        }
        if (!m16391i(rect, rect3, i) || m16383a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m16383a(i, rect, rect3, rect2) && m16389g(m16393k(i, rect, rect2), m16397o(i, rect, rect2)) < m16389g(m16393k(i, rect, rect3), m16397o(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m16391i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m16392j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        return rect.bottom <= rect2.top;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    private static int m16393k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m16394l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m16394l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m16395m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m16396n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m16396n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m16397o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
