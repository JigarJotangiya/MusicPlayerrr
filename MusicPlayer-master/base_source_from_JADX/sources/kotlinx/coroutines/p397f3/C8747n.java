package kotlinx.coroutines.p397f3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8901r;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.p397f3.p398q.C8753c;
import kotlinx.coroutines.p397f3.p398q.C8754d;
import p369i.C8447l;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.f3.n */
/* compiled from: StateFlow.kt */
final class C8747n extends C8754d<C8744l<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35103a = AtomicReferenceFieldUpdater.newUpdater(C8747n.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo30986a(C8744l<?> lVar) {
        if (this._state != null) {
            return false;
        }
        this._state = C8746m.f35101a;
        return true;
    }

    /* renamed from: d */
    public final Object mo30989d(C8508d<? super C8457t> dVar) {
        boolean z = true;
        C8901r rVar = new C8901r(C8522c.m46721c(dVar), 1);
        rVar.mo31237y();
        if (!C8919v0.m47824a() || (!(this._state instanceof C8901r))) {
            if (!f35103a.compareAndSet(this, C8746m.f35101a, rVar)) {
                if (C8919v0.m47824a()) {
                    if (this._state != C8746m.f35102b) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                C8457t tVar = C8457t.f34900a;
                C8447l.C8448a aVar = C8447l.Companion;
                rVar.resumeWith(C8447l.m50326constructorimpl(tVar));
            }
            Object v = rVar.mo31235v();
            if (v == C8527d.m46722d()) {
                C8535h.m46737c(dVar);
            }
            return v == C8527d.m46722d() ? v : C8457t.f34900a;
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public C8508d<C8457t>[] mo30987b(C8744l<?> lVar) {
        this._state = null;
        return C8753c.f35111a;
    }

    /* renamed from: f */
    public final void mo30991f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != C8746m.f35102b) {
                if (obj == C8746m.f35101a) {
                    if (f35103a.compareAndSet(this, obj, C8746m.f35102b)) {
                        return;
                    }
                } else if (f35103a.compareAndSet(this, obj, C8746m.f35101a)) {
                    C8457t tVar = C8457t.f34900a;
                    C8447l.C8448a aVar = C8447l.Companion;
                    ((C8901r) obj).resumeWith(C8447l.m50326constructorimpl(tVar));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo30992g() {
        Object andSet = f35103a.getAndSet(this, C8746m.f35101a);
        C8594l.m46769c(andSet);
        if (C8919v0.m47824a() && !(!(andSet instanceof C8901r))) {
            throw new AssertionError();
        } else if (andSet == C8746m.f35102b) {
            return true;
        } else {
            return false;
        }
    }
}
