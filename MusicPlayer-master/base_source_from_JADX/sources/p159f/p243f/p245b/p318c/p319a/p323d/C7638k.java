package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.c.a.d.k */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7638k<ResultT> implements C7641n<ResultT> {

    /* renamed from: a */
    private final Executor f32998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f32999b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7629b f33000c;

    public C7638k(Executor executor, C7629b bVar) {
        this.f32998a = executor;
        this.f33000c = bVar;
    }

    /* renamed from: a */
    public final void mo28627a(C7632e<ResultT> eVar) {
        if (!eVar.mo28625g()) {
            synchronized (this.f32999b) {
                if (this.f33000c != null) {
                    this.f32998a.execute(new C7637j(this, eVar));
                }
            }
        }
    }
}
