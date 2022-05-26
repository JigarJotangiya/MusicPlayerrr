package kotlinx.coroutines.p396e3;

import kotlinx.coroutines.internal.C8859z;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.e3.m */
/* compiled from: LinkedListChannel.kt */
public class C8716m<E> extends C8694a<E> {
    public C8716m(C8570l<? super E, C8457t> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo30945m(E e) {
        C8719p<?> o;
        do {
            Object m = super.mo30945m(e);
            C8859z zVar = C8699b.f35064b;
            if (m == zVar) {
                return zVar;
            }
            if (m == C8699b.f35065c) {
                o = mo30947o(e);
                if (o == null) {
                    return zVar;
                }
            } else if (m instanceof C8712i) {
                return m;
            } else {
                throw new IllegalStateException(C8594l.m46777k("Invalid offerInternal result ", m).toString());
            }
        } while (!(o instanceof C8712i));
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo30925v() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo30926w() {
        return true;
    }
}
