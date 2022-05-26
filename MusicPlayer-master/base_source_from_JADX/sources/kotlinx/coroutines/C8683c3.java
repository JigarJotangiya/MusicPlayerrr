package kotlinx.coroutines;

import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.c3 */
/* compiled from: CoroutineContext.kt */
final class C8683c3 implements C8513g.C8516b, C8513g.C8518c<C8683c3> {

    /* renamed from: g */
    public static final C8683c3 f35046g = new C8683c3();

    private C8683c3() {
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        return C8513g.C8516b.C8517a.m46711a(this, r, pVar);
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        return C8513g.C8516b.C8517a.m46712b(this, cVar);
    }

    public C8513g.C8518c<?> getKey() {
        return this;
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        return C8513g.C8516b.C8517a.m46713c(this, cVar);
    }

    public C8513g plus(C8513g gVar) {
        return C8513g.C8516b.C8517a.m46714d(this, gVar);
    }
}
