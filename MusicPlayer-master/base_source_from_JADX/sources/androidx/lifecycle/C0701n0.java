package androidx.lifecycle;

import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8921v2;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.n0 */
/* compiled from: ViewModel.kt */
public final class C0701n0 {
    /* renamed from: a */
    public static final C8902r0 m4259a(C0696m0 m0Var) {
        C8594l.m46771e(m0Var, "$this$viewModelScope");
        C8902r0 r0Var = (C8902r0) m0Var.mo4254c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (r0Var != null) {
            return r0Var;
        }
        Object e = m0Var.mo4255e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0665d(C8921v2.m47831b((C8665a2) null, 1, (Object) null).plus(C8768g1.m47303c().mo30872P0())));
        C8594l.m46770d(e, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C8902r0) e;
    }
}
