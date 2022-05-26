package p369i.p379w;

import java.util.Objects;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.e */
/* compiled from: ContinuationInterceptor.kt */
public interface C8509e extends C8513g.C8516b {

    /* renamed from: d */
    public static final C8511b f34913d = C8511b.f34914g;

    /* renamed from: i.w.e$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C8510a {
        /* renamed from: a */
        public static <E extends C8513g.C8516b> E m46706a(C8509e eVar, C8513g.C8518c<E> cVar) {
            C8594l.m46771e(cVar, "key");
            if (cVar instanceof C8502b) {
                C8502b bVar = (C8502b) cVar;
                if (!bVar.mo30577a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo30578b(eVar);
                if (!(b instanceof C8513g.C8516b)) {
                    return null;
                }
                return b;
            } else if (C8509e.f34913d != cVar) {
                return null;
            } else {
                Objects.requireNonNull(eVar, "null cannot be cast to non-null type E");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C8513g m46707b(C8509e eVar, C8513g.C8518c<?> cVar) {
            C8594l.m46771e(cVar, "key");
            if (!(cVar instanceof C8502b)) {
                return C8509e.f34913d == cVar ? C8519h.INSTANCE : eVar;
            }
            C8502b bVar = (C8502b) cVar;
            return (!bVar.mo30577a(eVar.getKey()) || bVar.mo30578b(eVar) == null) ? eVar : C8519h.INSTANCE;
        }
    }

    /* renamed from: i.w.e$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C8511b implements C8513g.C8518c<C8509e> {

        /* renamed from: g */
        static final /* synthetic */ C8511b f34914g = new C8511b();

        private C8511b() {
        }
    }

    /* renamed from: d */
    void mo30587d(C8508d<?> dVar);

    /* renamed from: p */
    <T> C8508d<T> mo30588p(C8508d<? super T> dVar);
}
