package p369i.p387z.p389d;

import java.util.Arrays;
import p369i.C8405e;
import p369i.C8456s;

/* renamed from: i.z.d.l */
/* compiled from: Intrinsics */
public class C8594l {
    private C8594l() {
    }

    /* renamed from: a */
    public static boolean m46767a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m46768b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            m46775i(illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public static void m46769c(Object obj) {
        if (obj == null) {
            m46778l();
            throw null;
        }
    }

    /* renamed from: d */
    public static void m46770d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            m46775i(nullPointerException);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m46771e(Object obj, String str) {
        if (obj == null) {
            m46781o(str);
            throw null;
        }
    }

    /* renamed from: f */
    public static void m46772f(Object obj, String str) {
        if (obj == null) {
            m46780n(str);
            throw null;
        }
    }

    /* renamed from: g */
    public static int m46773g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: h */
    private static String m46774h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: i */
    private static <T extends Throwable> T m46775i(T t) {
        m46776j(t, C8594l.class.getName());
        return t;
    }

    /* renamed from: j */
    static <T extends Throwable> T m46776j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: k */
    public static String m46777k(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m46778l() {
        NullPointerException nullPointerException = new NullPointerException();
        m46775i(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: m */
    public static void m46779m() {
        C8405e eVar = new C8405e();
        m46775i(eVar);
        throw eVar;
    }

    /* renamed from: n */
    private static void m46780n(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m46774h(str));
        m46775i(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: o */
    private static void m46781o(String str) {
        NullPointerException nullPointerException = new NullPointerException(m46774h(str));
        m46775i(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: p */
    public static void m46782p(String str) {
        C8456s sVar = new C8456s(str);
        m46775i(sVar);
        throw sVar;
    }

    /* renamed from: q */
    public static void m46783q(String str) {
        m46782p("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
