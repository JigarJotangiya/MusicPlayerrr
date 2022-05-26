package p402l.p406b.p426c.p431t;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

/* renamed from: l.b.c.t.m */
/* compiled from: ID3Tags */
public class C9238m {
    static {
        Logger.getLogger("org.jaudiotagger.tag.id3");
    }

    /* renamed from: a */
    public static String m49062a(String str) {
        if (str.length() < 3) {
            return null;
        }
        return C9198k.f35887m.get((String) str.subSequence(0, 3));
    }

    /* renamed from: b */
    public static String m49063b(String str) {
        String str2;
        if (str.length() < 3 || (str2 = C9198k.f35887m.get(str.substring(0, 3))) == null) {
            return null;
        }
        String str3 = C9198k.f35891q.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (C9189f0.m48856k().mo31790a().get(str2) != null) {
            return str2;
        }
        return null;
    }

    /* renamed from: c */
    public static String m49064c(String str) {
        if (str.length() >= 4 && C9173a0.m48741k().mo31790a().containsKey(str)) {
            return C9198k.f35888n.get(str.substring(0, 4));
        }
        return null;
    }

    /* renamed from: d */
    public static String m49065d(String str) {
        if (str.length() < 4 || !C9173a0.m48741k().mo31790a().containsKey(str)) {
            return null;
        }
        if (C9189f0.m48856k().mo31790a().containsKey(str)) {
            return str;
        }
        return C9198k.f35891q.get(str.substring(0, 4));
    }

    /* renamed from: e */
    public static String m49066e(String str) {
        if (str.length() < 4) {
            return null;
        }
        String str2 = C9198k.f35892r.get(str);
        return (str2 != null || !C9173a0.m48741k().mo31790a().containsKey(str)) ? str2 : str;
    }

    /* renamed from: f */
    public static Object m49067f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getConstructor(new Class[]{obj.getClass()}).newInstance(new Object[]{obj});
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("NoSuchMethodException: Error finding constructor to create copy:" + obj.getClass().getName());
        } catch (IllegalAccessException unused2) {
            throw new IllegalArgumentException("IllegalAccessException: No access to run constructor to create copy" + obj.getClass().getName());
        } catch (InstantiationException unused3) {
            throw new IllegalArgumentException("InstantiationException: Unable to instantiate constructor to copy" + obj.getClass().getName());
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else {
                throw new IllegalArgumentException("InvocationTargetException: Unable to invoke constructor to create copy");
            }
        }
    }

    /* renamed from: g */
    public static String m49068g(String str) {
        return C9198k.f35889o.get(str);
    }

    /* renamed from: h */
    public static String m49069h(String str) {
        return C9198k.f35890p.get(str);
    }

    /* renamed from: i */
    public static String m49070i(String str) {
        return C9198k.f35893s.get(str);
    }

    /* renamed from: j */
    public static String m49071j(String str) {
        return C9198k.f35894t.get(str);
    }

    /* renamed from: k */
    public static long m49072k(Object obj) {
        int intValue;
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof Byte) {
            intValue = ((Byte) obj).byteValue();
        } else if (obj instanceof Short) {
            intValue = ((Short) obj).shortValue();
        } else if (obj instanceof Integer) {
            intValue = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            return ((Long) obj).longValue();
        } else {
            throw new IllegalArgumentException("Unsupported value class: " + obj.getClass().getName());
        }
        return (long) intValue;
    }

    /* renamed from: l */
    public static boolean m49073l(String str) {
        if (str.length() >= 3 && str.length() == 3 && C9249v.m49141k().mo31790a().containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m49074m(String str) {
        return str.length() >= 4 && C9173a0.m48741k().mo31790a().containsKey(str.substring(0, 4));
    }

    /* renamed from: n */
    public static boolean m49075n(String str) {
        return str.length() >= 4 && C9189f0.m48856k().mo31790a().containsKey(str.substring(0, 4));
    }

    /* renamed from: o */
    public static String m49076o(String str, int i) {
        if (str != null && i >= 0) {
            return str.length() > i ? str.substring(0, i) : str;
        }
        return null;
    }
}
