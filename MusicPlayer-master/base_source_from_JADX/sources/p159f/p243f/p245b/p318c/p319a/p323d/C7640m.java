package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.c.a.d.m */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7640m<ResultT> implements C7641n<ResultT> {

    /* renamed from: a */
    private final Executor f33003a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f33004b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7630c<? super ResultT> f33005c;

    public C7640m(Executor executor, C7630c<? super ResultT> cVar) {
        this.f33003a = executor;
        this.f33005c = cVar;
    }

    /* renamed from: a */
    public final void mo28627a(C7632e<ResultT> eVar) {
        if (eVar.mo28625g()) {
            synchronized (this.f33004b) {
                if (this.f33005c != null) {
                    this.f33003a.execute(new C7639l(this, eVar));
                }
            }
        }
    }
}
