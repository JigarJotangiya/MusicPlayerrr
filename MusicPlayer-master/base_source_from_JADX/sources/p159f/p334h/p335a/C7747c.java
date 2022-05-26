package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p159f.p334h.p335a.C7755f;
import p159f.p334h.p335a.C7761k;
import p159f.p334h.p335a.p336v.C7801b;

/* renamed from: f.h.a.c */
/* compiled from: ClassJsonAdapter */
final class C7747c<T> extends C7755f<T> {

    /* renamed from: d */
    public static final C7755f.C7756a f33110d = new C7748a();

    /* renamed from: a */
    private final C7742b<T> f33111a;

    /* renamed from: b */
    private final C7749b<?>[] f33112b;

    /* renamed from: c */
    private final C7761k.C7762a f33113c;

    /* renamed from: f.h.a.c$a */
    /* compiled from: ClassJsonAdapter */
    class C7748a implements C7755f.C7756a {
        C7748a() {
        }

        /* renamed from: b */
        private void m42626b(C7781s sVar, Type type, Map<String, C7749b<?>> map) {
            Class<?> g = C7799u.m42769g(type);
            boolean i = C7801b.m42783i(g);
            for (Field field : g.getDeclaredFields()) {
                if (m42627c(i, field.getModifiers())) {
                    Type m = C7801b.m42787m(type, g, field.getGenericType());
                    Set<? extends Annotation> j = C7801b.m42784j(field);
                    String name = field.getName();
                    C7755f<T> f = sVar.mo29031f(m, j, name);
                    field.setAccessible(true);
                    C7754e eVar = (C7754e) field.getAnnotation(C7754e.class);
                    if (eVar != null) {
                        name = eVar.name();
                    }
                    C7749b bVar = new C7749b(name, field, f);
                    C7749b put = map.put(name, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f33114a + "\n    " + bVar.f33114a);
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m42627c(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private void m42628d(Type type, Class<?> cls) {
            Class<?> g = C7799u.m42769g(type);
            if (cls.isAssignableFrom(g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        /* renamed from: a */
        public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> g = C7799u.m42769g(type);
            if (g.isInterface() || g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C7801b.m42783i(g)) {
                m42628d(type, List.class);
                m42628d(type, Set.class);
                m42628d(type, Map.class);
                m42628d(type, Collection.class);
                String str = "Platform " + g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g.getName());
            } else if (g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g.getName());
            } else if (g.getEnclosingClass() != null && !Modifier.isStatic(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g.getName());
            } else if (Modifier.isAbstract(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g.getName());
            } else if (!C7801b.m42782h(g)) {
                C7742b<?> a = C7742b.m42619a(g);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    m42626b(sVar, type, treeMap);
                    type = C7799u.m42768f(type);
                }
                return new C7747c(a, treeMap).mo28954c();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }
    }

    /* renamed from: f.h.a.c$b */
    /* compiled from: ClassJsonAdapter */
    static class C7749b<T> {

        /* renamed from: a */
        final Field f33114a;

        /* renamed from: b */
        final C7755f<T> f33115b;

        C7749b(String str, Field field, C7755f<T> fVar) {
            this.f33114a = field;
            this.f33115b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28947a(C7761k kVar, Object obj) throws IOException, IllegalAccessException {
            this.f33114a.set(obj, this.f33115b.mo15563a(kVar));
        }
    }

    C7747c(C7742b<T> bVar, Map<String, C7749b<?>> map) {
        this.f33111a = bVar;
        this.f33112b = (C7749b[]) map.values().toArray(new C7749b[map.size()]);
        this.f33113c = C7761k.C7762a.m42667a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    /* renamed from: a */
    public T mo15563a(C7761k kVar) throws IOException {
        try {
            T b = this.f33111a.mo28941b();
            try {
                kVar.mo28969d();
                while (kVar.mo28957E()) {
                    int F0 = kVar.mo28958F0(this.f33113c);
                    if (F0 == -1) {
                        kVar.mo28962L0();
                        kVar.mo28963N0();
                    } else {
                        this.f33112b[F0].mo28947a(kVar, b);
                    }
                }
                kVar.mo28976x();
                return b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C7801b.m42790p(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f33111a + ")";
    }
}
