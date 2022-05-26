package p082e.p126k.p129c.p131j;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: e.k.c.j.u1 */
/* compiled from: UnsafeUtil */
final class C4022u1 {

    /* renamed from: a */
    private static final Logger f12172a = Logger.getLogger(C4022u1.class.getName());

    /* renamed from: b */
    private static final Unsafe f12173b = m17618F();

    /* renamed from: c */
    private static final Class<?> f12174c = C3914d.m16666b();

    /* renamed from: d */
    private static final boolean f12175d = m17649o(Long.TYPE);

    /* renamed from: e */
    private static final boolean f12176e = m17649o(Integer.TYPE);

    /* renamed from: f */
    private static final C4027e f12177f = m17616D();

    /* renamed from: g */
    private static final boolean f12178g = m17634V();

    /* renamed from: h */
    private static final boolean f12179h = m17633U();

    /* renamed from: i */
    static final long f12180i = ((long) m17645k(byte[].class));

    /* renamed from: j */
    private static final long f12181j = m17651q(m17647m());

    /* renamed from: k */
    static final boolean f12182k = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: e.k.c.j.u1$a */
    /* compiled from: UnsafeUtil */
    static class C4023a implements PrivilegedExceptionAction<Unsafe> {
        C4023a() {
        }

        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: e.k.c.j.u1$b */
    /* compiled from: UnsafeUtil */
    private static final class C4024b extends C4027e {
        C4024b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo14003c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo14004d(Object obj, long j) {
            if (C4022u1.f12182k) {
                return C4022u1.m17653s(obj, j);
            }
            return C4022u1.m17654t(obj, j);
        }

        /* renamed from: e */
        public byte mo14005e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo14006f(Object obj, long j) {
            if (C4022u1.f12182k) {
                return C4022u1.m17657w(obj, j);
            }
            return C4022u1.m17658x(obj, j);
        }

        /* renamed from: g */
        public double mo14007g(Object obj, long j) {
            return Double.longBitsToDouble(mo14017k(obj, j));
        }

        /* renamed from: h */
        public float mo14008h(Object obj, long j) {
            return Float.intBitsToFloat(mo14016i(obj, j));
        }

