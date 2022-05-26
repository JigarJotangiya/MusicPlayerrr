package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8825g;
import p369i.C8447l;
import p369i.C8450m;
import p369i.p379w.C8508d;

/* renamed from: kotlinx.coroutines.w0 */
/* compiled from: DebugStrings.kt */
public final class C8923w0 {
    /* renamed from: a */
    public static final String m47833a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m47834b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m47835c(C8508d<?> dVar) {
        Object obj;
        if (dVar instanceof C8825g) {
            return dVar.toString();
        }
        try {
            C8447l.C8448a aVar = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(dVar + '@' + m47834b(dVar));
        } catch (Throwable th) {
            C8447l.C8448a aVar2 = C8447l.Companion;
            obj = C8447l.m50326constructorimpl(C8450m.m46574a(th));
        }
        Throwable r2 = C8447l.m50329exceptionOrNullimpl(obj);
        String str = obj;
        if (r2 != null) {
            str = dVar.getClass().getName() + '@' + m47834b(dVar);
        }
        return (String) str;
    }
}
