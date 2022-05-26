package androidx.lifecycle;

import androidx.lifecycle.C0697n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* compiled from: ClassesInfoCache */
final class C0660c {

    /* renamed from: c */
    static C0660c f3275c = new C0660c();

    /* renamed from: a */
    private final Map<Class<?>, C0661a> f3276a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3277b = new HashMap();

    /* renamed from: androidx.lifecycle.c$a */
    /* compiled from: ClassesInfoCache */
    static class C0661a {

        /* renamed from: a */
        final Map<C0697n.C0699b, List<C0662b>> f3278a = new HashMap();

        /* renamed from: b */
        final Map<C0662b, C0697n.C0699b> f3279b;

        C0661a(Map<C0662b, C0697n.C0699b> map) {
            this.f3279b = map;
            for (Map.Entry next : map.entrySet()) {
                C0697n.C0699b bVar = (C0697n.C0699b) next.getValue();
                List list = this.f3278a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3278a.put(bVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: b */
        private static void m4195b(List<C0662b> list, C0718v vVar, C0697n.C0699b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo4202a(vVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4201a(C0718v vVar, C0697n.C0699b bVar, Object obj) {
            m4195b(this.f3278a.get(bVar), vVar, bVar, obj);
            m4195b(this.f3278a.get(C0697n.C0699b.ON_ANY), vVar, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    /* compiled from: ClassesInfoCache */
    static final class C0662b {

        /* renamed from: a */
        final int f3280a;

        /* renamed from: b */
        final Method f3281b;

        C0662b(int i, Method method) {
            this.f3280a = i;
            this.f3281b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4202a(C0718v vVar, C0697n.C0699b bVar, Object obj) {
            try {
                int i = this.f3280a;
                if (i == 0) {
                    this.f3281b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3281b.invoke(obj, new Object[]{vVar});
                } else if (i == 2) {
                    this.f3281b.invoke(obj, new Object[]{vVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0662b)) {
                return false;
            }
            C0662b bVar = (C0662b) obj;
            if (this.f3280a != bVar.f3280a || !this.f3281b.getName().equals(bVar.f3281b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3280a * 31) + this.f3281b.getName().hashCode();
        }
    }

    C0660c() {
    }

    /* renamed from: a */
    private C0661a m4190a(Class<?> cls, Method[] methodArr) {
        int i;
        C0661a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo4199c(superclass)) == null)) {
            hashMap.putAll(c.f3279b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo4199c(c2).f3279b.entrySet()) {
                m4192e(hashMap, (C0662b) next.getKey(), (C0697n.C0699b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4191b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0674g0 g0Var = (C0674g0) method.getAnnotation(C0674g0.class);
            if (g0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0718v.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0697n.C0699b value = g0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0697n.C0699b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0697n.C0699b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4192e(hashMap, new C0662b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0661a aVar = new C0661a(hashMap);
        this.f3276a.put(cls, aVar);
        this.f3277b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4191b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m4192e(Map<C0662b, C0697n.C0699b> map, C0662b bVar, C0697n.C0699b bVar2, Class<?> cls) {
        C0697n.C0699b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f3281b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0661a mo4199c(Class<?> cls) {
        C0661a aVar = this.f3276a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m4190a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4200d(Class<?> cls) {
        Boolean bool = this.f3277b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m4191b(cls);
        for (Method annotation : b) {
            if (((C0674g0) annotation.getAnnotation(C0674g0.class)) != null) {
                m4190a(cls, b);
                return true;
            }
        }
        this.f3277b.put(cls, Boolean.FALSE);
        return false;
    }
}
