package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlinx.coroutines.C8925w2;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.internal.d0 */
/* compiled from: ThreadContext.kt */
public final class C8817d0 {

    /* renamed from: a */
    public static final C8859z f35207a = new C8859z("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C8574p<Object, C8513g.C8516b, Object> f35208b = C8818a.INSTANCE;

    /* renamed from: c */
    private static final C8574p<C8925w2<?>, C8513g.C8516b, C8925w2<?>> f35209c = C8819b.INSTANCE;

    /* renamed from: d */
    private static final C8574p<C8826g0, C8513g.C8516b, C8826g0> f35210d = C8820c.INSTANCE;

    /* renamed from: kotlinx.coroutines.internal.d0$a */
    /* compiled from: ThreadContext.kt */
    static final class C8818a extends C8595m implements C8574p<Object, C8513g.C8516b, Object> {
        public static final C8818a INSTANCE = new C8818a();

        C8818a() {
            super(2);
        }

        public final Object invoke(Object obj, C8513g.C8516b bVar) {
            if (!(bVar instanceof C8925w2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.d0$b */
    /* compiled from: ThreadContext.kt */
    static final class C8819b extends C8595m implements C8574p<C8925w2<?>, C8513g.C8516b, C8925w2<?>> {
        public static final C8819b INSTANCE = new C8819b();

        C8819b() {
            super(2);
        }

        public final C8925w2<?> invoke(C8925w2<?> w2Var, C8513g.C8516b bVar) {
            if (w2Var != null) {
                return w2Var;
            }
            if (bVar instanceof C8925w2) {
                return (C8925w2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.d0$c */
    /* compiled from: ThreadContext.kt */
    static final class C8820c extends C8595m implements C8574p<C8826g0, C8513g.C8516b, C8826g0> {
        public static final C8820c INSTANCE = new C8820c();

        C8820c() {
            super(2);
        }

        public final C8826g0 invoke(C8826g0 g0Var, C8513g.C8516b bVar) {
            if (bVar instanceof C8925w2) {
                C8925w2 w2Var = (C8925w2) bVar;
                g0Var.mo31128a(w2Var, w2Var.mo31208H0(g0Var.f35219a));
            }
            return g0Var;
        }
    }

    /* renamed from: a */
    public static final void m47525a(C8513g gVar, Object obj) {
        if (obj != f35207a) {
            if (obj instanceof C8826g0) {
                ((C8826g0) obj).mo31129b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f35209c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C8925w2) fold).mo31214m0(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m47526b(C8513g gVar) {
        Object fold = gVar.fold(0, f35208b);
        C8594l.m46769c(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m47527c(C8513g gVar, Object obj) {
        if (obj == null) {
            obj = m47526b(gVar);
        }
        if (obj == 0) {
            return f35207a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C8826g0(gVar, ((Number) obj).intValue()), f35210d);
        }
        return ((C8925w2) obj).mo31208H0(gVar);
    }
}
