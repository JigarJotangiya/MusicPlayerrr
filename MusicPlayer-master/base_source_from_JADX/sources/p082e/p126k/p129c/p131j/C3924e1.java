package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e.k.c.j.e1 */
/* compiled from: Protobuf */
final class C3924e1 {

    /* renamed from: c */
    private static final C3924e1 f11999c = new C3924e1();

    /* renamed from: a */
    private final C3969k1 f12000a = new C3966k0();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C3963j1<?>> f12001b = new ConcurrentHashMap();

    private C3924e1() {
    }

    /* renamed from: a */
    public static C3924e1 m16737a() {
        return f11999c;
    }

    /* renamed from: b */
    public <T> void mo13537b(T t, C3933h1 h1Var, C4003q qVar) throws IOException {
        mo13540e(t).mo13705b(t, h1Var, qVar);
    }

    /* renamed from: c */
    public C3963j1<?> mo13538c(Class<?> cls, C3963j1<?> j1Var) {
        C3899b0.m16646b(cls, "messageType");
        C3899b0.m16646b(j1Var, "schema");
        return this.f12001b.putIfAbsent(cls, j1Var);
    }

    /* renamed from: d */
    public <T> C3963j1<T> mo13539d(Class<T> cls) {
        C3899b0.m16646b(cls, "messageType");
        C3963j1<T> j1Var = (C3963j1) this.f12001b.get(cls);
        if (j1Var != null) {
            return j1Var;
        }
        C3963j1<T> a = this.f12000a.mo13714a(cls);
        C3963j1<?> c = mo13538c(cls, a);
        return c != null ? c : a;
    }

    /* renamed from: e */
    public <T> C3963j1<T> mo13540e(T t) {
        return mo13539d(t.getClass());
    }
}
