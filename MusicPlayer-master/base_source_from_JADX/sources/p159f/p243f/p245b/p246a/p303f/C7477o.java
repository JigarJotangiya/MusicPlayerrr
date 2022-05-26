package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.o */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7477o<TResult, TContinuationResult> implements C7468f<TContinuationResult>, C7467e, C7464c, C7486x {

    /* renamed from: a */
    private final Executor f32654a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7460a<TResult, C7470h<TContinuationResult>> f32655b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7463b0<TContinuationResult> f32656c;

    public C7477o(Executor executor, C7460a<TResult, C7470h<TContinuationResult>> aVar, C7463b0<TContinuationResult> b0Var) {
        this.f32654a = executor;
        this.f32655b = aVar;
        this.f32656c = b0Var;
    }

    /* renamed from: a */
    public final void mo28351a(TContinuationResult tcontinuationresult) {
        this.f32656c.mo28344n(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo20538b(Exception exc) {
        this.f32656c.mo28346p(exc);
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        this.f32654a.execute(new C7476n(this, hVar));
    }

    /* renamed from: d */
    public final void mo28349d() {
        this.f32656c.mo28348r();
    }
}
