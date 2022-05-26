package p159f.p243f.p245b.p318c.p319a.p320a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: f.f.b.c.a.a.l */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7599l implements ServiceConnection {

    /* renamed from: g */
    final /* synthetic */ C7601m f32960g;

    /* synthetic */ C7599l(C7601m mVar, C7597k kVar) {
        this.f32960g = mVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f32960g.f32963b.mo28577d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C7601m mVar = this.f32960g;
        mVar.mo28602c().post(new C7593i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f32960g.f32963b.mo28577d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C7601m mVar = this.f32960g;
        mVar.mo28602c().post(new C7595j(this));
    }
}
