package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.c.a.d.i */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7636i<ResultT> implements C7641n<ResultT> {

    /* renamed from: a */
    private final Executor f32993a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32994b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7628a<ResultT> f32995c;

    public C7636i(Executor executor, C7628a<ResultT> aVar) {
        this.f32993a = executor;
        this.f32995c = aVar;
    }

    /* renamed from: a */
    public final void mo28627a(C7632e<ResultT> eVar) {
        synchronized (this.f32994b) {
            if (this.f32995c != null) {
                this.f32993a.execute(new C7635h(this, eVar));
            }
        }
    }
}
