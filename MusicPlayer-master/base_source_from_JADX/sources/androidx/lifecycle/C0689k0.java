package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0697n;

/* renamed from: androidx.lifecycle.k0 */
/* compiled from: ServiceLifecycleDispatcher */
public class C0689k0 {

    /* renamed from: a */
    private final C0720x f3311a;

    /* renamed from: b */
    private final Handler f3312b = new Handler();

    /* renamed from: c */
    private C0690a f3313c;

    /* renamed from: androidx.lifecycle.k0$a */
    /* compiled from: ServiceLifecycleDispatcher */
    static class C0690a implements Runnable {

        /* renamed from: g */
        private final C0720x f3314g;

        /* renamed from: h */
        final C0697n.C0699b f3315h;

        /* renamed from: i */
        private boolean f3316i = false;

        C0690a(C0720x xVar, C0697n.C0699b bVar) {
            this.f3314g = xVar;
            this.f3315h = bVar;
        }

        public void run() {
            if (!this.f3316i) {
                this.f3314g.mo4268h(this.f3315h);
                this.f3316i = true;
            }
        }
    }

    public C0689k0(C0718v vVar) {
        this.f3311a = new C0720x(vVar);
    }

    /* renamed from: f */
    private void m4242f(C0697n.C0699b bVar) {
        C0690a aVar = this.f3313c;
        if (aVar != null) {
            aVar.run();
        }
        C0690a aVar2 = new C0690a(this.f3311a, bVar);
        this.f3313c = aVar2;
        this.f3312b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public C0697n mo4246a() {
        return this.f3311a;
    }

    /* renamed from: b */
    public void mo4247b() {
        m4242f(C0697n.C0699b.ON_START);
    }

    /* renamed from: c */
    public void mo4248c() {
        m4242f(C0697n.C0699b.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4249d() {
        m4242f(C0697n.C0699b.ON_STOP);
        m4242f(C0697n.C0699b.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4250e() {
        m4242f(C0697n.C0699b.ON_START);
    }
}
