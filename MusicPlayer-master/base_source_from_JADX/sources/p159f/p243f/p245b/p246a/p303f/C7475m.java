package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.m */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7475m<TResult, TContinuationResult> implements C7486x<TResult> {

    /* renamed from: a */
    private final Executor f32649a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7460a<TResult, TContinuationResult> f32650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7463b0<TContinuationResult> f32651c;

    public C7475m(Executor executor, C7460a<TResult, TContinuationResult> aVar, C7463b0<TContinuationResult> b0Var) {
        this.f32649a = executor;
        this.f32650b = aVar;
        this.f32651c = b0Var;
    }

    /* renamed from: c */
    public final void mo28358c(C7470h<TResult> hVar) {
        this.f32649a.execute(new C7474l(this, hVar));
    }
}
