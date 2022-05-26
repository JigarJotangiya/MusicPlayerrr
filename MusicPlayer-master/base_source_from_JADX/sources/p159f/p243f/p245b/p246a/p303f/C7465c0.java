package p159f.p243f.p245b.p246a.p303f;

import java.util.concurrent.Callable;

/* renamed from: f.f.b.a.f.c0 */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7465c0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C7463b0 f32642g;

    /* renamed from: h */
    final /* synthetic */ Callable f32643h;

    C7465c0(C7463b0 b0Var, Callable callable) {
        this.f32642g = b0Var;
        this.f32643h = callable;
    }

    public final void run() {
        try {
            this.f32642g.mo28344n(this.f32643h.call());
        } catch (Exception e) {
            this.f32642g.mo28346p(e);
        } catch (Throwable th) {
            this.f32642g.mo28346p(new RuntimeException(th));
        }
    }
}
