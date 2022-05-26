package p369i.p379w;

import java.util.Objects;
import p369i.p379w.C8509e;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: i.w.g */
/* compiled from: CoroutineContext.kt */
public interface C8513g {

    /* renamed from: i.w.g$a */
    /* compiled from: CoroutineContext.kt */
    public static final class C8514a {

        /* renamed from: i.w.g$a$a */
        /* compiled from: CoroutineContext.kt */
        static final class C8515a extends C8595m implements C8574p<C8513g, C8516b, C8513g> {
            public static final C8515a INSTANCE = new C8515a();

            C8515a() {
                super(2);
            }

            public final C8513g invoke(C8513g gVar, C8516b bVar) {
                C8503c cVar;
                C8594l.m46771e(gVar, "acc");
                C8594l.m46771e(bVar, "element");
                C8513g minusKey = gVar.minusKey(bVar.getKey());
                C8519h hVar = C8519h.INSTANCE;
                if (minusKey == hVar) {
                    return bVar;
                }
                C8509e.C8511b bVar2 = C8509e.f34913d;
                C8509e eVar = (C8509e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new C8503c(minusKey, bVar);
                } else {
                    C8513g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new C8503c(bVar, eVar);
                    }
                    cVar = new C8503c(new C8503c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        /* renamed from: a */
        public static C8513g m46710a(C8513g gVar, C8513g gVar2) {
            C8594l.m46771e(gVar2, "context");
            return gVar2 == C8519h.INSTANCE ? gVar : (C8513g) gVar2.fold(gVar, C8515a.INSTANCE);
        }
    }

    /* renamed from: i.w.g$b */
    /* compiled from: CoroutineContext.kt */
    public interface C8516b extends C8513g {

        /* renamed from: i.w.g$b$a */
        /* compiled from: CoroutineContext.kt */
        public static final class C8517a {
            /* renamed from: a */
            public static <R> R m46711a(C8516b bVar, R r, C8574p<? super R, ? super C8516b, ? extends R> pVar) {
                C8594l.m46771e(pVar, "operation");
                return pVar.invoke(r, bVar);
            }

            /* renamed from: b */
            public static <E extends C8516b> E m46712b(C8516b bVar, C8518c<E> cVar) {
                C8594l.m46771e(cVar, "key");
                if (!C8594l.m46767a(bVar.getKey(), cVar)) {
                    return null;
                }
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type E");
                return bVar;
            }

            /* renamed from: c */
            public static C8513g m46713c(C8516b bVar, C8518c<?> cVar) {
                C8594l.m46771e(cVar, "key");
                return C8594l.m46767a(bVar.getKey(), cVar) ? C8519h.INSTANCE : bVar;
            }

            /* renamed from: d */
            public static C8513g m46714d(C8516b bVar, C8513g gVar) {
                C8594l.m46771e(gVar, "context");
                return C8514a.m46710a(bVar, gVar);
            }
        }

        <E extends C8516b> E get(C8518c<E> cVar);

        C8518c<?> getKey();
    }

    /* renamed from: i.w.g$c */
    /* compiled from: CoroutineContext.kt */
    public interface C8518c<E extends C8516b> {
    }

    <R> R fold(R r, C8574p<? super R, ? super C8516b, ? extends R> pVar);

    <E extends C8516b> E get(C8518c<E> cVar);

    C8513g minusKey(C8518c<?> cVar);

    C8513g plus(C8513g gVar);
}
