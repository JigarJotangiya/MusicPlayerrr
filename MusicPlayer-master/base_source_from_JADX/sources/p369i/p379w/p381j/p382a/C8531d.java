package p369i.p379w.p381j.p382a;

import p369i.p379w.C8508d;
import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.w.j.a.d */
/* compiled from: ContinuationImpl.kt */
public abstract class C8531d extends C8528a {
    private final C8513g _context;
    private transient C8508d<Object> intercepted;

    public C8531d(C8508d<Object> dVar, C8513g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C8513g getContext() {
        C8513g gVar = this._context;
        C8594l.m46769c(gVar);
        return gVar;
    }

    public final C8508d<Object> intercepted() {
        C8508d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C8509e eVar = (C8509e) getContext().get(C8509e.f34913d);
            if (eVar == null || (dVar = eVar.mo30588p(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C8508d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C8513g.C8516b bVar = getContext().get(C8509e.f34913d);
            C8594l.m46769c(bVar);
            ((C8509e) bVar).mo30587d(dVar);
        }
        this.intercepted = C8530c.f34916g;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8531d(C8508d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
