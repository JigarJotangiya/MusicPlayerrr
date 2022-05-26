package p159f.p166c.p177d.p180j;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: f.c.d.j.b */
/* compiled from: ForegroundCallbacks */
public class C4357b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: l */
    private static final String f12942l = C4357b.class.getName();

    /* renamed from: m */
    private static C4357b f12943m;

    /* renamed from: g */
    private int f12944g = 0;

    /* renamed from: h */
    private boolean f12945h = true;

    /* renamed from: i */
    private boolean f12946i = false;

    /* renamed from: j */
    private boolean f12947j = true;

    /* renamed from: k */
    private List<C4358a> f12948k;

    /* renamed from: f.c.d.j.b$a */
    /* compiled from: ForegroundCallbacks */
    public interface C4358a {
        /* renamed from: a */
        void mo14787a();

        /* renamed from: b */
        void mo14788b();
    }

    public C4357b() {
        new Handler();
        this.f12948k = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public static C4357b m19006b(Application application) {
        if (f12943m == null) {
            C4357b bVar = new C4357b();
            f12943m = bVar;
            application.registerActivityLifecycleCallbacks(bVar);
        }
        return f12943m;
    }

    /* renamed from: a */
    public void mo14792a(C4358a aVar) {
        this.f12948k.add(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f12947j = true;
        if (!this.f12946i || 1 == 0) {
            Log.v(f12942l, "still foreground");
            for (C4358a a : this.f12948k) {
                try {
                    a.mo14787a();
                } catch (Exception e) {
                    String str = f12942l;
                    Log.e(str, "Listener threw exception!: " + e);
                }
            }
            return;
        }
        this.f12946i = false;
        Log.d(f12942l, "延迟后台");
        this.f12945h = false;
    }

    public void onActivityResumed(Activity activity) {
        this.f12947j = false;
        boolean z = !this.f12946i;
        this.f12946i = true;
        if (z) {
            Log.d(f12942l, "延迟前台");
            for (C4358a next : this.f12948k) {
                try {
                    if (this.f12945h) {
                        next.mo14787a();
                    }
                } catch (Exception e) {
                    Log.e(f12942l, "Listener threw exception!: " + e);
                }
            }
            return;
        }
        Log.v(f12942l, "still foreground");
        for (C4358a a : this.f12948k) {
            try {
                a.mo14787a();
            } catch (Exception e2) {
                Log.e(f12942l, "Listener threw exception!: " + e2);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f12944g == 0) {
            Log.d(f12942l, "计数前台");
            this.f12945h = true;
        }
        this.f12944g++;
    }

    public void onActivityStopped(Activity activity) {
        int i = this.f12944g - 1;
        this.f12944g = i;
        if (i == 0) {
            Log.d(f12942l, "计数后台");
            if (!this.f12945h) {
                for (C4358a b : this.f12948k) {
                    try {
                        b.mo14788b();
                    } catch (Exception e) {
                        Log.e(f12942l, "Listener threw exception!: " + e);
                    }
                }
            }
        }
    }
}
