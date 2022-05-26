package p159f.p334h.p335a;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p159f.p334h.p335a.p336v.C7801b;

/* renamed from: f.h.a.b */
/* compiled from: ClassFactory */
abstract class C7742b<T> {

    /* renamed from: f.h.a.b$a */
    /* compiled from: ClassFactory */
    class C7743a extends C7742b<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f33100a;

        /* renamed from: b */
        final /* synthetic */ Class f33101b;

        C7743a(Constructor constructor, Class cls) {
            this.f33100a = constructor;
            this.f33101b = cls;
        }

        /* renamed from: b */
        public T mo28941b() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f33100a.newInstance((Object[]) null);
        }

        public String toString() {
            return this.f33101b.getName();
        }
    }

    /* renamed from: f.h.a.b$b */
    /* compiled from: ClassFactory */
    class C7744b extends C7742b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33102a;

        /* renamed from: b */
        final /* synthetic */ Object f33103b;

        /* renamed from: c */
        final /* synthetic */ Class f33104c;

        C7744b(Method method, Object obj, Class cls) {
            this.f33102a = method;
            this.f33103b = obj;
            this.f33104c = cls;
        }

        /* renamed from: b */
        public T mo28941b() throws InvocationTargetException, IllegalAccessException {
            return this.f33102a.invoke(this.f33103b, new Object[]{this.f33104c});
        }

        public String toString() {
            return this.f33104c.getName();
        }
    }

    /* renamed from: f.h.a.b$c */
    /* compiled from: ClassFactory */
    class C7745c extends C7742b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33105a;

        /* renamed from: b */
        final /* synthetic */ Class f33106b;

        /* renamed from: c */
        final /* synthetic */ int f33107c;

        C7745c(Method method, Class cls, int i) {
            this.f33105a = method;
            this.f33106b = cls;
            this.f33107c = i;
        }

        /* renamed from: b */
        public T mo28941b() throws InvocationTargetException, IllegalAccessException {
            return this.f33105a.invoke((Object) null, new Object[]{this.f33106b, Integer.valueOf(this.f33107c)});
        }

        public String toString() {
            return this.f33106b.getName();
        }
    }

    /* renamed from: f.h.a.b$d */
    /* compiled from: ClassFactory */
    class C7746d extends C7742b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f33108a;

        /* renamed from: b */
        final /* synthetic */ Class f33109b;

        C7746d(Method method, Class cls) {
            this.f33108a = method;
            this.f33109b = cls;
        }

        /* renamed from: b */
        public T mo28941b() throws InvocationTargetException, IllegalAccessException {
            return this.f33108a.invoke((Object) null, new Object[]{this.f33109b, Object.class});
        }

        public String toString() {
            return this.f33109b.getName();
        }
    }

    C7742b() {
    }

    /* renamed from: a */
    public static <T> C7742b<T> m42619a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C7743a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C7744b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C7745c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    C7801b.m42790p(e);
                    throw null;
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C7746d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo28941b() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
