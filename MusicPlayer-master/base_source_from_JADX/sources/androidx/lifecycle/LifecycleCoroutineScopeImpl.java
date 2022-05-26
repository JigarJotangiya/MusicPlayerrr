package androidx.lifecycle;

import androidx.lifecycle.C0697n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends C0709p implements C0715s {

    /* renamed from: g */
    private final C0697n f3231g;

    /* renamed from: h */
    private final C8513g f3232h;

    @C8533f(mo30599c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo30600f = "Lifecycle.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* compiled from: Lifecycle.kt */
    static final class C0644a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0644a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C8508d dVar) {
            super(2, dVar);
            this.this$0 = lifecycleCoroutineScopeImpl;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            C0644a aVar = new C0644a(this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0644a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C8902r0 r0Var = (C8902r0) this.L$0;
                if (this.this$0.mo4133h().mo4257b().compareTo(C0697n.C0700c.INITIALIZED) >= 0) {
                    this.this$0.mo4133h().mo4256a(this.this$0);
                } else {
                    C8769g2.m47307d(r0Var.mo4135x(), (CancellationException) null, 1, (Object) null);
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(C0697n nVar, C8513g gVar) {
        C8594l.m46771e(nVar, "lifecycle");
        C8594l.m46771e(gVar, "coroutineContext");
        this.f3231g = nVar;
        this.f3232h = gVar;
        if (mo4133h().mo4257b() == C0697n.C0700c.DESTROYED) {
            C8769g2.m47307d(mo4135x(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        C8594l.m46771e(vVar, "source");
        C8594l.m46771e(bVar, "event");
        if (mo4133h().mo4257b().compareTo(C0697n.C0700c.DESTROYED) <= 0) {
            mo4133h().mo4258c(this);
            C8769g2.m47307d(mo4135x(), (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: h */
    public C0697n mo4133h() {
        return this.f3231g;
    }

    /* renamed from: i */
    public final void mo4134i() {
        C8665a2 unused = C8875m.m47725b(this, C8768g1.m47303c().mo30872P0(), (C8910t0) null, new C0644a(this, (C8508d) null), 2, (Object) null);
    }

    /* renamed from: x */
    public C8513g mo4135x() {
        return this.f3232h;
    }
}
