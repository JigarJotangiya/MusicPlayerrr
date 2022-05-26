package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8825g;
import p369i.p379w.C8501a;
import p369i.p379w.C8502b;
import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.m0 */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C8876m0 extends C8501a implements C8509e {

    /* renamed from: g */
    public static final C8877a f35279g = new C8877a((C8589g) null);

    /* renamed from: kotlinx.coroutines.m0$a */
    /* compiled from: CoroutineDispatcher.kt */
    public static final class C8877a extends C8502b<C8509e, C8876m0> {

        /* renamed from: kotlinx.coroutines.m0$a$a */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C8878a extends C8595m implements C8570l<C8513g.C8516b, C8876m0> {
            public static final C8878a INSTANCE = new C8878a();

            C8878a() {
                super(1);
            }

            public final C8876m0 invoke(C8513g.C8516b bVar) {
                if (bVar instanceof C8876m0) {
                    return (C8876m0) bVar;
                }
                return null;
            }
        }

        private C8877a() {
            super(C8509e.f34913d, C8878a.INSTANCE);
        }

        public /* synthetic */ C8877a(C8589g gVar) {
            this();
        }
    }

    public C8876m0() {
        super(C8509e.f34913d);
    }

    /* renamed from: N0 */
    public abstract void mo30866N0(C8513g gVar, Runnable runnable);

    /* renamed from: O0 */
    public boolean mo30867O0(C8513g gVar) {
        return true;
    }

    /* renamed from: d */
    public final void mo30587d(C8508d<?> dVar) {
        ((C8825g) dVar).mo31125q();
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        return C8509e.C8510a.m46706a(this, cVar);
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        return C8509e.C8510a.m46707b(this, cVar);
    }

    /* renamed from: p */
    public final <T> C8508d<T> mo30588p(C8508d<? super T> dVar) {
        return new C8825g(this, dVar);
    }

    public String toString() {
        return C8923w0.m47833a(this) + '@' + C8923w0.m47834b(this);
    }
}