        /* renamed from: j */
        public long mo14009j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo14010n(Object obj, long j, boolean z) {
            if (C4022u1.f12182k) {
                C4022u1.m17623K(obj, j, z);
            } else {
                C4022u1.m17624L(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo14011o(Object obj, long j, byte b) {
            if (C4022u1.f12182k) {
                C4022u1.m17626N(obj, j, b);
            } else {
                C4022u1.m17627O(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo14012p(Object obj, long j, double d) {
            mo14021s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo14013q(Object obj, long j, float f) {
            mo14020r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: e.k.c.j.u1$c */
    /* compiled from: UnsafeUtil */
    private static final class C4025c extends C4027e {
        C4025c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo14003c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo14004d(Object obj, long j) {
            if (C4022u1.f12182k) {
                return C4022u1.m17653s(obj, j);
            }
            return C4022u1.m17654t(obj, j);
        }

        /* renamed from: e */
        public byte mo14005e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo14006f(Object obj, long j) {
            if (C4022u1.f12182k) {
                return C4022u1.m17657w(obj, j);
            }
            return C4022u1.m17658x(obj, j);
        }

        /* renamed from: g */
        public double mo14007g(Object obj, long j) {
            return Double.longBitsToDouble(mo14017k(obj, j));
        }

        /* renamed from: h */
        public float mo14008h(Object obj, long j) {
            return Float.intBitsToFloat(mo14016i(obj, j));
        }

        /* renamed from: j */
        public long mo14009j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo14010n(Object obj, long j, boolean z) {
            if (C4022u1.f12182k) {
                C4022u1.m17623K(obj, j, z);
            } else {
                C4022u1.m17624L(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo14011o(Object obj, long j, byte b) {
            if (C4022u1.f12182k) {
                C4022u1.m17626N(obj, j, b);
            } else {
                C4022u1.m17627O(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo14012p(Object obj, long j, double d) {
            mo14021s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo14013q(Object obj, long j, float f) {
            mo14020r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: e.k.c.j.u1$d */
    /* compiled from: UnsafeUtil */
    private static final class C4026d extends C4027e {
        C4026d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo14003c(long j, byte[] bArr, long j2, long j3) {
            this.f12183a.copyMemory((Object) null, j, bArr, C4022u1.f12180i + j2, j3);
        }

        /* renamed from: d */
        public boolean mo14004d(Object obj, long j) {
            return this.f12183a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo14005e(long j) {
            return this.f12183a.getByte(j);
        }

        /* renamed from: f */
        public byte mo14006f(Object obj, long j) {
            return this.f12183a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo14007g(Object obj, long j) {
            return this.f12183a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo14008h(Object obj, long j) {
            return this.f12183a.getFloat(obj, j);
        }

        /* renamed from: j */
        public long mo14009j(long j) {
            return this.f12183a.getLong(j);
        }

        /* renamed from: n */
        public void mo14010n(Object obj, long j, boolean z) {
            this.f12183a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo14011o(Object obj, long j, byte b) {
            this.f12183a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo14012p(Object obj, long j, double d) {
            this.f12183a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo14013q(Object obj, long j, float f) {
            this.f12183a.putFloat(obj, j, f);
        }
    }

    /* renamed from: e.k.c.j.u1$e */
    /* compiled from: UnsafeUtil */
    private static abstract class C4027e {

        /* renamed from: a */
        Unsafe f12183a;

        C4027e(Unsafe unsafe) {
            this.f12183a = unsafe;
        }

        /* renamed from: a */
        public final int mo14014a(Class<?> cls) {
            return this.f12183a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo14015b(Class<?> cls) {
            return this.f12183a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo14003c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo14004d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo14005e(long j);

        /* renamed from: f */
        public abstract byte mo14006f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo14007g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo14008h(Object obj, long j);

        /* renamed from: i */
        public final int mo14016i(Object obj, long j) {
            return this.f12183a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo14009j(long j);

        /* renamed from: k */
        public final long mo14017k(Object obj, long j) {
            return this.f12183a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo14018l(Object obj, long j) {
            return this.f12183a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo14019m(Field field) {
            return this.f12183a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo14010n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo14011o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo14012p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo14013q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo14020r(Object obj, long j, int i) {
            this.f12183a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo14021s(Object obj, long j, long j2) {
            this.f12183a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo14022t(Object obj, long j, Object obj2) {
            this.f12183a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        m17645k(cls6);
        m17646l(cls6);
        m17645k(cls5);
        m17646l(cls5);
        m17645k(cls4);
        m17646l(cls4);
        m17645k(cls3);
        m17646l(cls3);
        m17645k(cls2);
        m17646l(cls2);
        m17645k(cls);
        m17646l(cls);
    }

    private C4022u1() {
    }

    /* renamed from: A */
    static int m17613A(Object obj, long j) {
        return f12177f.mo14016i(obj, j);
    }

    /* renamed from: B */
    static long m17614B(long j) {
        return f12177f.mo14009j(j);
    }

    /* renamed from: C */
    static long m17615C(Object obj, long j) {
        return f12177f.mo14017k(obj, j);
    }

    /* renamed from: D */
    private static C4027e m17616D() {
        Unsafe unsafe = f12173b;
        if (unsafe == null) {
            return null;
        }
        if (!C3914d.m16667c()) {
            return new C4026d(unsafe);
        }
        if (f12175d) {
            return new C4025c(unsafe);
        }
        if (f12176e) {
            return new C4024b(unsafe);
        }
        return null;
    }

    /* renamed from: E */
    static Object m17617E(Object obj, long j) {
        return f12177f.mo14018l(obj, j);
    }

    /* renamed from: F */
    static Unsafe m17618F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4023a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    static boolean m17619G() {
        return f12179h;
    }

    /* renamed from: H */
    static boolean m17620H() {
        return f12178g;
    }

    /* renamed from: I */
    static long m17621I(Field field) {
        return f12177f.mo14019m(field);
    }

    /* renamed from: J */
    static void m17622J(Object obj, long j, boolean z) {
        f12177f.mo14010n(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static void m17623K(Object obj, long j, boolean z) {
        m17626N(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static void m17624L(Object obj, long j, boolean z) {
        m17627O(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: M */
    static void m17625M(byte[] bArr, long j, byte b) {
        f12177f.mo14011o(bArr, f12180i + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static void m17626N(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int A = m17613A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m17630R(obj, j2, ((255 & b) << i) | (A & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static void m17627O(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m17630R(obj, j2, ((255 & b) << i) | (m17613A(obj, j2) & (~(255 << i))));
    }

    /* renamed from: P */
    static void m17628P(Object obj, long j, double d) {
        f12177f.mo14012p(obj, j, d);
    }

    /* renamed from: Q */
    static void m17629Q(Object obj, long j, float f) {
        f12177f.mo14013q(obj, j, f);
    }

    /* renamed from: R */
    static void m17630R(Object obj, long j, int i) {
        f12177f.mo14020r(obj, j, i);
    }

    /* renamed from: S */
    static void m17631S(Object obj, long j, long j2) {
        f12177f.mo14021s(obj, j, j2);
    }

    /* renamed from: T */
    static void m17632T(Object obj, long j, Object obj2) {
        f12177f.mo14022t(obj, j, obj2);
    }

    /* renamed from: U */
    private static boolean m17633U() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f12173b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (C3914d.m16667c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f12172a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: V */
    private static boolean m17634V() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f12173b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (m17647m() == null) {
                return false;
            }
            if (C3914d.m16667c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger = f12172a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    static long m17643i(ByteBuffer byteBuffer) {
        return f12177f.mo14017k(byteBuffer, f12181j);
    }

    /* renamed from: j */
    static <T> T m17644j(Class<T> cls) {
        try {
            return f12173b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    private static int m17645k(Class<?> cls) {
        if (f12179h) {
            return f12177f.mo14014a(cls);
        }
        return -1;
    }

    /* renamed from: l */
    private static int m17646l(Class<?> cls) {
        if (f12179h) {
            return f12177f.mo14015b(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static Field m17647m() {
        Field p;
        if (C3914d.m16667c() && (p = m17650p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m17650p(Buffer.class, "address");
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: n */
    static void m17648n(long j, byte[] bArr, long j2, long j3) {
        f12177f.mo14003c(j, bArr, j2, j3);
    }

    /* renamed from: o */
    private static boolean m17649o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C3914d.m16667c()) {
            return false;
        }
        try {
            Class<?> cls3 = f12174c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    private static Field m17650p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m17651q(Field field) {
        C4027e eVar;
        if (field == null || (eVar = f12177f) == null) {
            return -1;
        }
        return eVar.mo14019m(field);
    }

    /* renamed from: r */
    static boolean m17652r(Object obj, long j) {
        return f12177f.mo14004d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m17653s(Object obj, long j) {
        return m17657w(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m17654t(Object obj, long j) {
        return m17658x(obj, j) != 0;
    }

    /* renamed from: u */
    static byte m17655u(long j) {
        return f12177f.mo14005e(j);
    }

    /* renamed from: v */
    static byte m17656v(byte[] bArr, long j) {
        return f12177f.mo14006f(bArr, f12180i + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static byte m17657w(Object obj, long j) {
        return (byte) ((m17613A(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static byte m17658x(Object obj, long j) {
        return (byte) ((m17613A(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: y */
    static double m17659y(Object obj, long j) {
        return f12177f.mo14007g(obj, j);
    }

    /* renamed from: z */
    static float m17660z(Object obj, long j) {
        return f12177f.mo14008h(obj, j);
    }
}
