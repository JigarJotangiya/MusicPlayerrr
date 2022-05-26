package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f.f.b.c.a.a.i */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7593i extends C7579b {

    /* renamed from: h */
    final /* synthetic */ IBinder f32957h;

    /* renamed from: i */
    final /* synthetic */ C7599l f32958i;

    C7593i(C7599l lVar, IBinder iBinder) {
        this.f32958i = lVar;
        this.f32957h = iBinder;
    }

    /* renamed from: a */
    public final void mo25173a() {
        C7601m mVar = this.f32958i.f32960g;
        mVar.f32975n = (IInterface) mVar.f32970i.mo25172a(this.f32957h);
        C7601m.m42376o(this.f32958i.f32960g);
        this.f32958i.f32960g.f32968g = false;
        for (Runnable run : this.f32958i.f32960g.f32965d) {
            run.run();
        }
        this.f32958i.f32960g.f32965d.clear();
    }
}
