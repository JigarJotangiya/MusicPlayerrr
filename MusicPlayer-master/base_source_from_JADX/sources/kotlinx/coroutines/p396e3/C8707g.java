package kotlinx.coroutines.p396e3;

import p369i.C8457t;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.e3.g */
/* compiled from: Channel.kt */
public final class C8707g {
    /* renamed from: a */
    public static final <E> C8705f<E> m47199a(int i, C8704e eVar, C8570l<? super E, C8457t> lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C8704e.SUSPEND) {
                i2 = C8705f.f35079a.mo30953a();
            }
            return new C8702d(i2, eVar, lVar);
        } else if (i == -1) {
            if (eVar != C8704e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C8715l(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C8716m(lVar);
            }
            if (i == 1 && eVar == C8704e.DROP_OLDEST) {
                return new C8715l(lVar);
            }
            return new C8702d(i, eVar, lVar);
        } else if (eVar == C8704e.SUSPEND) {
            return new C8720q(lVar);
        } else {
            return new C8702d(1, eVar, lVar);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C8705f m47200b(int i, C8704e eVar, C8570l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C8704e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m47199a(i, eVar, lVar);
    }
}
