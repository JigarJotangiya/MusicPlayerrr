package p159f.p243f.p245b.p246a.p303f;

/* renamed from: f.f.b.a.f.l */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7474l implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C7470h f32647g;

    /* renamed from: h */
    final /* synthetic */ C7475m f32648h;

    C7474l(C7475m mVar, C7470h hVar) {
        this.f32648h = mVar;
        this.f32647g = hVar;
    }

    public final void run() {
        if (this.f32647g.mo28341k()) {
            this.f32648h.f32651c.mo28348r();
            return;
        }
        try {
            this.f32648h.f32651c.mo28344n(this.f32648h.f32650b.mo15987a(this.f32647g));
        } catch (C7469g e) {
            if (e.getCause() instanceof Exception) {
                this.f32648h.f32651c.mo28346p((Exception) e.getCause());
            } else {
                this.f32648h.f32651c.mo28346p(e);
            }
        } catch (Exception e2) {
            this.f32648h.f32651c.mo28346p(e2);
        }
    }
}
