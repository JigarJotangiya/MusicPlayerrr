package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.w */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7485w<TResult> implements C7486x<TResult> {

    /* renamed from: a */
    private final Executor f32673a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32674b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7468f<? super TResult> f32675c;

    public C7485w(Executor executor, C7468f<? super TResult> fVar) {
        this.f32673a = executor;
        this.f32675c = fVar;
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        if (hVar.mo28343m()) {
            synchronized (this.f32674b) {
                if (this.f32675c != null) {
                    this.f32673a.execute(new C7484v(this, hVar));
                }
            }
        }
    }
}
