package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.q */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7479q<TResult> implements C7486x<TResult> {

    /* renamed from: a */
    private final Executor f32658a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32659b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7464c f32660c;

    public C7479q(Executor executor, C7464c cVar) {
        this.f32658a = executor;
        this.f32660c = cVar;
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        if (hVar.mo28341k()) {
            synchronized (this.f32659b) {
                if (this.f32660c != null) {
                    this.f32658a.execute(new C7478p(this));
                }
            }
        }
    }
}
