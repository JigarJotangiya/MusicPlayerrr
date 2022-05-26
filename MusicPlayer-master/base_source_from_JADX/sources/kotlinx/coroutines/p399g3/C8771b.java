package kotlinx.coroutines.p399g3;

import kotlinx.coroutines.C8724f0;
import kotlinx.coroutines.C8863j2;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.internal.C8817d0;
import kotlinx.coroutines.internal.C8857x;
import kotlinx.coroutines.internal.C8858y;
import p369i.C8447l;
import p369i.C8450m;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8606x;

/* renamed from: kotlinx.coroutines.g3.b */
/* compiled from: Undispatched.kt */
public final class C8771b {
    /* renamed from: a */
    public static final <T> void m47316a(C8570l<? super C8508d<? super T>, ? extends Object> lVar, C8508d<? super T> dVar) {
        C8513g context;
        Object c;
        C8535h.m46735a(dVar);
        try {
            context = dVar.getContext();
            c = C8817d0.m47527c(context, (Object) null);
            if (lVar != null) {
                C8606x.m46798b(lVar, 1);
                Object invoke = lVar.invoke(dVar);
                C8817d0.m47525a(context, c);
                if (invoke != C8527d.m46722d()) {
                    C8447l.C8448a aVar = C8447l.Companion;
                    dVar.resumeWith(C8447l.m50326constructorimpl(invoke));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            dVar.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(th)));
        }
    }

    /* renamed from: b */
    public static final <R, T> void m47317b(C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar, R r, C8508d<? super T> dVar) {
        C8513g context;
        Object c;
        C8535h.m46735a(dVar);
        try {
            context = dVar.getContext();
            c = C8817d0.m47527c(context, (Object) null);
            if (pVar != null) {
                C8606x.m46798b(pVar, 2);
                Object invoke = pVar.invoke(r, dVar);
                C8817d0.m47525a(context, c);
                if (invoke != C8527d.m46722d()) {
                    C8447l.C8448a aVar = C8447l.Companion;
                    dVar.resumeWith(C8447l.m50326constructorimpl(invoke));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            dVar.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(th)));
        }
    }

    /* renamed from: c */
    public static final <T, R> Object m47318c(C8857x<? super T> xVar, R r, C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar) {
        Object obj;
        if (pVar != null) {
            try {
                C8606x.m46798b(pVar, 2);
                obj = pVar.invoke(r, xVar);
            } catch (Throwable th) {
                obj = new C8724f0(th, false, 2, (C8589g) null);
            }
            if (obj == C8527d.m46722d()) {
                return C8527d.m46722d();
            }
            Object U = xVar.mo31059U(obj);
            if (U == C8863j2.f35260b) {
                return C8527d.m46722d();
            }
            if (!(U instanceof C8724f0)) {
                return C8863j2.m47671h(U);
            }
            Throwable th2 = ((C8724f0) U).f35091a;
            C8508d<T> dVar = xVar.f35254i;
            if (C8919v0.m47827d() && (dVar instanceof C8532e)) {
                th2 = C8858y.m47654j(th2, (C8532e) dVar);
            }
            throw th2;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
