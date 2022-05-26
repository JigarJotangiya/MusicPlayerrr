package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.n */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7476n implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C7470h f32652g;

    /* renamed from: h */
    final /* synthetic */ C7477o f32653h;

    C7476n(C7477o oVar, C7470h hVar) {
        this.f32653h = oVar;
        this.f32652g = hVar;
    }

    public final void run() {
        try {
            C7470h hVar = (C7470h) this.f32653h.f32655b.mo15987a(this.f32652g);
            if (hVar == null) {
                this.f32653h.mo20538b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C7472j.f32646b;
            hVar.mo28335e(executor, this.f32653h);
            hVar.mo28334d(executor, this.f32653h);
            hVar.mo28331a(executor, this.f32653h);
        } catch (C7469g e) {
            if (e.getCause() instanceof Exception) {
                this.f32653h.f32656c.mo28346p((Exception) e.getCause());
            } else {
                this.f32653h.f32656c.mo28346p(e);
            }
        } catch (Exception e2) {
            this.f32653h.f32656c.mo28346p(e2);
        }
    }
}
