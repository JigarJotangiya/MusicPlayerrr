package p369i.p379w;

import java.io.Serializable;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.h */
/* compiled from: CoroutineContextImpl.kt */
public final class C8519h implements C8513g, Serializable {
    public static final C8519h INSTANCE = new C8519h();
    private static final long serialVersionUID = 0;

    private C8519h() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        C8594l.m46771e(pVar, "operation");
        return r;
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        C8594l.m46771e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        return this;
    }

    public C8513g plus(C8513g gVar) {
        C8594l.m46771e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
