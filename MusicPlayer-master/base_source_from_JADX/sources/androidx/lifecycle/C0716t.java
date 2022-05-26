package androidx.lifecycle;

import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8921v2;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.t */
/* compiled from: Lifecycle.kt */
public final class C0716t {
    /* renamed from: a */
    public static final C0709p m4280a(C0697n nVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C8594l.m46771e(nVar, "$this$coroutineScope");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) nVar.f3323a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(nVar, C8921v2.m47831b((C8665a2) null, 1, (Object) null).plus(C8768g1.m47303c().mo30872P0()));
        } while (!nVar.f3323a.compareAndSet((Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.mo4134i();
        return lifecycleCoroutineScopeImpl;
    }
}
