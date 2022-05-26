package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p369i.C8447l;
import p369i.C8450m;
import p369i.p387z.C8557a;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.internal.i */
/* compiled from: ExceptionsConstuctor.kt */
public final class C8829i {

    /* renamed from: a */
    private static final int f35225a = m47565d(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f35226b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C8570l<Throwable, Throwable>> f35227c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.i$a */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C8830a extends C8595m implements C8570l<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8830a(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C8447l.C8448a aVar = C8447l.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = C8447l.m50326constructorimpl((Throwable) newInstance);
                    if (C8447l.m50331isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C8447l.C8448a aVar2 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(C8450m.m46574a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$b */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C8831b extends C8595m implements C8570l<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8831b(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C8447l.C8448a aVar = C8447l.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = C8447l.m50326constructorimpl((Throwable) newInstance);
                    if (C8447l.m50331isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C8447l.C8448a aVar2 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(C8450m.m46574a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$c */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C8832c extends C8595m implements C8570l<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8832c(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C8447l.C8448a aVar = C8447l.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C8447l.m50326constructorimpl(th2);
                    if (C8447l.m50331isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C8447l.C8448a aVar2 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(C8450m.m46574a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$d */
    /* compiled from: ExceptionsConstuctor.kt */
    public static final class C8833d extends C8595m implements C8570l<Throwable, Throwable> {
        final /* synthetic */ Constructor $constructor$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8833d(Constructor constructor) {
            super(1);
            this.$constructor$inlined = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C8447l.C8448a aVar = C8447l.Companion;
                Object newInstance = this.$constructor$inlined.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C8447l.m50326constructorimpl(th2);
                    if (C8447l.m50331isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C8447l.C8448a aVar2 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(C8450m.m46574a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$e */
    /* compiled from: Comparisons.kt */
    public static final class C8834e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C8498b.m46698a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$f */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C8835f extends C8595m implements C8570l {
        public static final C8835f INSTANCE = new C8835f();

        C8835f() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i$g */
    /* compiled from: ExceptionsConstuctor.kt */
    static final class C8836g extends C8595m implements C8570l {
        public static final C8836g INSTANCE = new C8836g();

        C8836g() {
            super(1);
        }

        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static final C8570l<Throwable, Throwable> m47562a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C8833d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C8594l.m46767a(cls2, Throwable.class)) {
                return new C8831b(constructor);
            }
            if (C8594l.m46767a(cls2, cls)) {
                return new C8832c(constructor);
            }
            return null;
        } else if (length == 2 && C8594l.m46767a(parameterTypes[0], cls) && C8594l.m46767a(parameterTypes[1], Throwable.class)) {
            return new C8830a(constructor);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private static final int m47563b(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m47564c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m47563b(cls, i);
    }

    /* renamed from: d */
    private static final int m47565d(Class<?> cls, int i) {
        Integer num;
        C8557a.m46760b(cls);
        try {
            C8447l.C8448a aVar = C8447l.Companion;
            num = C8447l.m50326constructorimpl(Integer.valueOf(m47564c(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            num = C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C8447l.m50331isFailureimpl(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: e */
    public static final <E extends java.lang.Throwable> E m47566e(E r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.C8865k0
            r1 = 0
            if (r0 == 0) goto L_0x0028
            i.l$a r0 = p369i.C8447l.Companion     // Catch:{ all -> 0x0012 }
            kotlinx.coroutines.k0 r9 = (kotlinx.coroutines.C8865k0) r9     // Catch:{ all -> 0x0012 }
            java.lang.Throwable r9 = r9.createCopy()     // Catch:{ all -> 0x0012 }
            java.lang.Object r9 = p369i.C8447l.m50326constructorimpl(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x001d
        L_0x0012:
            r9 = move-exception
            i.l$a r0 = p369i.C8447l.Companion
            java.lang.Object r9 = p369i.C8450m.m46574a(r9)
            java.lang.Object r9 = p369i.C8447l.m50326constructorimpl(r9)
        L_0x001d:
            boolean r0 = p369i.C8447l.m50331isFailureimpl(r9)
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = r9
        L_0x0025:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0028:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f35226b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, i.z.c.l<java.lang.Throwable, java.lang.Throwable>> r3 = f35227c     // Catch:{ all -> 0x011a }
            java.lang.Class r4 = r9.getClass()     // Catch:{ all -> 0x011a }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x011a }
            i.z.c.l r3 = (p369i.p387z.p388c.C8570l) r3     // Catch:{ all -> 0x011a }
            r2.unlock()
            if (r3 != 0) goto L_0x0113
            int r2 = f35225a
            java.lang.Class r3 = r9.getClass()
            r4 = 0
            int r3 = m47565d(r3, r4)
            if (r2 == r3) goto L_0x0095
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L_0x005e
            int r3 = r0.getReadHoldCount()
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            r5 = 0
        L_0x0060:
            if (r5 >= r3) goto L_0x0068
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0068:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, i.z.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = f35227c     // Catch:{ all -> 0x0088 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0088 }
            kotlinx.coroutines.internal.i$f r6 = kotlinx.coroutines.internal.C8829i.C8835f.INSTANCE     // Catch:{ all -> 0x0088 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0088 }
            i.t r9 = p369i.C8457t.f34900a     // Catch:{ all -> 0x0088 }
        L_0x007c:
            if (r4 >= r3) goto L_0x0084
            r2.lock()
            int r4 = r4 + 1
            goto L_0x007c
        L_0x0084:
            r0.unlock()
            return r1
        L_0x0088:
            r9 = move-exception
        L_0x0089:
            if (r4 >= r3) goto L_0x0091
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0089
        L_0x0091:
            r0.unlock()
            throw r9
        L_0x0095:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            kotlinx.coroutines.internal.i$e r2 = new kotlinx.coroutines.internal.i$e
            r2.<init>()
            java.util.List r0 = p369i.p377u.C8477h.m46634s(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00ab:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            i.z.c.l r2 = m47562a(r2)
            if (r2 == 0) goto L_0x00ab
        L_0x00bd:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f35226b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00ce
            int r5 = r0.getReadHoldCount()
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r6 = 0
        L_0x00d0:
            if (r6 >= r5) goto L_0x00d8
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x00d8:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, i.z.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = f35227c     // Catch:{ all -> 0x0106 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x0106 }
            if (r2 != 0) goto L_0x00ea
            kotlinx.coroutines.internal.i$g r8 = kotlinx.coroutines.internal.C8829i.C8836g.INSTANCE     // Catch:{ all -> 0x0106 }
            goto L_0x00eb
        L_0x00ea:
            r8 = r2
        L_0x00eb:
            r6.put(r7, r8)     // Catch:{ all -> 0x0106 }
            i.t r6 = p369i.C8457t.f34900a     // Catch:{ all -> 0x0106 }
        L_0x00f0:
            if (r4 >= r5) goto L_0x00f8
            r3.lock()
            int r4 = r4 + 1
            goto L_0x00f0
        L_0x00f8:
            r0.unlock()
            if (r2 != 0) goto L_0x00fe
            goto L_0x0105
        L_0x00fe:
            java.lang.Object r9 = r2.invoke(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0105:
            return r1
        L_0x0106:
            r9 = move-exception
        L_0x0107:
            if (r4 >= r5) goto L_0x010f
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0107
        L_0x010f:
            r0.unlock()
            throw r9
        L_0x0113:
            java.lang.Object r9 = r3.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x011a:
            r9 = move-exception
            r2.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C8829i.m47566e(java.lang.Throwable):java.lang.Throwable");
    }
}
