package p369i.p379w.p381j.p382a;

import java.lang.reflect.Method;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.j.a.i */
/* compiled from: DebugMetadata.kt */
final class C8536i {

    /* renamed from: a */
    private static final C8537a f34917a = new C8537a((Method) null, (Method) null, (Method) null);

    /* renamed from: b */
    private static C8537a f34918b;

    /* renamed from: c */
    public static final C8536i f34919c = new C8536i();

    /* renamed from: i.w.j.a.i$a */
    /* compiled from: DebugMetadata.kt */
    private static final class C8537a {

        /* renamed from: a */
        public final Method f34920a;

        /* renamed from: b */
        public final Method f34921b;

        /* renamed from: c */
        public final Method f34922c;

        public C8537a(Method method, Method method2, Method method3) {
            this.f34920a = method;
            this.f34921b = method2;
            this.f34922c = method3;
        }
    }

    private C8536i() {
    }

    /* renamed from: a */
    private final C8537a m46738a(C8528a aVar) {
        try {
            C8537a aVar2 = new C8537a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f34918b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C8537a aVar3 = f34917a;
            f34918b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo30604b(C8528a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C8594l.m46771e(aVar, "continuation");
        C8537a aVar2 = f34918b;
        if (aVar2 == null) {
            aVar2 = m46738a(aVar);
        }
        Object obj = null;
        if (aVar2 == f34917a || (method = aVar2.f34920a) == null || (invoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVar2.f34921b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.f34922c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            obj = invoke3;
        }
        return (String) obj;
    }
}
