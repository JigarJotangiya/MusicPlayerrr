package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.C1405l;
import androidx.work.impl.foreground.C1270b;

public class SystemForegroundService extends LifecycleService implements C1270b.C1272b {

    /* renamed from: l */
    private static final String f5140l = C1405l.m7462f("SystemFgService");

    /* renamed from: h */
    private Handler f5141h;

    /* renamed from: i */
    private boolean f5142i;

    /* renamed from: j */
    C1270b f5143j;

    /* renamed from: k */
    NotificationManager f5144k;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class C1266a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f5145g;

        /* renamed from: h */
        final /* synthetic */ Notification f5146h;

        /* renamed from: i */
        final /* synthetic */ int f5147i;

        C1266a(int i, Notification notification, int i2) {
            this.f5145g = i;
            this.f5146h = notification;
            this.f5147i = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f5145g, this.f5146h, this.f5147i);
            } else {
                SystemForegroundService.this.startForeground(this.f5145g, this.f5146h);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class C1267b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f5149g;

        /* renamed from: h */
        final /* synthetic */ Notification f5150h;

        C1267b(int i, Notification notification) {
            this.f5149g = i;
            this.f5150h = notification;
        }

        public void run() {
            SystemForegroundService.this.f5144k.notify(this.f5149g, this.f5150h);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class C1268c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f5152g;

        C1268c(int i) {
            this.f5152g = i;
        }

        public void run() {
            SystemForegroundService.this.f5144k.cancel(this.f5152g);
        }
    }

    /* renamed from: e */
    private void m7049e() {
        this.f5141h = new Handler(Looper.getMainLooper());
        this.f5144k = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1270b bVar = new C1270b(getApplicationContext());
        this.f5143j = bVar;
        bVar.mo6590m(this);
    }

    /* renamed from: b */
    public void mo6580b(int i, int i2, Notification notification) {
        this.f5141h.post(new C1266a(i, notification, i2));
    }

    /* renamed from: c */
    public void mo6581c(int i, Notification notification) {
        this.f5141h.post(new C1267b(i, notification));
    }

    /* renamed from: d */
    public void mo6582d(int i) {
        this.f5141h.post(new C1268c(i));
    }

    public void onCreate() {
        super.onCreate();
        m7049e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5143j.mo6588k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5142i) {
            C1405l.m7460c().mo6818d(f5140l, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5143j.mo6588k();
            m7049e();
            this.f5142i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5143j.mo6589l(intent);
        return 3;
    }

    public void stop() {
        this.f5142i = true;
        C1405l.m7460c().mo6816a(f5140l, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }
}
