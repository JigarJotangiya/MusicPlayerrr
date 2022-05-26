package kotlinx.coroutines.p397f3.p398q;

import kotlinx.coroutines.C8693e2;
import kotlinx.coroutines.p397f3.C8730c;
import p369i.C8447l;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.f3.q.i */
/* compiled from: SafeCollector.kt */
public final class C8760i<T> extends C8531d implements C8730c<T>, C8532e {
    public final C8513g collectContext;
    public final int collectContextSize;
    public final C8730c<T> collector;
    private C8508d<? super C8457t> completion;
    private C8513g lastEmissionContext;

    /* renamed from: kotlinx.coroutines.f3.q.i$a */
    /* compiled from: SafeCollector.kt */
    static final class C8761a extends C8595m implements C8574p<Integer, C8513g.C8516b, Integer> {
        public static final C8761a INSTANCE = new C8761a();

        C8761a() {
            super(2);
        }

        public final Integer invoke(int i, C8513g.C8516b bVar) {
            return Integer.valueOf(i + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (C8513g.C8516b) obj2);
        }
    }

    public C8760i(C8730c<? super T> cVar, C8513g gVar) {
        super(C8758g.f35115g, C8519h.INSTANCE);
        this.collector = cVar;
        this.collectContext = gVar;
        this.collectContextSize = ((Number) gVar.fold(0, C8761a.INSTANCE)).intValue();
    }

    /* renamed from: c */
    private final void m47295c(C8513g gVar, C8513g gVar2, T t) {
        if (!(gVar2 instanceof C8755e)) {
            C8764k.m47299a(this, gVar);
            this.lastEmissionContext = gVar;
            return;
        }
        m47297i((C8755e) gVar2, t);
        throw null;
    }

    /* renamed from: d */
    private final Object m47296d(C8508d<? super C8457t> dVar, T t) {
        C8513g context = dVar.getContext();
        C8693e2.m47146f(context);
        C8513g gVar = this.lastEmissionContext;
        if (gVar != context) {
            m47295c(context, gVar, t);
        }
        this.completion = dVar;
        return C8762j.f35118a.invoke(this.collector, t, this);
    }

    /* renamed from: i */
    private final void m47297i(C8755e eVar, Object obj) {
        throw new IllegalStateException(C8427h.m46511e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f35113g + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, C8508d<? super C8457t> dVar) {
        try {
            Object d = m47296d(dVar, t);
            if (d == C8527d.m46722d()) {
                C8535h.m46737c(dVar);
            }
            return d == C8527d.m46722d() ? d : C8457t.f34900a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C8755e(th);
            throw th;
        }
    }

    public C8532e getCallerFrame() {
        C8508d<? super C8457t> dVar = this.completion;
        if (dVar instanceof C8532e) {
            return (C8532e) dVar;
        }
        return null;
    }

    public C8513g getContext() {
        C8508d<? super C8457t> dVar = this.completion;
        C8513g context = dVar == null ? null : dVar.getContext();
        return context == null ? C8519h.INSTANCE : context;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable r0 = C8447l.m50329exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.lastEmissionContext = new C8755e(r0);
        }
        C8508d<? super C8457t> dVar = this.completion;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C8527d.m46722d();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
