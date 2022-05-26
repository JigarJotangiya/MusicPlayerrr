package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements C0718v {

    /* renamed from: g */
    private final C0689k0 f3233g = new C0689k0(this);

    public IBinder onBind(Intent intent) {
        this.f3233g.mo4247b();
        return null;
    }

    public void onCreate() {
        this.f3233g.mo4248c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3233g.mo4249d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3233g.mo4250e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: v */
    public C0697n mo390v() {
        return this.f3233g.mo4246a();
    }
}
