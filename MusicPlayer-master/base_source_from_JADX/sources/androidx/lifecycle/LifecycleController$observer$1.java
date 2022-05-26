package androidx.lifecycle;

import androidx.lifecycle.C0697n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8665a2;
import p369i.p387z.p389d.C8594l;

/* compiled from: LifecycleController.kt */
final class LifecycleController$observer$1 implements C0715s {

    /* renamed from: g */
    final /* synthetic */ C0702o f3229g;

    /* renamed from: h */
    final /* synthetic */ C8665a2 f3230h;

    /* renamed from: c */
    public final void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        C8594l.m46771e(vVar, "source");
        C8594l.m46771e(bVar, "<anonymous parameter 1>");
        C0697n v = vVar.mo390v();
        C8594l.m46770d(v, "source.lifecycle");
        if (v.mo4257b() != C0697n.C0700c.DESTROYED) {
            C0697n v2 = vVar.mo390v();
            C8594l.m46770d(v2, "source.lifecycle");
            if (v2.mo4257b().compareTo(this.f3229g.f3327a) < 0) {
                this.f3229g.f3328b.mo4213a();
                throw null;
            } else {
                this.f3229g.f3328b.mo4214b();
                throw null;
            }
        } else {
            C0702o oVar = this.f3229g;
            C8665a2.C8666a.m47072a(this.f3230h, (CancellationException) null, 1, (Object) null);
            oVar.mo4261c();
            throw null;
        }
    }
}
