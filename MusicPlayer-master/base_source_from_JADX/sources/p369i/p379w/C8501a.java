package p369i.p379w;

import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C8501a implements C8513g.C8516b {
    private final C8513g.C8518c<?> key;

    public C8501a(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        C8594l.m46771e(pVar, "operation");
        return C8513g.C8516b.C8517a.m46711a(this, r, pVar);
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        C8594l.m46771e(cVar, "key");
        return C8513g.C8516b.C8517a.m46712b(this, cVar);
    }

    public C8513g.C8518c<?> getKey() {
        return this.key;
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        return C8513g.C8516b.C8517a.m46713c(this, cVar);
    }

    public C8513g plus(C8513g gVar) {
        C8594l.m46771e(gVar, "context");
        return C8513g.C8516b.C8517a.m46714d(this, gVar);
    }
}
