package p082e.p109h.p116m;

import android.graphics.Typeface;
import android.os.Handler;
import p082e.p109h.p116m.C3664e;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.m.a */
/* compiled from: CallbackWithHandler */
class C3657a {

    /* renamed from: a */
    private final C3670f.C3673c f11626a;

    /* renamed from: b */
    private final Handler f11627b;

    /* renamed from: e.h.m.a$a */
    /* compiled from: CallbackWithHandler */
    class C3658a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C3670f.C3673c f11628g;

        /* renamed from: h */
        final /* synthetic */ Typeface f11629h;

        C3658a(C3657a aVar, C3670f.C3673c cVar, Typeface typeface) {
            this.f11628g = cVar;
            this.f11629h = typeface;
        }

        public void run() {
            this.f11628g.mo12884b(this.f11629h);
        }
    }

    /* renamed from: e.h.m.a$b */
    /* compiled from: CallbackWithHandler */
    class C3659b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C3670f.C3673c f11630g;

        /* renamed from: h */
        final /* synthetic */ int f11631h;

        C3659b(C3657a aVar, C3670f.C3673c cVar, int i) {
            this.f11630g = cVar;
            this.f11631h = i;
        }

        public void run() {
            this.f11630g.mo12883a(this.f11631h);
        }
    }

    C3657a(C3670f.C3673c cVar, Handler handler) {
        this.f11626a = cVar;
        this.f11627b = handler;
    }

    /* renamed from: a */
    private void m15719a(int i) {
        this.f11627b.post(new C3659b(this, this.f11626a, i));
    }

    /* renamed from: c */
    private void m15720c(Typeface typeface) {
        this.f11627b.post(new C3658a(this, this.f11626a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12925b(C3664e.C3669e eVar) {
        if (eVar.mo12944a()) {
            m15720c(eVar.f11653a);
        } else {
            m15719a(eVar.f11654b);
        }
    }
}
