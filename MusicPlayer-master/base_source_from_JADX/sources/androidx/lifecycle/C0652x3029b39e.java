package androidx.lifecycle;

import androidx.lifecycle.C0697n;
import kotlinx.coroutines.C8894q;
import p369i.C8447l;
import p369i.C8450m;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 */
/* compiled from: WithLifecycleState.kt */
public final class C0652x3029b39e implements C0715s {

    /* renamed from: g */
    final /* synthetic */ C8894q f3262g;

    /* renamed from: h */
    final /* synthetic */ C0697n f3263h;

    /* renamed from: i */
    final /* synthetic */ C0697n.C0700c f3264i;

    /* renamed from: j */
    final /* synthetic */ C8559a f3265j;

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        Object obj;
        C8594l.m46771e(vVar, "source");
        C8594l.m46771e(bVar, "event");
        if (bVar == C0697n.C0699b.upTo(this.f3264i)) {
            this.f3263h.mo4258c(this);
            C8894q qVar = this.f3262g;
            C8559a aVar = this.f3265j;
            try {
                C8447l.C8448a aVar2 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(aVar.invoke());
            } catch (Throwable th) {
                C8447l.C8448a aVar3 = C8447l.Companion;
                obj = C8447l.m50326constructorimpl(C8450m.m46574a(th));
            }
            qVar.resumeWith(obj);
        } else if (bVar == C0697n.C0699b.ON_DESTROY) {
            this.f3263h.mo4258c(this);
            C8894q qVar2 = this.f3262g;
            C0711q qVar3 = new C0711q();
            C8447l.C8448a aVar4 = C8447l.Companion;
            qVar2.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(qVar3)));
        }
    }
}
