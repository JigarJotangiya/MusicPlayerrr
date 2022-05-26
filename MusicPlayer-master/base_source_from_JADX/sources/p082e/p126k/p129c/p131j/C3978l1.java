package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;
import p082e.p126k.p129c.p131j.C4028v;

/* renamed from: e.k.c.j.l1 */
/* compiled from: SchemaUtil */
final class C3978l1 {

    /* renamed from: a */
    private static final Class<?> f12111a = m17295B();

    /* renamed from: b */
    private static final C4006q1<?, ?> f12112b = m17296C(false);

    /* renamed from: c */
    private static final C4006q1<?, ?> f12113c = m17296C(true);

    /* renamed from: d */
    private static final C4006q1<?, ?> f12114d = new C4014s1();

    /* renamed from: A */
    static <UT, UB> UB m17294A(int i, List<Integer> list, C3899b0.C3904e eVar, UB ub, C4006q1<UT, UB> q1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo13462a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m17305L(i, intValue, ub, q1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo13462a(intValue2)) {
                    ub = m17305L(i, intValue2, ub, q1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m17295B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static C4006q1<?, ?> m17296C(boolean z) {
        try {
            Class<?> D = m17297D();
            if (D == null) {
                return null;
            }
            return (C4006q1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m17297D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends C4028v.C4030b<FT>> void m17298E(C4007r<FT> rVar, T t, T t2) {
        C4028v<FT> c = rVar.mo13934c(t2);
        if (!c.mo14032n()) {
            rVar.mo13935d(t).mo14037u(c);
        }
    }

    /* renamed from: F */
    static <T> void m17299F(C3993n0 n0Var, T t, T t2, long j) {
        C4022u1.m17632T(t, j, n0Var.mo13895a(C4022u1.m17617E(t, j), C4022u1.m17617E(t2, j)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m17300G(C4006q1<UT, UB> q1Var, T t, T t2) {
        q1Var.mo13927p(t, q1Var.mo13922k(q1Var.mo13918g(t), q1Var.mo13918g(t2)));
    }

    /* renamed from: H */
    public static C4006q1<?, ?> m17301H() {
        return f12112b;
    }

    /* renamed from: I */
    public static C4006q1<?, ?> m17302I() {
        return f12113c;
    }

    /* renamed from: J */
    public static void m17303J(Class<?> cls) {
        Class<?> cls2;
        if (!C4056z.class.isAssignableFrom(cls) && (cls2 = f12111a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m17304K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    static <UT, UB> UB m17305L(int i, int i2, UB ub, C4006q1<UT, UB> q1Var) {
        if (ub == null) {
            ub = q1Var.mo13925n();
        }
        q1Var.mo13916e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C4006q1<?, ?> m17306M() {
        return f12114d;
    }

    /* renamed from: N */
    public static void m17307N(int i, List<Boolean> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13782A(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m17308O(int i, List<C3934i> list, C4052x1 x1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13795N(i, list);
        }
    }

    /* renamed from: P */
    public static void m17309P(int i, List<Double> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13792K(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m17310Q(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13791J(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m17311R(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13821y(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m17312S(int i, List<Long> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13817u(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m17313T(int i, List<Float> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13797a(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m17314U(int i, List<?> list, C4052x1 x1Var, C3963j1 j1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13808l(i, list, j1Var);
        }
    }

    /* renamed from: V */
    public static void m17315V(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13811o(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m17316W(int i, List<Long> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13790I(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m17317X(int i, List<?> list, C4052x1 x1Var, C3963j1 j1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13806j(i, list, j1Var);
        }
    }

    /* renamed from: Y */
    public static void m17318Y(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13818v(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m17319Z(int i, List<Long> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13802f(i, list, z);
        }
    }

    /* renamed from: a */
    static int m17320a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(size);
        }
        return size * C3970l.m17147e(i, true);
    }

    /* renamed from: a0 */
    public static void m17321a0(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13788G(i, list, z);
        }
    }

    /* renamed from: b */
    static int m17322b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m17323b0(int i, List<Long> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13784C(i, list, z);
        }
    }

    /* renamed from: c */
    static int m17324c(int i, List<C3934i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int W = size * C3970l.m17139W(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            W += C3970l.m17153i(list.get(i2));
        }
        return W;
    }

    /* renamed from: c0 */
    public static void m17325c0(int i, List<String> list, C4052x1 x1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13807k(i, list);
        }
    }

    /* renamed from: d */
    static int m17326d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m17328e(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(e);
        }
        return e + (size * C3970l.m17139W(i));
    }

    /* renamed from: d0 */
    public static void m17327d0(int i, List<Integer> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13783B(i, list, z);
        }
    }

    /* renamed from: e */
    static int m17328e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17158m(a0Var.mo13431y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17158m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m17329e0(int i, List<Long> list, C4052x1 x1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            x1Var.mo13803g(i, list, z);
        }
    }

    /* renamed from: f */
    static int m17330f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(size * 4);
        }
        return size * C3970l.m17159n(i, 0);
    }

    /* renamed from: g */
    static int m17331g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m17332h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(size * 8);
        }
        return size * C3970l.m17161p(i, 0);
    }

    /* renamed from: i */
    static int m17333i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m17334j(int i, List<C4012s0> list, C3963j1 j1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3970l.m17165t(i, list.get(i3), j1Var);
        }
        return i2;
    }

    /* renamed from: k */
    static int m17335k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m17336l(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(l);
        }
        return l + (size * C3970l.m17139W(i));
    }

    /* renamed from: l */
    static int m17336l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17169x(a0Var.mo13431y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17169x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m17337m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m17338n(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(n);
        }
        return n + (list.size() * C3970l.m17139W(i));
    }

    /* renamed from: n */
    static int m17338n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17171z(j0Var.mo13703y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17171z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m17339o(int i, Object obj, C3963j1 j1Var) {
        if (obj instanceof C3926f0) {
            return C3970l.m17118B(i, (C3926f0) obj);
        }
        return C3970l.m17123G(i, (C4012s0) obj, j1Var);
    }

    /* renamed from: p */
    static int m17340p(int i, List<?> list, C3963j1 j1Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int W = C3970l.m17139W(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C3926f0) {
                i2 = C3970l.m17119C((C3926f0) obj);
            } else {
                i2 = C3970l.m17125I((C4012s0) obj, j1Var);
            }
            W += i2;
        }
        return W;
    }

    /* renamed from: q */
    static int m17341q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m17342r(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(r);
        }
        return r + (size * C3970l.m17139W(i));
    }

    /* renamed from: r */
    static int m17342r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17134R(a0Var.mo13431y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17134R(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m17343s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m17344t(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(t);
        }
        return t + (size * C3970l.m17139W(i));
    }

    /* renamed from: t */
    static int m17344t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17136T(j0Var.mo13703y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17136T(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m17345u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int W = C3970l.m17139W(i) * size;
        if (list instanceof C3932h0) {
            C3932h0 h0Var = (C3932h0) list;
            while (i4 < size) {
                Object q = h0Var.mo13573q(i4);
                if (q instanceof C3934i) {
                    i3 = C3970l.m17153i((C3934i) q);
                } else {
                    i3 = C3970l.m17138V((String) q);
                }
                W += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C3934i) {
                    i2 = C3970l.m17153i((C3934i) obj);
                } else {
                    i2 = C3970l.m17138V((String) obj);
                }
                W += i2;
                i4++;
            }
        }
        return W;
    }

    /* renamed from: v */
    static int m17346v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m17347w(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(w);
        }
        return w + (size * C3970l.m17139W(i));
    }

    /* renamed from: w */
    static int m17347w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17141Y(a0Var.mo13431y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17141Y(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m17348x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m17349y(list);
        if (z) {
            return C3970l.m17139W(i) + C3970l.m17120D(y);
        }
        return y + (size * C3970l.m17139W(i));
    }

    /* renamed from: y */
    static int m17349y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            i = 0;
            while (i2 < size) {
                i += C3970l.m17143a0(j0Var.mo13703y(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3970l.m17143a0(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static <UT, UB> UB m17350z(int i, List<Integer> list, C3899b0.C3903d<?> dVar, UB ub, C4006q1<UT, UB> q1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo13461a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m17305L(i, intValue, ub, q1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo13461a(intValue2) == null) {
                    ub = m17305L(i, intValue2, ub, q1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
