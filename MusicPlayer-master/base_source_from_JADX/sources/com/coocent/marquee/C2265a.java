package com.coocent.marquee;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.coocent.marquee.a */
/* compiled from: ForegroundCallbacks */
public class C2265a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: l */
    private static final String f7807l = C2265a.class.getName();

    /* renamed from: m */
    private static C2265a f7808m;

    /* renamed from: g */
    private int f7809g = 0;

    /* renamed from: h */
    private boolean f7810h = true;

    /* renamed from: i */
    private boolean f7811i = false;

    /* renamed from: j */
    private boolean f7812j = true;

    /* renamed from: k */
    private List<C2266a> f7813k;

    /* renamed from: com.coocent.marquee.a$a */
    /* compiled from: ForegroundCallbacks */
    public interface C2266a {
        /* renamed from: a */
        void mo8990a();

        /* renamed from: b */
        void mo8991b();
    }

    public C2265a() {
        new Handler();
        this.f7813k = new CopyOnWriteArrayList();
    }

    /* renamed from: b */
    public static C2265a m10573b(Application application) {
        if (f7808m == null) {
            C2265a aVar = new C2265a();
            f7808m = aVar;
            application.registerActivityLifecycleCallbacks(aVar);
        }
        return f7808m;
    }

    /* renamed from: a */
    public void mo8982a(C2266a aVar) {
        this.f7813k.add(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f7812j = true;
        if (!this.f7811i || 1 == 0) {
            Log.v(f7807l, "still foreground");
            for (C2266a a : this.f7813k) {
                try {
                    a.mo8990a();
                } catch (Exception e) {
                    String str = f7807l;
                    Log.e(str, "Listener threw exception!: " + e);
                }
            }
            return;
        }
        this.f7811i = false;
        Log.d(f7807l, "延迟后台");
        this.f7810h = false;
    }

    public void onActivityResumed(Activity activity) {
        this.f7812j = false;
        boolean z = !this.f7811i;
        this.f7811i = true;
        if (z) {
            Log.d(f7807l, "延迟前台");
            for (C2266a next : this.f7813k) {
                try {
                    if (this.f7810h) {
                        next.mo8990a();
                    }
                } catch (Exception e) {
                    Log.e(f7807l, "Listener threw exception!: " + e);
                }
            }
            return;
        }
        Log.v(f7807l, "still foreground");
        for (C2266a a : this.f7813k) {
            try {
                a.mo8990a();
            } catch (Exception e2) {
                Log.e(f7807l, "Listener threw exception!: " + e2);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f7809g == 0) {
            Log.d(f7807l, "计数前台");
            this.f7810h = true;
        }
        this.f7809g++;
    }

    public void onActivityStopped(Activity activity) {
        int i = this.f7809g - 1;
        this.f7809g = i;
        if (i == 0) {
            Log.d(f7807l, "计数后台");
            if (!this.f7810h) {
                for (C2266a b : this.f7813k) {
                    try {
                        b.mo8991b();
                    } catch (Exception e) {
                        Log.e(f7807l, "Listener threw exception!: " + e);
                    }
                }
            }
        }
    }
}
