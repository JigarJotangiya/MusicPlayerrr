package p369i.p387z.p389d;

import java.util.List;
import p369i.C8384c;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8560b;
import p369i.p387z.p388c.C8561c;
import p369i.p387z.p388c.C8562d;
import p369i.p387z.p388c.C8563e;
import p369i.p387z.p388c.C8564f;
import p369i.p387z.p388c.C8565g;
import p369i.p387z.p388c.C8566h;
import p369i.p387z.p388c.C8567i;
import p369i.p387z.p388c.C8568j;
import p369i.p387z.p388c.C8569k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8571m;
import p369i.p387z.p388c.C8572n;
import p369i.p387z.p388c.C8573o;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p388c.C8575q;
import p369i.p387z.p388c.C8576r;
import p369i.p387z.p388c.C8577s;
import p369i.p387z.p388c.C8578t;
import p369i.p387z.p388c.C8579u;
import p369i.p387z.p388c.C8580v;
import p369i.p387z.p388c.C8581w;
import p369i.p387z.p389d.p390y.C8607a;

/* renamed from: i.z.d.x */
/* compiled from: TypeIntrinsics */
public class C8606x {
    /* renamed from: a */
    public static List m46797a(Object obj) {
        if (!(obj instanceof C8607a)) {
            return m46799c(obj);
        }
        m46804h(obj, "kotlin.collections.MutableList");
        throw null;
    }

    /* renamed from: b */
    public static Object m46798b(Object obj, int i) {
        if (obj == null || m46801e(obj, i)) {
            return obj;
        }
        m46804h(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: c */
    public static List m46799c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            m46803g(e);
            throw null;
        }
    }

    /* renamed from: d */
    public static int m46800d(Object obj) {
        if (obj instanceof C8590h) {
            return ((C8590h) obj).getArity();
        }
        if (obj instanceof C8559a) {
            return 0;
        }
        if (obj instanceof C8570l) {
            return 1;
        }
        if (obj instanceof C8574p) {
            return 2;
        }
        if (obj instanceof C8575q) {
            return 3;
        }
        if (obj instanceof C8576r) {
            return 4;
        }
        if (obj instanceof C8577s) {
            return 5;
        }
        if (obj instanceof C8578t) {
            return 6;
        }
        if (obj instanceof C8579u) {
            return 7;
        }
        if (obj instanceof C8580v) {
            return 8;
        }
        if (obj instanceof C8581w) {
            return 9;
        }
        if (obj instanceof C8560b) {
            return 10;
        }
        if (obj instanceof C8561c) {
            return 11;
        }
        if (obj instanceof C8562d) {
            return 12;
        }
        if (obj instanceof C8563e) {
            return 13;
        }
        if (obj instanceof C8564f) {
            return 14;
        }
        if (obj instanceof C8565g) {
            return 15;
        }
        if (obj instanceof C8566h) {
            return 16;
        }
        if (obj instanceof C8567i) {
            return 17;
        }
        if (obj instanceof C8568j) {
            return 18;
        }
        if (obj instanceof C8569k) {
            return 19;
        }
        if (obj instanceof C8571m) {
            return 20;
        }
        if (obj instanceof C8572n) {
            return 21;
        }
        return obj instanceof C8573o ? 22 : -1;
    }

    /* renamed from: e */
    public static boolean m46801e(Object obj, int i) {
        return (obj instanceof C8384c) && m46800d(obj) == i;
    }

    /* renamed from: f */
    private static <T extends Throwable> T m46802f(T t) {
        C8594l.m46776j(t, C8606x.class.getName());
        return t;
    }

    /* renamed from: g */
    public static ClassCastException m46803g(ClassCastException classCastException) {
        m46802f(classCastException);
        throw classCastException;
    }

    /* renamed from: h */
    public static void m46804h(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m46805i(name + " cannot be cast to " + str);
        throw null;
    }

    /* renamed from: i */
    public static void m46805i(String str) {
        m46803g(new ClassCastException(str));
        throw null;
    }
}
