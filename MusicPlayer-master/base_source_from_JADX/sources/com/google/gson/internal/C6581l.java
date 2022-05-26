package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
/* compiled from: UnsafeAllocator */
public abstract class C6581l {

    /* renamed from: com.google.gson.internal.l$a */
    /* compiled from: UnsafeAllocator */
    class C6582a extends C6581l {

        /* renamed from: a */
        final /* synthetic */ Method f29941a;

        /* renamed from: b */
        final /* synthetic */ Object f29942b;

        C6582a(Method method, Object obj) {
            this.f29941a = method;
            this.f29942b = obj;
        }

        /* renamed from: c */
        public <T> T mo25772c(Class<T> cls) throws Exception {
            C6581l.m38032a(cls);
            return this.f29941a.invoke(this.f29942b, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.internal.l$b */
    /* compiled from: UnsafeAllocator */
    class C6583b extends C6581l {

        /* renamed from: a */
        final /* synthetic */ Method f29943a;

        /* renamed from: b */
        final /* synthetic */ int f29944b;

        C6583b(Method method, int i) {
            this.f29943a = method;
            this.f29944b = i;
        }

        /* renamed from: c */
        public <T> T mo25772c(Class<T> cls) throws Exception {
            C6581l.m38032a(cls);
            return this.f29943a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f29944b)});
        }
    }

    /* renamed from: com.google.gson.internal.l$c */
    /* compiled from: UnsafeAllocator */
    class C6584c extends C6581l {

        /* renamed from: a */
        final /* synthetic */ Method f29945a;

        C6584c(Method method) {
            this.f29945a = method;
        }

        /* renamed from: c */
        public <T> T mo25772c(Class<T> cls) throws Exception {
            C6581l.m38032a(cls);
            return this.f29945a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.internal.l$d */
    /* compiled from: UnsafeAllocator */
    class C6585d extends C6581l {
        C6585d() {
        }

        /* renamed from: c */
        public <T> T mo25772c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m38032a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static C6581l m38033b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C6582a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C6583b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C6584c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C6585d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo25772c(Class<T> cls) throws Exception;
}
