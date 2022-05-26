package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.lifecycle.z */
/* compiled from: Lifecycling */
public class C0723z {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3346a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0691l>>> f3347b = new HashMap();

    /* renamed from: a */
    private static C0691l m4301a(Constructor<? extends C0691l> constructor, Object obj) {
        try {
            return (C0691l) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C0691l> m4302b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m4303c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m4303c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m4304d(Class<?> cls) {
        Integer num = f3346a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m4307g(cls);
        f3346a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m4305e(Class<?> cls) {
        return cls != null && C0717u.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C0715s m4306f(Object obj) {
        boolean z = obj instanceof C0715s;
        boolean z2 = obj instanceof C0688k;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0688k) obj, (C0715s) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0688k) obj, (C0715s) null);
        }
        if (z) {
            return (C0715s) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4304d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3347b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4301a((Constructor) list.get(0), obj));
        }
        C0691l[] lVarArr = new C0691l[list.size()];
        for (int i = 0; i < list.size(); i++) {
            lVarArr[i] = m4301a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(lVarArr);
    }

    /* renamed from: g */
    private static int m4307g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0691l> b = m4302b(cls);
        if (b != null) {
            f3347b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0660c.f3275c.mo4200d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4305e(superclass)) {
                if (m4304d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3347b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4305e(cls2)) {
                    if (m4304d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3347b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3347b.put(cls, arrayList);
            return 2;
        }
    }
}
