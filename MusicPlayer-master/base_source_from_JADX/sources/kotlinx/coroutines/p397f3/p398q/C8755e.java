package kotlinx.coroutines.p397f3.p398q;

import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.f3.q.e */
/* compiled from: SafeCollector.kt */
public final class C8755e implements C8513g.C8516b {

    /* renamed from: i */
    public static final C8756a f35112i = new C8756a((C8589g) null);

    /* renamed from: g */
    public final Throwable f35113g;

    /* renamed from: h */
    private final C8513g.C8518c<?> f35114h = f35112i;

    /* renamed from: kotlinx.coroutines.f3.q.e$a */
    /* compiled from: SafeCollector.kt */
    public static final class C8756a implements C8513g.C8518c<C8755e> {
        private C8756a() {
        }

        public /* synthetic */ C8756a(C8589g gVar) {
            this();
        }
    }

    public C8755e(Throwable th) {
        this.f35113g = th;
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        return C8513g.C8516b.C8517a.m46711a(this, r, pVar);
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        return C8513g.C8516b.C8517a.m46712b(this, cVar);
    }

    public C8513g.C8518c<?> getKey() {
        return this.f35114h;
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        return C8513g.C8516b.C8517a.m46713c(this, cVar);
    }

    public C8513g plus(C8513g gVar) {
        return C8513g.C8516b.C8517a.m46714d(this, gVar);
    }
}
