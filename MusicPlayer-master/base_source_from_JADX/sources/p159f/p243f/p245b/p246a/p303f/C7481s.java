package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.s */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7481s<TResult> implements C7486x<TResult> {

    /* renamed from: a */
    private final Executor f32663a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32664b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7466d<TResult> f32665c;

    public C7481s(Executor executor, C7466d<TResult> dVar) {
        this.f32663a = executor;
        this.f32665c = dVar;
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        synchronized (this.f32664b) {
            if (this.f32665c != null) {
                this.f32663a.execute(new C7480r(this, hVar));
            }
        }
    }
}
