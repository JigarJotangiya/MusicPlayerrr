package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.x2 */
/* compiled from: EventLoop.common.kt */
public final class C8929x2 {

    /* renamed from: a */
    public static final C8929x2 f35315a = new C8929x2();

    /* renamed from: b */
    private static final ThreadLocal<C8866k1> f35316b = new ThreadLocal<>();

    private C8929x2() {
    }

    /* renamed from: a */
    public final C8866k1 mo31250a() {
        return f35316b.get();
    }

    /* renamed from: b */
    public final C8866k1 mo31251b() {
        ThreadLocal<C8866k1> threadLocal = f35316b;
        C8866k1 k1Var = threadLocal.get();
        if (k1Var != null) {
            return k1Var;
        }
        C8866k1 a = C8883n1.m47739a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo31252c() {
        f35316b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo31253d(C8866k1 k1Var) {
        f35316b.set(k1Var);
    }
}
