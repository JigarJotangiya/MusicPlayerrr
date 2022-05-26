package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vo3 {

    /* renamed from: a */
    private static final Class<?> f24887a;

    /* renamed from: b */
    private static final lp3<?, ?> f24888b = m32565C(false);

    /* renamed from: c */
    private static final lp3<?, ?> f24889c = m32565C(true);

    /* renamed from: d */
    private static final lp3<?, ?> f24890d = new np3();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f24887a = cls;
    }

    /* renamed from: A */
    static int m32563A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (xl3.m33733a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m32564B(int i, List<Long> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22238k(i, list, z);
        }
    }

    /* renamed from: C */
    private static lp3<?, ?> m32565C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (lp3) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m32566D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    static int m32567E(int i, List<kl3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * xl3.m33732D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += xl3.m33737x(list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m32568F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32569G(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: G */
    static int m32569G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            i = 0;
            while (i2 < size) {
                i += xl3.m33739z(rm3.mo20682p(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + xl3.m33739z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m32570H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (xl3.m33733a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m32571I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m32572J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (xl3.m33733a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m32573K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m32574L(int i, List<zn3> list, to3 to3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += xl3.m33738y(i, list.get(i3), to3);
        }
        return i2;
    }

    /* renamed from: M */
    static int m32575M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32576N(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: N */
    static int m32576N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            i = 0;
            while (i2 < size) {
                i += xl3.m33739z(rm3.mo20682p(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + xl3.m33739z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m32577O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m32578P(list) + (list.size() * xl3.m33732D(i));
    }

    /* renamed from: P */
    static int m32578P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            i = 0;
            while (i2 < size) {
                i += xl3.m33734b(on3.mo20056p(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + xl3.m33734b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m32579Q(int i, Object obj, to3 to3) {
        if (!(obj instanceof fn3)) {
            return xl3.m33733a(i << 3) + xl3.m33730B((zn3) obj, to3);
        }
        int a = xl3.m33733a(i << 3);
        int a2 = ((fn3) obj).mo17576a();
        return a + xl3.m33733a(a2) + a2;
    }

    /* renamed from: R */
    static int m32580R(int i, List<?> list, to3 to3) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = xl3.m33732D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof fn3) {
                i2 = xl3.m33729A((fn3) obj);
            } else {
                i2 = xl3.m33730B((zn3) obj, to3);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m32581S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32582T(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: T */
    static int m32582T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            i = 0;
            while (i2 < size) {
                int p = rm3.mo20682p(i2);
                i += xl3.m33733a((p >> 31) ^ (p + p));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + xl3.m33733a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m32583U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32584V(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: V */
    static int m32584V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            i = 0;
            while (i2 < size) {
                long p = on3.mo20056p(i2);
                i += xl3.m33734b((p >> 63) ^ (p + p));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + xl3.m33734b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m32585W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = xl3.m33732D(i) * size;
        if (list instanceof hn3) {
            hn3 hn3 = (hn3) list;
            while (i4 < size) {
                Object z = hn3.mo17996z(i4);
                if (z instanceof kl3) {
                    i3 = xl3.m33737x((kl3) z);
                } else {
                    i3 = xl3.m33731C((String) z);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof kl3) {
                    i2 = xl3.m33737x((kl3) obj);
                } else {
                    i2 = xl3.m33731C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m32586X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32587Y(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: Y */
    static int m32587Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rm3) {
            rm3 rm3 = (rm3) list;
            i = 0;
            while (i2 < size) {
                i += xl3.m33733a(rm3.mo20682p(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + xl3.m33733a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m32588Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32590a0(list) + (size * xl3.m33732D(i));
    }

    /* renamed from: a */
    public static lp3<?, ?> m32589a() {
        return f24889c;
    }

    /* renamed from: a0 */
    static int m32590a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof on3) {
            on3 on3 = (on3) list;
            i = 0;
            while (i2 < size) {
                i += xl3.m33734b(on3.mo20056p(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + xl3.m33734b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static lp3<?, ?> m32591b() {
        return f24890d;
    }

    /* renamed from: b0 */
    public static lp3<?, ?> m32592b0() {
        return f24888b;
    }

    /* renamed from: c */
    static <UT, UB> UB m32593c(int i, List<Integer> list, tm3 tm3, UB ub, lp3<UT, UB> lp3) {
        if (tm3 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (tm3.mo15938c(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m32594d(i, intValue, ub, lp3);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!tm3.mo15938c(intValue2)) {
                    ub = m32594d(i, intValue2, ub, lp3);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m32594d(int i, int i2, UB ub, lp3<UT, UB> lp3) {
        if (ub == null) {
            ub = lp3.mo19256f();
        }
        lp3.mo19262l(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    static <T, FT extends hm3<FT>> void m32595e(dm3<FT> dm3, T t, T t2) {
        dm3.mo16953a(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m32596f(lp3<UT, UB> lp3, T t, T t2) {
        lp3.mo19265o(t, lp3.mo19255e(lp3.mo19254d(t), lp3.mo19254d(t2)));
    }

    /* renamed from: g */
    public static void m32597g(Class<?> cls) {
        Class<?> cls2;
        if (!qm3.class.isAssignableFrom(cls) && (cls2 = f24887a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m32598h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static <T> void m32599i(un3 un3, T t, T t2, long j) {
        vp3.m32628D(t, j, un3.m31935c(vp3.m32648p(t, j), vp3.m32648p(t2, j)));
    }

    /* renamed from: j */
    public static void m32600j(int i, List<Boolean> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22240n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m32601k(int i, List<kl3> list, yl3 yl3) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22242p(i, list);
        }
    }

    /* renamed from: l */
    public static void m32602l(int i, List<Double> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22244r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m32603m(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22247u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m32604n(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22249w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m32605o(int i, List<Long> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22251y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m32606p(int i, List<Float> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22217A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m32607q(int i, List<?> list, yl3 yl3, to3 to3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                yl3.mo22218B(i, list.get(i2), to3);
            }
        }
    }

    /* renamed from: r */
    public static void m32608r(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22220D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m32609s(int i, List<Long> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22222F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m32610t(int i, List<?> list, yl3 yl3, to3 to3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                yl3.mo22223G(i, list.get(i2), to3);
            }
        }
    }

    /* renamed from: u */
    public static void m32611u(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22225I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m32612v(int i, List<Long> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22227K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m32613w(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22229b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m32614x(int i, List<Long> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22231d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m32615y(int i, List<String> list, yl3 yl3) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22234g(i, list);
        }
    }

    /* renamed from: z */
    public static void m32616z(int i, List<Integer> list, yl3 yl3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yl3.mo22236i(i, list, z);
        }
    }
}
