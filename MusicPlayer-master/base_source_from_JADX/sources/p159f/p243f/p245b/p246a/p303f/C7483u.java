package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.u */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7483u<TResult> implements C7486x<TResult> {

    /* renamed from: a */
    private final Executor f32668a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32669b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7467e f32670c;

    public C7483u(Executor executor, C7467e eVar) {
        this.f32668a = executor;
        this.f32670c = eVar;
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        if (!hVar.mo28343m() && !hVar.mo28341k()) {
            synchronized (this.f32669b) {
                if (this.f32670c != null) {
                    this.f32668a.execute(new C7482t(this, hVar));
                }
            }
        }
    }
}
