package p159f.p243f.p245b.p246a.p303f;

import com.google.android.gms.common.internal.C3292l;

/* renamed from: f.f.b.a.f.t */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7482t implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C7470h f32666g;

    /* renamed from: h */
    final /* synthetic */ C7483u f32667h;

    C7482t(C7483u uVar, C7470h hVar) {
        this.f32667h = uVar;
        this.f32666g = hVar;
    }

    public final void run() {
        synchronized (this.f32667h.f32669b) {
            if (this.f32667h.f32670c != null) {
                C7467e b = this.f32667h.f32670c;
                Exception i = this.f32666g.mo28339i();
                C3292l.m14240h(i);
                b.mo20538b(i);
            }
        }
    }
}
