package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vp3 {

    /* renamed from: a */
    private static final Unsafe f24896a;

    /* renamed from: b */
    private static final Class<?> f24897b = xk3.m33724a();

    /* renamed from: c */
    private static final boolean f24898c;

    /* renamed from: d */
    private static final boolean f24899d;

    /* renamed from: e */
    private static final up3 f24900e;

    /* renamed from: f */
    private static final boolean f24901f;

    /* renamed from: g */
    private static final boolean f24902g;

    /* renamed from: h */
    static final long f24903h = ((long) m32635c(byte[].class));

    /* renamed from: i */
    private static final long f24904i;

    /* renamed from: j */
    static final boolean f24905j;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m32649q()
            f24896a = r7
            java.lang.Class r8 = com.google.android.gms.internal.ads.xk3.m33724a()
            f24897b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m32631G(r8)
            f24898c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m32631G(r10)
            f24899d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.tp3 r11 = new com.google.android.gms.internal.ads.tp3
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.sp3 r11 = new com.google.android.gms.internal.ads.sp3
            r11.<init>(r7)
        L_0x003d:
            f24900e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f24409a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m32637e()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = 1
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.vp3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0048
        L_0x0073:
            f24901f = r8
            com.google.android.gms.internal.ads.up3 r8 = f24900e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = 0
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f24409a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = 1
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.vp3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0079
        L_0x00f6:
            f24902g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m32635c(r6)
            long r6 = (long) r6
            f24903h = r6
            m32635c(r5)
            m32636d(r5)
            m32635c(r4)
            m32636d(r4)
            m32635c(r3)
            m32636d(r3)
            m32635c(r2)
            m32636d(r2)
            m32635c(r1)
            m32636d(r1)
            m32635c(r0)
            m32636d(r0)
            java.lang.reflect.Field r0 = m32637e()
            r1 = -1
            if (r0 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.up3 r3 = f24900e
            if (r3 != 0) goto L_0x0132
            goto L_0x0136
        L_0x0132:
            long r1 = r3.mo21352n(r0)
        L_0x0136:
            f24904i = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r12 = 0
        L_0x0142:
            f24905j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vp3.<clinit>():void");
    }

    private vp3() {
    }

    /* renamed from: A */
    static void m32625A(Object obj, long j, float f) {
        f24900e.mo20941h(obj, j, f);
    }

    /* renamed from: B */
    static void m32626B(Object obj, long j, int i) {
        f24900e.mo21354p(obj, j, i);
    }

    /* renamed from: C */
    static void m32627C(Object obj, long j, long j2) {
        f24900e.mo21355q(obj, j, j2);
    }

    /* renamed from: D */
    static void m32628D(Object obj, long j, Object obj2) {
        f24900e.mo21356r(obj, j, obj2);
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ boolean m32629E(Object obj, long j) {
        return ((byte) ((f24900e.mo21350l(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ boolean m32630F(Object obj, long j) {
        return ((byte) ((f24900e.mo21350l(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: G */
    static boolean m32631G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = xk3.f25869a;
        try {
            Class<?> cls3 = f24897b;
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

    /* renamed from: H */
    static boolean m32632H(Object obj, long j) {
        return f24900e.mo20942i(obj, j);
    }

    /* renamed from: a */
    static boolean m32633a() {
        return f24902g;
    }

    /* renamed from: b */
    static boolean m32634b() {
        return f24901f;
    }

    /* renamed from: c */
    private static int m32635c(Class<?> cls) {
        if (f24902g) {
            return f24900e.mo21348j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m32636d(Class<?> cls) {
        if (f24902g) {
            return f24900e.mo21349k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m32637e() {
        int i = xk3.f25869a;
        Field f = m32638f(Buffer.class, "effectiveDirectAddress");
        if (f != null) {
            return f;
        }
        Field f2 = m32638f(Buffer.class, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: f */
    private static Field m32638f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m32639g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        up3 up3 = f24900e;
        int l = up3.mo21350l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        up3.mo21354p(obj, j2, ((255 & b) << i) | (l & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m32640h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        up3 up3 = f24900e;
        int i = (((int) j) & 3) << 3;
        up3.mo21354p(obj, j2, ((255 & b) << i) | (up3.mo21350l(obj, j2) & (~(255 << i))));
    }

    /* renamed from: i */
    static byte m32641i(long j) {
        return f24900e.mo20934a(j);
    }

    /* renamed from: j */
    static double m32642j(Object obj, long j) {
        return f24900e.mo20935b(obj, j);
    }

    /* renamed from: k */
    static float m32643k(Object obj, long j) {
        return f24900e.mo20936c(obj, j);
    }

    /* renamed from: l */
    static int m32644l(Object obj, long j) {
        return f24900e.mo21350l(obj, j);
    }

    /* renamed from: m */
    static long m32645m(ByteBuffer byteBuffer) {
        return f24900e.mo21351m(byteBuffer, f24904i);
    }

    /* renamed from: n */
    static long m32646n(Object obj, long j) {
        return f24900e.mo21351m(obj, j);
    }

    /* renamed from: o */
    static <T> T m32647o(Class<T> cls) {
        try {
            return f24896a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    static Object m32648p(Object obj, long j) {
        return f24900e.mo21353o(obj, j);
    }

    /* renamed from: q */
    static Unsafe m32649q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new rp3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static void m32655w(long j, byte[] bArr, long j2, long j3) {
        f24900e.mo20937d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    static void m32656x(Object obj, long j, boolean z) {
        f24900e.mo20938e(obj, j, z);
    }

    /* renamed from: y */
    static void m32657y(byte[] bArr, long j, byte b) {
        f24900e.mo20939f(bArr, f24903h + j, b);
    }

    /* renamed from: z */
    static void m32658z(Object obj, long j, double d) {
        f24900e.mo20940g(obj, j, d);
    }
}
