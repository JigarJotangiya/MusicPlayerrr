package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.C1405l;
import androidx.work.impl.background.systemalarm.C1252e;
import androidx.work.impl.utils.C1372j;

public class SystemAlarmService extends LifecycleService implements C1252e.C1255c {

    /* renamed from: j */
    private static final String f5069j = C1405l.m7462f("SystemAlarmService");

    /* renamed from: h */
    private C1252e f5070h;

    /* renamed from: i */
    private boolean f5071i;

    /* renamed from: e */
    private void m6963e() {
        C1252e eVar = new C1252e(this);
        this.f5070h = eVar;
        eVar.mo6552m(this);
    }

    /* renamed from: a */
    public void mo6536a() {
        this.f5071i = true;
        C1405l.m7460c().mo6816a(f5069j, "All commands completed in dispatcher", new Throwable[0]);
        C1372j.m7390a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m6963e();
        this.f5071i = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5071i = true;
        this.f5070h.mo6550j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f5071i) {
            C1405l.m7460c().mo6818d(f5069j, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5070h.mo6550j();
            m6963e();
            this.f5071i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5070h.mo6544a(intent, i2);
        return 3;
    }
}
