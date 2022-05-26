package p369i.p383x;

import java.util.Objects;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.x.b */
/* compiled from: PlatformImplementations.kt */
public final class C8542b {

    /* renamed from: a */
    public static final C8540a f34924a;

    static {
        C8540a aVar;
        Object newInstance;
        Object newInstance2;
        Class<C8540a> cls = C8540a.class;
        int a = m46742a();
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("i.x.e.a").newInstance();
                C8594l.m46770d(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = (C8540a) newInstance2;
                    f34924a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                C8594l.m46770d(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C8594l.m46770d(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C8540a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                            C8594l.m46770d(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("i.x.d.a").newInstance();
                C8594l.m46770d(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = (C8540a) newInstance;
                    f34924a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                C8594l.m46770d(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C8594l.m46770d(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C8540a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                            C8594l.m46770d(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C8540a();
        f34924a = aVar;
    }

    /* renamed from: a */
    private static final int m46742a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int D = C8437p.m46529D(property, '.', 0, false, 6, (Object) null);
        if (D < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = D + 1;
            int D2 = C8437p.m46529D(property, '.', i, false, 4, (Object) null);
            if (D2 < 0) {
                D2 = property.length();
            }
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring = property.substring(0, D);
            C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
            String substring2 = property.substring(i, D2);
            C8594l.m46770d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
