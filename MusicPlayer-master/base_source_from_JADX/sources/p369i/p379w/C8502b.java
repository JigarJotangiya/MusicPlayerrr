package p369i.p379w;

import p369i.p379w.C8513g;
import p369i.p379w.C8513g.C8516b;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.b */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C8502b<B extends C8513g.C8516b, E extends B> implements C8513g.C8518c<E> {

    /* renamed from: g */
    private final C8513g.C8518c<?> f34911g;

    /* renamed from: h */
    private final C8570l<C8513g.C8516b, E> f34912h;

    public C8502b(C8513g.C8518c<B> cVar, C8570l<? super C8513g.C8516b, ? extends E> lVar) {
        C8594l.m46771e(cVar, "baseKey");
        C8594l.m46771e(lVar, "safeCast");
        this.f34912h = lVar;
        this.f34911g = cVar instanceof C8502b ? ((C8502b) cVar).f34911g : cVar;
    }

    /* renamed from: a */
    public final boolean mo30577a(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        return cVar == this || this.f34911g == cVar;
    }

    /* renamed from: b */
    public final E mo30578b(C8513g.C8516b bVar) {
        C8594l.m46771e(bVar, "element");
        return (C8513g.C8516b) this.f34912h.invoke(bVar);
    }
}
