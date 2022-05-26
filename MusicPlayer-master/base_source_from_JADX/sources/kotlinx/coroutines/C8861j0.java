package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8858y;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8532e;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.j0 */
/* compiled from: CompletionState.kt */
public final class C8861j0 {
    /* renamed from: a */
    public static final <T> Object m47658a(Object obj, C8508d<? super T> dVar) {
        if (obj instanceof C8724f0) {
            C8447l.C8448a aVar = C8447l.Companion;
            Throwable th = ((C8724f0) obj).f35091a;
            if (C8919v0.m47827d() && (dVar instanceof C8532e)) {
                th = C8858y.m47654j(th, (C8532e) dVar);
            }
            return C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        C8447l.C8448a aVar2 = C8447l.Companion;
        return C8447l.m50326constructorimpl(obj);
    }

    /* renamed from: b */
    public static final <T> Object m47659b(Object obj, C8570l<? super Throwable, C8457t> lVar) {
        Throwable r0 = C8447l.m50329exceptionOrNullimpl(obj);
        if (r0 != null) {
            return new C8724f0(r0, false, 2, (C8589g) null);
        }
        if (lVar != null) {
            return new C8767g0(obj, lVar);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m47660c(Object obj, C8894q<?> qVar) {
        Throwable r0 = C8447l.m50329exceptionOrNullimpl(obj);
        if (r0 != null) {
            if (C8919v0.m47827d() && (qVar instanceof C8532e)) {
                r0 = C8858y.m47654j(r0, (C8532e) qVar);
            }
            obj = new C8724f0(r0, false, 2, (C8589g) null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m47661d(Object obj, C8570l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m47659b(obj, lVar);
    }
}
