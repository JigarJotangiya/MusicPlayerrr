package kotlinx.coroutines.p397f3;

import kotlinx.coroutines.internal.C8859z;
import kotlinx.coroutines.p397f3.p398q.C8759h;

/* renamed from: kotlinx.coroutines.f3.m */
/* compiled from: StateFlow.kt */
public final class C8746m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8859z f35101a = new C8859z("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8859z f35102b = new C8859z("PENDING");

    /* renamed from: a */
    public static final <T> C8742j<T> m47274a(T t) {
        if (t == null) {
            t = C8759h.f35117a;
        }
        return new C8744l(t);
    }

    /* renamed from: d */
    public static final void m47277d(C8742j<Integer> jVar, int i) {
        Integer value;
        do {
            value = jVar.getValue();
        } while (!jVar.mo30977a(value, Integer.valueOf(value.intValue() + i)));
    }
}
