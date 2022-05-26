package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.o0 */
/* compiled from: ViewModelProvider */
public class C0703o0 {

    /* renamed from: a */
    private final C0705b f3329a;

    /* renamed from: b */
    private final C0710p0 f3330b;

    /* renamed from: androidx.lifecycle.o0$a */
    /* compiled from: ViewModelProvider */
    public static class C0704a extends C0707d {

        /* renamed from: c */
        private static C0704a f3331c;

        /* renamed from: b */
        private Application f3332b;

        public C0704a(Application application) {
            this.f3332b = application;
        }

        /* renamed from: c */
        public static C0704a m4265c(Application application) {
            if (f3331c == null) {
                f3331c = new C0704a(application);
            }
            return f3331c;
        }

        /* renamed from: a */
        public <T extends C0696m0> T mo4019a(Class<T> cls) {
            if (!C0653a.class.isAssignableFrom(cls)) {
                return super.mo4019a(cls);
            }
            try {
                return (C0696m0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f3332b});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.o0$b */
    /* compiled from: ViewModelProvider */
    public interface C0705b {
        /* renamed from: a */
        <T extends C0696m0> T mo4019a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.o0$c */
    /* compiled from: ViewModelProvider */
    static abstract class C0706c extends C0708e implements C0705b {
        C0706c() {
        }

        /* renamed from: a */
        public <T extends C0696m0> T mo4019a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends C0696m0> T mo4239c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.o0$d */
    /* compiled from: ViewModelProvider */
    public static class C0707d implements C0705b {

        /* renamed from: a */
        private static C0707d f3333a;

        /* renamed from: b */
        static C0707d m4270b() {
            if (f3333a == null) {
                f3333a = new C0707d();
            }
            return f3333a;
        }

        /* renamed from: a */
        public <T extends C0696m0> T mo4019a(Class<T> cls) {
            try {
                return (C0696m0) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* renamed from: androidx.lifecycle.o0$e */
    /* compiled from: ViewModelProvider */
    static class C0708e {
        C0708e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4238b(C0696m0 m0Var) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0703o0(androidx.lifecycle.C0712q0 r3) {
        /*
            r2 = this;
            androidx.lifecycle.p0 r0 = r3.mo392z0()
            boolean r1 = r3 instanceof androidx.lifecycle.C0695m
            if (r1 == 0) goto L_0x000f
            androidx.lifecycle.m r3 = (androidx.lifecycle.C0695m) r3
            androidx.lifecycle.o0$b r3 = r3.mo385Y()
            goto L_0x0013
        L_0x000f:
            androidx.lifecycle.o0$d r3 = androidx.lifecycle.C0703o0.C0707d.m4270b()
        L_0x0013:
            r2.<init>((androidx.lifecycle.C0710p0) r0, (androidx.lifecycle.C0703o0.C0705b) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0703o0.<init>(androidx.lifecycle.q0):void");
    }

    /* renamed from: a */
    public <T extends C0696m0> T mo4262a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4263b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C0696m0> T mo4263b(String str, Class<T> cls) {
        T t;
        T b = this.f3330b.mo4265b(str);
        if (cls.isInstance(b)) {
            C0705b bVar = this.f3329a;
            if (bVar instanceof C0708e) {
                ((C0708e) bVar).mo4238b(b);
            }
            return b;
        }
        C0705b bVar2 = this.f3329a;
        if (bVar2 instanceof C0706c) {
            t = ((C0706c) bVar2).mo4239c(str, cls);
        } else {
            t = bVar2.mo4019a(cls);
        }
        this.f3330b.mo4267d(str, t);
        return t;
    }

    public C0703o0(C0712q0 q0Var, C0705b bVar) {
        this(q0Var.mo392z0(), bVar);
    }

    public C0703o0(C0710p0 p0Var, C0705b bVar) {
        this.f3329a = bVar;
        this.f3330b = p0Var;
    }
}
