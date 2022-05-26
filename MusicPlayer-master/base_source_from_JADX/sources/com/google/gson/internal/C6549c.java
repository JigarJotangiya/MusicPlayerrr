package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p255m.C6587b;
import com.google.gson.p253b.C6488a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
/* compiled from: ConstructorConstructor */
public final class C6549c {

    /* renamed from: a */
    private final Map<Type, InstanceCreator<?>> f29911a;

    /* renamed from: b */
    private final C6587b f29912b = C6587b.m38040a();

    /* renamed from: com.google.gson.internal.c$a */
    /* compiled from: ConstructorConstructor */
    class C6550a implements C6575h<T> {
        C6550a(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$b */
    /* compiled from: ConstructorConstructor */
    class C6551b implements C6575h<T> {
        C6551b(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$c */
    /* compiled from: ConstructorConstructor */
    class C6552c implements C6575h<T> {
        C6552c(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$d */
    /* compiled from: ConstructorConstructor */
    class C6553d implements C6575h<T> {
        C6553d(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new C6567g();
        }
    }

    /* renamed from: com.google.gson.internal.c$e */
    /* compiled from: ConstructorConstructor */
    class C6554e implements C6575h<T> {

        /* renamed from: a */
        private final C6581l f29913a = C6581l.m38033b();

        /* renamed from: b */
        final /* synthetic */ Class f29914b;

        /* renamed from: c */
        final /* synthetic */ Type f29915c;

        C6554e(C6549c cVar, Class cls, Type type) {
            this.f29914b = cls;
            this.f29915c = type;
        }

        /* renamed from: a */
        public T mo25717a() {
            try {
                return this.f29913a.mo25772c(this.f29914b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f29915c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.c$f */
    /* compiled from: ConstructorConstructor */
    class C6555f implements C6575h<T> {

        /* renamed from: a */
        final /* synthetic */ InstanceCreator f29916a;

        /* renamed from: b */
        final /* synthetic */ Type f29917b;

        C6555f(C6549c cVar, InstanceCreator instanceCreator, Type type) {
            this.f29916a = instanceCreator;
            this.f29917b = type;
        }

        /* renamed from: a */
        public T mo25717a() {
            return this.f29916a.createInstance(this.f29917b);
        }
    }

    /* renamed from: com.google.gson.internal.c$g */
    /* compiled from: ConstructorConstructor */
    class C6556g implements C6575h<T> {

        /* renamed from: a */
        final /* synthetic */ InstanceCreator f29918a;

        /* renamed from: b */
        final /* synthetic */ Type f29919b;

        C6556g(C6549c cVar, InstanceCreator instanceCreator, Type type) {
            this.f29918a = instanceCreator;
            this.f29919b = type;
        }

        /* renamed from: a */
        public T mo25717a() {
            return this.f29918a.createInstance(this.f29919b);
        }
    }

    /* renamed from: com.google.gson.internal.c$h */
    /* compiled from: ConstructorConstructor */
    class C6557h implements C6575h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f29920a;

        C6557h(C6549c cVar, Constructor constructor) {
            this.f29920a = constructor;
        }

        /* renamed from: a */
        public T mo25717a() {
            try {
                return this.f29920a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f29920a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f29920a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.google.gson.internal.c$i */
    /* compiled from: ConstructorConstructor */
    class C6558i implements C6575h<T> {
        C6558i(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$j */
    /* compiled from: ConstructorConstructor */
    class C6559j implements C6575h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f29921a;

        C6559j(C6549c cVar, Type type) {
            this.f29921a = type;
        }

        /* renamed from: a */
        public T mo25717a() {
            Type type = this.f29921a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f29921a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f29921a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.c$k */
    /* compiled from: ConstructorConstructor */
    class C6560k implements C6575h<T> {
        C6560k(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$l */
    /* compiled from: ConstructorConstructor */
    class C6561l implements C6575h<T> {
        C6561l(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.c$m */
    /* compiled from: ConstructorConstructor */
    class C6562m implements C6575h<T> {
        C6562m(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.c$n */
    /* compiled from: ConstructorConstructor */
    class C6563n implements C6575h<T> {
        C6563n(C6549c cVar) {
        }

        /* renamed from: a */
        public T mo25717a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C6549c(Map<Type, InstanceCreator<?>> map) {
        this.f29911a = map;
    }

    /* renamed from: b */
    private <T> C6575h<T> m37989b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f29912b.mo25773b(declaredConstructor);
            }
            return new C6557h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> C6575h<T> m37990c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C6558i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C6559j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C6560k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C6561l(this);
            }
            return new C6562m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C6563n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C6550a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C6551b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C6488a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C6553d(this);
            }
            return new C6552c(this);
        }
    }

    /* renamed from: d */
    private <T> C6575h<T> m37991d(Type type, Class<? super T> cls) {
        return new C6554e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C6575h<T> mo25715a(C6488a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        InstanceCreator instanceCreator = this.f29911a.get(type);
        if (instanceCreator != null) {
            return new C6555f(this, instanceCreator, type);
        }
        InstanceCreator instanceCreator2 = this.f29911a.get(rawType);
        if (instanceCreator2 != null) {
            return new C6556g(this, instanceCreator2, type);
        }
        C6575h<T> b = m37989b(rawType);
        if (b != null) {
            return b;
        }
        C6575h<T> c = m37990c(type, rawType);
        if (c != null) {
            return c;
        }
        return m37991d(type, rawType);
    }

    public String toString() {
        return this.f29911a.toString();
    }
}
